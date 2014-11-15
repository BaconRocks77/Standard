package me.hii488.moRandomStuff.Registries;

import cpw.mods.fml.common.registry.GameRegistry;
import me.hii488.moRandomStuff.Blocks.SilverOre;
import me.hii488.moRandomStuff.Blocks.SolidBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRegistry {
	 public static Block silverOre;
	    public static Block silverBlock;
	    
	    
	    public static void BlockReg(){
	    	//Blocks
	    	silverOre = new SilverOre(Material.rock).setBlockName("silverOre");
	    	
	    	silverBlock = new SolidBlock(Material.rock).setBlockName("SilverBlock");
	    	
	    	
	    	//Registration
	    	GameRegistry.registerBlock(silverOre, "silverOre");
	    	
	    	GameRegistry.registerBlock(silverBlock, "SilverBlock");
	    }
}
