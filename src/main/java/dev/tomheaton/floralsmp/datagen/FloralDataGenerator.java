package dev.tomheaton.floralsmp.datagen;

import dev.tomheaton.floralsmp.FloralSMP;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FloralSMP.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class FloralDataGenerator {

    private FloralDataGenerator() {
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        // TODO: test the boolean
        gen.addProvider(true, new FloralItemModelProvider(gen, existingFileHelper));
        gen.addProvider(true, new FloralBlockModelProvider(gen, existingFileHelper));
    }
}
