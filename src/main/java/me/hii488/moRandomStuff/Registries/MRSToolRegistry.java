package me.hii488.moRandomStuff.Registries;

import me.hii488.moRandomStuff.Items.Axe;
import me.hii488.moRandomStuff.Items.Hoe;
import me.hii488.moRandomStuff.Items.PickAxe;
import me.hii488.moRandomStuff.Items.Spade;
import me.hii488.moRandomStuff.Items.Sword;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.common.registry.GameRegistry;

public class MRSToolRegistry {
	
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
    
  //obsidian items
    public static ItemSword obsidianSword;
    public static ItemAxe obsidianAxe;
    public static ItemPickaxe obsidianPick;
    public static ItemHoe obsidianHoe;
    public static ItemSpade obsidianSpade;
	
	
	public static void toolReg(){
		
		//SilverItems
    	silverSword = (ItemSword) new Sword(MRSTaAMaterialRegistry.silver).setUnlocalizedName("silverSword");
    	silverAxe = (ItemAxe) new Axe(MRSTaAMaterialRegistry.silver).setUnlocalizedName("silverAxe");
    	silverHoe = (ItemHoe) new Hoe(MRSTaAMaterialRegistry.silver).setUnlocalizedName("silverHoe");
    	silverPick = (ItemPickaxe) new PickAxe(MRSTaAMaterialRegistry.silver).setUnlocalizedName("silverPick");
    	silverSpade = (ItemSpade) new Spade(MRSTaAMaterialRegistry.silver).setUnlocalizedName("silverSpade");

    	//gonumite Items
    	gonumiteSword = (ItemSword) new Sword(MRSTaAMaterialRegistry.gonumite).setUnlocalizedName("gonumiteSword");
    	gonumiteAxe = (ItemAxe) new Axe(MRSTaAMaterialRegistry.gonumite).setUnlocalizedName("gonumiteAxe");
    	gonumiteHoe = (ItemHoe) new Hoe(MRSTaAMaterialRegistry.gonumite).setUnlocalizedName("gonumiteHoe");
    	gonumitePick = (ItemPickaxe) new PickAxe(MRSTaAMaterialRegistry.gonumite).setUnlocalizedName("gonumitePick");
    	gonumiteSpade = (ItemSpade) new Spade(MRSTaAMaterialRegistry.gonumite).setUnlocalizedName("gonumiteSpade");

    	//dragonite Items
    	dragoniteSword = (ItemSword) new Sword(MRSTaAMaterialRegistry.dragonite).setUnlocalizedName("dragoniteSword");
    	dragoniteAxe = (ItemAxe) new Axe(MRSTaAMaterialRegistry.dragonite).setUnlocalizedName("dragoniteAxe");
    	dragoniteHoe = (ItemHoe) new Hoe(MRSTaAMaterialRegistry.dragonite).setUnlocalizedName("dragoniteHoe");
    	dragonitePick = (ItemPickaxe) new PickAxe(MRSTaAMaterialRegistry.dragonite).setUnlocalizedName("dragonitePick");
    	dragoniteSpade = (ItemSpade) new Spade(MRSTaAMaterialRegistry.dragonite).setUnlocalizedName("dragoniteSpade");

    	//enurium Items
    	enuriumSword = (ItemSword) new Sword(MRSTaAMaterialRegistry.enurium).setUnlocalizedName("enuriumSword");
    	enuriumAxe = (ItemAxe) new Axe(MRSTaAMaterialRegistry.enurium).setUnlocalizedName("enuriumAxe");
    	enuriumHoe = (ItemHoe) new Hoe(MRSTaAMaterialRegistry.enurium).setUnlocalizedName("enuriumHoe");
    	enuriumPick = (ItemPickaxe) new PickAxe(MRSTaAMaterialRegistry.enurium).setUnlocalizedName("enuriumPick");
    	enuriumSpade = (ItemSpade) new Spade(MRSTaAMaterialRegistry.enurium).setUnlocalizedName("enuriumShovel");

    	//binoium Items
    	binoiumSword = (ItemSword) new Sword(MRSTaAMaterialRegistry.binoium).setUnlocalizedName("binoiumSword");
    	binoiumAxe = (ItemAxe) new Axe(MRSTaAMaterialRegistry.binoium).setUnlocalizedName("binoiumAxe");
    	binoiumHoe = (ItemHoe) new Hoe(MRSTaAMaterialRegistry.binoium).setUnlocalizedName("binoiumHoe");
    	binoiumPick = (ItemPickaxe) new PickAxe(MRSTaAMaterialRegistry.binoium).setUnlocalizedName("binoiumPick");
    	binoiumSpade = (ItemSpade) new Spade(MRSTaAMaterialRegistry.binoium).setUnlocalizedName("binoiumSpade");
    	
    	//obsidian Items
    	obsidianSword = (ItemSword) new Sword(MRSTaAMaterialRegistry.obsidian).setUnlocalizedName("obsidianSword");
    	obsidianAxe = (ItemAxe) new Axe(MRSTaAMaterialRegistry.obsidian).setUnlocalizedName("obsidianAxe");
    	obsidianHoe = (ItemHoe) new Hoe(MRSTaAMaterialRegistry.obsidian).setUnlocalizedName("obsidianHoe");
    	obsidianPick = (ItemPickaxe) new PickAxe(MRSTaAMaterialRegistry.obsidian).setUnlocalizedName("obsidianPick");
    	obsidianSpade = (ItemSpade) new Spade(MRSTaAMaterialRegistry.obsidian).setUnlocalizedName("obsidianSpade");
		
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
    	
    	GameRegistry.registerItem(obsidianAxe, "obsidianAxe");
    	GameRegistry.registerItem(obsidianSword, "obsidianSword");
    	GameRegistry.registerItem(obsidianHoe, "obsidianHoe");
    	GameRegistry.registerItem(obsidianPick, "obsidianPick");
    	GameRegistry.registerItem(obsidianSpade, "obsidianSpade");
	}
	
}
