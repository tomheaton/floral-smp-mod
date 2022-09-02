package dev.tomheaton.floralsmp.item;

import dev.tomheaton.floralsmp.FloralSMP;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class FloralItemGroup extends CreativeModeTab {

    public FloralItemGroup() {
        super(FloralSMP.MODID + ".main");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.RED_TULIP);
    }
}
