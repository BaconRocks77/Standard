package me.hii488.moRandomStuff.ice.items;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class FrostRodFragment extends IceItem {

    private static final String DICT = "fragmentFrost";
    static FrostRodFragment instance;

    public FrostRodFragment() {
        setUnlocalizedName(DICT);
    }

    public static void init() {
        instance = new FrostRodFragment();
        GameRegistry.registerItem(instance, DICT);
        OreDictionary.registerOre(DICT, instance);

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(instance, 2), FrostRod.DICT));
    }

}
