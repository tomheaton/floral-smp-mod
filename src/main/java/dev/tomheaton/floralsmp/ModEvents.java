package dev.tomheaton.floralsmp;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
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

                if (itemStack.is(ItemInit.DANDELION.get())) {
                    FloralSMP.LOGGER.info("is instance of other flower");
                }
            }
        }
    }
}
