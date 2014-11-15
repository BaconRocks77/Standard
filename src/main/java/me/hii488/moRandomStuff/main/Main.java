package me.hii488.moRandomStuff.main;

import me.hii488.moRandomStuff.Handlers.CustomEventHandler;
import me.hii488.moRandomStuff.Handlers.OreGeneration;
import me.hii488.moRandomStuff.Registries.BlockRegistry;
import me.hii488.moRandomStuff.Registries.CustomEntityRegistry;
import me.hii488.moRandomStuff.Registries.ItemRegistry;
import me.hii488.moRandomStuff.Registries.RecipesRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {
	
	public static final String MODID = "mrs";
    public static final String VERSION = "0.a";
    
    @Instance(Main.MODID)
    public static Main modinstance;
    
    @SidedProxy(clientSide = "me.hii488.moRandomStuff.main.ClientProxy", serverSide = "me.hii488.moRandomStuff.main.ServerProxy")
    public static ServerProxy proxy;
    
	@EventHandler
    public void preInit(FMLPreInitializationEvent event){
		proxy.registerRenderThings();
		BlockRegistry.BlockReg();
		ItemRegistry.ItemReg();
		RecipesRegistry.RecipesReg();
    	CustomEntityRegistry.mainRegistry();
    	GameRegistry.registerWorldGenerator(new OreGeneration(), 1);
    }
	
	@EventHandler
    public void Init(FMLInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(new CustomEventHandler());
		
    }

}
