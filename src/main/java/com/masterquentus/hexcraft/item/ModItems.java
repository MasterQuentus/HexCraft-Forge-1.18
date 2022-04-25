package com.masterquentus.hexcraft.item;

import com.masterquentus.hexcraft.HexCraft;
import com.masterquentus.hexcraft.block.ModBlocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<net.minecraft.world.item.Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HexCraft.MOD_ID);


    public static final RegistryObject<Item> INFUSED_FABRIC = ITEMS.register("infused_fabric",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> WITCHES_LADDER_ITEM = ITEMS.register("witches_ladder_item",
            () -> new BlockItem(ModBlocks.WITCHES_LADDER.get(), new Item.Properties().tab(ModCreativeModeTab.HEXCRAFT_TAB)));

    //Brooms
    //public static final RegistryObject<Item> EBONY_BROOM = ITEMS.register("ebony_broom",
    //() -> new BroomItem(new Item.Properties().tab(ModCreativeModeTab.HEXCRAFT_TAB)));

    //public static final RegistryObject<Item> BLOOD_OAK_BROOM = ITEMS.register("blood_oak_broom",
            //() -> new BroomItem(new Item.Properties().tab(ModCreativeModeTab.HEXCRAFT_TAB)));


public static void register(IEventBus eventBus) {
   ITEMS.register(eventBus);
   }
}
