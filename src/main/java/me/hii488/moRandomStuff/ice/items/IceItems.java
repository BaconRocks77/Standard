package me.hii488.moRandomStuff.ice.items;

import net.minecraft.item.Item;

/**
 * Items originating from winter, frost, and ice regions/entities.
 */
public class IceItems {

    public static void init() {
        FrostRod.init();
        FrostCrown.init();
    }

    public static Item getFrostCrown() {
        return FrostCrown.instance;
    }

}
