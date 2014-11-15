package me.hii488.moRandomStuff.Registries;

import cpw.mods.fml.common.registry.GameRegistry;
import me.hii488.moRandomStuff.Blocks.SilverOre;
import me.hii488.moRandomStuff.Blocks.SolidBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRegistry {
	    public static Block silverOre;
	    public static Block silverBlock;
	    
	    public static Block gonumiteOre;
	    public static Block gonumiteBlock;
	 
	    public static Block beiaRock;
	    public static Block hive;
	    public static Block slimyBlock;
	    public static Block cloudBlock;
	    
	    
	    public static void BlockReg(){
	    	//silver Blocks
	    	silverOre = new SimpleOre(Material.rock, 2).setBlockName("silverOre");
	    	silverBlock = new SolidBlock(Material.rock).setBlockName("silverBlock");
	    	
	    	//gonumite Blocks
	    	gonumiteOre = new SimpleOre(Material.rock, 2).setBlockName("gonumiteOre");
	    	gonumiteBlock = new SolidBlock(Material.rock).setBlockName("gonumiteBlock");
	    	
	    	//Other
	    	beiaRock = new SimpleOre(Material.rock, 3).setBlockName("beiaRock").setHardness(500f).setResistance(1000f);
	    	hive = new SolidBlock(Material.ground).setBlockName("hive");
	    	slimyBlock = new SimpleOre(Material.ground,1).setBlockName("slimyBlock");
	    	cloudBlock = new SolidBlock(Material.web).setBlockName("cloudBlock");
	    	
	    	//Registration
	    	GameRegistry.registerBlock(silverOre, "silverOre");
	    	GameRegistry.registerBlock(silverBlock, "silverBlock");
	    	
	    	GameRegistry.registerBlock(silverOre, "silverOre");
	    	GameRegistry.registerBlock(silverBlock, "silverBlock");
	    	
	    	GameRegistry.registerBlock(gonumiteOre, "gonumiteOre");
	    	GameRegistry.registerBlock(gonumiteBlock, "gonumiteBlock");
	    	
	    	GameRegistry.registerBlock(hive, "hive");
	    	GameRegistry.registerBlock(beiaRock, "beiaRock");
	    	GameRegistry.registerBlock(slimyBlock, "slimyBlock");
	    	GameRegistry.registerBlock(cloudBlock, "cloudBlock");
	    }
}
