package me.hii488.moRandomStuff.Registries;

import me.hii488.moRandomStuff.Food.EnderFlesh;
import me.hii488.moRandomStuff.Food.IronApple;
import me.hii488.moRandomStuff.Food.JustFood;
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
import net.minecraft.item.ItemFood;
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

    //Food
    public static ItemFood squidMeat;
    public static ItemFood cookedSquidMeat;
    public static ItemFood rawMutton;
    public static ItemFood cookedMutton;
    public static ItemFood chips;
    public static ItemFood enderFlesh;
    public static ItemFood cookedFlesh;
    public static ItemFood sausage;
    public static ItemFood breadSlice;
    public static ItemFood hotDog;
    public static ItemFood friedEgg;
    public static ItemFood strawberry;
    public static ItemFood plainDoughnut;
    public static ItemFood chocDoughnut;
    public static ItemFood sugarDoughnut;
    public static ItemFood strawberryDoughnut;
    public static ItemFood butterEyeball;
    public static ItemFood ironApple;
    public static ItemFood honey;
    public static ItemFood gummySkull;
    public static ItemFood chewyBones;
    public static ItemFood lollipop;
    public static ItemFood enderpop;
    public static ItemFood popcorn;


    //Misc
    public static Item WitheredBones;
    public static Item WitheredBoneMeal;
    public static Item uncookedChips;
    public static Item metalBoat;
    public static Item dough;
    public static Item doughnutCutter;
    public static Item eyeBall;
    public static Item butter;
    public static Item skull;
    public static Item boringCandy;
    public static Item corn;

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

    	//Food
    	squidMeat = (ItemFood) new JustFood(1,0.5f,false).setUnlocalizedName("squidMeat");
    	cookedSquidMeat = (ItemFood) new JustFood(3,1.5f,false).setUnlocalizedName("cookedSquidMeat");
    	rawMutton = (ItemFood) new JustFood(1,0.5f,false).setUnlocalizedName("rawMutton");
    	cookedMutton = (ItemFood) new JustFood(3,1.5f,false).setUnlocalizedName("cookedMutton");
    	chips = (ItemFood) new JustFood(2,1.0f,false).setUnlocalizedName("chips");
    	enderFlesh = (ItemFood) new EnderFlesh(2,1.0f,false).setUnlocalizedName("EnderFlesh");
    	cookedFlesh = (ItemFood) new EnderFlesh(2,1.0f,false).setUnlocalizedName("CookedFlesh");
    	sausage = (ItemFood) new JustFood(1,1.0f,true).setUnlocalizedName("sausage");
    	breadSlice = (ItemFood) new JustFood(1,0.2f,false).setUnlocalizedName("breadSlice");
    	hotDog = (ItemFood) new JustFood(4,3.5f,false).setUnlocalizedName("hotDog");
    	friedEgg = (ItemFood) new JustFood(2, 0.5f, false).setUnlocalizedName("friedEgg");
    	strawberry = (ItemFood) new JustFood(1,0f,false).setUnlocalizedName("strawberry");
    	plainDoughnut = (ItemFood) new JustFood(2,0.5f,false).setUnlocalizedName("plainDoughnut");
    	chocDoughnut = (ItemFood) new JustFood(2,1f,false).setUnlocalizedName("chocDoughnut");
    	strawberryDoughnut = (ItemFood) new JustFood(3,0.5f,false).setUnlocalizedName("strawberryDoughnut");
    	sugarDoughnut = (ItemFood) new JustFood(4,-0.5f,false).setUnlocalizedName("sugarDoughnut");
    	butterEyeball = (ItemFood) new JustFood(2, 0.5f,false).setUnlocalizedName("butterEyeball");
    	ironApple = (ItemFood) new IronApple(2,1f,false).setAlwaysEdible().setUnlocalizedName("ironApple");
    	honey = (ItemFood) new JustFood(2, 0.5f,false).setUnlocalizedName("honey");
    	gummySkull = (ItemFood) new JustFood(4, -0.5f,false).setUnlocalizedName("gummySkull");
    	chewyBones = (ItemFood) new JustFood(4, -0.5f,false).setUnlocalizedName("chewyBones");
    	lollipop = (ItemFood) new JustFood(5, -1f,false).setUnlocalizedName("lollipop");
    	enderpop = (ItemFood) new EnderFlesh(5, -1f,false).setUnlocalizedName("enderpop");
    	popcorn = (ItemFood) new EnderFlesh(3, 0f,false).setUnlocalizedName("popcorn");

    	//Misc
    	WitheredBones = new SimpleItem().setUnlocalizedName("WitheredBones");
    	WitheredBoneMeal = new WitheredBoneMeal().setUnlocalizedName("WitheredBoneMeal");
    	uncookedChips = new SimpleItem().setUnlocalizedName("uncookedChips").setCreativeTab(TabRegistry.MRFtab);
    	metalBoat = new MetalBoat().setUnlocalizedName("metalBoat");
    	doughnutCutter = new SimpleItem().setUnlocalizedName("doughnutCutter");
    	eyeBall = new SimpleItem().setUnlocalizedName("eyeBall");
    	butter = new SimpleItem().setUnlocalizedName("butter");
    	skull = new SimpleItem().setUnlocalizedName("skull");
    	boringCandy = new SimpleItem().setUnlocalizedName("unsetCandy");
    	corn = new SimpleItem().setUnlocalizedName("corn");

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

    	GameRegistry.registerItem(squidMeat, "squidMeat");
    	GameRegistry.registerItem(cookedSquidMeat, "cookedSquidMeat");
    	GameRegistry.registerItem(rawMutton, "rawMutton");
    	GameRegistry.registerItem(cookedMutton, "cookedMutton");
    	GameRegistry.registerItem(chips, "Chips");
    	GameRegistry.registerItem(enderFlesh, "EnderFlesh");
    	GameRegistry.registerItem(cookedFlesh, "CookedFlesh");
    	GameRegistry.registerItem(sausage, "sausage");
    	GameRegistry.registerItem(breadSlice, "breadSlice");
    	GameRegistry.registerItem(hotDog, "hotDog");
    	GameRegistry.registerItem(friedEgg, "friedEgg");
    	GameRegistry.registerItem(strawberry, "strawberry");
    	GameRegistry.registerItem(plainDoughnut, "plainDoughnut");
    	GameRegistry.registerItem(chocDoughnut, "chocDoughtnut");
    	GameRegistry.registerItem(strawberryDoughnut, "strawberryDoughnut");
    	GameRegistry.registerItem(sugarDoughnut, "sugarDoughnut");
    	GameRegistry.registerItem(butterEyeball, "butterEyeball");
    	GameRegistry.registerItem(ironApple, "ironApple");
    	GameRegistry.registerItem(popcorn, "popcorn");
    	GameRegistry.registerItem(lollipop, "lollipop");
    	GameRegistry.registerItem(enderpop, "enderpop");

    	GameRegistry.registerItem(WitheredBones, "WitheredBones");
    	GameRegistry.registerItem(WitheredBoneMeal, "WitheredBoneMeal");
    	GameRegistry.registerItem(uncookedChips, "UncookedChips");
    	GameRegistry.registerItem(metalBoat, "metalBoat");
    	GameRegistry.registerItem(doughnutCutter, "doughnutCutter");
    	GameRegistry.registerItem(eyeBall, "eyeBall");
    	GameRegistry.registerItem(butter, "butter");
    	GameRegistry.registerItem(skull, "skull");
    	GameRegistry.registerItem(boringCandy, "unsetCandy");
    	GameRegistry.registerItem(corn, "corn");

    	GameRegistry.registerItem(bootySlapper, "BootySlapper");
    	GameRegistry.registerItem(kitchenKnife, "KitchenKnife");

    	IceItems.init();
    }

}
