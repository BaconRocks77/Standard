package me.hii488.moRandomStuff.Food;

import me.hii488.moRandomStuff.Registries.TabRegistry;
import me.hii488.moRandomStuff.main.Main;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ResAndSlowFood extends ItemFood{

	public ResAndSlowFood(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		this.setCreativeTab(TabRegistry.MRFtab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(Main.MODID + ":" + this.getUnlocalizedName().substring(5));
	}

	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player){
		if(!world.isRemote){
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 500, 0));
			player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 500, 0));
		}
	}
	
	
}
