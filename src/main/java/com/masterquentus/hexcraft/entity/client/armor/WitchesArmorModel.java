package com.masterquentus.hexcraft.entity.client.armor;

import com.masterquentus.hexcraft.HexCraft;
import com.masterquentus.hexcraft.item.custom.WitchesArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WitchesArmorModel extends AnimatedGeoModel<WitchesArmorItem> {
    @Override
    public ResourceLocation getModelLocation(WitchesArmorItem object) {
        return new ResourceLocation(HexCraft.MOD_ID, "geo/witch_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(WitchesArmorItem object) {
        return new ResourceLocation(HexCraft.MOD_ID, "textures/models/armor/witch_armor_texture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(WitchesArmorItem animatable) {
        return new ResourceLocation(HexCraft.MOD_ID, "animations/armor_animation.json");
    }
}
