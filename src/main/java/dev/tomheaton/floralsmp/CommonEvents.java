package dev.tomheaton.floralsmp;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = FloralSMP.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonEvents {

    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
//            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.EXAMPLE_FLOWER.getId(), BlockInit.EXAMPLE_FLOWER_POT);
        });
    }
}
