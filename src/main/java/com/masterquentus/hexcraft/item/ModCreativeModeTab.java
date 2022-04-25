package com.masterquentus.hexcraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab HEXCRAFT_TAB = new CreativeModeTab("hexcrafttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.INFUSED_FABRIC.get());
        }
    };
}