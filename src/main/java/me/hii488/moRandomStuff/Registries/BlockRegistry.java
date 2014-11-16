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
	    public static Block dragoniteOre;
   	    public static Block dragoniteBlock;
	    public static Block enuriumOre;
	    public static Block enuriumBlock;
	    public static Block zayuamiteOre;
	    public static Block zayuamiteBlock;
	    public static Block binoiumOre;
   	    public static Block binoiumBlock;
	 
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
	    	
	    	//dragonite Blocks
	    	dragoniteOre = new SimpleOre(Material.rock, 4).setBlockName("dragoniteOre").setResistance(10000f);
	    	dragoniteBlock = new SolidBlock(Material.rock).setBlockName("dragoniteBlock").setResistance(10000f);
	    	
	    	//enurium Blocks
	    	enuriumOre = new SimpleOre(Material.rock, 2).setBlockName("enuriumOre").setResistance(20f);
	    	enuriumBlock = new SolidBlock(Material.rock).setBlockName("enuriumBlock").setResistance(20f);
	    	
	    	//zayuamite Blocks
	    	zayuamiteOre = new SimpleOre(Material.rock, 2).setBlockName("zayuamiteOre");
	    	zayuamiteBlock = new SolidBlock(Material.rock).setBlockName("zayuamiteBlock");
	    	
	    	//binoium Blocks
	    	binoiumOre = new SimpleOre(Material.rock, 1).setBlockName("binoiumOre");
	    	binoiumBlock = new SolidBlock(Material.rock).setBlockName("binoiumBlock");
	    	
	    	//Other
	    	beiaRock = new SimpleOre(Material.rock, 3).setBlockName("beiaRock").setHardness(500f).setResistance(1000f);
	    	hive = new SolidBlock(Material.ground).setBlockName("hive");
	    	slimyBlock = new SimpleOre(Material.ground,1).setBlockName("slimyBlock");
	    	cloudBlock = new SolidBlock(Material.web).setBlockName("cloudBlock");
	    	
	    	//Registration
	    	GameRegistry.registerBlock(silverOre, "silverOre");
	    	GameRegistry.registerBlock(silverBlock, "silverBlock");
	    	
	    	GameRegistry.registerBlock(gonumiteOre, "gonumiteOre");
	    	GameRegistry.registerBlock(gonumiteBlock, "gonumiteBlock");
	    	
	    	GameRegistry.registerBlock(dragoniteOre, "dragoniteOre");
	    	GameRegistry.registerBlock(dragoniteBlock, "dragoniteBlock");
	    	
	    	GameRegistry.registerBlock(enuriumOre, "enuriumOre");
	    	GameRegistry.registerBlock(enuriumBlock, "enuriumBlock");

	    	GameRegistry.registerBlock(zayuamiteOre, "zayuamiteOre");
	    	GameRegistry.registerBlock(zayuamiteBlock, "zayuamiteBlock");
	    	
	    	GameRegistry.registerBlock(binoiumOre, "binoiumOre");
	    	GameRegistry.registerBlock(binoiumBlock, "binoiumBlock");
	    	
	    	GameRegistry.registerBlock(hive, "hive");
	    	GameRegistry.registerBlock(beiaRock, "beiaRock");
	    	GameRegistry.registerBlock(slimyBlock, "slimyBlock");
	    	GameRegistry.registerBlock(cloudBlock, "cloudBlock");
	    }
}
