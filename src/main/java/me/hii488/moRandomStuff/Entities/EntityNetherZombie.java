package me.hii488.moRandomStuff.Entities;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIFleeSun;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityNetherZombie extends EntityMob{

	public EntityNetherZombie(World p_i1738_1_) {
		super(p_i1738_1_);
		this.setSize(0.9f, 1.9f);
		this.tasks.addTask(0, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAILookIdle(this));
		this.tasks.addTask(3, new EntityAIFleeSun(this, 1.0D));
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
		this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.targetTasks.addTask(0, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	}
	
	public boolean isAIEnabled(){
		return true;
	}
	
	//protected Item getDropItem(){
	//	return 
	//}
	
	protected void dropFewItems(boolean par1, int par2){
		int random = this.rand.nextInt(15) + this.rand.nextInt(1 + par2);
		
		for(int k = 0; k<random-1; k++){
			if(k==4){
				this.dropItem(Items.rotten_flesh, 1);
			}else if(k==1){
				this.dropItem(Items.rotten_flesh, 1);
			}else if(k==14){
				this.dropItem(Items.blaze_rod, 1);
			}else if(k==10){
				this.dropItem(Item.getItemFromBlock(Blocks.netherrack), 1);
			}
		}
	}
	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(35.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(20.0D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0D);
	}
	
	
}
