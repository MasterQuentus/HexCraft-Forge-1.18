package com.masterquentus.hexcraft.block.custom;

import com.masterquentus.hexcraft.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class MandrakePlantBlock extends CropBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;
    public MandrakePlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.MANDRAKE_ROOT.get();
    }
}
