package me.hii488.moRandomStuff.ice.items;

import java.util.concurrent.atomic.AtomicInteger;

import me.hii488.moRandomStuff.Registries.TabRegistry;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

/**
 * IMPORTANT: IceItems DO NOT support damage.
 */
public abstract class IceItem<T extends Item> extends Item implements Melting<T> {

    public static final int TICKS_BETWEEN_MELT = 200;
    private final AtomicInteger tickCounter = new AtomicInteger(0);
    private int lastChunkX = -9999;
    private int lastChunkZ = -9999;

    private boolean isInWarmBiome = false;
    private final int maxMelt;
    protected int meltedness;

    protected IceItem(int meltLevel, int maxMeltedness) {
        this.setCreativeTab(TabRegistry.MRIIceTab);
        this.meltedness = meltLevel;
        this.maxMelt = maxMeltedness;
    }

    @Override
    public boolean onEntityItemUpdate(EntityItem self) {
        boolean superOnUpdate = super.onEntityItemUpdate(self);
        if (shouldMelt(self)) {
            meltNow(self);
        }
        return superOnUpdate;
    }

    private boolean shouldMelt(EntityItem self) {
        if (tickCounter.incrementAndGet() < TICKS_BETWEEN_MELT) {
            return false;
        }
        tickCounter.set(0);
        int chunkCoordX = self.chunkCoordX;
        int chunkCoordZ = self.chunkCoordZ;
        if (chunkCoordX == lastChunkX && chunkCoordZ == lastChunkZ) {
            if (isInWarmBiome) {
                return true;
            }
        }
        lastChunkX = chunkCoordX;
        lastChunkZ = chunkCoordZ;

        BiomeGenBase biomeGenForCoords = self.worldObj.getBiomeGenForCoords(chunkCoordX, chunkCoordZ);
        isInWarmBiome = !IceItems.isBiomeCold(biomeGenForCoords);
        if (isInWarmBiome) {
            return true;
        }
        return false;
    }

    private void meltNow(EntityItem self) {
        ItemStack item = self.getEntityItem();
        IceItem<?> iceItem = (IceItem<?>) item.getItem();
        int currentDamage = iceItem.getMeltedness();
        int newDamage = currentDamage + 1;
        if (newDamage > iceItem.getMaxMeltedness()) {
            self.worldObj.setBlock((int) self.posX, (int) self.posY, (int) self.posZ, Blocks.flowing_water, 3, 1);
            item.stackSize--;
            self.setEntityItemStack(new ItemStack(iceItem.withNoMelt(), item.stackSize));
            if (item.stackSize <= 0) {
                self.setDead();
            }
        } else {
            self.setEntityItemStack(new ItemStack(iceItem.withMeltedness(newDamage), item.stackSize));
        }
    }

    protected void combineMeltValues(EntityItemPickupEvent e) {
        ItemStack pickedUpItem = e.item.getEntityItem();
        if (pickedUpItem.getItem() instanceof IceItem) {
            if (!e.entityPlayer.inventory.hasItem(pickedUpItem.getItem())) {
                return; // just add it to the inventory as usual
            }
            ItemStack[] inventory = e.entityPlayer.inventory.mainInventory;
            for (int i = 0; i < inventory.length; i++) {
                if (pickedUpItem.stackSize == 0) {
                    return;
                }
                ItemStack itemStack = inventory[i];
                if (itemStack.stackSize == itemStack.getMaxStackSize()) {
                    continue;
                }
                Item stackItem = itemStack.getItem();
                if (stackItem.getClass().equals(pickedUpItem.getItem().getClass())) {
                    IceItem<?> iceItem = (IceItem<?>) stackItem;
                    int amountToAddToStack = Math.min(itemStack.getMaxStackSize() - itemStack.stackSize, pickedUpItem.stackSize);
                    int amountToRemove = amountToAddToStack;
                    if (isCloseToMeltingOneAway(iceItem)) {
                        amountToAddToStack -= 1;
                    }
                    int inventoryStackAmount = itemStack.stackSize + amountToAddToStack;
                    pickedUpItem.stackSize -= amountToRemove;
                    inventory[i] = new ItemStack(iceItem.withNoMelt(), inventoryStackAmount);
                }
            }
        }
    }

    private boolean isCloseToMeltingOneAway(IceItem<?> itemStack) {
        return itemStack.getMeltedness() > itemStack.getMaxMeltedness() / 2;
    }

    @Override
    public int getMaxMeltedness() {
        return maxMelt;
    }

    @Override
    public int getMeltedness() {
        return meltedness;
    }

}
