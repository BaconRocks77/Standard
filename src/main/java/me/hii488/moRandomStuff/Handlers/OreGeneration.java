package me.hii488.moRandomStuff.Handlers;

import java.util.Random;

import me.hii488.moRandomStuff.Registries.BlockRegistry;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreGeneration implements IWorldGenerator{
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId){
        case -1:
            generateNether(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 0:
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 1:
            generateEnd(world, random, chunkX * 16, chunkZ * 16);
            break;
        }
	}

	private void generateEnd(World world, Random rand, int chunkX, int chunkZ) {}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ){
        for(int a = 0; a < 10; a++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(50);
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	(new WorldGenMinable(BlockRegistry.silverOre, 7)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
        
        for(int b = 0; b < 20; b++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(64);
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	(new WorldGenMinable(BlockRegistry.gonumiteOre, 6)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
        
        
        
        
        for(int c = 0; c < 20; c++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(5);
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	(new WorldGenMinable(BlockRegistry.beiaRock, 4)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
        
        for(int d = 0; d < 10; d++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(5) + 59;
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	(new WorldGenMinable(BlockRegistry.hive, 1)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
        
        for(int e = 0; e < 2; e++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(10) + 200;
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	(new WorldGenMinable(BlockRegistry.cloudBlock, 0, 15, Blocks.air)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
        
        for(int f = 0; f <10; f++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(128);
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	(new WorldGenMinable(BlockRegistry.slimyBlock, 1)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);

        }
	}

	private void generateNether(World world, Random rand, int chunkX, int chunkZ) {}
}
