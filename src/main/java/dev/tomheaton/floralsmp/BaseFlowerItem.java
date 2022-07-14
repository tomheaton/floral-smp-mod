package dev.tomheaton.floralsmp;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class BaseFlowerItem extends Item {

    public BaseFlowerItem() {
        // TODO: create custom Creative Tab
        super(new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC));
    }
}
