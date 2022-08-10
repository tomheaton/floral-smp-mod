package dev.tomheaton.floralsmp.datagen;

import dev.tomheaton.floralsmp.FloralSMP;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

// TODO: this
public class FloralBlockstateProvider extends BlockStateProvider {

    public FloralBlockstateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, FloralSMP.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
    }
}
