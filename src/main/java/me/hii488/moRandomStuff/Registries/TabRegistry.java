package me.hii488.moRandomStuff.Registries;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabRegistry {
	 public static CreativeTabs MRItab = new CreativeTabs("MoRandomItemsTab") {
	        @SideOnly(Side.CLIENT)
	        public Item getTabIconItem(){
	                return ItemRegistry.silverIngot;
	        }
	};
	
	public static CreativeTabs MRBtab = new CreativeTabs("MoRandomBlocksTab") {
	        @SideOnly(Side.CLIENT)
	        public Item getTabIconItem(){
	                return Item.getItemFromBlock(BlockRegistry.silverBlock);
	        }
	};
	
	public static CreativeTabs MRTtab = new CreativeTabs("MoRandomToolsTab") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){
                return ItemRegistry.silverPick;
        }
	};
	
	public static CreativeTabs MRWtab = new CreativeTabs("MoRandomWeaponsTab") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){
                return ItemRegistry.silverSword;
        }
	};
	
	public static CreativeTabs MRFtab = new CreativeTabs("MoRandomFoodTab") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){
                return ItemRegistry.chips;
        }
	};
}
