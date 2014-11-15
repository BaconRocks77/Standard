package me.hii488.moRandomStuff.Food;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.hii488.moRandomStuff.main.Main;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class IronApple extends ItemFood{

	public IronApple(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(Main.MODID + ":" + this.getUnlocalizedName().substring(5));
	}

	protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entityPlayer)
    {
        if (!world.isRemote)
        {
            entityPlayer.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 2400, 0));
        }

        
        if (!world.isRemote)
        {
            entityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 300, 4));
            entityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 3000, 0));
            entityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 3000, 0));
        }
        
        
    }
	
}
