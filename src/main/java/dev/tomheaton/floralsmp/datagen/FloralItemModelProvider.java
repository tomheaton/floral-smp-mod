package dev.tomheaton.floralsmp.datagen;

import dev.tomheaton.floralsmp.FloralSMP;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class FloralItemModelProvider extends ItemModelProvider {

    public FloralItemModelProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, FloralSMP.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "dandelion");
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
        builder(itemGenerated, "sunflower");
        builder(itemGenerated, "lilac");
        builder(itemGenerated, "rose_bush");
        builder(itemGenerated, "peony");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
