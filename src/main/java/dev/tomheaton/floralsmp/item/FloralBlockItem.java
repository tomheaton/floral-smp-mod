package dev.tomheaton.floralsmp.item;

import dev.tomheaton.floralsmp.FloralSMP;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

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

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.floralsmp.base").withStyle(ChatFormatting.AQUA));

        if (Screen.hasShiftDown()) {
            components.add(Component.translatable("tooltip.floralsmp." + stack.getDescriptionId().split("\\.")[2]).withStyle(ChatFormatting.WHITE));
        } else {
            components.add(Component.translatable("tooltip.floralsmp.shift").withStyle(ChatFormatting.YELLOW));
        }

        super.appendHoverText(stack, level, components, flag);
    }

    @Override
    public Rarity getRarity(ItemStack itemStack) {
        return Rarity.EPIC;
    }
}
