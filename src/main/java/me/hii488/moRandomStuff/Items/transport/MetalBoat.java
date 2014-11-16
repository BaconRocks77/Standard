package me.hii488.moRandomStuff.Items.transport;

import java.util.List;

import me.hii488.moRandomStuff.Entities.EntityMetalBoat;
import me.hii488.moRandomStuff.Registries.TabRegistry;
import me.hii488.moRandomStuff.main.Main;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MetalBoat extends Item{
	
	public MetalBoat(){
		this.maxStackSize = 3;
		this.setCreativeTab(TabRegistry.MRItab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(Main.MODID + ":" + this.getUnlocalizedName().substring(5));
	}
	
	/**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        float f = 1.0F;
        float f1 = entityplayer.prevRotationPitch + (entityplayer.rotationPitch - entityplayer.prevRotationPitch) * f;
        float f2 = entityplayer.prevRotationYaw + (entityplayer.rotationYaw - entityplayer.prevRotationYaw) * f;
        double d0 = entityplayer.prevPosX + (entityplayer.posX - entityplayer.prevPosX) * (double)f;
        double d1 = entityplayer.prevPosY + (entityplayer.posY - entityplayer.prevPosY) * (double)f + 1.62D - (double)entityplayer.yOffset;
        double d2 = entityplayer.prevPosZ + (entityplayer.posZ - entityplayer.prevPosZ) * (double)f;
        Vec3 vec3 = Vec3.createVectorHelper(d0, d1, d2);
        float f3 = MathHelper.cos(-f2 * 0.017453292F - (float)Math.PI);
        float f4 = MathHelper.sin(-f2 * 0.017453292F - (float)Math.PI);
        float f5 = -MathHelper.cos(-f1 * 0.017453292F);
        float f6 = MathHelper.sin(-f1 * 0.017453292F);
        float f7 = f4 * f5;
        float f8 = f3 * f5;
        double d3 = 5.0D;
        Vec3 vec31 = vec3.addVector((double)f7 * d3, (double)f6 * d3, (double)f8 * d3);
        MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3, vec31, true);

        if (movingobjectposition == null)
        {
            return itemstack;
        }
        else
        {
            Vec3 vec32 = entityplayer.getLook(f);
            boolean flag = false;
            float f9 = 1.0F;
            List list = world.getEntitiesWithinAABBExcludingEntity(entityplayer, entityplayer.boundingBox.addCoord(vec32.xCoord * d3, vec32.yCoord * d3, vec32.zCoord * d3).expand((double)f9, (double)f9, (double)f9));
            int i;

            for (i = 0; i < list.size(); ++i)
            {
                Entity entity = (Entity)list.get(i);

                if (entity.canBeCollidedWith())
                {
                    float f10 = entity.getCollisionBorderSize();
                    AxisAlignedBB axisalignedbb = entity.boundingBox.expand((double)f10, (double)f10, (double)f10);

                    if (axisalignedbb.isVecInside(vec3))
                    {
                        flag = true;
                    }
                }
            }

            if (flag)
            {
                return itemstack;
            }
            else
            {
                if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK)
                {
                    i = movingobjectposition.blockX;
                    int j = movingobjectposition.blockY;
                    int k = movingobjectposition.blockZ;

                    if (world.getBlock(i, j, k) == Blocks.snow_layer)
                    {
                        --j;
                    }

                    EntityMetalBoat entityboat = new EntityMetalBoat(world, (double)((float)i + 0.5F), (double)((float)j + 1.0F), (double)((float)k + 0.5F));
                    entityboat.rotationYaw = (float)(((MathHelper.floor_double((double)(entityplayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) - 1) * 90);

                    if (!world.getCollidingBoundingBoxes(entityboat, entityboat.boundingBox.expand(-0.1D, -0.1D, -0.1D)).isEmpty())
                    {
                        return itemstack;
                    }

                    if (!world.isRemote)
                    {
                        world.spawnEntityInWorld(entityboat);
                    }

                    if (!entityplayer.capabilities.isCreativeMode)
                    {
                        --itemstack.stackSize;
                    }
                }

                return itemstack;
            }
        }
    }
}
