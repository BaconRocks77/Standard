package me.hii488.moRandomStuff.Registries;

import me.hii488.moRandomStuff.Items.Axe;
import me.hii488.moRandomStuff.Items.Hoe;
import me.hii488.moRandomStuff.Items.PickAxe;
import me.hii488.moRandomStuff.Items.Spade;
import me.hii488.moRandomStuff.Items.Sword;
import me.hii488.moRandomStuff.main.HelperMethods;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

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
    
    //adamantine items
    public static ItemSword adamantineSword;
    public static ItemAxe adamantineAxe;
    public static ItemPickaxe adamantinePick;
    public static ItemHoe adamantineHoe;
    public static ItemSpade adamantineSpade;
	
	
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
    	
    	//adamantine Items
    	adamantineSword = (ItemSword) new Sword(MRSTaAMaterialRegistry.adamantine).setUnlocalizedName("adamantineSword");
    	adamantineAxe = (ItemAxe) new Axe(MRSTaAMaterialRegistry.adamantine).setUnlocalizedName("adamantineAxe");
    	adamantineHoe = (ItemHoe) new Hoe(MRSTaAMaterialRegistry.adamantine).setUnlocalizedName("adamantineHoe");
    	adamantinePick = (ItemPickaxe) new PickAxe(MRSTaAMaterialRegistry.adamantine).setUnlocalizedName("adamantinePick");
    	adamantineSpade = (ItemSpade) new Spade(MRSTaAMaterialRegistry.adamantine).setUnlocalizedName("adamantineSpade");
		
		HelperMethods.GameAndOreRegistry(silverAxe, "silverAxe");
    	HelperMethods.GameAndOreRegistry(silverSword, "silverSword");
    	HelperMethods.GameAndOreRegistry(silverHoe, "silverHoe");
    	HelperMethods.GameAndOreRegistry(silverPick, "silverPick");
    	HelperMethods.GameAndOreRegistry(silverSpade, "silverSpade");

    	HelperMethods.GameAndOreRegistry(gonumiteAxe, "gonumiteAxe");
    	HelperMethods.GameAndOreRegistry(gonumiteSword, "gonumiteSword");
    	HelperMethods.GameAndOreRegistry(gonumiteHoe, "gonumiteHoe");
    	HelperMethods.GameAndOreRegistry(gonumitePick, "gonumitePick");
    	HelperMethods.GameAndOreRegistry(gonumiteSpade, "gonumiteSpade");

    	HelperMethods.GameAndOreRegistry(dragoniteAxe, "dragoniteAxe");
    	HelperMethods.GameAndOreRegistry(dragoniteSword, "dragoniteSword");
    	HelperMethods.GameAndOreRegistry(dragoniteHoe, "dragoniteHoe");
    	HelperMethods.GameAndOreRegistry(dragonitePick, "dragonitePick");
    	HelperMethods.GameAndOreRegistry(dragoniteSpade, "dragoniteSpade");

    	HelperMethods.GameAndOreRegistry(enuriumAxe, "enuriumAxe");
    	HelperMethods.GameAndOreRegistry(enuriumSword, "enuriumSword");
    	HelperMethods.GameAndOreRegistry(enuriumHoe, "enuriumHoe");
    	HelperMethods.GameAndOreRegistry(enuriumPick, "enuriumPick");
    	HelperMethods.GameAndOreRegistry(enuriumSpade, "enuriumSpade");

    	HelperMethods.GameAndOreRegistry(binoiumAxe, "binoiumAxe");
    	HelperMethods.GameAndOreRegistry(binoiumSword, "binoiumSword");
    	HelperMethods.GameAndOreRegistry(binoiumHoe, "binoiumHoe");
    	HelperMethods.GameAndOreRegistry(binoiumPick, "binoiumPick");
    	HelperMethods.GameAndOreRegistry(binoiumSpade, "binoiumSpade");
    	
    	HelperMethods.GameAndOreRegistry(obsidianAxe, "obsidianAxe");
    	HelperMethods.GameAndOreRegistry(obsidianSword, "obsidianSword");
    	HelperMethods.GameAndOreRegistry(obsidianHoe, "obsidianHoe");
    	HelperMethods.GameAndOreRegistry(obsidianPick, "obsidianPick");
    	HelperMethods.GameAndOreRegistry(obsidianSpade, "obsidianSpade");
    	
    	HelperMethods.GameAndOreRegistry(adamantineAxe, "adamantineAxe");
    	HelperMethods.GameAndOreRegistry(adamantineSword, "adamantineSword");
    	HelperMethods.GameAndOreRegistry(adamantineHoe, "adamantineHoe");
    	HelperMethods.GameAndOreRegistry(adamantinePick, "adamantinePick");
    	HelperMethods.GameAndOreRegistry(adamantineSpade, "adamantineSpade");
	}
	
}
