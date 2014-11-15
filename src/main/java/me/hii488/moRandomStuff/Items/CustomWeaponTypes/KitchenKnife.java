package me.hii488.moRandomStuff.Items.CustomWeaponTypes;

import me.hii488.moRandomStuff.Registries.TabRegistry;
import me.hii488.moRandomStuff.main.Main;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class KitchenKnife extends ItemSword{

	public KitchenKnife(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setCreativeTab(TabRegistry.MRTtab);
		this.maxStackSize = 1;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(Main.MODID + ":" + this.getUnlocalizedName().substring(5));
	}
	
	 @Override
     public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack)
     {
             return false;
     }
    
     @Override
     public ItemStack getContainerItem(ItemStack itemStack)
     {
         ItemStack cStack = itemStack.copy();
         cStack.setItemDamage(cStack.getItemDamage() + 1);
         cStack.stackSize = 1;
         return cStack;
         
     }
}
