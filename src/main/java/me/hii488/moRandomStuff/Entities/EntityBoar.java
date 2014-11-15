package me.hii488.moRandomStuff.Entities;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityBoar extends EntityAnimal{

	public EntityBoar(World p_i1738_1_) {
		super(p_i1738_1_);
		this.setSize(2f, 1.0f);
		this.tasks.addTask(0, new EntityAIWander(this, 0.3D));
		this.tasks.addTask(1, new EntityAIPanic(this, 1.1D));
		this.tasks.addTask(2, new EntityAILookIdle(this));
		this.tasks.addTask(3, new EntityAITempt(this, 0.4D, Items.book, false));
	}
	
	public boolean isAIEnabled(){
		return true;
	}
	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable var1) {
		return new EntityBoar(worldObj);
	}

}
