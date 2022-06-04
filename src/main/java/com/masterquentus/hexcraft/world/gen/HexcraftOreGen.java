package com.masterquentus.hexcraft.world.gen;

import com.masterquentus.hexcraft.world.feature.HexcraftPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class HexcraftOreGen {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(HexcraftPlacedFeatures.PEARL_STONE_PLACED);
        base.add(HexcraftPlacedFeatures.CRIMSON_STONE_PLACED);

    }
}