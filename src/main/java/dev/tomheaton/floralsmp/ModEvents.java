package dev.tomheaton.floralsmp;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
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

            if (player.getInventory().contains(new ItemStack(ItemInit.DANDELION.get()))) {
                event.player.sendSystemMessage(Component.literal("Server player tick with item"));
            }

            if (player.getInventory().contains(new ItemStack(Items.DANDELION))) {
                event.player.sendSystemMessage(Component.literal("Server player tick with item (official)"));
            }
        }
    }
}
