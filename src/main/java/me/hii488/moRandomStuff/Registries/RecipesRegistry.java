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

    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.uncookedChips, 4), Items.potato, MRSItemRegistry.kitchenKnife);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.sausage, 3), MRSItemRegistry.kitchenKnife, Items.cooked_porkchop);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.breadSlice, 4), Items.bread, MRSItemRegistry.kitchenKnife);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.hotDog, 1), MRSItemRegistry.breadSlice, MRSItemRegistry.breadSlice, MRSItemRegistry.sausage);
//    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.plainDoughnut,1), MRSItemRegistry.doughnutCutter, MRSItemRegistry.dough, MRSItemRegistry.dough, MRSItemRegistry.dough, MRSItemRegistry.dough);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.butterEyeball,1), MRSItemRegistry.butter, MRSItemRegistry.eyeBall);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.butterEyeball,1), MRSItemRegistry.butter, Items.spider_eye);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.chewyBones, 1), MRSItemRegistry.boringCandy, Items.bone);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.gummySkull, 1), MRSItemRegistry.boringCandy, MRSItemRegistry.skull);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.lollipop, 1), MRSItemRegistry.boringCandy, Items.stick);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.enderpop, 1), MRSItemRegistry.lollipop, Items.ender_pearl);

    	GameRegistry.addShapedRecipe(new ItemStack(MRSItemRegistry.woodGear, 2), " X ", "X X", " X ", 'X', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSItemRegistry.stoneGear, 1), " X ", "XYX", " X ", 'X', Blocks.cobblestone, 'Y', MRSItemRegistry.woodGear);
    	GameRegistry.addShapedRecipe(new ItemStack(MRSItemRegistry.ironGear, 1), " X ", "XYX", " X ", 'X', Items.iron_ingot, 'Y', MRSItemRegistry.stoneGear);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.WitheredBoneMeal,1),MRSItemRegistry.WitheredBones);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.dough, 4), Items.water_bucket, Items.wheat);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.butter, 2), Items.milk_bucket);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.honey, 5), BlockRegistry.hive);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.boringCandy,1), MRSItemRegistry.honey, Items.sugar);
    	GameRegistry.addShapelessRecipe(new ItemStack(MRSItemRegistry.corn, 2), Items.wheat, MRSItemRegistry.kitchenKnife);

    	// Smelting
    	GameRegistry.addSmelting(BlockRegistry.silverOre, new ItemStack(MRSItemRegistry.silverIngot), 10f);

    	GameRegistry.addSmelting(MRSItemRegistry.squidMeat, new ItemStack(MRSItemRegistry.cookedSquidMeat), 3f);
    	GameRegistry.addSmelting(MRSItemRegistry.rawMutton, new ItemStack(MRSItemRegistry.cookedMutton), 3f);
    	GameRegistry.addSmelting(MRSItemRegistry.uncookedChips, new ItemStack(MRSItemRegistry.chips), 3f);
    	GameRegistry.addSmelting(Items.egg, new ItemStack(MRSItemRegistry.friedEgg), 3f);
    	GameRegistry.addSmelting(MRSItemRegistry.corn, new ItemStack(MRSItemRegistry.popcorn, 2), 3);
	}
}
