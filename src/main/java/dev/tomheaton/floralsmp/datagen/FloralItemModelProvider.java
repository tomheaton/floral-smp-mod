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

        blockBuilder(itemGenerated, "dandelion");
        blockBuilder(itemGenerated, "poppy");
        blockBuilder(itemGenerated, "blue_orchid");
        blockBuilder(itemGenerated, "allium");
        blockBuilder(itemGenerated, "azure_bluet");
        blockBuilder(itemGenerated, "red_tulip");
        blockBuilder(itemGenerated, "orange_tulip");
        blockBuilder(itemGenerated, "white_tulip");
        blockBuilder(itemGenerated, "pink_tulip");
        blockBuilder(itemGenerated, "oxeye_daisy");
        blockBuilder(itemGenerated, "cornflower");
        blockBuilder(itemGenerated, "lily_of_the_valley");
        blockBuilder(itemGenerated, "wither_rose");

        blockBuilder(itemGenerated, "sunflower", "top");
        blockBuilder(itemGenerated, "lilac", "top");
        blockBuilder(itemGenerated, "rose_bush", "top");
        blockBuilder(itemGenerated, "peony", "top");

        blockBuilder(itemGenerated, "brown_mushroom");
        blockBuilder(itemGenerated, "red_mushroom");

//        blockBuilder(itemGenerated, "cactus");
    }

    private ItemModelBuilder itemBuilder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }

    // TODO: move this to block data gen?
    private ItemModelBuilder blockBuilder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "block/" + name);
    }

    private ItemModelBuilder blockBuilder(ModelFile itemGenerated, String name, String extra) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "block/" + name + "_" + extra);
    }
}
