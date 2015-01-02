package me.hii488.moRandomStuff.Entities;

import net.minecraft.entity.IEntityLivingData;
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
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntitySkeletalGuard extends EntityMob{

	public EntitySkeletalGuard(World p_i1738_1_) {
		super(p_i1738_1_);
		this.setSize(0.9f, 1.9f);
		this.tasks.addTask(0, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAILookIdle(this));
		this.tasks.addTask(3, new EntityAIFleeSun(this, 1.0D));
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
		this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.targetTasks.addTask(0, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		this.setCanPickUpLoot(false);
		
	}
	
	public boolean isAIEnabled(){
		return true;
	}

	
	protected void dropFewItems(boolean par1, int par2){
		int random = this.rand.nextInt(15) + this.rand.nextInt(1 + par2);
		
		for(int k = 0; k<random-1; k++){
			if(k==8){
				this.dropItem(Items.iron_ingot, 1);
			}else if(k==1){
				this.dropItem(Items.bone, 1);
			}else if(k==14){
				this.dropItem(Items.diamond, 1);
			}
		}
	}
	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.17D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(30.0D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.0D);
	}
	
	public void onLivingUpdate(){
        if (this.worldObj.isDaytime() && !this.worldObj.isRemote && !this.isChild()){
            float f = this.getBrightness(1.0F);

            if (f > 0.5F && this.rand.nextFloat() * 30.0F < (f - 0.4F) * 2.0F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)))
            {
                boolean flag = true;
                ItemStack itemstack = this.getEquipmentInSlot(4);

                if (itemstack != null){
                    if (itemstack.isItemStackDamageable()){
                        itemstack.setItemDamage(itemstack.getItemDamageForDisplay() + this.rand.nextInt(2));

                        if (itemstack.getItemDamageForDisplay() >= itemstack.getMaxDamage()){
                            this.renderBrokenItemStack(itemstack);
                            this.setCurrentItemOrArmor(4, (ItemStack)null);
                        }
                    }

                    flag = false;
                }

                if (flag)
                {
                    this.setFire(8);
                }
            }
        }
        
        if(!this.worldObj.isRemote){
        	this.setCurrentItemOrArmor(0, new ItemStack(Items.diamond_sword));
            this.setCurrentItemOrArmor(4, new ItemStack(Items.iron_helmet));
            this.setCurrentItemOrArmor(3, new ItemStack(Items.iron_chestplate));
        }
        
        super.onLivingUpdate();
    }
	
	protected void addRandomArmor()
    {
        super.addRandomArmor();
        this.setCurrentItemOrArmor(0, new ItemStack(Items.diamond_sword));
        this.setCurrentItemOrArmor(4, new ItemStack(Items.iron_helmet));
        this.setCurrentItemOrArmor(3, new ItemStack(Items.iron_chestplate));
    }
	
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData p_110161_1_)
    {
        p_110161_1_ = super.onSpawnWithEgg(p_110161_1_);
        if(!this.worldObj.isRemote){
        	addRandomArmor();
        }
        this.setCanPickUpLoot(this.rand.nextFloat() < 0.55F * this.worldObj.func_147462_b(this.posX, this.posY, this.posZ));
        return p_110161_1_;
    }
	
	public double getYOffset()
    {
        return super.getYOffset() - 0.5D;
    }
	

}