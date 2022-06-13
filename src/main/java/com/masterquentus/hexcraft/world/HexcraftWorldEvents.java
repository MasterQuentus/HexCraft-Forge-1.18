package com.masterquentus.hexcraft.world;

import com.masterquentus.hexcraft.HexCraft;
import com.masterquentus.hexcraft.world.gen.HexcraftEntityGeneration;
import com.masterquentus.hexcraft.world.gen.HexcraftFlowerGen;
import com.masterquentus.hexcraft.world.gen.HexcraftOreGen;
import com.masterquentus.hexcraft.world.gen.HexcraftTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = HexCraft.MOD_ID)
public class HexcraftWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        HexcraftOreGen.generateOres(event);

        HexcraftTreeGeneration.generateTrees(event);
        HexcraftFlowerGen.generateFlowers(event);

        HexcraftEntityGeneration.onEntitySpawn(event);
    }
}
