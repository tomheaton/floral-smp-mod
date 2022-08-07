package dev.tomheaton.floralsmp;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WitherRoseBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FloralSMP.MODID);

    // EXAMPLE:
//    public static final Block AZURE_BLUET = register("azure_bluet", new FloralFlowerBlock(MobEffects.BLINDNESS, 8, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));

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

    public static final RegistryObject<Block> WITHER_ROSE = BLOCKS.register("wither_rose", () -> new WitherRoseBlock(MobEffects.WITHER, BlockBehaviour.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ)));

    /*public static final RegistryObject<Block> BROWN_MUSHROOM = BLOCKS.register("brown_mushroom", () -> new MushroomBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_BROWN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).lightLevel((p_50892_) -> {
        return 1;
    }).hasPostProcess(Blocks::always), () -> {
        return TreeFeatures.HUGE_BROWN_MUSHROOM;
    }));
    public static final RegistryObject<Block> RED_MUSHROOM = BLOCKS.register("red_mushroom", () -> new MushroomBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_RED).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).hasPostProcess(Blocks::always), () -> {
        return TreeFeatures.HUGE_RED_MUSHROOM;
    }));*/

    public static final RegistryObject<Block> SUNFLOWER = BLOCKS.register("sunflower", FloralTallFlowerBlock::new);
    public static final RegistryObject<Block> LILAC = BLOCKS.register("lilac", FloralTallFlowerBlock::new);
    public static final RegistryObject<Block> ROSE_BUSH = BLOCKS.register("rose_bush", FloralTallFlowerBlock::new);
    public static final RegistryObject<Block> PEONY = BLOCKS.register("peony", FloralTallFlowerBlock::new);
}
