package me.hii488.moRandomStuff.ice.items;

import me.hii488.moRandomStuff.main.Main;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class FrostRodFragment extends IceItem<FrostRodFragment> {

    private static final String DICT = "fragmentFrost";
    static FrostRodFragment instance;

    public FrostRodFragment() {
        super(1, 1);
        setTextureName(Main.MODID + ":" + DICT);
        // TODO: Create fragment textures with melt bar
        setUnlocalizedName(DICT);
    }

    public static void init() {
        instance = new FrostRodFragment();
        GameRegistry.registerItem(instance, DICT);
        OreDictionary.registerOre(DICT, instance);

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(instance, 2), FrostRod.DICT));
    }

    @Override
    public FrostRodFragment withMeltedness(int i) {
        // TODO: Add meltedness to this object -BJ
        return instance;
    }

    @Override
    public FrostRodFragment withNoMelt() {
        return instance;
    }

}
