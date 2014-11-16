package me.hii488.moRandomStuff.ice.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.hii488.moRandomStuff.Registries.TabRegistry;
import me.hii488.moRandomStuff.main.Main;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class IceItem extends Item {

    public IceItem(){
        this.setCreativeTab(TabRegistry.MRIIceTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Main.MODID + ":" + this.getUnlocalizedName().substring(5));
    }


}
