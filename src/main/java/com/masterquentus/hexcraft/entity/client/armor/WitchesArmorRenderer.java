package com.masterquentus.hexcraft.entity.client.armor;

import com.masterquentus.hexcraft.item.custom.WitchesArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WitchesArmorRenderer extends GeoArmorRenderer<WitchesArmorItem> {
    public WitchesArmorRenderer() {
        super(new WitchesArmorModel());

        this.headBone = "Head";
        this.bodyBone = "Body";
        this.rightArmBone = "RightArm";
        this.leftArmBone = "LeftArm";
        this.rightLegBone = "RightLeg";
        this.leftLegBone = "LeftLeg";

    }
}