package com.masterquentus.hexcraft.block.entity.client;

import com.masterquentus.hexcraft.HexCraft;
import com.masterquentus.hexcraft.entity.custom.LilithEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class LilithModel extends AnimatedGeoModel<LilithEntity> {
    @Override
    public ResourceLocation getModelLocation(LilithEntity object) {
        return new ResourceLocation(HexCraft.MOD_ID, "geo/lilith.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(LilithEntity object) {
        return new ResourceLocation(HexCraft.MOD_ID, "textures/entity/lilith/lilith.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(LilithEntity animatable) {
        return new ResourceLocation(HexCraft.MOD_ID, "animations/lilith.animation.json");
    }
}
