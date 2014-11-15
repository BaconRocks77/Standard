package me.hii488.moRandomStuff.Registries;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class TaAMaterialRegistry {
	 //Tool Materials
    public static ToolMaterial silver = EnumHelper.addToolMaterial("Silver", 2, 350, 5.5F, 1.5F, 100);
     public static ToolMaterial gonumite = EnumHelper.addToolMaterial("Gonumite", 2, 350, 6.5F, 2.5F, 18);
    
    public static ToolMaterial bootySlapper = EnumHelper.addToolMaterial("BootySlapper", 0, 300, -1.0f, -2.0f, 1);
    public static ToolMaterial KitchenKnife = EnumHelper.addToolMaterial("KitchenKnife", 1, 300, 0f, -1.0f, 10);
	
	
	public static void toolReg(){
		
	}
	
	public static void armourReg(){
		
	}
}
