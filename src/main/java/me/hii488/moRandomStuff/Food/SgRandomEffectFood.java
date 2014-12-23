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

public class SgRandomEffectFood extends ItemFood{

	public SgRandomEffectFood(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		this.setCreativeTab(TabRegistry.MRFtab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(Main.MODID + ":" + this.getUnlocalizedName().substring(5));
	}
	
	
	 protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player)
	    {
	        if (!world.isRemote)
	        {
	            player.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 2400, 0));
	        }

	        if (itemstack.getItemDamage() > 0)
	        {
	            if (!world.isRemote)
	            {
	            	Random r = new Random();
	        		final double d = r.nextDouble();
	        		System.out.print(d);
	        		if(d<1){
	        			player.addPotionEffect(new PotionEffect(Potion.blindness.id, 120, 1));
	        		}else if(d<0.2 && d>=0.1){
	        			player.addPotionEffect(new PotionEffect(Potion.confusion.id, 120, 1));
	        		}else if(d<0.3 && d>=0.2){
	        			player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 120, 1));
	        		}else if(d<0.4 && d>=0.3){
	        			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 100, 1));
	        		}else if(d<0.5 && d>=0.4){
	        			player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 120, 1));
	        		}else if(d<0.6 && d>=0.5){
	        			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 100, 1));
	        		}else if(d<0.7 && d>=0.6){
	        			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 100, 1));
	        		}else if(d<0.8 && d>=0.7){
	        			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 100, 1));
	        		}else if(d<0.9 && d>=0.8){
	        			player.addPotionEffect(new PotionEffect(Potion.weakness.id, 120, 1));
	        		}else if(d<0.95 && d>=0.9){
	        			player.addPotionEffect(new PotionEffect(Potion.heal.id, 80, 1));
	        		}else if(d<1 && d>=0.95){
	        			player.addPotionEffect(new PotionEffect(Potion.harm.id, 1, 1));
	        		}
	            }
	        }
	        else
	        {
	            super.onFoodEaten(itemstack, world, player);
	        }
	    }

}
