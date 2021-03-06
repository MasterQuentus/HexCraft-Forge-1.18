package com.masterquentus.hexcraft.block;

import com.masterquentus.hexcraft.HexCraft;
import com.masterquentus.hexcraft.block.custom.*;
import com.masterquentus.hexcraft.item.HexcraftItems;
import com.masterquentus.hexcraft.event.tree.BloodOakTreeGrower;
import com.masterquentus.hexcraft.event.tree.EbonyTreeGrower;
import com.masterquentus.hexcraft.event.tree.HellbarkTreeGrower;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import com.masterquentus.hexcraft.item.HexcraftCreativeModeTab;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;

import java.util.function.Supplier;


import net.minecraft.world.level.block.*;

public class HexcraftBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, HexCraft.MOD_ID);
//Blocks
    public static final RegistryObject<Block> PEARL_STONE = registerBlock("pearl_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> PEARL_COBBLESTONE = registerBlock("pearl_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> PEARL_STONE_BRICKS = registerBlock("pearl_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_PEARL_STONE = registerBlock("polished_pearl_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CHISELED_PEARL_STONE = registerBlock("chiseled_pearl_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRACKED_PEARL_STONE = registerBlock("cracked_pearl_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_STONE = registerBlock("crimson_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_COBBLESTONE = registerBlock("crimson_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_STONE_BRICKS = registerBlock("crimson_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_CRIMSON_STONE = registerBlock("polished_crimson_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CHISELED_CRIMSON_STONE = registerBlock("chiseled_crimson_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRACKED_CRIMSON_STONE = registerBlock("cracked_crimson_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_STONE = registerBlock("under_world_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_COBBLESTONE = registerBlock("under_world_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_STONE_BRICKS = registerBlock("under_world_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_UNDER_WORLD_STONE = registerBlock("polished_under_world_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CHISELED_UNDER_WORLD_STONE = registerBlock("chiseled_under_world_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRACKED_UNDER_WORLD_STONE = registerBlock("cracked_under_world_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> BLACK_OBSIDIAN = registerBlock("black_obsidian",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(50.0F, 1200.0F).sound(SoundType.STONE)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> EMBER_MOSS_BLOCK = registerBlock("ember_moss_block",
            () -> new EmberMossBlock(BlockBehaviour.Properties.of(Material.MOSS).strength(0.1F).sound(SoundType.MOSS)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> EMBER_MOSS_CARPET = registerBlock("ember_moss_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.MOSS).strength(0.1F).sound(SoundType.MOSS)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> MAGIC_CRYSTAL_BLOCK = registerBlock("magic_crystal_block",
            () -> new MagicalCrystalBlock(BlockBehaviour.Properties.of(Material.AMETHYST).strength(1.5F).requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> BUDDING_MAGIC_CRYSTAL = registerBlock("budding_magic_crystal",
            () -> new BuddingMagicalCrystalBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> MAGIC_CRYSTAL_CLUSTER = registerBlock("magic_crystal_cluster",
            () -> new MagicCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion()
                    .randomTicks().strength(1.5F).requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST).lightLevel((state) -> 5)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> LARGE_MAGIC_CRYSTAL_BUD = registerBlock("large_magic_crystal_bud",
            () -> new MagicCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion()
                    .randomTicks().strength(1.5F).requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST).lightLevel((state) -> 4)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> MEDIUM_MAGIC_CRYSTAL_BUD = registerBlock("medium_magic_crystal_bud",
            () -> new MagicCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion()
                    .randomTicks().strength(1.5F).requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST).lightLevel((state) -> 2)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> SMALL_MAGIC_CRYSTAL_BUD = registerBlock("small_magic_crystal_bud",
            () -> new MagicCrystalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion()
                    .randomTicks().strength(1.5F).requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST).lightLevel((state) -> 1)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Stairs
    public static final RegistryObject<Block> PEARL_STONE_STAIRS = registerBlock("pearl_stone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.PEARL_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> PEARL_COBBLESTONE_STAIRS = registerBlock("pearl_cobblestone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.PEARL_COBBLESTONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> PEARL_STONE_BRICKS_STAIRS = registerBlock("pearl_stone_bricks_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.PEARL_STONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_PEARL_STONE_STAIRS = registerBlock("polished_pearl_stone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.POLISHED_PEARL_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_STONE_STAIRS = registerBlock("crimson_stone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.PEARL_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_COBBLESTONE_STAIRS = registerBlock("crimson_cobblestone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.PEARL_COBBLESTONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_STONE_BRICKS_STAIRS = registerBlock("crimson_stone_bricks_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.CRIMSON_STONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_CRIMSON_STONE_STAIRS = registerBlock("polished_crimson_stone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.POLISHED_CRIMSON_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_STONE_STAIRS = registerBlock("under_world_stone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.UNDER_WORLD_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_COBBLESTONE_STAIRS = registerBlock("under_world_cobblestone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.UNDER_WORLD_COBBLESTONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_STONE_BRICKS_STAIRS = registerBlock("under_world_stone_bricks_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_UNDER_WORLD_STONE_STAIRS = registerBlock("polished_under_world_stone_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.POLISHED_UNDER_WORLD_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> EBONY_STAIRS = registerBlock("ebony_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.EBONY_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD)
                    ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_STAIRS = registerBlock("blood_oak_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.BLOOD_OAK_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD)
                    ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_STAIRS = registerBlock("hell_bark_stairs",
            () -> new StairBlock(() -> HexcraftBlocks.HELL_BARK_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Slabs
    public static final RegistryObject<Block> PEARL_STONE_SLAB = registerBlock("pearl_stone_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> PEARL_COBBLESTONE_SLAB = registerBlock("pearl_cobblestone_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> PEARL_STONE_BRICKS_SLAB = registerBlock("pearl_stone_bricks_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_PEARL_STONE_SLAB = registerBlock("polished_pearl_stone_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_STONE_SLAB = registerBlock("crimson_stone_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_COBBLESTONE_SLAB = registerBlock("crimson_cobblestone_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_STONE_BRICKS_SLAB = registerBlock("crimson_stone_bricks_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_CRIMSON_STONE_SLAB = registerBlock("polished_crimson_stone_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_STONE_SLAB = registerBlock("under_world_stone_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_COBBLESTONE_SLAB = registerBlock("under_world_cobblestone_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_STONE_BRICKS_SLAB = registerBlock("under_world_stone_bricks_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_UNDER_WORLD_STONE_SLAB = registerBlock("polished_under_world_stone_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> EBONY_SLAB = registerBlock("ebony_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_SLAB = registerBlock("blood_oak_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_SLAB = registerBlock("hell_bark_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Walls
    public static final RegistryObject<Block> PEARL_STONE_WALL = registerBlock("pearl_stone_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> PEARL_COBBLESTONE_WALL = registerBlock("pearl_cobblestone_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> PEARL_STONE_BRICKS_WALL = registerBlock("pearl_stone_bricks_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_PEARL_STONE_WALL = registerBlock("polished_pearl_stone_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_STONE_WALL = registerBlock("crimson_stone_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_COBBLESTONE_WALL = registerBlock("crimson_cobblestone_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_STONE_BRICKS_WALL = registerBlock("crimson_stone_bricks_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_CRIMSON_STONE_WALL = registerBlock("polished_crimson_stone_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_STONE_WALL = registerBlock("under_world_stone_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_COBBLESTONE_WALL = registerBlock("under_world_cobblestone_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_STONE_BRICKS_WALL = registerBlock("under_world_stone_bricks_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POLISHED_UNDER_WORLD_STONE_WALL = registerBlock("polished_under_world_stone_wall",
            () -> new WallBlock (BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Saplings
    public static final RegistryObject<Block> EBONY_SAPLING = registerBlock("ebony_sapling",
            () -> new SaplingBlock (new EbonyTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_SAPLING = registerBlock("blood_oak_sapling",
            () -> new SaplingBlock (new BloodOakTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_SAPLING = registerBlock("hell_bark_sapling",
            () -> new SaplingBlock (new HellbarkTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Stripped Wood
    public static final RegistryObject<Block> STRIPPED_EBONY_WOOD = registerBlock("stripped_ebony_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> STRIPPED_BLOOD_OAK_WOOD = registerBlock("stripped_blood_oak_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> STRIPPED_HELL_BARK_WOOD = registerBlock("stripped_hell_bark_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Stripped Log
    public static final RegistryObject<Block> STRIPPED_EBONY_LOG = registerBlock("stripped_ebony_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> STRIPPED_BLOOD_OAK_LOG = registerBlock("stripped_blood_oak_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> STRIPPED_HELL_BARK_LOG = registerBlock("stripped_hell_bark_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Wood
    public static final RegistryObject<Block> EBONY_WOOD = registerBlock("ebony_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_WOOD = registerBlock("blood_oak_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_WOOD = registerBlock("hell_bark_wood",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);


    //Log
    public static final RegistryObject<Block> EBONY_LOG = registerBlock("ebony_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_LOG = registerBlock("hell_bark_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_LOG = registerBlock("blood_oak_log",
            () -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
            ), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Planks
    public static final RegistryObject<Block> EBONY_PLANKS = registerBlock("ebony_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_PLANKS = registerBlock("blood_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_PLANKS = registerBlock("hell_bark_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);


    //Leaves
    public static final RegistryObject<Block> EBONY_LEAVES = registerBlock("ebony_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> EBONY_LEAVES_PILE = registerBlock("ebony_leaves_pile",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F)
                    .sound(SoundType.GRASS).noDrops().noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);


    public static final RegistryObject<Block> BLOOD_OAK_LEAVES = registerBlock("blood_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> BLOOD_OAK_LEAVES_PILE = registerBlock("blood_oak_leaves_pile",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F)
                    .sound(SoundType.GRASS).noDrops().noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_LEAVES = registerBlock("hell_bark_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return false;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject <Block> HELL_BARK_LEAVES_PILE = registerBlock("hell_bark_leaves_pile",
            () -> new CarpetBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F)
                    .sound(SoundType.GRASS).noDrops().noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Doors
    public static final RegistryObject<Block> EBONY_DOOR = registerBlock("ebony_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_DOOR = registerBlock("blood_oak_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_DOOR = registerBlock("hell_bark_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    //Trapdoors
    public static final RegistryObject<Block> EBONY_TRAPDOOR = registerBlock("ebony_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_TRAPDOOR = registerBlock("blood_oak_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_TRAPDOOR = registerBlock("hell_bark_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(3.0F).noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Pressure Plates
    public static final RegistryObject<Block> EBONY_PRESSURE_PLATE = registerBlock("ebony_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noDrops()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_PRESSURE_PLATE = registerBlock("blood_oak_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_PRESSURE_PLATE = registerBlock("hell_bark_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Buttons
    public static final RegistryObject<Block> PEARL_STONE_BUTTON = registerBlock("pearl_stone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> CRIMSON_STONE_BUTTON = registerBlock("crimson_stone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> UNDER_WORLD_STONE_BUTTON = registerBlock("under_world_stone_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> EBONY_BUTTON = registerBlock("ebony_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_BUTTON = registerBlock("blood_oak_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_BUTTON = registerBlock("hell_bark_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F).noCollission()), HexcraftCreativeModeTab.HEXCRAFT_TAB);
    //Fences
    public static final RegistryObject<Block> EBONY_FENCE = registerBlock("ebony_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_FENCE = registerBlock("blood_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_FENCE = registerBlock("hell_bark_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Fence Gates
    public static final RegistryObject<Block> EBONY_FENCE_GATE = registerBlock("ebony_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_FENCE_GATE = registerBlock("blood_oak_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_FENCE_GATE = registerBlock("hell_bark_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Signs
    public static final RegistryObject<Block> EBONY_WALL_SIGN = registerBlockWithoutBlockItem("ebony_wall_sign",
            () -> new HexcraftWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), HexcraftWoodTypes.EBONY));

    public static final RegistryObject<Block> EBONY_SIGN = registerBlockWithoutBlockItem("ebony_sign",
            () -> new HexcraftStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), HexcraftWoodTypes.EBONY));

    public static final RegistryObject<Block> BLOOD_OAK_WALL_SIGN = registerBlockWithoutBlockItem("blood_oak_wall_sign",
            () -> new HexcraftWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), HexcraftWoodTypes.BLOOD_OAK));

    public static final RegistryObject<Block> BLOOD_OAK_SIGN = registerBlockWithoutBlockItem("blood_oak_sign",
            () -> new HexcraftStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), HexcraftWoodTypes.BLOOD_OAK));

    public static final RegistryObject<Block> HELL_BARK_WALL_SIGN = registerBlockWithoutBlockItem("hell_bark_wall_sign",
            () -> new HexcraftWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), HexcraftWoodTypes.HELL_BARK));

    public static final RegistryObject<Block> HELL_BARK_SIGN = registerBlockWithoutBlockItem("hell_bark_sign",
            () -> new HexcraftStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), HexcraftWoodTypes.HELL_BARK));

    //Portal Blocks
    public static final RegistryObject<Block> UNDERWORLD_PORTAL = registerBlockWithoutBlockItem("underworld_portal",
            UnderworldPortalBlock::new);

    //Bookshelves
    public static final RegistryObject<Block> EBONY_BOOKSHELF = registerBlock("ebony_bookshelf",
            () -> new HexcraftBookshelf(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_OAK_BOOKSHELF = registerBlock("blood_oak_bookshelf",
            () -> new HexcraftBookshelf(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> HELL_BARK_BOOKSHELF = registerBlock("hell_bark_bookshelf",
            () -> new HexcraftBookshelf(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(1.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    //Plants
    public static final RegistryObject<Block> BLOODY_ROSE = registerBlock("bloody_rose",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 4, BlockBehaviour.Properties.copy(Blocks.POPPY)
                    .instabreak().noOcclusion()), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> POTTED_BLOODY_ROSE = registerBlockWithoutItem("potted_bloody_rose",
            () -> new FlowerPotBlock(null, HexcraftBlocks.BLOODY_ROSE,
                    BlockBehaviour.Properties.copy(Blocks.BRICKS)
                    .instabreak().noOcclusion()));

    public static final RegistryObject<Block> WITCHES_LADDER = BLOCKS.register("witches_ladder",
            () -> new WitchesLadderBlock(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES)
                    .instabreak().noOcclusion().randomTicks()));

    public static final RegistryObject<Block> WITCHES_LADDER_PLANT = BLOCKS.register("witches_ladder_plant",
            () -> new WitchesLadderPlant(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES)
                    .instabreak().noOcclusion()));

    public static final RegistryObject<Block> LIVING_KELP = BLOCKS.register("living_kelp",
            () -> new LivingKelpBlock(BlockBehaviour.Properties.copy(Blocks.KELP)
                    .noCollission().randomTicks().instabreak().sound(SoundType.WET_GRASS)
                    .lightLevel((state) -> 15)));

    public static final RegistryObject<Block> LIVING_KELP_PLANT = BLOCKS.register("living_kelp_plant",
            () -> new LivingkelpPlant(BlockBehaviour.Properties.copy(Blocks.KELP_PLANT)
                    .instabreak().lightLevel((state) -> 15).noOcclusion()));


    public static final RegistryObject<Block> LIVING_KELP_BLOCK = registerBlock("living_kelp_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.WATER_PLANT).sound(SoundType.GRASS)
                    .strength(0.5F, 2.5F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> MANDRAKE_FLOWER = registerBlockWithoutBlockItem("mandrake_flower",
            () -> new MandrakePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> BLOOD_MUSHROOM_BLOCK = registerBlock("blood_mushroom_block",
            () -> new HugeMushroomBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.2F, 0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);

    public static final RegistryObject<Block> BLOOD_MUSHROOM_STEM = registerBlock("blood_mushroom_stem",
            () -> new HugeMushroomBlock(BlockBehaviour.Properties.of(Material.WOOD)
                   .strength(0.2F, 0F)), HexcraftCreativeModeTab.HEXCRAFT_TAB);


    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
      return  BLOCKS.register(name, block);

    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return HexcraftItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
   }

}

