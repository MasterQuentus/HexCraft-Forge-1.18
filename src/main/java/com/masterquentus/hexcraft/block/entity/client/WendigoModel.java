package com.masterquentus.hexcraft.block.entity.client;

import com.masterquentus.hexcraft.HexCraft;
import com.masterquentus.hexcraft.entity.custom.WendigoEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WendigoModel extends AnimatedGeoModel<WendigoEntity> {
    @Override
    public ResourceLocation getModelLocation(WendigoEntity object) {
        return new ResourceLocation(HexCraft.MOD_ID, "geo/wendigo.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(WendigoEntity object) {
        return new ResourceLocation(HexCraft.MOD_ID, "textures/entity/wendigo/wendigo.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(WendigoEntity animatable) {
        return new ResourceLocation(HexCraft.MOD_ID, "animations/wendigo.animation.json");
    }
}
