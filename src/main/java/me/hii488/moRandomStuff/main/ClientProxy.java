package me.hii488.moRandomStuff.main;

import me.hii488.moRandomStuff.Entities.EntityEnderZombie;
import me.hii488.moRandomStuff.Entities.EntityNetherZombie;
import me.hii488.moRandomStuff.Entities.EntityTntZombie;
import me.hii488.moRandomStuff.Entities.RenderEntityEnderZombie;
import me.hii488.moRandomStuff.Entities.RenderEntityNetherZombie;
import me.hii488.moRandomStuff.Entities.RenderEntityTntZombie;
import net.minecraft.client.model.ModelBiped;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	public void registerRenderThings(){
		RenderingRegistry.registerEntityRenderingHandler(EntityNetherZombie.class, new RenderEntityNetherZombie(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTntZombie.class, new RenderEntityTntZombie(new ModelBiped(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderZombie.class, new RenderEntityEnderZombie(new ModelBiped(), 0));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMetalBoat.class, new RenderEntityMetalBoat());
	}
}
