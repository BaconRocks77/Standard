package me.hii488.moRandomStuff.Food.Crops;

import me.hii488.moRandomStuff.Registries.MRSFoodRegistry;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class RiceCrop extends BlockCrops{
	
	@Override
	protected Item func_149866_i()
    {
        return MRSFoodRegistry.rice;
    }

	@Override
    protected Item func_149865_P()
    {
        return MRSFoodRegistry.rice;
    }
	
}
