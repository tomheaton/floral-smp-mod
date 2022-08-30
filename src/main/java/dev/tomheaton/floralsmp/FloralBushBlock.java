package dev.tomheaton.floralsmp;

import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class FloralBushBlock extends BushBlock {

    public FloralBushBlock(Properties properties) {
        super(properties);
    }

    public FloralBushBlock() {
        super(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_BROWN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).lightLevel((p_50892_) -> 1));
    }
}
