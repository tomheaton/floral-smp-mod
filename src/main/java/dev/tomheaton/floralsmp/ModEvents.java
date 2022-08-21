package dev.tomheaton.floralsmp;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.predicates.InvertedLootItemCondition;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FloralSMP.MODID)
public class ModEvents {

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.side == LogicalSide.SERVER) {
//            event.player.sendSystemMessage(Component.literal("Server player tick"));
            Player player = event.player;

            Inventory inventory = player.getInventory();
            for (int i = 0; i < 9; ++i) {
                ItemStack itemStack = inventory.items.get(i);
                if (itemStack.isEmpty()) continue;

                FloralSMP.LOGGER.info("item: " + itemStack.getItem());
            }

            if (player.getInventory().contains(new ItemStack(ItemInit.DANDELION.get()))) {
//                FloralSMP.LOGGER.info(String.valueOf(player.getName()));
                FloralSMP.LOGGER.info("DANDELION");
//                event.player.sendSystemMessage(Component.literal("Server player tick with item"));
            }

            if (player.getInventory().contains(new ItemStack(Items.DANDELION))) {
//                FloralSMP.LOGGER.info(String.valueOf(player.getName()));
                FloralSMP.LOGGER.info("DANDELION CUSTOM");
//                event.player.sendSystemMessage(Component.literal("Server player tick with item (official)"));
            }
        }
    }
}
