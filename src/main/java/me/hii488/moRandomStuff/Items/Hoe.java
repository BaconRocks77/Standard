package me.hii488.moRandomStuff.Items;

import me.hii488.moRandomStuff.Registries.MRSTabRegistry;
import me.hii488.moRandomStuff.main.Main;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemHoe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Hoe extends ItemHoe{

	public Hoe(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setCreativeTab(MRSTabRegistry.MRTtab);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(Main.MODID + ":" + this.getUnlocalizedName().substring(5));
	}
}
