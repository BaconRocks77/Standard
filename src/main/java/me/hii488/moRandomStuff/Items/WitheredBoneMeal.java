package me.hii488.moRandomStuff.Items;

import me.hii488.moRandomStuff.Registries.TabRegistry;
import me.hii488.moRandomStuff.main.Main;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.BonemealEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WitheredBoneMeal extends Item{
	public WitheredBoneMeal(){
		this.setCreativeTab(TabRegistry.MRItab);
		
	}
	
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(Main.MODID + ":" + this.getUnlocalizedName().substring(5));
	}
	
	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int int4, float float1, float float2, float float3){
		if (applyBonemeal(itemstack, world, x, y, z, player)){
			if (!world.isRemote){
				world.playAuxSFX(2005, x, y, z, 0);
			}
			applyBonemeal(itemstack, world, x+2, y, z, player);
			applyBonemeal(itemstack, world, x-2, y, z, player);
			applyBonemeal(itemstack, world, x, y, z+2, player);
			applyBonemeal(itemstack, world, x, y, z-2, player);
			return true;
		}
        return false;
	}
    
	
	public static boolean applyBonemeal(ItemStack itemStack, World world, int x, int y, int z, EntityPlayer player)
    {
        Block block = world.getBlock(x, y, z);

        BonemealEvent event = new BonemealEvent(player, world, block, x, y, z);
        if (MinecraftForge.EVENT_BUS.post(event))
        {
            return false;
        }

        if (event.getResult() == Result.ALLOW)
        {
            if (!world.isRemote)
            {
                itemStack.stackSize--;
            }
            return true;
        }

        if (block instanceof IGrowable)
        {
            IGrowable igrowable = (IGrowable)block;

            if (igrowable.func_149851_a(world, x, y, z, world.isRemote))
            {
                if (!world.isRemote)
                {
                    if (igrowable.func_149852_a(world, world.rand, x, y, z))
                    {
                        igrowable.func_149853_b(world, world.rand, x, y, z);
                    }

                    --itemStack.stackSize;
                }

                return true;
            }
        }

        return false;
    }
	
}
