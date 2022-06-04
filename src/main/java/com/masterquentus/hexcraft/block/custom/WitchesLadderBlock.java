package com.masterquentus.hexcraft.block.custom;

import com.masterquentus.hexcraft.block.HexcraftBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public class WitchesLadderBlock extends GrowingPlantHeadBlock implements BonemealableBlock {
    protected static final VoxelShape SHAPE = Block.box(4.0D, 9.0D, 4.0D, 12.0D, 16.0D, 12.0D);

    public WitchesLadderBlock(BlockBehaviour.Properties p_154966_) {
        super(p_154966_, Direction.DOWN, SHAPE, false, 0.1D);
    }

    /**
     * Used to determine how much to grow the plant when using bonemeal.
     */
    protected int getBlocksToGrowWhenBonemealed(Random p_154968_) {
        return NetherVines.getBlocksToGrowWhenBonemealed(p_154968_);
    }

    @Override
    public boolean isLadder(BlockState state, LevelReader level, BlockPos pos, LivingEntity entity) {
        return true;
    }

    protected Block getBodyBlock() {
        return HexcraftBlocks.WITCHES_LADDER_PLANT.get();
    }

    protected boolean canGrowInto(BlockState p_154971_) {
        return NetherVines.isValidGrowthState(p_154971_);
    }
}