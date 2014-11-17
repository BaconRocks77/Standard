package me.hii488.moRandomStuff.ice.items;

import java.util.concurrent.atomic.AtomicInteger;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

/**
 * Items originating from winter, frost, and ice regions/entities.
 */
public class IceItems {

    public static final class MeltTickHandler {
        AtomicInteger tickCount = new AtomicInteger();

        @SubscribeEvent
        public void def(PlayerTickEvent e) {
            if (tickCount.incrementAndGet() == IceItem.TICKS_BETWEEN_MELT) {
                tickCount.set(0);
                IceItems.meltInventoryFromTick(e.player.inventory);
            }
        }
    }

    public static final MeltTickHandler MELT_TICK_HANDLER = new MeltTickHandler();

    public static void init() {
        FrostRod.init();
        FrostCrown.init();
        FrostRodFragment.init();
        FMLCommonHandler.instance().bus().register(MELT_TICK_HANDLER);
    }

    protected static void meltInventoryFromTick(InventoryPlayer inventory) {
        ItemStack[] inv = inventory.mainInventory;
        for (int i = 0; i < inv.length; i++) {
            ItemStack stack = inv[i];
            if (stack == null) {
                continue;
            }
            if (stack.getItem() instanceof IceItem) {

                IceItem<?> iceItem = (IceItem<?>) stack.getItem();
                int integer = iceItem.getMeltedness();
                int damageAfter = integer + 1;
                System.out.println("Damage will be " + damageAfter + " out of " + iceItem.getMaxMeltedness());
                int maxMeltedness = iceItem.getMaxMeltedness();
                if (damageAfter >= maxMeltedness) {
                    stack.stackSize--;
                    inv[i] = new ItemStack(iceItem.withNoMelt(), stack.stackSize - 1);

                } else {
                    inv[i] = new ItemStack(iceItem.withMeltedness(damageAfter), stack.stackSize);
                }
            }
        }
    }

    public static Item getFrostCrown() {
        return FrostCrown.instance;
    }

    public static Item getFrostRodFragment() {
        return FrostRodFragment.instance;
    }

    public static boolean isBiomeCold(BiomeGenBase biome) {
        if (BiomeDictionary.isBiomeOfType(biome, Type.SNOWY)) {
            return true;
        }
        if (BiomeDictionary.isBiomeOfType(biome, Type.COLD)) {
            return true;
        }
        return false;
    }

}
