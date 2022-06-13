package com.masterquentus.hexcraft.block.custom;

import com.masterquentus.hexcraft.block.HexcraftBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BuddingAmethystBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;

import java.util.Random;

public class BuddingMagicalCrystalBlock extends BuddingAmethystBlock {
    public static final int GROWTH_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();


    public BuddingMagicalCrystalBlock(Properties p_152726_) {
        super(p_152726_);
    }
    public PushReaction getPistonPushReaction(BlockState pState) {
        return PushReaction.DESTROY;
    }

    /**
     * Performs a random tick on a block.
     */
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, Random pRandom) {
        if (pRandom.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[pRandom.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = pPos.relative(direction);
            BlockState blockstate = pLevel.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = HexcraftBlocks.SMALL_MAGIC_CRYSTAL_BUD.get();
            } else if (blockstate.is(HexcraftBlocks.SMALL_MAGIC_CRYSTAL_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = HexcraftBlocks.MEDIUM_MAGIC_CRYSTAL_BUD.get();
            } else if (blockstate.is(HexcraftBlocks.MEDIUM_MAGIC_CRYSTAL_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = HexcraftBlocks.LARGE_MAGIC_CRYSTAL_BUD.get();
            } else if (blockstate.is(HexcraftBlocks.LARGE_MAGIC_CRYSTAL_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = HexcraftBlocks.MAGIC_CRYSTAL_CLUSTER.get();
            }

            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState().setValue(AmethystClusterBlock.FACING, direction).setValue(AmethystClusterBlock.WATERLOGGED, Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
                pLevel.setBlockAndUpdate(blockpos, blockstate1);
            }

        }
    }

    public static boolean canClusterGrowAtState(BlockState pState) {
        return pState.isAir() || pState.is(Blocks.WATER) && pState.getFluidState().getAmount() == 8;
    }
}