package dev.tomheaton.floralsmp;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FloralSMP.MODID);

    // TEST
    public static final RegistryObject<FlowerBlock> EXAMPLE_FLOWER = register("test_flower",
            () -> new FlowerBlock(MobEffects.DIG_SPEED, 300, BlockBehaviour.Properties.copy(Blocks.DANDELION)),
            new Item.Properties().tab(FloralSMP.floralItemGroup));

    public static final RegistryObject<Block> DANDELION = BLOCKS.register("dandelion", () -> new FloralFlowerBlock(MobEffects.SATURATION, 7));
    public static final RegistryObject<Block> POPPY = BLOCKS.register("poppy", () -> new FloralFlowerBlock(MobEffects.NIGHT_VISION, 5));
    public static final RegistryObject<Block> BLUE_ORCHID = BLOCKS.register("blue_orchid", () -> new FloralFlowerBlock(MobEffects.SATURATION, 7));
    public static final RegistryObject<Block> ALLIUM = BLOCKS.register("allium", () -> new FloralFlowerBlock(MobEffects.FIRE_RESISTANCE, 4));
    public static final RegistryObject<Block> AZURE_BLUET = BLOCKS.register("azure_bluet", () -> new FloralFlowerBlock(MobEffects.BLINDNESS, 8));
    public static final RegistryObject<Block> RED_TULIP = BLOCKS.register("red_tulip", () -> new FloralFlowerBlock(MobEffects.WEAKNESS, 9));
    public static final RegistryObject<Block> ORANGE_TULIP = BLOCKS.register("orange_tulip", () -> new FloralFlowerBlock(MobEffects.WEAKNESS, 9));
    public static final RegistryObject<Block> WHITE_TULIP = BLOCKS.register("white_tulip", () -> new FloralFlowerBlock(MobEffects.WEAKNESS, 9));
    public static final RegistryObject<Block> PINK_TULIP = BLOCKS.register("pink_tulip", () -> new FloralFlowerBlock(MobEffects.WEAKNESS, 9));
    public static final RegistryObject<Block> OXEYE_DAISY = BLOCKS.register("oxeye_daisy", () -> new FloralFlowerBlock(MobEffects.REGENERATION, 8));
    public static final RegistryObject<Block> CORNFLOWER = BLOCKS.register("cornflower", () -> new FloralFlowerBlock(MobEffects.JUMP, 6));
    public static final RegistryObject<Block> LILY_OF_THE_VALLEY = BLOCKS.register("lily_of_the_valley", () -> new FloralFlowerBlock(MobEffects.POISON, 12));

    // TODO: custom flower block here?
    public static final RegistryObject<Block> WITHER_ROSE = BLOCKS.register("wither_rose", () -> new WitherRoseBlock(MobEffects.WITHER, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));

    public static final RegistryObject<Block> SUNFLOWER = BLOCKS.register("sunflower", FloralTallFlowerBlock::new);
    public static final RegistryObject<Block> LILAC = BLOCKS.register("lilac", FloralTallFlowerBlock::new);
    public static final RegistryObject<Block> ROSE_BUSH = BLOCKS.register("rose_bush", FloralTallFlowerBlock::new);
    public static final RegistryObject<Block> PEONY = BLOCKS.register("peony", FloralTallFlowerBlock::new);

    public static final RegistryObject<Block> BROWN_MUSHROOM = BLOCKS.register("brown_mushroom", FloralBushBlock::new);
    public static final RegistryObject<Block> RED_MUSHROOM = BLOCKS.register("red_mushroom", FloralBushBlock::new);
}
