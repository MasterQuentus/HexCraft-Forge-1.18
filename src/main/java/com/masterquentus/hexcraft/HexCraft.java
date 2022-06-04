package com.masterquentus.hexcraft;

import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.block.entity.HexcraftBlockEntities;
import com.masterquentus.hexcraft.block.entity.HexcraftWoodTypes;
import com.masterquentus.hexcraft.common.HexcraftCompostables;
import com.masterquentus.hexcraft.fluid.HexcraftFluids;
import com.masterquentus.hexcraft.item.HexcraftItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

@Mod(HexCraft.MOD_ID)
public class HexCraft {
    public static final String MOD_ID = "hexcraft";
    public static final Logger LOGGER = LogUtils.getLogger();

    public HexCraft() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        HexcraftItems.register(eventBus);
        HexcraftBlocks.register(eventBus);
        HexcraftBlockEntities.register(eventBus);

        HexcraftFluids.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        GeckoLib.initialize();

        MinecraftForge.EVENT_BUS.register(this);
    }


    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.EBONY_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.EBONY_TRAPDOOR.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.BLOOD_OAK_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.BLOOD_OAK_TRAPDOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.EBONY_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.BLOOD_OAK_SAPLING.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.EBONY_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.BLOOD_OAK_LEAVES.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.EBONY_LEAVES_PILE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.BLOOD_OAK_LEAVES_PILE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.BLOODY_ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.POTTED_BLOODY_ROSE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WITCHES_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.WITCHES_LADDER_PLANT.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.LIVING_KELP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.LIVING_KELP_PLANT.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftBlocks.MANDRAKE_FLOWER.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HexcraftFluids.BLOOD_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(HexcraftFluids.BLOOD_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(HexcraftFluids.BLOOD_FLOWING.get(), RenderType.translucent());

        BlockEntityRenderers.register(HexcraftBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);
        WoodType.register(HexcraftWoodTypes.EBONY);
        WoodType.register(HexcraftWoodTypes.Blood_Oak);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();


    }


    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.BLOODY_ROSE.getId(), HexcraftBlocks.POTTED_BLOODY_ROSE);
            Sheets.addWoodType(HexcraftWoodTypes.EBONY);
            Sheets.addWoodType(HexcraftWoodTypes.Blood_Oak);
        });
    }

    public static void threadSafeLoadFinish() {
        LOGGER.debug("BYG: \"Load Complete Event\" Starting...");
        HexcraftCompostables.compostablesHex();
    }
}