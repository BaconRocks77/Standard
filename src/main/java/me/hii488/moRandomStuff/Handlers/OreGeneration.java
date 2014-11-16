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
        for(int a = 0; a < 4; a++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(50);
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	(new WorldGenMinable(BlockRegistry.silverOre, 7)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
        
        for(int ab = 0; ab < 6; ab++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(64);
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	(new WorldGenMinable(BlockRegistry.gonumiteOre, 6)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
        
        for(int ac = 0; ac < 2; ac++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(15)+3;
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	(new WorldGenMinable(BlockRegistry.dragoniteOre, 1)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
        
        for(int ad = 0; ad < 4; ad++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(32);
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	(new WorldGenMinable(BlockRegistry.enuriumOre, 10)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
        
        for(int ae = 0; ae < 2; ae++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(128)+128;
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	(new WorldGenMinable(BlockRegistry.zayuamiteOre, 0, 2, BlockRegistry.cloudBlock)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
        for(int af = 0; af < 3; af++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(64);
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	(new WorldGenMinable(BlockRegistry.zayuamiteOre, 4)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
        for(int ag = 0; ag < 3; ag++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(10)+60;
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	(new WorldGenMinable(BlockRegistry.binoiumOre, 4)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
        
        
        // Non ores
        
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
