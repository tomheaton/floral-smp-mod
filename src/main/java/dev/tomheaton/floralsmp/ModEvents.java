package dev.tomheaton.floralsmp;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
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

                // TODO: create custom base item and check if player has item of instance of that
                // then add method to item to get the effect needed, so that we can loop here and apply dynamically

                if (itemStack.is(ItemInit.DANDELION.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 100, true, true));
                }
                if (itemStack.is(ItemInit.POPPY.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200, 100, true, true));
                }
                if (itemStack.is(ItemInit.BLUE_ORCHID.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 100, true, true));
                    player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 200, 100, true, true));
                }
                if (itemStack.is(ItemInit.ALLIUM.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 100, true, true));
                }
                if (itemStack.is(ItemInit.AZURE_BLUET.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 100, true, true));
                }
                if (itemStack.is(ItemInit.RED_TULIP.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 100, true, true));
                }
                if (itemStack.is(ItemInit.ORANGE_TULIP.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 100, true, true));
                }
                if (itemStack.is(ItemInit.WHITE_TULIP.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 100, true, true));
                }
                if (itemStack.is(ItemInit.PINK_TULIP.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 100, true, true));
                }
                if (itemStack.is(ItemInit.OXEYE_DAISY.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 200, 100, true, true));
                }
                if (itemStack.is(ItemInit.CORNFLOWER.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 100, true, true));
                }
                if (itemStack.is(ItemInit.LILY_OF_THE_VALLEY.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.HEAL, 200, 100, true, true));
                    player.addEffect(new MobEffectInstance(MobEffects.SATURATION, 200, 100, true, true));
                }
                if (itemStack.is(ItemInit.WITHER_ROSE.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 100, true, true));
                    player.addEffect(new MobEffectInstance(MobEffects.HEAL, 200, 100, true, true));
                    player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 200, 100, true, true));
                    player.addEffect(new MobEffectInstance(MobEffects.SATURATION, 200, 100, true, true));
                    player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 100, true, true));
                }
                if (itemStack.is(ItemInit.SUNFLOWER.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 100, true, true));
                }
                if (itemStack.is(ItemInit.LILAC.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 200, 100, true, true));
                }
                if (itemStack.is(ItemInit.ROSE_BUSH.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.JUMP, 200, 100, true, true));
                    player.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 100, true, true));
                }
                if (itemStack.is(ItemInit.PEONY.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 100, true, true));
                }
                if (itemStack.is(ItemInit.BROWN_MUSHROOM.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 100, true, true));
                }
                if (itemStack.is(ItemInit.RED_MUSHROOM.get())) {
                    player.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 100, true, true));
                }
            }
        }
    }
}
