package me.hii488.moRandomStuff.Blocks;

import me.hii488.moRandomStuff.Registries.TabRegistry;
import me.hii488.moRandomStuff.main.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SolidBlock extends Block{

	public SolidBlock(Material mat) {
		super(mat);
		this.setCreativeTab(TabRegistry.MRBtab);
		this.setHardness(3.5f);
		this.setResistance(10f);
		this.setHarvestLevel("pickaxe", 1);
	}

	@Override
    @SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(Main.MODID + ":" + this.getUnlocalizedName().substring(5));
	}

}
