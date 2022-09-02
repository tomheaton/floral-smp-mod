package dev.tomheaton.floralsmp;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class BaseFlowerBlock extends FlowerBlock {

    public BaseFlowerBlock(MobEffect mobEffect, int effectDuration, Properties properties) {
        super(mobEffect, effectDuration, properties);
    }

    public BaseFlowerBlock() {
        super(MobEffects.BLINDNESS, 8, BlockBehaviour.Properties
                .of(Material.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
        );
    }

    @Override
    protected boolean mayPlaceOn(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return false;
    }
}
