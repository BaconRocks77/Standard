package me.hii488.moRandomStuff.Entities;

import me.hii488.moRandomStuff.main.Main;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderEntityTntZombie extends RenderLiving {
	private static final ResourceLocation mobTextures = new ResourceLocation(Main.MODID + ":textures/entity/TntZombie.png");
    private static final String __OBFID = "CL_00000983";

    public RenderEntityTntZombie(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityTntZombie p_110775_1_)
    {
        return mobTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((EntityTntZombie)p_110775_1_);
    }

}
