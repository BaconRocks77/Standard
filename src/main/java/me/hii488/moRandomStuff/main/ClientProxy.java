package me.hii488.moRandomStuff.main;

import me.hii488.moRandomStuff.Entities.EntityEnderZombie;
import me.hii488.moRandomStuff.Entities.EntityMetalBoat;
import me.hii488.moRandomStuff.Entities.EntityNetherZombie;
import me.hii488.moRandomStuff.Entities.EntityTntZombie;
import me.hii488.moRandomStuff.Entities.RenderEntityEnderZombie;
import me.hii488.moRandomStuff.Entities.RenderEntityMetalBoat;
import me.hii488.moRandomStuff.Entities.RenderEntityNetherZombie;
import me.hii488.moRandomStuff.Entities.RenderEntityTntZombie;
import net.minecraft.client.model.ModelZombie;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	@Override
    public void registerRenderThings(){
		RenderingRegistry.registerEntityRenderingHandler(EntityNetherZombie.class, new RenderEntityNetherZombie(new ModelZombie(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTntZombie.class, new RenderEntityTntZombie(new ModelZombie(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderZombie.class, new RenderEntityEnderZombie(new ModelZombie(), 0));

		RenderingRegistry.registerEntityRenderingHandler(EntityMetalBoat.class, new RenderEntityMetalBoat());
	}
}
