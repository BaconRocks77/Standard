package me.hii488.moRandomStuff.Registries;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipesRegistry {
	public static void RecipesReg(){
		// Recipies
    	GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.silverBlock), "XXX","XXX","XXX" ,'X', ItemRegistry.silverIngot);
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.silverIngot, 9),BlockRegistry.silverBlock);
    	
    	
    	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.silverSword), " X "," X "," Y " ,'X', ItemRegistry.silverIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.silverAxe), "XX ","XY "," Y " ,'X', ItemRegistry.silverIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.silverPick), "XXX"," Y "," Y " ,'X', ItemRegistry.silverIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.silverHoe), "XX "," Y "," Y " ,'X', ItemRegistry.silverIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.silverSpade), " X "," Y "," Y " ,'X', ItemRegistry.silverIngot, 'Y', Items.stick);
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.WitheredBoneMeal,1),ItemRegistry.WitheredBones);
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.uncookedChips, 4), Items.potato, ItemRegistry.kitchenKnife);
    	
    	// Smelting
    	GameRegistry.addSmelting(BlockRegistry.silverOre, new ItemStack(ItemRegistry.silverIngot), 10f);
    	
    	GameRegistry.addSmelting(ItemRegistry.squidMeat, new ItemStack(ItemRegistry.cookedSquidMeat), 3f);
    	GameRegistry.addSmelting(ItemRegistry.rawMutton, new ItemStack(ItemRegistry.cookedMutton), 3f);
    	GameRegistry.addSmelting(ItemRegistry.uncookedChips, new ItemStack(ItemRegistry.chips), 3f);
	}
}
