package dev.tomheaton.floralsmp;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;

public class FloralBlockItem extends BlockItem {

    public FloralBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    public FloralBlockItem(Block block) {
        super(block, new Item.Properties().tab(FloralSMP.floralItemGroup));
    }

    @Override
    public InteractionResult place(BlockPlaceContext blockPlaceContext) {
        return InteractionResult.FAIL;
    }
}
