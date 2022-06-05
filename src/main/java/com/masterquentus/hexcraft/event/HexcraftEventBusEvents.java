package com.masterquentus.hexcraft.event;

import com.masterquentus.hexcraft.HexCraft;
import com.masterquentus.hexcraft.entity.HexcraftEntityTypes;
import com.masterquentus.hexcraft.entity.custom.LilithEntity;
import com.masterquentus.hexcraft.entity.custom.WendigoEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = HexCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class HexcraftEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(HexcraftEntityTypes.LILITH.get(), LilithEntity.setAttributes());
        event.put(HexcraftEntityTypes.WENDIGO.get(), WendigoEntity.setAttributes());

    }
}