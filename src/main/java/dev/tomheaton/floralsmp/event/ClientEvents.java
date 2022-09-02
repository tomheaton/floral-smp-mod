package dev.tomheaton.floralsmp.event;

import dev.tomheaton.floralsmp.block.BlockInit;
import dev.tomheaton.floralsmp.FloralSMP;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = FloralSMP.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(BlockInit.EXAMPLE_FLOWER.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(BlockInit.EXAMPLE_FLOWER_POT.get(), RenderType.cutout());
    }
}