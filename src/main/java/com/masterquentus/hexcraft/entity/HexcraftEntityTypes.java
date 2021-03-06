package com.masterquentus.hexcraft.entity;

import com.masterquentus.hexcraft.HexCraft;
import com.masterquentus.hexcraft.entity.custom.LilithEntity;
import com.masterquentus.hexcraft.entity.custom.WendigoEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, HexCraft.MOD_ID);

    public static final RegistryObject<EntityType<LilithEntity>> LILITH =
            ENTITY_TYPES.register("lilith",
                    () -> EntityType.Builder.of(LilithEntity::new, MobCategory.MONSTER)
                            .sized(0.8F, 2.0F)
                            .build(new ResourceLocation(HexCraft.MOD_ID, "lilith").toString()));

    public static final RegistryObject<EntityType<WendigoEntity>> WENDIGO =
            ENTITY_TYPES.register("wendigo",
                    () -> EntityType.Builder.of(WendigoEntity::new, MobCategory.MONSTER)
                            .sized(0.8F, 2.0F)
                            .build(new ResourceLocation(HexCraft.MOD_ID, "wendigo").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}