package me.hii488.moRandomStuff.main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class HelperMethods {
	
	public static void GameAndOreRegistry(String string, Item item){
		GameRegistry.registerItem(item, string);
		OreDictionary.registerOre(string, item);
	}
	
	public static void GameAndOreRegistry(Item item, String string){
		GameRegistry.registerItem(item, string);
		OreDictionary.registerOre(string, item);
	}
	
	public static void GameAndOreRegistry(String string, Block block){
		GameRegistry.registerBlock(block, string);
		OreDictionary.registerOre(string, block);
	}
	
	public static void GameAndOreRegistry(Block block, String string){
		GameRegistry.registerBlock(block, string);
		OreDictionary.registerOre(string, block);
	}
	
}
