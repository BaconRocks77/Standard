package me.hii488.moRandomStuff.ice.items;

import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class FrostRod extends IceItem {

    static FrostRod instance;

    private static final String DICT = "rodFrost";

    public FrostRod() {
        setUnlocalizedName(DICT);
    }

    public static void init() {
        instance = new FrostRod();
        GameRegistry.registerItem(instance, DICT);
        OreDictionary.registerOre(DICT, instance);
    }

}
