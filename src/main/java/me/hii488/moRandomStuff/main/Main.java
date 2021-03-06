package me.hii488.moRandomStuff.main;

import me.hii488.moRandomStuff.Handlers.CustomEventHandler;
import me.hii488.moRandomStuff.Handlers.OreGeneration;
import me.hii488.moRandomStuff.Registries.MRSBlockRegistry;
import me.hii488.moRandomStuff.Registries.MRSCustomEntityRegistry;
import me.hii488.moRandomStuff.Registries.MRSFoodRegistry;
import me.hii488.moRandomStuff.Registries.MRSItemRegistry;
import me.hii488.moRandomStuff.Registries.MRSRecipesRegistry;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {

	public static final String MODID = "mrs";
    public static final String VERSION = "WIP 0.C";

    @Instance(Main.MODID)
    public static Main modinstance;

    @SidedProxy(clientSide = "me.hii488.moRandomStuff.main.ClientProxy", serverSide = "me.hii488.moRandomStuff.main.ServerProxy")
    public static ServerProxy proxy;

	@EventHandler
    public void preInit(FMLPreInitializationEvent event){
		proxy.registerRenderThings();

		MRSBlockRegistry.BlockReg();
		MRSItemRegistry.registerItems();
		MRSFoodRegistry.MainFoodReg();
		MRSRecipesRegistry.RecipesReg();
    	MRSCustomEntityRegistry.mainRegistry();

    	GameRegistry.registerWorldGenerator(new OreGeneration(), 1);
    }

	@EventHandler
    public void Init(FMLInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(new CustomEventHandler());

    }

}
