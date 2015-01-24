package me.hii488.moRandomStuff.Registries;

import me.hii488.moRandomStuff.Blocks.CloudBlock;
import me.hii488.moRandomStuff.Blocks.SimpleOre;
import me.hii488.moRandomStuff.Blocks.SolidBlock;
import me.hii488.moRandomStuff.Food.Crops.BlazingChilliCrop;
import me.hii488.moRandomStuff.Food.Crops.RiceCrop;
import me.hii488.moRandomStuff.main.HelperMethods;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MRSBlockRegistry {
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
   	    public static Block adamantineOre;
   	    public static Block adamantineBlock;

	    public static Block beiaRock;
	    public static Block hive;
	    public static Block slimyBlock;
	    public static Block cloudBlock;
	    
	  //Crops
		 public static Block riceCrop;
		 public static Block blazingChilliCrop;


	    public static void BlockReg(){
	    	//silver Blocks
	    	silverOre = new SimpleOre(Material.rock, 1).setBlockName("silverOre");
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
	    	
	    	//adamantine Blocks
	    	adamantineOre = new SimpleOre(Material.rock, 1).setBlockName("adamantineOre");
	    	adamantineBlock = new SolidBlock(Material.rock).setBlockName("adamantineBlock");

	    	//Other
	    	beiaRock = new SimpleOre(Material.rock, 3).setBlockName("beiaRock").setHardness(500f).setResistance(1000f);
	    	hive = new SolidBlock(Material.ground).setBlockName("hive");
	    	slimyBlock = new SimpleOre(Material.ground,1).setBlockName("slimyBlock");
	    	cloudBlock = new CloudBlock(Material.web).setBlockName("cloudBlock");
	    	
	    	//Crops
	    	riceCrop = new RiceCrop().setBlockName("riceCrop");
	    	blazingChilliCrop = new BlazingChilliCrop().setBlockName("blazingChilliCrop");
	    	
	    	
	    	
	    	//Registration
	    	HelperMethods.GameAndOreRegistry(silverOre, "silverOre");
	    	HelperMethods.GameAndOreRegistry(silverBlock, "silverBlock");

	    	HelperMethods.GameAndOreRegistry(gonumiteOre, "gonumiteOre");
	    	HelperMethods.GameAndOreRegistry(gonumiteBlock, "gonumiteBlock");

	    	HelperMethods.GameAndOreRegistry(dragoniteOre, "dragoniteOre");
	    	HelperMethods.GameAndOreRegistry(dragoniteBlock, "dragoniteBlock");

	    	HelperMethods.GameAndOreRegistry(enuriumOre, "enuriumOre");
	    	HelperMethods.GameAndOreRegistry(enuriumBlock, "enuriumBlock");

	    	HelperMethods.GameAndOreRegistry(zayuamiteOre, "zayuamiteOre");
	    	HelperMethods.GameAndOreRegistry(zayuamiteBlock, "zayuamiteBlock");

	    	HelperMethods.GameAndOreRegistry(binoiumOre, "binoiumOre");
	    	HelperMethods.GameAndOreRegistry(binoiumBlock, "binoiumBlock");
	    	
	    	HelperMethods.GameAndOreRegistry(adamantineOre, "adamantineOre");
	    	HelperMethods.GameAndOreRegistry(adamantineBlock, "adamantineBlock");

	    	HelperMethods.GameAndOreRegistry(hive, "hive");
	    	HelperMethods.GameAndOreRegistry(beiaRock, "beiaRock");
	    	HelperMethods.GameAndOreRegistry(slimyBlock, "slimyBlock");
	    	HelperMethods.GameAndOreRegistry(cloudBlock, "cloudBlock");
	    	
	    	//Crops
	    	HelperMethods.GameAndOreRegistry(riceCrop, "riceCrop");
	    	HelperMethods.GameAndOreRegistry(blazingChilliCrop, "blazingChilliCrop");
	    }
}
