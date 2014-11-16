package me.hii488.moRandomStuff.ice.items;

import me.hii488.moRandomStuff.Registries.TabRegistry;
import me.hii488.moRandomStuff.main.Main;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class FrostCrown extends ItemArmor {

    private static final String DICT = "crownFrost";
    static FrostCrown instance;

    public FrostCrown() {
        super(ArmorMaterial.IRON, 0, 0);
        super.setTextureName(Main.MODID + ":crownFrost");
        setCreativeTab(TabRegistry.MRIIceTab);
        setUnlocalizedName(DICT);
    }

    public static void init() {
        instance = new FrostCrown();
//        TODO: Nov 16, 2014 - Finish the crown, then register it. -BJ
//        GameRegistry.registerItem(instance, DICT);
//        OreDictionary.registerOre(DICT, instance);
    }

}
