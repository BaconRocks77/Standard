package me.hii488.moRandomStuff.Registries;

import me.hii488.moRandomStuff.Food.EnderFlesh;
import me.hii488.moRandomStuff.Food.JustFood;
import me.hii488.moRandomStuff.Items.Axe;
import me.hii488.moRandomStuff.Items.Hoe;
import me.hii488.moRandomStuff.Items.PickAxe;
import me.hii488.moRandomStuff.Items.SimpleItem;
import me.hii488.moRandomStuff.Items.Spade;
import me.hii488.moRandomStuff.Items.Sword;
import me.hii488.moRandomStuff.Items.WitheredBoneMeal;
import me.hii488.moRandomStuff.Items.CustomWeaponTypes.BootySlapper;
import me.hii488.moRandomStuff.Items.CustomWeaponTypes.KitchenKnife;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemRegistry{

	public static Item silverIngot;
    
    
    //Silver items
    public static ItemSword silverSword;
    public static ItemAxe silverAxe;
    public static ItemPickaxe silverPick;
    public static ItemHoe silverHoe;
    public static ItemSpade silverSpade;
    
    //Misc weapons
    public static ItemSword bootySlapper;
    
    //Food
    public static ItemFood squidMeat;
    public static ItemFood cookedSquidMeat;
    public static ItemFood rawMutton;
    public static ItemFood cookedMutton;
    public static ItemFood chips;
    public static ItemFood enderFlesh;
    public static ItemFood cookedFlesh;
    
    
    //Misc
    public static Item WitheredBones;
    public static Item WitheredBoneMeal;
    public static Item uncookedChips;
    
    //Just Weird things
    public static ItemSword kitchenKnife;
    
    public static void ItemReg(){
    	//Ingots
    	silverIngot = new SimpleItem().setUnlocalizedName("silverIngot");
    	
    	//SilverItems
    	silverSword = (ItemSword) new Sword(TaAMaterialRegistry.silver).setUnlocalizedName("silverSword");
    	silverAxe = (ItemAxe) new Axe(TaAMaterialRegistry.silver).setUnlocalizedName("silverAxe");
    	silverHoe = (ItemHoe) new Hoe(TaAMaterialRegistry.silver).setUnlocalizedName("silverHoe");
    	silverPick = (ItemPickaxe) new PickAxe(TaAMaterialRegistry.silver).setUnlocalizedName("silverPick");
    	silverSpade = (ItemSpade) new Spade(TaAMaterialRegistry.silver).setUnlocalizedName("silverSpade");
    	
    	//Food
    	squidMeat = (ItemFood) new JustFood(1,0.5f,false).setUnlocalizedName("squidMeat");
    	cookedSquidMeat = (ItemFood) new JustFood(3,1.5f,false).setUnlocalizedName("cookedSquidMeat");
    	rawMutton = (ItemFood) new JustFood(1,0.5f,false).setUnlocalizedName("rawMutton");
    	cookedMutton = (ItemFood) new JustFood(3,1.5f,false).setUnlocalizedName("cookedMutton");
    	chips = (ItemFood) new JustFood(2,1.0f,false).setUnlocalizedName("chips");
    	enderFlesh = (ItemFood) new EnderFlesh(2,1.0f,false).setUnlocalizedName("EnderFlesh");
    	cookedFlesh = (ItemFood) new EnderFlesh(2,1.0f,false).setUnlocalizedName("CookedFlesh");
    	
    	//Misc
    	WitheredBones = new SimpleItem().setUnlocalizedName("WitheredBones");
    	WitheredBoneMeal = new WitheredBoneMeal().setUnlocalizedName("WitheredBoneMeal");
    	uncookedChips = new SimpleItem().setUnlocalizedName("uncookedChips").setCreativeTab(TabRegistry.MRFtab);
    	
    	//Misc Weapons
    	bootySlapper = (ItemSword) new BootySlapper(TaAMaterialRegistry.bootySlapper).setUnlocalizedName("BootySlapper");
    	
    	//Just Weird Things
    	kitchenKnife = (ItemSword) new KitchenKnife(TaAMaterialRegistry.KitchenKnife).setUnlocalizedName("KitchenKnife");

    	GameRegistry.registerItem(silverIngot, "silverIngot");
    	
    	GameRegistry.registerItem(silverAxe, "silverAxe");
    	GameRegistry.registerItem(silverSword, "silverSword");
    	GameRegistry.registerItem(silverHoe, "silverHoe");
    	GameRegistry.registerItem(silverPick, "silverPick");
    	GameRegistry.registerItem(silverSpade, "silverSpade");
    	
    	GameRegistry.registerItem(squidMeat, "squidMeat");
    	GameRegistry.registerItem(cookedSquidMeat, "cookedSquidMeat");
    	GameRegistry.registerItem(rawMutton, "rawMutton");
    	GameRegistry.registerItem(cookedMutton, "cookedMutton");
    	GameRegistry.registerItem(chips, "Chips");
    	GameRegistry.registerItem(enderFlesh, "EnderFlesh");
    	GameRegistry.registerItem(cookedFlesh, "CookedFlesh");
    	
    	GameRegistry.registerItem(WitheredBones, "WitheredBones");
    	GameRegistry.registerItem(WitheredBoneMeal, "WitheredBoneMeal");
    	GameRegistry.registerItem(uncookedChips, "UncookedChips");
    	
    	GameRegistry.registerItem(bootySlapper, "BootySlapper");
    	GameRegistry.registerItem(kitchenKnife, "KitchenKnife");
    }
    
}
