package me.hii488.moRandomStuff.Items.CustomWeaponTypes;

import me.hii488.moRandomStuff.Registries.MRSTabRegistry;
import me.hii488.moRandomStuff.main.Main;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BootySlapper extends ItemSword{

	public BootySlapper(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setCreativeTab(MRSTabRegistry.MRWtab);
	}
	
	public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5){
		if(itemstack.isItemEnchanted() == false){
			itemstack.addEnchantment(Enchantment.knockback, 4);
		}
	} 
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(Main.MODID + ":" + this.getUnlocalizedName().substring(5));
	}

}
