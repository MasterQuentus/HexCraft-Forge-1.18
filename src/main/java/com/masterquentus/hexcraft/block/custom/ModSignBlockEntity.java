package com.masterquentus.hexcraft.block.custom;

import com.masterquentus.hexcraft.block.ModBlocks;
import com.masterquentus.hexcraft.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ModSignBlockEntity extends SignBlockEntity {
    public ModSignBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(pWorldPosition, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntities.SIGN_BLOCK_ENTITIES.get();
    }
}
