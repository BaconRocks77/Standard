package me.hii488.moRandomStuff.Food;

import me.hii488.moRandomStuff.Registries.MRSTabRegistry;
import me.hii488.moRandomStuff.main.Main;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class JustFood extends ItemFood{

	public JustFood(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		this.setCreativeTab(MRSTabRegistry.MRFtab);
		this.setMaxStackSize(64);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(Main.MODID + ":" + this.getUnlocalizedName().substring(5));
	}

}
