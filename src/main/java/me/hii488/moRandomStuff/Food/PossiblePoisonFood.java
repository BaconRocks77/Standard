package me.hii488.moRandomStuff.Food;

import java.util.Random;

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

public class PossiblePoisonFood extends ItemFood{

	public PossiblePoisonFood(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		this.setCreativeTab(TabRegistry.MRPFtab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(Main.MODID + ":" + this.getUnlocalizedName().substring(5));
	}

	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player){
		if(!world.isRemote){
			Random r = new Random();
			int i = r.nextInt(100);
			if(i<25){
				player.addPotionEffect(new PotionEffect(Potion.poison.id, 500, 0));
			}
		}
	}
	
	
}
