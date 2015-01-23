package me.hii488.moRandomStuff.Registries;

import me.hii488.moRandomStuff.Items.SimpleItem;
import me.hii488.moRandomStuff.Items.WitheredBoneMeal;
import me.hii488.moRandomStuff.Items.CustomWeaponTypes.BootySlapper;
import me.hii488.moRandomStuff.Items.CustomWeaponTypes.KitchenKnife;
import me.hii488.moRandomStuff.Items.transport.MetalBoat;
import me.hii488.moRandomStuff.ice.items.IceItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class MRSItemRegistry{

    public static Item silverIngot;
    public static Item gonumiteIngot;
    public static Item dragoniteIngot;
    public static Item enuriumIngot;
    public static Item zayuamiteIngot;
    public static Item binoiumIngot;
    public static Item obsidianIngot;

    //Gears
    public static Item woodGear;
    public static Item stoneGear;
    public static Item ironGear;

    //Misc weapons
    public static ItemSword bootySlapper;

    //Misc
    public static Item WitheredBones;
    public static Item WitheredBoneMeal;
    public static Item metalBoat;
    public static Item unicornHorn;
    public static Item bloodBottle;

    //Misc other stuff
    public static ItemSword kitchenKnife;

    public static void registerItems(){
    	//Ingots
    	silverIngot = new SimpleItem().setUnlocalizedName("silverIngot");
    	gonumiteIngot = new SimpleItem().setUnlocalizedName("gonumiteIngot");
    	dragoniteIngot = new SimpleItem().setUnlocalizedName("dragoniteIngot");
    	enuriumIngot = new SimpleItem().setUnlocalizedName("enuriumIngot");
    	zayuamiteIngot = new SimpleItem().setUnlocalizedName("zayuamiteIngot");
    	binoiumIngot = new SimpleItem().setUnlocalizedName("binoiumIngot");
    	obsidianIngot = new SimpleItem().setUnlocalizedName("obsidianIngot");

    	//Gears
    	woodGear = new SimpleItem().setUnlocalizedName("woodGear");
    	ironGear = new SimpleItem().setUnlocalizedName("ironGear");
    	stoneGear = new SimpleItem().setUnlocalizedName("stoneGear");

    	//Misc
    	WitheredBones = new SimpleItem().setUnlocalizedName("WitheredBones");
    	WitheredBoneMeal = new WitheredBoneMeal().setUnlocalizedName("WitheredBoneMeal");
    	metalBoat = new MetalBoat().setUnlocalizedName("metalBoat");
    	unicornHorn = new SimpleItem().setUnlocalizedName("unicornHorn");
    	bloodBottle = new SimpleItem().setUnlocalizedName("bloodBottle");
    	
    	//Misc Weapons
    	bootySlapper = (ItemSword) new BootySlapper(MRSTaAMaterialRegistry.bootySlapper).setUnlocalizedName("BootySlapper");

    	//Just Weird Things
    	kitchenKnife = (ItemSword) new KitchenKnife(MRSTaAMaterialRegistry.KitchenKnife).setUnlocalizedName("KitchenKnife");

    	GameRegistry.registerItem(silverIngot, "silverIngot");
    	GameRegistry.registerItem(gonumiteIngot, "gonumiteIngot");
    	GameRegistry.registerItem(dragoniteIngot, "dragoniteIngot");
    	GameRegistry.registerItem(enuriumIngot, "enuriumIngot");
    	GameRegistry.registerItem(binoiumIngot, "binoiumIngot");
    	GameRegistry.registerItem(zayuamiteIngot, "zayuamiteIngot");
    	GameRegistry.registerItem(obsidianIngot, "obsidianIngot");
    	
    	GameRegistry.registerItem(woodGear, "woodGear");
    	GameRegistry.registerItem(ironGear, "ironGear");
    	GameRegistry.registerItem(stoneGear, "stoneGear");

    	GameRegistry.registerItem(WitheredBones, "WitheredBones");
    	GameRegistry.registerItem(WitheredBoneMeal, "WitheredBoneMeal");
    	GameRegistry.registerItem(metalBoat, "metalBoat");
    	GameRegistry.registerItem(unicornHorn, "unicornHorn");
    	GameRegistry.registerItem(bloodBottle, "bloodBottle");
    	
    	GameRegistry.registerItem(bootySlapper, "BootySlapper");
    	GameRegistry.registerItem(kitchenKnife, "KitchenKnife");

    	IceItems.init();
    	MRSToolRegistry.toolReg();
    }
    
    public static void itemOreDictReg(){
    	OreDictionary.registerOre("silverIngot", silverIngot);
    }

}
