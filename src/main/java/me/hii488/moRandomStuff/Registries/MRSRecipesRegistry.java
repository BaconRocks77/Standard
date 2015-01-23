package me.hii488.moRandomStuff.Registries;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class MRSRecipesRegistry {
	public static void RecipesReg(){
		toolRecipiesReg();
		foodRecipiesReg();
		
		// Recipies
    	GameRegistry.addShapedRecipe(new ItemStack(MRSBlockRegistry.silverBlock), "XXX","XXX","XXX" ,'X', MRSItemRegistry.silverIngot);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.silverIngot, 9),MRSBlockRegistry.silverBlock);
    	
    	GameRegistry.addShapedRecipe(new ItemStack(MRSBlockRegistry.gonumiteBlock), "XXX","XXX","XXX" ,'X', MRSItemRegistry.gonumiteIngot);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.gonumiteIngot, 9),MRSBlockRegistry.gonumiteBlock);
    	
    	GameRegistry.addShapedRecipe(new ItemStack(MRSBlockRegistry.binoiumBlock), "XXX","XXX","XXX" ,'X', MRSItemRegistry.binoiumIngot);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.binoiumIngot, 9),MRSBlockRegistry.binoiumBlock);
    	
    	GameRegistry.addShapedRecipe(new ItemStack(MRSBlockRegistry.dragoniteBlock), "XXX","XXX","XXX" ,'X', MRSItemRegistry.dragoniteIngot);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.dragoniteIngot, 9),MRSBlockRegistry.dragoniteBlock);
    	
    	GameRegistry.addShapedRecipe(new ItemStack(MRSBlockRegistry.enuriumBlock), "XXX","XXX","XXX" ,'X', MRSItemRegistry.enuriumIngot);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.enuriumIngot, 9),MRSBlockRegistry.enuriumBlock);

    	GameRegistry.addShapedRecipe(new ItemStack(MRSItemRegistry.woodGear, 2), " X ", "X X", " X ", 'X', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSItemRegistry.stoneGear, 1), " X ", "XYX", " X ", 'X', Blocks.cobblestone, 'Y', MRSItemRegistry.woodGear);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSItemRegistry.ironGear, 1), " X ", "XYX", " X ", 'X', Items.iron_ingot, 'Y', MRSItemRegistry.stoneGear);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.WitheredBoneMeal,1),MRSItemRegistry.WitheredBones);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.dough, 4), Items.water_bucket, Items.wheat);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.butter, 2), Items.milk_bucket);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.honey, 5), MRSBlockRegistry.hive);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.boringCandy,1), MRSFoodRegistry.honey, Items.sugar);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.corn, 2), Items.wheat, MRSItemRegistry.kitchenKnife);

    	// Smelting
    	GameRegistry.addSmelting(MRSBlockRegistry.silverOre, new ItemStack(MRSItemRegistry.silverIngot), 10f);
    	GameRegistry.addSmelting(MRSBlockRegistry.gonumiteOre, new ItemStack(MRSItemRegistry.gonumiteIngot), 10f);
    	GameRegistry.addSmelting(MRSBlockRegistry.binoiumOre, new ItemStack(MRSItemRegistry.binoiumIngot), 10f);
    	GameRegistry.addSmelting(MRSBlockRegistry.dragoniteOre, new ItemStack(MRSItemRegistry.dragoniteIngot), 10f);
    	GameRegistry.addSmelting(MRSBlockRegistry.enuriumOre, new ItemStack(MRSItemRegistry.enuriumIngot), 10f);
	}
	
	
	public static void toolRecipiesReg(){
		GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.silverSword), " X "," X "," Y " ,'X', MRSItemRegistry.silverIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.silverAxe), "XX ","XY "," Y " ,'X', MRSItemRegistry.silverIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.silverPick), "XXX"," Y "," Y " ,'X', MRSItemRegistry.silverIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.silverHoe), "XX "," Y "," Y " ,'X', MRSItemRegistry.silverIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.silverSpade), " X "," Y "," Y " ,'X', MRSItemRegistry.silverIngot, 'Y', Items.stick);

    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.gonumiteSword), " X "," X "," Y " ,'X', MRSItemRegistry.gonumiteIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.gonumiteAxe), "XX ","XY "," Y " ,'X', MRSItemRegistry.gonumiteIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.gonumitePick), "XXX"," Y "," Y " ,'X', MRSItemRegistry.gonumiteIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.gonumiteHoe), "XX "," Y "," Y " ,'X', MRSItemRegistry.gonumiteIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.gonumiteSpade), " X "," Y "," Y " ,'X', MRSItemRegistry.gonumiteIngot, 'Y', Items.stick);
    	
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.binoiumSword), " X "," X "," Y " ,'X', MRSItemRegistry.binoiumIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.binoiumAxe), "XX ","XY "," Y " ,'X', MRSItemRegistry.binoiumIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.binoiumPick), "XXX"," Y "," Y " ,'X', MRSItemRegistry.binoiumIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.binoiumHoe), "XX "," Y "," Y " ,'X', MRSItemRegistry.binoiumIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.binoiumSpade), " X "," Y "," Y " ,'X', MRSItemRegistry.binoiumIngot, 'Y', Items.stick);
    	
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.dragoniteSword), " X "," X "," Y " ,'X', MRSItemRegistry.dragoniteIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.dragoniteAxe), "XX ","XY "," Y " ,'X', MRSItemRegistry.dragoniteIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.dragonitePick), "XXX"," Y "," Y " ,'X', MRSItemRegistry.dragoniteIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.dragoniteHoe), "XX "," Y "," Y " ,'X', MRSItemRegistry.dragoniteIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.dragoniteSpade), " X "," Y "," Y " ,'X', MRSItemRegistry.dragoniteIngot, 'Y', Items.stick);
    	
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.enuriumSword), " X "," X "," Y " ,'X', MRSItemRegistry.enuriumIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.enuriumAxe), "XX ","XY "," Y " ,'X', MRSItemRegistry.enuriumIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.enuriumPick), "XXX"," Y "," Y " ,'X', MRSItemRegistry.enuriumIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.enuriumHoe), "XX "," Y "," Y " ,'X', MRSItemRegistry.enuriumIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.enuriumSpade), " X "," Y "," Y " ,'X', MRSItemRegistry.enuriumIngot, 'Y', Items.stick);
    	
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.obsidianSword), " X "," X "," Y " ,'X', MRSItemRegistry.obsidianIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.obsidianAxe), "XX ","XY "," Y " ,'X', MRSItemRegistry.obsidianIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.obsidianPick), "XXX"," Y "," Y " ,'X', MRSItemRegistry.obsidianIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.obsidianHoe), "XX "," Y "," Y " ,'X', MRSItemRegistry.obsidianIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSToolRegistry.obsidianSpade), " X "," Y "," Y " ,'X', MRSItemRegistry.obsidianIngot, 'Y', Items.stick);

	}
	
	public static void foodRecipiesReg(){
		GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.uncookedChips, 4), Items.potato, MRSItemRegistry.kitchenKnife);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.sausage, 3), MRSItemRegistry.kitchenKnife, Items.cooked_porkchop);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.breadSlice, 4), Items.bread, MRSItemRegistry.kitchenKnife);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.hotDog, 1), MRSFoodRegistry.breadSlice, MRSFoodRegistry.breadSlice, MRSFoodRegistry.sausage);
//    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.plainDoughnut,1), MRSFoodRegistry.doughnutCutter, MRSFoodRegistry.dough, MRSFoodRegistry.dough, MRSFoodRegistry.dough, MRSFoodRegistry.dough);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.butterEyeball,1), MRSFoodRegistry.butter, MRSFoodRegistry.eyeBall);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.butterEyeball,1), MRSFoodRegistry.butter, Items.spider_eye);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.chewyBones, 1), MRSFoodRegistry.boringCandy, Items.bone);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.gummySkull, 1), MRSFoodRegistry.boringCandy, MRSFoodRegistry.skull);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.lollipop, 1), MRSFoodRegistry.boringCandy, Items.stick);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.enderpop, 1), MRSFoodRegistry.lollipop, Items.ender_pearl);

    	
    	// Smelting
    	GameRegistry.addSmelting(MRSFoodRegistry.squidMeat, new ItemStack(MRSFoodRegistry.cookedSquidMeat), 3f);
    	GameRegistry.addSmelting(MRSFoodRegistry.rawMutton, new ItemStack(MRSFoodRegistry.cookedMutton), 3f);
    	GameRegistry.addSmelting(MRSFoodRegistry.uncookedChips, new ItemStack(MRSFoodRegistry.chips), 3f);
    	GameRegistry.addSmelting(Items.egg, new ItemStack(MRSFoodRegistry.friedEgg), 3f);
    	GameRegistry.addSmelting(MRSFoodRegistry.corn, new ItemStack(MRSFoodRegistry.popcorn, 2), 3);
	}
}
