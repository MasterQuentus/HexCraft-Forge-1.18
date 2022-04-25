package com.masterquentus.hexcraft.world;

import com.masterquentus.hexcraft.HexCraft;
import com.masterquentus.hexcraft.world.gen.ModFlowerGen;
import com.masterquentus.hexcraft.world.gen.ModOreGen;
import com.masterquentus.hexcraft.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = HexCraft.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGen.generateOres(event);

        ModTreeGeneration.generateTrees(event);
        ModFlowerGen.generateFlowers(event);
    }
}
