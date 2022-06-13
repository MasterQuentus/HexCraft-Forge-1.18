package com.masterquentus.hexcraft.world.dimension;

import com.masterquentus.hexcraft.HexCraft;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;


public class UnderworldDimension {
    public static final ResourceKey<Level> UNDER_WORLD_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(HexCraft.MOD_ID, "under_world"));

    public static final ResourceKey<DimensionType> UNDER_WORLD_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, UNDER_WORLD_KEY.getRegistryName());

    public static void register() {
        System.out.println("Registering HexcraftDimensions for " + HexCraft.MOD_ID);
    }
}
