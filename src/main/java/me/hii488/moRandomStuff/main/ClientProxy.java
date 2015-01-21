package me.hii488.moRandomStuff.main;

import me.hii488.moRandomStuff.Entities.EntityArmouredCreeper;
import me.hii488.moRandomStuff.Entities.EntityDayZombie;
import me.hii488.moRandomStuff.Entities.EntityEnderZombie;
import me.hii488.moRandomStuff.Entities.EntityIronGolbie;
import me.hii488.moRandomStuff.Entities.EntityMetalBoat;
import me.hii488.moRandomStuff.Entities.EntityMonoclePig;
import me.hii488.moRandomStuff.Entities.EntityNetherZombie;
import me.hii488.moRandomStuff.Entities.EntitySkeletalGuard;
import me.hii488.moRandomStuff.Entities.EntityTntZombie;
import me.hii488.moRandomStuff.Entities.EntityZombifiedBlaze;
import me.hii488.moRandomStuff.Models.ModelIronGolbie;
import me.hii488.moRandomStuff.Models.ModelMonoclePig;
import me.hii488.moRandomStuff.Models.ModelSkeletalGuard;
import me.hii488.moRandomStuff.RenderEntities.RenderEntityDayZombie;
import me.hii488.moRandomStuff.RenderEntities.RenderEntityEnderZombie;
import me.hii488.moRandomStuff.RenderEntities.RenderEntityIronGolbie;
import me.hii488.moRandomStuff.RenderEntities.RenderEntityMetalBoat;
import me.hii488.moRandomStuff.RenderEntities.RenderEntityMonoclePig;
import me.hii488.moRandomStuff.RenderEntities.RenderEntityNetherZombie;
import me.hii488.moRandomStuff.RenderEntities.RenderEntitySkeletalGuard;
import me.hii488.moRandomStuff.RenderEntities.RenderEntityTntZombie;
import me.hii488.moRandomStuff.RenderEntities.RenderEntityZombifiedBlaze;
import net.minecraft.client.model.ModelBlaze;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderCreeper;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	@Override
    public void registerRenderThings(){
		RenderingRegistry.registerEntityRenderingHandler(EntityNetherZombie.class, new RenderEntityNetherZombie(new ModelZombie(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTntZombie.class, new RenderEntityTntZombie(new ModelZombie(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderZombie.class, new RenderEntityEnderZombie(new ModelZombie(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntitySkeletalGuard.class, new RenderEntitySkeletalGuard(new ModelSkeletalGuard(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityIronGolbie.class, new RenderEntityIronGolbie(new ModelIronGolbie(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityZombifiedBlaze.class, new RenderEntityZombifiedBlaze(new ModelBlaze(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityDayZombie.class, new RenderEntityDayZombie(new ModelZombie(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityArmouredCreeper.class, new RenderCreeper());
		RenderingRegistry.registerEntityRenderingHandler(EntityMonoclePig.class, new RenderEntityMonoclePig(new ModelPig(), 0));

		
		RenderingRegistry.registerEntityRenderingHandler(EntityMetalBoat.class, new RenderEntityMetalBoat());
	}
}
