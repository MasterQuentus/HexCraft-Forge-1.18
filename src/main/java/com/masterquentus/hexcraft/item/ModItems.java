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

    //public static final RegistryObject<Item> TAGLOCK_KIT  = ITEMS.register("taglock_kit",
           // () -> new TaglockKit(new Item.Properties().tab(ModCreativeModeTab.HEXCRAFT_TAB)));

    //public static final RegistryObject<Item> FILLED_TAGLOCK  = ITEMS.register("filled_taglock",
            //() -> new Taglock(new Item.Properties().tab(ModCreativeModeTab.HEXCRAFT_TAB)));

    //Plants
    public static final RegistryObject<Item> MANDRAKE_SEEDS = ITEMS.register("mandrake_seeds",
            () -> new ItemNameBlockItem(ModBlocks.MANDRAKE_FLOWER.get(),
                    new Item.Properties().tab(ModCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> MANDRAKE_ROOT = ITEMS.register("mandrake_root",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HEXCRAFT_TAB)));

    //Signs
    public static final RegistryObject<Item> EBONY_SIGN = ITEMS.register("ebony_sign",
            () -> new SignItem(new Item.Properties().tab(ModCreativeModeTab.HEXCRAFT_TAB).stacksTo(16),
                    ModBlocks.EBONY_SIGN.get(), ModBlocks.EBONY_WALL_SIGN.get()));

    public static final RegistryObject<Item> BLOOD_OAK_SIGN = ITEMS.register("blood_oak_sign",
            () -> new SignItem(new Item.Properties().tab(ModCreativeModeTab.HEXCRAFT_TAB).stacksTo(16),
                    ModBlocks.BLOOD_OAK_SIGN.get(), ModBlocks.BLOOD_OAK_WALL_SIGN.get()));
    //Poppets
    public static final RegistryObject<Item> POPPET = ITEMS.register("poppet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> DEATH_PROTECTION_POPPET = ITEMS.register("death_protection_poppet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> FIRE_PROTECTION_POPPET = ITEMS.register("fire_protection_poppet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HEXCRAFT_TAB)));

    public static final RegistryObject<Item> WATER_PROTECTION_POPPET = ITEMS.register("water_protection_poppet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HEXCRAFT_TAB)));

    //Brooms
    //public static final RegistryObject<Item> EBONY_BROOM = ITEMS.register("ebony_broom",
    //() -> new BroomItem(new Item.Properties().tab(ModCreativeModeTab.HEXCRAFT_TAB)));

    //public static final RegistryObject<Item> BLOOD_OAK_BROOM = ITEMS.register("blood_oak_broom",
            //() -> new BroomItem(new Item.Properties().tab(ModCreativeModeTab.HEXCRAFT_TAB)));


public static void register(IEventBus eventBus) {
   ITEMS.register(eventBus);
   }
}
