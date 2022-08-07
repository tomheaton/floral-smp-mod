package dev.tomheaton.floralsmp;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TallFlowerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class FloralTallFlowerBlock extends TallFlowerBlock {

    public FloralTallFlowerBlock(Properties properties) {
        super(properties);
    }

    public FloralTallFlowerBlock() {
        super(BlockBehaviour.Properties
                .of(Material.REPLACEABLE_PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
        );
    }
}
