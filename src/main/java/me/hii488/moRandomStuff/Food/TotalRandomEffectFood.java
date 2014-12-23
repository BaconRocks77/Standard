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

public class TotalRandomEffectFood extends ItemFood{

	public TotalRandomEffectFood(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		this.setCreativeTab(TabRegistry.MRFtab);
		this.setAlwaysEdible();
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(Main.MODID + ":" + this.getUnlocalizedName().substring(5));
	}

	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player){
		if(!world.isRemote){
			Random rand = new Random();
			final int i = rand.nextInt(20);
			
//			System.out.println("[MRS] : Food had " + i + " iterations");
			
			for(int counter = 0; counter <= i; counter++){
				final int d = rand.nextInt(24);
				final int duration = rand.nextInt(25)*100;
				final int level = rand.nextInt(3);
				
//				System.out.println("[MRS] : Iteration :" + counter + ". d :" + d + ". Duration : " + duration + ". Level :" + level);
				
				switch(d){
				case 0 :
					player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, duration, level));
					break;
				case 1 :
					player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, duration, level));
					break;
				case 2 :
					player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, duration, level));
					break;
				case 3 :
					player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, duration, level));
					break;
				case 4 :
					player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, duration, level));
					break;
				case 5 :
					player.addPotionEffect(new PotionEffect(Potion.heal.id, duration, level));
					break;
				case 6 :
					player.addPotionEffect(new PotionEffect(Potion.harm.id, duration, level));
					break;
				case 7 :
					player.addPotionEffect(new PotionEffect(Potion.jump.id, duration, level));
					break;
				case 8 :
					player.addPotionEffect(new PotionEffect(Potion.confusion.id, duration, level));
					break;
				case 9 :
					player.addPotionEffect(new PotionEffect(Potion.regeneration.id, duration, level));
					break;
				case 10 :
					player.addPotionEffect(new PotionEffect(Potion.resistance.id, duration, level));
					break;
				case 11 :
					player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, duration, level));
					break;
				case 12 :
					player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, duration, level));
					break;
				case 13 :
					player.addPotionEffect(new PotionEffect(Potion.invisibility.id, duration, level));
					break;
				case 14 :
					player.addPotionEffect(new PotionEffect(Potion.blindness.id, duration, level));
					break;
				case 15 :
					player.addPotionEffect(new PotionEffect(Potion.nightVision.id, duration, level));
					break;
				case 16 :
					player.addPotionEffect(new PotionEffect(Potion.hunger.id, duration, level));
					break;
				case 17 :
					player.addPotionEffect(new PotionEffect(Potion.weakness.id, duration, level));
					break;
				case 18 :
					player.addPotionEffect(new PotionEffect(Potion.poison.id, duration, level));
					break;
				case 19 :
					player.addPotionEffect(new PotionEffect(Potion.wither.id, duration, level));
					break;
				case 20 :
					player.addPotionEffect(new PotionEffect(Potion.field_76434_w.id, duration, level));
					break;
				case 21 :
					player.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, duration, level));
					break;
				case 22 :
					player.addPotionEffect(new PotionEffect(Potion.field_76443_y.id, duration, level));
					break;
				default :
					break;
				}
			}
			
		}
	}
	
}
