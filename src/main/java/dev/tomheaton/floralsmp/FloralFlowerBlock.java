package dev.tomheaton.floralsmp;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class FloralFlowerBlock extends FlowerBlock {

    public FloralFlowerBlock(MobEffect mobEffect, int effectDuration, Properties properties) {
        super(mobEffect, effectDuration, properties);
    }

    public FloralFlowerBlock(MobEffect mobEffect, int effectDuration) {
        super(mobEffect, effectDuration, Properties
                .of(Material.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(OffsetType.XZ)
        );
    }

    public FloralFlowerBlock() {
        super(MobEffects.BLINDNESS, 8, Properties
                        .of(Material.PLANT)
                        .noCollission()
                        .instabreak()
                        .sound(SoundType.GRASS)
                        .offsetType(OffsetType.XZ)
        );
    }
}
