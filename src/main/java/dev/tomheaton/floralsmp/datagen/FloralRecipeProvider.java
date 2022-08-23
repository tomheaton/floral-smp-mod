package dev.tomheaton.floralsmp.datagen;

import dev.tomheaton.floralsmp.ItemInit;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class FloralRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public FloralRecipeProvider(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        powerFlowerRecipe(ItemInit.DANDELION.get(), Items.DANDELION, consumer);
        powerFlowerRecipe(ItemInit.POPPY.get(), Items.POPPY, consumer);
        powerFlowerRecipe(ItemInit.BLUE_ORCHID.get(), Items.BLUE_ORCHID, consumer);
        powerFlowerRecipe(ItemInit.ALLIUM.get(), Items.ALLIUM, consumer);
        powerFlowerRecipe(ItemInit.AZURE_BLUET.get(), Items.AZURE_BLUET, consumer);
        powerFlowerRecipe(ItemInit.RED_TULIP.get(), Items.RED_TULIP, consumer);
        powerFlowerRecipe(ItemInit.ORANGE_TULIP.get(), Items.ORANGE_TULIP, consumer);
        powerFlowerRecipe(ItemInit.WHITE_TULIP.get(), Items.WHITE_TULIP, consumer);
        powerFlowerRecipe(ItemInit.PINK_TULIP.get(), Items.PINK_TULIP, consumer);
        powerFlowerRecipe(ItemInit.OXEYE_DAISY.get(), Items.OXEYE_DAISY, consumer);
        powerFlowerRecipe(ItemInit.LILY_OF_THE_VALLEY.get(), Items.LILY_OF_THE_VALLEY, consumer);
        powerFlowerRecipe(ItemInit.WITHER_ROSE.get(), Items.WITHER_ROSE, consumer);
        powerFlowerRecipe(ItemInit.SUNFLOWER.get(), Items.SUNFLOWER, consumer);
        powerFlowerRecipe(ItemInit.LILAC.get(), Items.LILAC, consumer);
        powerFlowerRecipe(ItemInit.ROSE_BUSH.get(), Items.ROSE_BUSH, consumer);
        powerFlowerRecipe(ItemInit.PEONY.get(), Items.PEONY, consumer);
    }

    private void powerFlowerRecipe(Item powerFlower, Item baseFlower, Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(powerFlower)
                .requires(baseFlower)
                .requires(Items.NETHER_STAR)
                .unlockedBy("has_nether_star", inventoryTrigger(ItemPredicate.Builder.item().of(Items.NETHER_STAR).build()))
                .save(consumer);
    }
}
