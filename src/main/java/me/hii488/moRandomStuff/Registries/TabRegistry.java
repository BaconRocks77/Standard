package me.hii488.moRandomStuff.Registries;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabRegistry {
	 public static CreativeTabs MRItab = new CreativeTabs("MoRandomItemsTab") {
	        @Override
            @SideOnly(Side.CLIENT)
	        public Item getTabIconItem(){
	                return MRSItemRegistry.silverIngot;
	        }
	};

	public static CreativeTabs MRBtab = new CreativeTabs("MoRandomBlocksTab") {
	        @Override
            @SideOnly(Side.CLIENT)
	        public Item getTabIconItem(){
	                return Item.getItemFromBlock(BlockRegistry.silverBlock);
	        }
	};

	public static CreativeTabs MRTtab = new CreativeTabs("MoRandomToolsTab") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){
                return MRSItemRegistry.silverPick;
        }
	};

	public static CreativeTabs MRWtab = new CreativeTabs("MoRandomWeaponsTab") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){
                return MRSItemRegistry.silverSword;
        }
	};

	public static CreativeTabs MRFtab = new CreativeTabs("MoRandomFoodTab") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){
                return MRSItemRegistry.chips;
        }
	};
}
