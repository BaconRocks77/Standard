package me.hii488.moRandomStuff.Registries;

import me.hii488.moRandomStuff.Items.Axe;
import me.hii488.moRandomStuff.Items.Hoe;
import me.hii488.moRandomStuff.Items.PickAxe;
import me.hii488.moRandomStuff.Items.SimpleItem;
import me.hii488.moRandomStuff.Items.Spade;
import me.hii488.moRandomStuff.Items.Sword;
import me.hii488.moRandomStuff.Items.WitheredBoneMeal;
import me.hii488.moRandomStuff.Items.CustomWeaponTypes.BootySlapper;
import me.hii488.moRandomStuff.Items.CustomWeaponTypes.KitchenKnife;
import me.hii488.moRandomStuff.Items.transport.MetalBoat;
import me.hii488.moRandomStuff.ice.items.IceItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.common.registry.GameRegistry;

public class MRSItemRegistry{

    public static Item silverIngot;
    public static Item gonumiteIngot;
    public static Item dragoniteIngot;
    public static Item enuriumIngot;
    public static Item zayuamiteIngot;
    public static Item binoiumIngot;

    //Silver items
    public static ItemSword silverSword;
    public static ItemAxe silverAxe;
    public static ItemPickaxe silverPick;
    public static ItemHoe silverHoe;
    public static ItemSpade silverSpade;

    //Gonumite items
    public static ItemSword gonumiteSword;
    public static ItemAxe gonumiteAxe;
    public static ItemPickaxe gonumitePick;
    public static ItemHoe gonumiteHoe;
    public static ItemSpade gonumiteSpade;

      //dragonite items
    public static ItemSword dragoniteSword;
    public static ItemAxe dragoniteAxe;
    public static ItemPickaxe dragonitePick;
    public static ItemHoe dragoniteHoe;
    public static ItemSpade dragoniteSpade;

  //enurium items
    public static ItemSword enuriumSword;
    public static ItemAxe enuriumAxe;
    public static ItemPickaxe enuriumPick;
    public static ItemHoe enuriumHoe;
    public static ItemSpade enuriumSpade;

  //binoium items
    public static ItemSword binoiumSword;
    public static ItemAxe binoiumAxe;
    public static ItemPickaxe binoiumPick;
    public static ItemHoe binoiumHoe;
    public static ItemSpade binoiumSpade;

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

    	//Gears
    	woodGear = new SimpleItem().setUnlocalizedName("woodGear");
    	ironGear = new SimpleItem().setUnlocalizedName("ironGear");
    	stoneGear = new SimpleItem().setUnlocalizedName("stoneGear");

    	//SilverItems
    	silverSword = (ItemSword) new Sword(TaAMaterialRegistry.silver).setUnlocalizedName("silverSword");
    	silverAxe = (ItemAxe) new Axe(TaAMaterialRegistry.silver).setUnlocalizedName("silverAxe");
    	silverHoe = (ItemHoe) new Hoe(TaAMaterialRegistry.silver).setUnlocalizedName("silverHoe");
    	silverPick = (ItemPickaxe) new PickAxe(TaAMaterialRegistry.silver).setUnlocalizedName("silverPick");
    	silverSpade = (ItemSpade) new Spade(TaAMaterialRegistry.silver).setUnlocalizedName("silverSpade");

    	//gonumite Items
    	gonumiteSword = (ItemSword) new Sword(TaAMaterialRegistry.gonumite).setUnlocalizedName("gonumiteSword");
    	gonumiteAxe = (ItemAxe) new Axe(TaAMaterialRegistry.gonumite).setUnlocalizedName("gonumiteAxe");
    	gonumiteHoe = (ItemHoe) new Hoe(TaAMaterialRegistry.gonumite).setUnlocalizedName("gonumiteHoe");
    	gonumitePick = (ItemPickaxe) new PickAxe(TaAMaterialRegistry.gonumite).setUnlocalizedName("gonumitePick");
    	gonumiteSpade = (ItemSpade) new Spade(TaAMaterialRegistry.gonumite).setUnlocalizedName("gonumiteSpade");

    	//dragonite Items
    	dragoniteSword = (ItemSword) new Sword(TaAMaterialRegistry.dragonite).setUnlocalizedName("dragoniteSword");
    	dragoniteAxe = (ItemAxe) new Axe(TaAMaterialRegistry.dragonite).setUnlocalizedName("dragoniteAxe");
    	dragoniteHoe = (ItemHoe) new Hoe(TaAMaterialRegistry.dragonite).setUnlocalizedName("dragoniteHoe");
    	dragonitePick = (ItemPickaxe) new PickAxe(TaAMaterialRegistry.dragonite).setUnlocalizedName("dragonitePick");
    	dragoniteSpade = (ItemSpade) new Spade(TaAMaterialRegistry.dragonite).setUnlocalizedName("dragoniteSpade");

    	//enurium Items
    	enuriumSword = (ItemSword) new Sword(TaAMaterialRegistry.enurium).setUnlocalizedName("enuriumSword");
    	enuriumAxe = (ItemAxe) new Axe(TaAMaterialRegistry.enurium).setUnlocalizedName("enuriumAxe");
    	enuriumHoe = (ItemHoe) new Hoe(TaAMaterialRegistry.enurium).setUnlocalizedName("enuriumHoe");
    	enuriumPick = (ItemPickaxe) new PickAxe(TaAMaterialRegistry.enurium).setUnlocalizedName("enuriumPick");
    	enuriumSpade = (ItemSpade) new Spade(TaAMaterialRegistry.enurium).setUnlocalizedName("enuriumSpade");

    	//binoium Items
    	binoiumSword = (ItemSword) new Sword(TaAMaterialRegistry.binoium).setUnlocalizedName("binoiumSword");
    	binoiumAxe = (ItemAxe) new Axe(TaAMaterialRegistry.binoium).setUnlocalizedName("binoiumAxe");
    	binoiumHoe = (ItemHoe) new Hoe(TaAMaterialRegistry.binoium).setUnlocalizedName("binoiumHoe");
    	binoiumPick = (ItemPickaxe) new PickAxe(TaAMaterialRegistry.binoium).setUnlocalizedName("binoiumPick");
    	binoiumSpade = (ItemSpade) new Spade(TaAMaterialRegistry.binoium).setUnlocalizedName("binoiumSpade");

    	//Misc
    	WitheredBones = new SimpleItem().setUnlocalizedName("WitheredBones");
    	WitheredBoneMeal = new WitheredBoneMeal().setUnlocalizedName("WitheredBoneMeal");
    	metalBoat = new MetalBoat().setUnlocalizedName("metalBoat");
    	unicornHorn = new SimpleItem().setUnlocalizedName("unicornHorn");
    	bloodBottle = new SimpleItem().setUnlocalizedName("bloodBottle");
    	
    	//Misc Weapons
    	bootySlapper = (ItemSword) new BootySlapper(TaAMaterialRegistry.bootySlapper).setUnlocalizedName("BootySlapper");

    	//Just Weird Things
    	kitchenKnife = (ItemSword) new KitchenKnife(TaAMaterialRegistry.KitchenKnife).setUnlocalizedName("KitchenKnife");

    	GameRegistry.registerItem(silverIngot, "silverIngot");
    	GameRegistry.registerItem(gonumiteIngot, "gonumiteIngot");
    	GameRegistry.registerItem(dragoniteIngot, "dragoniteIngot");
    	GameRegistry.registerItem(enuriumIngot, "enuriumIngot");
    	GameRegistry.registerItem(binoiumIngot, "binoiumIngot");
    	GameRegistry.registerItem(zayuamiteIngot, "zayuamiteIngot");

    	GameRegistry.registerItem(woodGear, "woodGear");
    	GameRegistry.registerItem(ironGear, "ironGear");
    	GameRegistry.registerItem(stoneGear, "stoneGear");

    	GameRegistry.registerItem(silverAxe, "silverAxe");
    	GameRegistry.registerItem(silverSword, "silverSword");
    	GameRegistry.registerItem(silverHoe, "silverHoe");
    	GameRegistry.registerItem(silverPick, "silverPick");
    	GameRegistry.registerItem(silverSpade, "silverSpade");

    	GameRegistry.registerItem(gonumiteAxe, "gonumiteAxe");
    	GameRegistry.registerItem(gonumiteSword, "gonumiteSword");
    	GameRegistry.registerItem(gonumiteHoe, "gonumiteHoe");
    	GameRegistry.registerItem(gonumitePick, "gonumitePick");
    	GameRegistry.registerItem(gonumiteSpade, "gonumiteSpade");

    	GameRegistry.registerItem(dragoniteAxe, "dragoniteAxe");
    	GameRegistry.registerItem(dragoniteSword, "dragoniteSword");
    	GameRegistry.registerItem(dragoniteHoe, "dragoniteHoe");
    	GameRegistry.registerItem(dragonitePick, "dragonitePick");
    	GameRegistry.registerItem(dragoniteSpade, "dragoniteSpade");

    	GameRegistry.registerItem(enuriumAxe, "enuriumAxe");
    	GameRegistry.registerItem(enuriumSword, "enuriumSword");
    	GameRegistry.registerItem(enuriumHoe, "enuriumHoe");
    	GameRegistry.registerItem(enuriumPick, "enuriumPick");
    	GameRegistry.registerItem(enuriumSpade, "enuriumSpade");

    	GameRegistry.registerItem(binoiumAxe, "binoiumAxe");
    	GameRegistry.registerItem(binoiumSword, "binoiumSword");
    	GameRegistry.registerItem(binoiumHoe, "binoiumHoe");
    	GameRegistry.registerItem(binoiumPick, "binoiumPick");
    	GameRegistry.registerItem(binoiumSpade, "binoiumSpade");

    	GameRegistry.registerItem(WitheredBones, "WitheredBones");
    	GameRegistry.registerItem(WitheredBoneMeal, "WitheredBoneMeal");
    	GameRegistry.registerItem(metalBoat, "metalBoat");
    	GameRegistry.registerItem(unicornHorn, "unicornHorn");
    	GameRegistry.registerItem(bloodBottle, "bloodBottle");
    	
    	GameRegistry.registerItem(bootySlapper, "BootySlapper");
    	GameRegistry.registerItem(kitchenKnife, "KitchenKnife");

    	IceItems.init();
    }

}
