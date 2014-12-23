package me.hii488.moRandomStuff.Handlers;

import java.util.Random;

import me.hii488.moRandomStuff.Entities.EntityNetherZombie;
import me.hii488.moRandomStuff.Entities.EntityTntZombie;
import me.hii488.moRandomStuff.Registries.MRSFoodRegistry;
import me.hii488.moRandomStuff.Registries.MRSItemRegistry;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class CustomEventHandler {
	public static Random rand = new Random();

	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void ChangeDrops(LivingDropsEvent event){
	    if (event.entity instanceof EntitySquid){
	        double d = rand.nextDouble();
	    	if(d < 0.5){
	        	ItemStack itemStackToDrop = new ItemStack(MRSFoodRegistry.squidMeat, 2);
	        	event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, itemStackToDrop));
	        }
	    }
	    if (event.entity instanceof EntitySheep){
	        double d = rand.nextDouble();
	    	if(d < 0.4){
	        	ItemStack itemStackToDrop = new ItemStack(MRSFoodRegistry.rawMutton, 2);
	        	event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, itemStackToDrop));
	        }
	    }
	    double d3 = rand.nextDouble();
	    if(d3 <0.3){
	    	ItemStack itemstack = new ItemStack(MRSFoodRegistry.skull, 1);
	    	event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, itemstack));
	    }
	}

	@SubscribeEvent(priority=EventPriority.NORMAL)
	public void NetherZombieHealing(LivingHurtEvent event){
		if(event.entity instanceof EntityNetherZombie){
			if(event.source == DamageSource.onFire || event.source == DamageSource.inFire || event.source == DamageSource.lava){
				event.entityLiving.setHealth(event.entityLiving.getHealth()+3f);
			}
		}
	}

	@SubscribeEvent(priority=EventPriority.NORMAL)
	public void TntZombieExplode(LivingDeathEvent event){
		if(event.entity instanceof EntityTntZombie){
			double d = rand.nextDouble();
			if(d<0.1){
				event.entityLiving.worldObj.createExplosion(null, event.entity.posX, event.entity.posY, event.entity.posZ, 3.0f, true);
			}
		}
	}


}
