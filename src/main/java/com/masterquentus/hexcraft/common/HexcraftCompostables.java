package com.masterquentus.hexcraft.common;

import com.masterquentus.hexcraft.HexCraft;
import com.masterquentus.hexcraft.block.HexcraftBlocks;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.ComposterBlock;

public class HexcraftCompostables {
    public static void compostableBlocks(float chance, ItemLike item) {
        ComposterBlock.COMPOSTABLES.put(item.asItem(), chance);
    }

    public static void compostableHex() {
        HexCraft.LOGGER.debug("Hexcraft: Adding Compostable Blocks...");

        //Leaves
        compostableBlocks(0.3f, HexcraftBlocks.EBONY_LEAVES.get());
        compostableBlocks(0.3f, HexcraftBlocks.BLOOD_OAK_LEAVES.get());


        //Saplings
        compostableBlocks(0.3f, HexcraftBlocks.EBONY_SAPLING.get());
        compostableBlocks(0.3f, HexcraftBlocks.BLOOD_OAK_SAPLING.get());


        //Flowers
        compostableBlocks(0.65f, HexcraftBlocks.BLOODY_ROSE.get());


        //Mushroom Blocks



        //Plants
        compostableBlocks(0.65f, HexcraftBlocks.EBONY_LEAVES_PILE.get());
        compostableBlocks(0.65f, HexcraftBlocks.BLOOD_OAK_LEAVES_PILE.get());

        HexCraft.LOGGER.info("Hexcraft: Compostable Blocks Added!");

        }

    }
