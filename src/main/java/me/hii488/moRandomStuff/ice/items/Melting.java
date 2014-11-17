package me.hii488.moRandomStuff.ice.items;

import net.minecraft.item.Item;

/**
 * Marker interface for items that can melt.
 *
 * @author Brad
 */
public interface Melting<T extends Item> {

    int getMeltedness();

    int getMaxMeltedness();

    T withMeltedness(int i);

    T withNoMelt();

}
