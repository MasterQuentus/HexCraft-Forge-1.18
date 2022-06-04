package com.masterquentus.hexcraft.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class HexcraftPlacedFeatures {

    public static final Holder<PlacedFeature> EBONY_PLACED = PlacementUtils.register("ebony_placed",
            HexcraftConfiguredFeatures.EBONY_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(0, 0.1f, 0)));

    public static final Holder<PlacedFeature> BLOOD_OAK_PLACED = PlacementUtils.register("blood_oak_placed",
            HexcraftConfiguredFeatures.BLOOD_OAK_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(0, 0.1f, 0)));

    public static final Holder<PlacedFeature> BLOODY_ROSE_PLACED = PlacementUtils.register("bloody_rose_placed",
            HexcraftConfiguredFeatures.BLOODY_ROSE, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> PEARL_STONE_PLACED = PlacementUtils.register("pearl_stone_placed",
            HexcraftConfiguredFeatures.PEARL_STONE_SPAWN, HexcraftOrePlacement.commonOrePlacement( 7,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> CRIMSON_STONE_PLACED = PlacementUtils.register("crimson_stone_placed",
            HexcraftConfiguredFeatures.CRIMSON_STONE_SPAWN, HexcraftOrePlacement.commonOrePlacement( 7,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
}
