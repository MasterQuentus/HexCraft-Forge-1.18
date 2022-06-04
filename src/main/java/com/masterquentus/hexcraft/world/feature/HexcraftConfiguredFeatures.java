package com.masterquentus.hexcraft.world.feature;

import com.masterquentus.hexcraft.block.HexcraftBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class HexcraftConfiguredFeatures {

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> EBONY_TREE =
            FeatureUtils.register("ebony", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(HexcraftBlocks.EBONY_LOG.get()),
                    new StraightTrunkPlacer(3, 6, 3),
                    BlockStateProvider.simple(HexcraftBlocks.EBONY_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> BLOOD_OAK_TREE =
            FeatureUtils.register("blood_oak", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(HexcraftBlocks.BLOOD_OAK_LOG.get()),
                    new StraightTrunkPlacer(4, 6, 3),
                    BlockStateProvider.simple(HexcraftBlocks.BLOOD_OAK_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                    new TwoLayersFeatureSize(3, 0, 3)).build());

    public static final Holder<PlacedFeature> EBONY_CHECKED =
            PlacementUtils.register("ebony_checked", EBONY_TREE,
                    PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.EBONY_SAPLING.get()));

    public static final Holder<PlacedFeature> BLOOD_OAK_CHECKED =
            PlacementUtils.register("blood_oak_checked", BLOOD_OAK_TREE,
                    PlacementUtils.filteredByBlockSurvival(HexcraftBlocks.BLOOD_OAK_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> EBONY_SPAWN =
            FeatureUtils.register("ebony_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(EBONY_CHECKED,
                            0.5F)), EBONY_CHECKED));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> BLOOD_OAK_SPAWN =
            FeatureUtils.register("blood_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(BLOOD_OAK_CHECKED,
                            0.5F)), BLOOD_OAK_CHECKED));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> BLOODY_ROSE =
            FeatureUtils.register("flower_bloody_rose", Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(HexcraftBlocks.BLOODY_ROSE.get())))));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_PEARL_STONE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, HexcraftBlocks.PEARL_STONE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> PEARL_STONE_SPAWN = FeatureUtils.register("pearl_stone",
            Feature.ORE, new OreConfiguration(OVERWORLD_PEARL_STONE, 14));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_CRIMSON_STONE = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, HexcraftBlocks.CRIMSON_STONE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CRIMSON_STONE_SPAWN = FeatureUtils.register("pearl_stone",
            Feature.ORE, new OreConfiguration(OVERWORLD_CRIMSON_STONE, 14));
}
