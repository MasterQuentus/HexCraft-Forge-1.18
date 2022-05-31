package com.masterquentus.hexcraft;

import com.masterquentus.hexcraft.block.entity.ModBlockEntities;
import com.masterquentus.hexcraft.block.entity.ModWoodTypes;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.WeepingVinesBlock;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import com.masterquentus.hexcraft.item.ModItems;
import com.masterquentus.hexcraft.block.ModBlocks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.slf4j.Logger;

@Mod(HexCraft.MOD_ID)
public class HexCraft {
    public static final String MOD_ID = "hexcraft";
    private static final Logger LOGGER = LogUtils.getLogger();

    public HexCraft()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModBlockEntities.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }


    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EBONY_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EBONY_TRAPDOOR.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLOOD_OAK_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLOOD_OAK_TRAPDOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EBONY_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLOOD_OAK_SAPLING.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLOODY_ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_BLOODY_ROSE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WITCHES_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WITCHES_LADDER_PLANT.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MANDRAKE_FLOWER.get(), RenderType.cutout());

        BlockEntityRenderers.register(ModBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);
        WoodType.register(ModWoodTypes.EBONY);
        WoodType.register(ModWoodTypes.Blood_Oak);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();


    }



    private void setup(final FMLCommonSetupEvent event) {
       event.enqueueWork(() ->{
           ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLOODY_ROSE.getId(), ModBlocks.POTTED_BLOODY_ROSE);
           Sheets.addWoodType(ModWoodTypes.EBONY);
           Sheets.addWoodType(ModWoodTypes.Blood_Oak);
       });
    }
}