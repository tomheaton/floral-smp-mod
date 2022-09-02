package dev.tomheaton.floralsmp;

import com.mojang.logging.LogUtils;
import dev.tomheaton.floralsmp.block.BlockInit;
import dev.tomheaton.floralsmp.item.FloralItemGroup;
import dev.tomheaton.floralsmp.item.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(FloralSMP.MODID)
public class FloralSMP {

    public static final String MODID = "floralsmp";
    public static final String MODNAME = "Floral SMP Mod";
    public static final String VERSION = "${version}";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final FloralItemGroup floralItemGroup = new FloralItemGroup();

    public FloralSMP() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);

        BlockInit.BLOCKS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("common setup");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("server starting");
    }
}
