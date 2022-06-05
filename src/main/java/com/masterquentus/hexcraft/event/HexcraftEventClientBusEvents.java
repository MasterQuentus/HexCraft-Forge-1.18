package com.masterquentus.hexcraft.event;

import com.masterquentus.hexcraft.HexCraft;
import com.masterquentus.hexcraft.block.entity.client.armor.WitchesArmorRenderer;
import com.masterquentus.hexcraft.item.custom.WitchesArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = HexCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HexcraftEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(WitchesArmorItem.class, new WitchesArmorRenderer());
    }
}