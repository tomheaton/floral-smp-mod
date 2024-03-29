
package dev.tomheaton.floralsmp.item;

import dev.tomheaton.floralsmp.FloralSMP;
import dev.tomheaton.floralsmp.block.BlockInit;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FloralSMP.MODID);

    public static final RegistryObject<FloralBlockItem> DANDELION = ITEMS.register("dandelion",
            () -> new FloralBlockItem(BlockInit.DANDELION.get()));
    public static final RegistryObject<FloralBlockItem> POPPY = ITEMS.register("poppy",
            () -> new FloralBlockItem(BlockInit.POPPY.get()));
    public static final RegistryObject<FloralBlockItem> BLUE_ORCHID = ITEMS.register("blue_orchid",
            () -> new FloralBlockItem(BlockInit.BLUE_ORCHID.get()));
    public static final RegistryObject<FloralBlockItem> ALLIUM = ITEMS.register("allium",
            () -> new FloralBlockItem(BlockInit.ALLIUM.get()));
    public static final RegistryObject<FloralBlockItem> AZURE_BLUET = ITEMS.register("azure_bluet",
            () -> new FloralBlockItem(BlockInit.AZURE_BLUET.get()));
    public static final RegistryObject<FloralBlockItem> RED_TULIP = ITEMS.register("red_tulip",
            () -> new FloralBlockItem(BlockInit.RED_TULIP.get()));
    public static final RegistryObject<FloralBlockItem> ORANGE_TULIP = ITEMS.register("orange_tulip",
            () -> new FloralBlockItem(BlockInit.ORANGE_TULIP.get()));
    public static final RegistryObject<FloralBlockItem> WHITE_TULIP = ITEMS.register("white_tulip",
            () -> new FloralBlockItem(BlockInit.WHITE_TULIP.get()));
    public static final RegistryObject<FloralBlockItem> PINK_TULIP = ITEMS.register("pink_tulip",
            () -> new FloralBlockItem(BlockInit.PINK_TULIP.get()));
    public static final RegistryObject<FloralBlockItem> OXEYE_DAISY = ITEMS.register("oxeye_daisy",
            () -> new FloralBlockItem(BlockInit.OXEYE_DAISY.get()));
    public static final RegistryObject<FloralBlockItem> CORNFLOWER = ITEMS.register("cornflower",
            () -> new FloralBlockItem(BlockInit.CORNFLOWER.get()));
    public static final RegistryObject<FloralBlockItem> LILY_OF_THE_VALLEY = ITEMS.register("lily_of_the_valley",
            () -> new FloralBlockItem(BlockInit.LILY_OF_THE_VALLEY.get()));

    public static final RegistryObject<FloralBlockItem> WITHER_ROSE = ITEMS.register("wither_rose",
            () -> new FloralBlockItem(BlockInit.WITHER_ROSE.get()));

    public static final RegistryObject<FloralBlockItem> SUNFLOWER = ITEMS.register("sunflower",
            () -> new FloralBlockItem(BlockInit.SUNFLOWER.get()));
    public static final RegistryObject<FloralBlockItem> LILAC = ITEMS.register("lilac",
            () -> new FloralBlockItem(BlockInit.LILAC.get()));
    public static final RegistryObject<FloralBlockItem> ROSE_BUSH = ITEMS.register("rose_bush",
            () -> new FloralBlockItem(BlockInit.ROSE_BUSH.get()));
    public static final RegistryObject<FloralBlockItem> PEONY = ITEMS.register("peony",
            () -> new FloralBlockItem(BlockInit.PEONY.get()));

    public static final RegistryObject<FloralBlockItem> BROWN_MUSHROOM = ITEMS.register("brown_mushroom",
            () -> new FloralBlockItem(BlockInit.BROWN_MUSHROOM.get()));

    public static final RegistryObject<FloralBlockItem> RED_MUSHROOM = ITEMS.register("red_mushroom",
            () -> new FloralBlockItem(BlockInit.RED_MUSHROOM.get()));

    public static final RegistryObject<FloralBlockItem> CACTUS = ITEMS.register("cactus",
            () -> new FloralBlockItem(BlockInit.CACTUS.get()));
}
