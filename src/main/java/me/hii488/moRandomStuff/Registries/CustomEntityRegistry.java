package me.hii488.moRandomStuff.Registries;

import me.hii488.moRandomStuff.Entities.EntityArmouredCreeper;
import me.hii488.moRandomStuff.Entities.EntityDayZombie;
import me.hii488.moRandomStuff.Entities.EntityEnderZombie;
import me.hii488.moRandomStuff.Entities.EntityIronGolbie;
import me.hii488.moRandomStuff.Entities.EntityMetalBoat;
import me.hii488.moRandomStuff.Entities.EntityNetherZombie;
import me.hii488.moRandomStuff.Entities.EntitySkeletalGuard;
import me.hii488.moRandomStuff.Entities.EntityTntZombie;
import me.hii488.moRandomStuff.Entities.EntityZombifiedBlaze;
import me.hii488.moRandomStuff.main.Main;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class CustomEntityRegistry {
	public static void mainRegistry(){
		registerEntity();
	}

	public static void registerEntity(){
		createEntity(EntityNetherZombie.class, "EntityNetherZombie", 0xEC4545, 0x001EFF);
		createEntity(EntityTntZombie.class, "EntityTntZombie", 0xEE4445, 0xEE1EFF);
		createEntity(EntityEnderZombie.class, "EntityEnderZombie", 0xEE4455, 0xEE1EFF);
		createEntity(EntitySkeletalGuard.class, "EntitySkeletalGuard",  0xEE4455, 0xEE1EFF);
		createEntity(EntityIronGolbie.class, "EntityIronGolbie", 0xEC7545, 0x004EFF);
		createEntity(EntityZombifiedBlaze.class, "EntityZombifiedBlaze", 0xEC7545, 0x004EFF);
		createEntity(EntityArmouredCreeper.class, "EntityArmouredCreeper", 0xEC7545, 0x004EFF);
		createEntity(EntityDayZombie.class, "EntityDayZombie", 0xEC7545, 0x004EFF);

		
		createEntityNoEgg(EntityMetalBoat.class, "EntityMetalBoat");

		EntityRegistry.addSpawn(EntityNetherZombie.class, 10, 2, 5, EnumCreatureType.monster, BiomeGenBase.hell);

		for(int i = 0; i < BiomeGenBase.getBiomeGenArray().length; i++){
			//Anywhere except Nether, End and Mooshroom Islands 
			if(BiomeGenBase.getBiome(i)!=null && BiomeGenBase.getBiome(i)!= BiomeGenBase.hell && BiomeGenBase.getBiome(i)!= BiomeGenBase.mushroomIsland	&& BiomeGenBase.getBiome(i)!= BiomeGenBase.mushroomIslandShore && BiomeGenBase.getBiome(i)!= BiomeGenBase.sky){
				
				EntityRegistry.addSpawn(EntityTntZombie.class, 10, 1, 5, EnumCreatureType.monster, BiomeGenBase.getBiome(i));
				EntityRegistry.addSpawn(EntitySkeletalGuard.class, 5, 1, 3, EnumCreatureType.monster, BiomeGenBase.getBiome(i));
				EntityRegistry.addSpawn(EntityIronGolbie.class, 1, 1, 1, EnumCreatureType.monster, BiomeGenBase.getBiome(i));
				EntityRegistry.addSpawn(EntityArmouredCreeper.class, 5, 1, 3, EnumCreatureType.monster, BiomeGenBase.getBiome(i));
				EntityRegistry.addSpawn(EntityDayZombie.class, 5, 0, 4, EnumCreatureType.monster, BiomeGenBase.getBiome(i));
				
				
			}
			//Anywhere but Nether + Mooshroom Islands
			if(BiomeGenBase.getBiome(i)!=null && BiomeGenBase.getBiome(i)!= BiomeGenBase.mushroomIsland && BiomeGenBase.getBiome(i)!= BiomeGenBase.mushroomIslandShore && BiomeGenBase.getBiome(i)!= BiomeGenBase.hell){
				
				EntityRegistry.addSpawn(EntityZombifiedBlaze.class, 3, 1, 3, EnumCreatureType.monster, BiomeGenBase.getBiome(i));
				
			}
			
			//Anywhere but Mooshroom Islands Or End
			if(BiomeGenBase.getBiome(i)!=null && BiomeGenBase.getBiome(i)!= BiomeGenBase.mushroomIsland && BiomeGenBase.getBiome(i)!= BiomeGenBase.mushroomIslandShore && BiomeGenBase.getBiome(i)!= BiomeGenBase.sky){
				
				EntityRegistry.addSpawn(EntitySkeletalGuard.class, 5, 1, 3, EnumCreatureType.monster, BiomeGenBase.getBiome(i));

				
			}
		}
	}

	public static void createEntity(Class entityClass, String entityName, int solidColour, int spotColour){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();

		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, Main.modinstance, 64, 1, true);
		createEgg(randomId, solidColour, spotColour);
	}

	private static void createEgg(int randomId, int solidColour, int spotColour) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColour, spotColour));
	}

	public static void createEntityNoEgg(Class entityClass, String entityName){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();

		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, Main.modinstance, 64, 1, true);
	}
}
