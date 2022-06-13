package com.masterquentus.hexcraft.villager;
import com.masterquentus.hexcraft.HexCraft;
import com.masterquentus.hexcraft.block.HexcraftBlocks;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftPOIs {
    public static final DeferredRegister<PoiType> POI
            = DeferredRegister.create(ForgeRegistries.POI_TYPES, HexCraft.MOD_ID);

    public static final RegistryObject<PoiType> UNDERWORLD_PORTAL =
            POI.register("underworld_portal", () -> new PoiType("underworld_portal",
                    PoiType.getBlockStates(HexcraftBlocks.UNDERWORLD_PORTAL.get()), 0, 1));


    public static void register(IEventBus eventBus) {
        POI.register(eventBus);
    }
}
