package me.hii488.moRandomStuff.Entities;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.world.World;

public class EntityArmouredCreeper extends EntityCreeper
{

    private int fuseTime = 25;
    /** Explosion radius for this creeper. */
    private int explosionRadius = 5;

    public EntityArmouredCreeper(World p_i1733_1_)
    {
        super(p_i1733_1_);
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40D);
    }


    /**
     * Called when a lightning bolt hits the entity.
     */
    public void onStruckByLightning(EntityLightningBolt p_70077_1_){}

}