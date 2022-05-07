package com.masterquentus.hexcraft.block.entity;

import com.masterquentus.hexcraft.HexCraft;
import com.masterquentus.hexcraft.block.ModBlocks;
import com.masterquentus.hexcraft.block.custom.ModSignBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, HexCraft.MOD_ID);



    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("sign_block_entity", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.EBONY_WALL_SIGN.get(),
                            ModBlocks.EBONY_SIGN.get(),
                            ModBlocks.BLOOD_OAK_WALL_SIGN.get(),
                            ModBlocks.BLOOD_OAK_SIGN.get()).build(null));





    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}