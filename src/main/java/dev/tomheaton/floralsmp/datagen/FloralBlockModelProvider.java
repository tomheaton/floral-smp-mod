package dev.tomheaton.floralsmp.datagen;

import dev.tomheaton.floralsmp.FloralSMP;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class FloralBlockModelProvider extends BlockModelProvider {


    public FloralBlockModelProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, FloralSMP.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModelFile itemGenerated = getExistingFile(mcLoc("block/cross"));

        builder(itemGenerated, "dandelion");
        builder(itemGenerated, "poppy");
        builder(itemGenerated, "blue_orchid");
        builder(itemGenerated, "allium");
        builder(itemGenerated, "azure_bluet");
        builder(itemGenerated, "red_tulip");
        builder(itemGenerated, "orange_tulip");
        builder(itemGenerated, "white_tulip");
        builder(itemGenerated, "pink_tulip");
        builder(itemGenerated, "oxeye_daisy");
        builder(itemGenerated, "cornflower");
        builder(itemGenerated, "lily_of_the_valley");
        builder(itemGenerated, "wither_rose");

//        builder(itemGenerated, "sunflower");
//        builder(itemGenerated, "lilac");
//        builder(itemGenerated, "rose_bush");
//        builder(itemGenerated, "peony");

        builder(itemGenerated, "red_mushroom");
        builder(itemGenerated, "brown_mushroom");
    }

    private BlockModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("cross", "block/" + name).renderType("cutout");
    }
}
