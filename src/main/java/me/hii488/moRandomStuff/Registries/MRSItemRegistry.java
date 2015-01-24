package me.hii488.moRandomStuff.Registries;

import me.hii488.moRandomStuff.Items.SimpleItem;
import me.hii488.moRandomStuff.Items.WitheredBoneMeal;
import me.hii488.moRandomStuff.Items.CustomWeaponTypes.BootySlapper;
import me.hii488.moRandomStuff.Items.CustomWeaponTypes.KitchenKnife;
import me.hii488.moRandomStuff.Items.transport.MetalBoat;
import me.hii488.moRandomStuff.ice.items.IceItems;
import me.hii488.moRandomStuff.main.HelperMethods;
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
    public static Item adamantineIngot;

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
    	adamantineIngot = new SimpleItem().setUnlocalizedName("adamantineIngot");

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
    	bootySlapper = (ItemSword) new BootySlapper(MRSTaAMaterialRegistry.bootySlapper).setUnlocalizedName("bootySlapper");

    	//Just Weird Things
    	kitchenKnife = (ItemSword) new KitchenKnife(MRSTaAMaterialRegistry.KitchenKnife).setUnlocalizedName("kitchenKnife");

    	HelperMethods.GameAndOreRegistry(silverIngot, "silverIngot");
    	HelperMethods.GameAndOreRegistry(gonumiteIngot, "gonumiteIngot");
    	HelperMethods.GameAndOreRegistry(dragoniteIngot, "dragoniteIngot");
    	HelperMethods.GameAndOreRegistry(enuriumIngot, "enuriumIngot");
    	HelperMethods.GameAndOreRegistry(binoiumIngot, "binoiumIngot");
    	HelperMethods.GameAndOreRegistry(zayuamiteIngot, "zayuamiteIngot");
    	HelperMethods.GameAndOreRegistry(obsidianIngot, "obsidianIngot");
    	HelperMethods.GameAndOreRegistry(adamantineIngot, "adamantineIngot");
    	
    	HelperMethods.GameAndOreRegistry(woodGear, "woodGear");
    	HelperMethods.GameAndOreRegistry(ironGear, "ironGear");
    	HelperMethods.GameAndOreRegistry(stoneGear, "stoneGear");

    	HelperMethods.GameAndOreRegistry(WitheredBones, "WitheredBones");
    	HelperMethods.GameAndOreRegistry(WitheredBoneMeal, "WitheredBoneMeal");
    	HelperMethods.GameAndOreRegistry(metalBoat, "metalBoat");
    	HelperMethods.GameAndOreRegistry(unicornHorn, "unicornHorn");
    	HelperMethods.GameAndOreRegistry(bloodBottle, "bloodBottle");
    	
    	HelperMethods.GameAndOreRegistry(bootySlapper, "bootySlapper");
    	HelperMethods.GameAndOreRegistry(kitchenKnife, "kitchenKnife");


    	IceItems.init();
    	MRSToolRegistry.toolReg();
    }

}
