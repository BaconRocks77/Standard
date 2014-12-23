package me.hii488.moRandomStuff.Registries;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipesRegistry {
	public static void RecipesReg(){
	// Recipies
    	GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.silverBlock), "XXX","XXX","XXX" ,'X', MRSItemRegistry.silverIngot);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.silverIngot, 9),BlockRegistry.silverBlock);
    	GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.gonumiteBlock), "XXX","XXX","XXX" ,'X', MRSItemRegistry.gonumiteIngot);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.gonumiteIngot, 9),BlockRegistry.gonumiteBlock);

    	GameRegistry.addShapedRecipe(new ItemStack(MRSItemRegistry.silverSword), " X "," X "," Y " ,'X', MRSItemRegistry.silverIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSItemRegistry.silverAxe), "XX ","XY "," Y " ,'X', MRSItemRegistry.silverIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSItemRegistry.silverPick), "XXX"," Y "," Y " ,'X', MRSItemRegistry.silverIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSItemRegistry.silverHoe), "XX "," Y "," Y " ,'X', MRSItemRegistry.silverIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSItemRegistry.silverSpade), " X "," Y "," Y " ,'X', MRSItemRegistry.silverIngot, 'Y', Items.stick);

    	GameRegistry.addShapedRecipe(new ItemStack(MRSItemRegistry.gonumiteSword), " X "," X "," Y " ,'X', MRSItemRegistry.gonumiteIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSItemRegistry.gonumiteAxe), "XX ","XY "," Y " ,'X', MRSItemRegistry.gonumiteIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSItemRegistry.gonumitePick), "XXX"," Y "," Y " ,'X', MRSItemRegistry.gonumiteIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSItemRegistry.gonumiteHoe), "XX "," Y "," Y " ,'X', MRSItemRegistry.gonumiteIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSItemRegistry.gonumiteSpade), " X "," Y "," Y " ,'X', MRSItemRegistry.gonumiteIngot, 'Y', Items.stick);

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

    	GameRegistry.addShapedRecipe(new ItemStack(MRSItemRegistry.woodGear, 2), " X ", "X X", " X ", 'X', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSItemRegistry.stoneGear, 1), " X ", "XYX", " X ", 'X', Blocks.cobblestone, 'Y', MRSItemRegistry.woodGear);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSItemRegistry.ironGear, 1), " X ", "XYX", " X ", 'X', Items.iron_ingot, 'Y', MRSItemRegistry.stoneGear);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.WitheredBoneMeal,1),MRSItemRegistry.WitheredBones);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.dough, 4), Items.water_bucket, Items.wheat);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.butter, 2), Items.milk_bucket);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.honey, 5), BlockRegistry.hive);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.boringCandy,1), MRSFoodRegistry.honey, Items.sugar);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSFoodRegistry.corn, 2), Items.wheat, MRSItemRegistry.kitchenKnife);

    	// Smelting
    	GameRegistry.addSmelting(BlockRegistry.silverOre, new ItemStack(MRSItemRegistry.silverIngot), 10f);

    	GameRegistry.addSmelting(MRSFoodRegistry.squidMeat, new ItemStack(MRSFoodRegistry.cookedSquidMeat), 3f);
    	GameRegistry.addSmelting(MRSFoodRegistry.rawMutton, new ItemStack(MRSFoodRegistry.cookedMutton), 3f);
    	GameRegistry.addSmelting(MRSFoodRegistry.uncookedChips, new ItemStack(MRSFoodRegistry.chips), 3f);
    	GameRegistry.addSmelting(Items.egg, new ItemStack(MRSFoodRegistry.friedEgg), 3f);
    	GameRegistry.addSmelting(MRSFoodRegistry.corn, new ItemStack(MRSFoodRegistry.popcorn, 2), 3);
	}
}
