package com.masterquentus.hexcraft.fluid;

import com.masterquentus.hexcraft.HexCraft;
import com.masterquentus.hexcraft.block.HexcraftBlocks;
import com.masterquentus.hexcraft.item.HexcraftItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftFluids {
    public static final ResourceLocation BLOOD_STILL_RL = new ResourceLocation(HexCraft.MOD_ID, "block/blood_fluid");
    public static final ResourceLocation BLOOD_FLOWING_RL = new ResourceLocation(HexCraft.MOD_ID, "block/blood_flowing");
    public static final ResourceLocation BLOOD_OVERLAY_RL = new ResourceLocation(HexCraft.MOD_ID,"block/blood_overlay");

    public static final DeferredRegister<Fluid> FLUIDS
            = DeferredRegister.create(ForgeRegistries.FLUIDS, HexCraft.MOD_ID);


    public static final RegistryObject<FlowingFluid> BLOOD_FLUID
            = FLUIDS.register("blood_fluid", () -> new ForgeFlowingFluid.Source(HexcraftFluids.BLOOD_PROPERTIES));

    public static final RegistryObject<FlowingFluid> BLOOD_FLOWING
            = FLUIDS.register("blood_flowing", () -> new ForgeFlowingFluid.Flowing(HexcraftFluids.BLOOD_PROPERTIES));


    public static final ForgeFlowingFluid.Properties BLOOD_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> BLOOD_FLUID.get(), () -> BLOOD_FLOWING.get(), FluidAttributes.builder(BLOOD_STILL_RL, BLOOD_FLOWING_RL)
            .density(10).luminosity(2).viscosity(5).sound(SoundEvents.WATER_AMBIENT).overlay(BLOOD_OVERLAY_RL))
            .slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> HexcraftFluids.BLOOD_BLOCK.get()).bucket(() -> HexcraftItems.BLOOD_BUCKET.get());

    public static final RegistryObject<LiquidBlock> BLOOD_BLOCK = HexcraftBlocks.BLOCKS.register("blood",
            () -> new LiquidBlock(() -> HexcraftFluids.BLOOD_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));



    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}