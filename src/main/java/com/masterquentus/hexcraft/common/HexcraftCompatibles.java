package com.masterquentus.hexcraft.common;

import com.masterquentus.hexcraft.HexCraft;
import com.masterquentus.hexcraft.block.ModBlocks;
import com.masterquentus.hexcraft.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.ComposterBlock;

public class HexcraftCompatibles {
    public static void compostibleBlocks(float chance, ItemLike item) {
        ComposterBlock.COMPOSTABLES.put(item.asItem(), chance);
    }

    public static void compostablesHex() {
        HexCraft.LOGGER.debug("Hexcraft: Adding Compostible Blocks...");

        //Leaves
        compostibleBlocks(0.3f, ModBlocks.EBONY_LEAVES.get());
        compostibleBlocks(0.3f, ModBlocks.BLOOD_OAK_LEAVES.get());


        //Saplings
        compostibleBlocks(0.3f, ModBlocks.EBONY_SAPLING.get());
        compostibleBlocks(0.3f, ModBlocks.BLOOD_OAK_SAPLING.get());


        //Flowers
        compostibleBlocks(0.65f, ModBlocks.BLOODY_ROSE.get());


        //Mushroom Blocks



        //Plants
        compostibleBlocks(0.65f, ModBlocks.EBONY_LEAVES_PILE.get());
        compostibleBlocks(0.65f, ModBlocks.BLOOD_OAK_LEAVES_PILE.get());


        HexCraft.LOGGER.info("Hexcraft: Compostible Blocks Added!");
    }
}
