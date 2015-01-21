package me.hii488.moRandomStuff.Blocks;

import me.hii488.moRandomStuff.Registries.MRSTabRegistry;
import me.hii488.moRandomStuff.main.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SimpleOre extends Block{

	public SimpleOre(Material mat, int harvestLevel) {
		super(mat);
		this.setCreativeTab(MRSTabRegistry.MRBtab);
		this.setHardness(4.5f);
		this.setResistance(12f);
		this.setHarvestLevel("pickaxe", harvestLevel);
	}

	@Override
    @SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(Main.MODID + ":" + this.getUnlocalizedName().substring(5));
	}
}
