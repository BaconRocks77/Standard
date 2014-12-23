package me.hii488.moRandomStuff.Registries;

import me.hii488.moRandomStuff.Food.BurnStrenSpeedAndHaste;
import me.hii488.moRandomStuff.Food.Chilli;
import me.hii488.moRandomStuff.Food.EternalBurnFood;
import me.hii488.moRandomStuff.Food.FatigueAndSpeedFood;
import me.hii488.moRandomStuff.Food.IronApple;
import me.hii488.moRandomStuff.Food.JustFood;
import me.hii488.moRandomStuff.Food.PoisonedFood;
import me.hii488.moRandomStuff.Food.PossiblePoisonFood;
import me.hii488.moRandomStuff.Food.ResAndAbsorbFood;
import me.hii488.moRandomStuff.Food.ResAndRegenFood;
import me.hii488.moRandomStuff.Food.ResAndSlowFood;
import me.hii488.moRandomStuff.Food.ResAndSpeedFood;
import me.hii488.moRandomStuff.Food.ResInvisAbsorbAndRegenFood;
import me.hii488.moRandomStuff.Food.ResSlowAndFatigueFood;
import me.hii488.moRandomStuff.Food.SgRandomEffectFood;
import me.hii488.moRandomStuff.Food.StrengthFood;
import me.hii488.moRandomStuff.Food.TotalRandomEffectFood;
import me.hii488.moRandomStuff.Food.WitherAndHarmingFood;
import me.hii488.moRandomStuff.Items.SimpleItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import cpw.mods.fml.common.registry.GameRegistry;

public class MRSFoodRegistry {
	
	public static void MainFoodReg(){
		FoodReg1();
		FoodReg2();
		
		PFoodReg1();
		PFoodReg2();
	}

	
	// Food
		//The Normal Stuff
			public static ItemFood squidMeat;
			public static ItemFood cookedSquidMeat;
			public static ItemFood rawMutton;
			public static ItemFood cookedMutton;
			public static ItemFood chips;
			public static ItemFood cookedFlesh;
			public static ItemFood sausage;
			public static ItemFood breadSlice;
			public static ItemFood hotDog;
			public static ItemFood friedEgg;
			public static ItemFood strawberry;
			public static ItemFood plainDoughnut;
			public static ItemFood chocDoughnut;
			public static ItemFood strawberryDoughnut;
			public static ItemFood butterEyeball;
			public static ItemFood honey;
			public static ItemFood popcorn;
			public static ItemFood cookedRice;
			public static ItemFood uncookedMurkcrawlerMeat;
			public static ItemFood butteredFriedFish;
			public static ItemFood friedOnionRings;
			public static ItemFood rawPufferFish;
			public static ItemFood pufferFish;
			public static ItemFood sashimi;
			public static ItemFood honeyedBark;
			public static ItemFood hashBrown;
			public static ItemFood pancake;
			public static ItemFood cottenCandy;
			public static ItemFood Marshmallow;
			public static ItemFood Curry;
			public static ItemFood bananaSplit;
			public static ItemFood iceCream;
			public static ItemFood gooSoup;
			public static ItemFood Omurice;
			public static ItemFood Omelette;
			public static ItemFood rawCrabMeat;
			public static ItemFood CrabMeat;
			public static ItemFood Onigiri;
			public static ItemFood rottenSalisburyFlesh;
			public static ItemFood chocoScorpion;
			public static ItemFood MysticDyebuberry;
			public static ItemFood ham;
			public static ItemFood SharkMeatStew;
			public static ItemFood SharkMeat;
			public static ItemFood rawSharkMeat;

		
		//Sugary Food
			public static ItemFood gummySkull;
			public static ItemFood chewyBones;
			public static ItemFood lollipop;
			public static ItemFood sugarDoughnut;
			
		//Random Effects food
			public static ItemFood enderpop;
			public static ItemFood enderFlesh;
			public static ItemFood blackHazeSoup;
			
		// Mushrooms
			public static ItemFood goldenMushroom;
			public static ItemFood blackMushroom;
			public static ItemFood purpleMushroom;
			public static ItemFood shroomSalad;
			public static ItemFood yellowMushroom;
			public static ItemFood greenMushroom;
			
		// Other Effects Food
			public static ItemFood blazingChilli;
			public static ItemFood ironApple;
			public static ItemFood cookedMurkcrawlerMeat;
			public static ItemFood rawkrakenMeat;
			public static ItemFood krakenMeat;
			public static ItemFood rawEnderDragonMeat;
			public static ItemFood enderDragonMeat;
			public static ItemFood rawCreepdraChops;
			public static ItemFood creepdraChops;
			public static ItemFood scoripianMeat;
			public static ItemFood RageChum;
			public static ItemFood KingChilliJar;

			
			
		// Poisoned Version Of all da food
			//Modded Food
				public static ItemFood psquidMeat;
				public static ItemFood pcookedSquidMeat;
				public static ItemFood prawMutton;
				public static ItemFood pcookedMutton;
				public static ItemFood pchips;
				public static ItemFood pcookedFlesh;
				public static ItemFood psausage;
				public static ItemFood pbreadSlice;
				public static ItemFood photDog;
				public static ItemFood pfriedEgg;
				public static ItemFood pstrawberry;
				public static ItemFood pplainDoughnut;
				public static ItemFood pchocDoughnut;
				public static ItemFood pstrawberryDoughnut;
				public static ItemFood pbutterEyeball;
				public static ItemFood phoney;
				public static ItemFood ppopcorn;
				public static ItemFood pcookedRice;
				public static ItemFood puncookedMurkcrawlerMeat;
				public static ItemFood pbutteredFriedFish;
				public static ItemFood pfriedOnionRings;
				public static ItemFood prawPufferFish;
				public static ItemFood ppufferFish;
				public static ItemFood psashimi;
				public static ItemFood phoneyedBark;
				public static ItemFood phashBrown;
				public static ItemFood ppancake;
				public static ItemFood pcottenCandy;
				public static ItemFood pMarshmallow;
				public static ItemFood pCurry;
				public static ItemFood pbananaSplit;
				public static ItemFood piceCream;
				public static ItemFood pgooSoup;
				public static ItemFood pOmurice;
				public static ItemFood pOmelette;
				public static ItemFood prawCrabMeat;
				public static ItemFood pCrabMeat;
				public static ItemFood pOnigiri;
				public static ItemFood prottenSalisburyFlesh;
				public static ItemFood pchocoScorpion;
				public static ItemFood pMysticDyebuberry;
				public static ItemFood pham;
				public static ItemFood pSharkMeatStew;
				public static ItemFood pSharkMeat;
				public static ItemFood prawSharkMeat;
				public static ItemFood pgummySkull;
				public static ItemFood pchewyBones;
				public static ItemFood plollipop;
				public static ItemFood psugarDoughnut;
				public static ItemFood penderpop;
				public static ItemFood penderFlesh;
				public static ItemFood pblackHazeSoup;
				public static ItemFood pblazingChilli;
				public static ItemFood pironApple;
				public static ItemFood pcookedMurkcrawlerMeat;
				public static ItemFood prawkrakenMeat;
				public static ItemFood pkrakenMeat;
				public static ItemFood prawEnderDragonMeat;
				public static ItemFood penderDragonMeat;
				public static ItemFood prawCreepdraChops;
				public static ItemFood pcreepdraChops;
				public static ItemFood pscoripianMeat;
				public static ItemFood pRageChum;
				public static ItemFood pKingChilliJar;
				public static ItemFood pgoldenMushroom;
				public static ItemFood pblackMushroom;
				public static ItemFood ppurpleMushroom;
				public static ItemFood pshroomSalad;
				public static ItemFood pyellowMushroom;
				public static ItemFood pgreenMushroom;

		
    //Not Actually food
		public static Item rice;
		public static Item blazingChilliSeeds;
		public static Item dough;
		public static Item doughnutCutter;
		public static Item eyeBall;
		public static Item butter;
		public static Item skull;
		public static Item boringCandy;
		public static Item corn;
		public static Item uncookedChips;
		public static Item poisonSupplement;
	
	public static void FoodReg1(){
		//Food
    	squidMeat = (ItemFood) new JustFood(1,0.5f,false).setUnlocalizedName("squidMeat");
    	cookedSquidMeat = (ItemFood) new JustFood(3,1.5f,false).setUnlocalizedName("cookedSquidMeat");
    	rawMutton = (ItemFood) new JustFood(1,0.5f,false).setUnlocalizedName("rawMutton");
    	cookedMutton = (ItemFood) new JustFood(3,1.5f,false).setUnlocalizedName("cookedMutton");
    	chips = (ItemFood) new JustFood(2,1.0f,false).setUnlocalizedName("chips");
    	enderFlesh = (ItemFood) new SgRandomEffectFood(2,1.0f,false).setUnlocalizedName("EnderFlesh");
    	cookedFlesh = (ItemFood) new JustFood(3,1.0f,false).setUnlocalizedName("CookedFlesh");
    	sausage = (ItemFood) new JustFood(1,1.0f,true).setUnlocalizedName("sausage");
    	breadSlice = (ItemFood) new JustFood(1,0.2f,false).setUnlocalizedName("breadSlice");
    	hotDog = (ItemFood) new JustFood(4,3.5f,false).setUnlocalizedName("hotDog");
    	friedEgg = (ItemFood) new JustFood(2, 0.5f, false).setUnlocalizedName("friedEgg");
    	strawberry = (ItemFood) new JustFood(1,0f,false).setUnlocalizedName("strawberry");
    	plainDoughnut = (ItemFood) new JustFood(2,0.5f,false).setUnlocalizedName("plainDoughnut");
    	chocDoughnut = (ItemFood) new JustFood(2,1f,false).setUnlocalizedName("chocDoughnut");
    	strawberryDoughnut = (ItemFood) new JustFood(3,0.5f,false).setUnlocalizedName("strawberryDoughnut");
    	sugarDoughnut = (ItemFood) new JustFood(4,-0.5f,false).setUnlocalizedName("sugarDoughnut");
    	butterEyeball = (ItemFood) new JustFood(2, 0.5f,false).setUnlocalizedName("butterEyeball");
    	ironApple = (ItemFood) new IronApple(2,1f,false).setAlwaysEdible().setUnlocalizedName("ironApple");
    	honey = (ItemFood) new JustFood(2, 0.5f,false).setUnlocalizedName("honey");
    	gummySkull = (ItemFood) new JustFood(4, -0.5f,false).setUnlocalizedName("gummySkull");
    	chewyBones = (ItemFood) new JustFood(4, -0.5f,false).setUnlocalizedName("chewyBones");
    	lollipop = (ItemFood) new JustFood(5, -1f,false).setUnlocalizedName("lollipop");
    	enderpop = (ItemFood) new SgRandomEffectFood(5, -1f,false).setUnlocalizedName("enderpop");
    	popcorn = (ItemFood) new JustFood(2, 0f,false).setUnlocalizedName("popcorn");
    	cookedRice = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("cookedRice");
    	blazingChilli = (ItemFood) new Chilli(2, 0f,false).setUnlocalizedName("blazingChilli");
    	uncookedMurkcrawlerMeat = (ItemFood) new JustFood(2, 0f,false).setUnlocalizedName("uncookedMurkcrawlerMeat");
    	cookedMurkcrawlerMeat = (ItemFood) new ResAndSlowFood(4, 2f,false).setUnlocalizedName("cookedMurkcrawlerMeat");
    	rawkrakenMeat = (ItemFood) new StrengthFood(4, 1f,false).setUnlocalizedName("rawkrakenMeat"); //Food needs to be balanced from here down
    	krakenMeat = (ItemFood) new ResAndAbsorbFood(4, 1f,false).setUnlocalizedName("krakenMeat");
    	butteredFriedFish = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("butteredFriedFish");
    	friedOnionRings = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("friedOnionRings");
    	rawPufferFish = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("rawPufferFish"); //Needs to be changed
    	pufferFish = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("pufferFish");		// Needs to be changed
    	sashimi = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("sashimi");
    	honeyedBark = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("honeyedBark");
    	rawEnderDragonMeat = (ItemFood) new ResAndRegenFood(4, 1f,false).setUnlocalizedName("rawEnderDragonMeat");
    	enderDragonMeat = (ItemFood) new ResInvisAbsorbAndRegenFood(4, 1f,false).setUnlocalizedName("enderDragonMeat");
    	rawCreepdraChops = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("rawCreepdraChops");
    	creepdraChops = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("creepdraChops");  // Needs to be changed
    	hashBrown = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("hashBrown");
    	pancake = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("pancake");
    	cottenCandy = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("cottenCandy");
    	Marshmallow = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("Marshmallow");
    	Curry = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("Curry");
    	bananaSplit = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("bananaSplit");
    	iceCream = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("iceCream");
    	blackHazeSoup = (ItemFood) new SgRandomEffectFood(4, 1f,false).setUnlocalizedName("blackHazeSoup");
    	gooSoup = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("gooSoup");
    	Omurice = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("Omurice");
    	Omelette = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("Omelette");
    	rawCrabMeat = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("rawCrabMeat");
    	CrabMeat = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("CrabMeat");
    	Onigiri = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("Onigiri");
    	rottenSalisburyFlesh = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("rottenSalisburyFlesh");
    	chocoScorpion = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("chocoScorpion");
    	scoripianMeat = (ItemFood) new PossiblePoisonFood(4, 1f,false).setUnlocalizedName("scoripianMeat");
    	MysticDyebuberry = (ItemFood) new JustFood(20, -1.0f,false).setUnlocalizedName("MysticDyebuberry");
    	RageChum = (ItemFood) new BurnStrenSpeedAndHaste(4, 1f,false).setUnlocalizedName("RageChum");
    	KingChilliJar = (ItemFood) new EternalBurnFood(4, 1f,false).setUnlocalizedName("KingChilliJar");
    	ham = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("ham");
    	SharkMeatStew = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("SharkMeatStew");
    	SharkMeat = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("SharkMeat");
    	rawSharkMeat = (ItemFood) new JustFood(4, 1f,false).setUnlocalizedName("rawSharkMeat");
    	goldenMushroom = (ItemFood) new ResAndSpeedFood(4, 1f,false).setUnlocalizedName("goldenMushroom");
    	blackMushroom = (ItemFood) new WitherAndHarmingFood(4, 1f,false).setUnlocalizedName("blackMushroom");
    	purpleMushroom = (ItemFood) new FatigueAndSpeedFood(4, 1f,false).setUnlocalizedName("purpleMushroom");
    	shroomSalad = (ItemFood) new TotalRandomEffectFood(4, 1f,false).setUnlocalizedName("shroomSalad");
    	yellowMushroom = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("yellowMushroom");
    	greenMushroom = (ItemFood) new ResSlowAndFatigueFood(4, 1f,false).setUnlocalizedName("greenMushroom");


    	uncookedChips = new SimpleItem().setUnlocalizedName("uncookedChips").setCreativeTab(TabRegistry.MRFtab);
    	doughnutCutter = new SimpleItem().setUnlocalizedName("doughnutCutter");
    	eyeBall = new SimpleItem().setUnlocalizedName("eyeBall");
    	butter = new SimpleItem().setUnlocalizedName("butter");
    	skull = new SimpleItem().setUnlocalizedName("skull");
    	boringCandy = new SimpleItem().setUnlocalizedName("unsetCandy");
    	corn = new SimpleItem().setUnlocalizedName("corn");
    	rice = new ItemSeeds(BlockRegistry.riceCrop, Blocks.farmland).setCreativeTab(TabRegistry.MRFtab).setUnlocalizedName("rice");
    	blazingChilliSeeds = new ItemSeeds(BlockRegistry.blazingChilliCrop, Blocks.farmland).setCreativeTab(TabRegistry.MRFtab).setUnlocalizedName("blazingChilliSeeds");
    	poisonSupplement = new SimpleItem().setUnlocalizedName("poisonSupplement");
	}
	
	public static void PFoodReg1(){
		//Modded PFood
		psquidMeat = (ItemFood) new PoisonedFood(1,0.5f,false).setUnlocalizedName("squidMeat");
    	pcookedSquidMeat = (ItemFood) new PoisonedFood(3,1.5f,false).setUnlocalizedName("cookedSquidMeat");
    	prawMutton = (ItemFood) new PoisonedFood(1,0.5f,false).setUnlocalizedName("rawMutton");
    	pcookedMutton = (ItemFood) new PoisonedFood(3,1.5f,false).setUnlocalizedName("cookedMutton");
    	pchips = (ItemFood) new PoisonedFood(2,1.0f,false).setUnlocalizedName("chips");
    	penderFlesh = (ItemFood) new PoisonedFood(2,1.0f,false).setUnlocalizedName("EnderFlesh");
    	pcookedFlesh = (ItemFood) new PoisonedFood(3,1.0f,false).setUnlocalizedName("CookedFlesh");
    	psausage = (ItemFood) new PoisonedFood(1,1.0f,true).setUnlocalizedName("sausage");
    	pbreadSlice = (ItemFood) new PoisonedFood(1,0.2f,false).setUnlocalizedName("breadSlice");
    	photDog = (ItemFood) new PoisonedFood(4,3.5f,false).setUnlocalizedName("hotDog");
    	pfriedEgg = (ItemFood) new PoisonedFood(2, 0.5f, false).setUnlocalizedName("friedEgg");
    	pstrawberry = (ItemFood) new PoisonedFood(1,0f,false).setUnlocalizedName("strawberry");
    	pplainDoughnut = (ItemFood) new PoisonedFood(2,0.5f,false).setUnlocalizedName("plainDoughnut");
    	pchocDoughnut = (ItemFood) new PoisonedFood(2,1f,false).setUnlocalizedName("chocDoughnut");
    	pstrawberryDoughnut = (ItemFood) new PoisonedFood(3,0.5f,false).setUnlocalizedName("strawberryDoughnut");
    	psugarDoughnut = (ItemFood) new PoisonedFood(4,-0.5f,false).setUnlocalizedName("sugarDoughnut");
    	pbutterEyeball = (ItemFood) new PoisonedFood(2, 0.5f,false).setUnlocalizedName("butterEyeball");
    	pironApple = (ItemFood) new PoisonedFood(2,1f,false).setAlwaysEdible().setUnlocalizedName("ironApple");
    	phoney = (ItemFood) new PoisonedFood(2, 0.5f,false).setUnlocalizedName("honey");
    	pgummySkull = (ItemFood) new PoisonedFood(4, -0.5f,false).setUnlocalizedName("gummySkull");
    	pchewyBones = (ItemFood) new PoisonedFood(4, -0.5f,false).setUnlocalizedName("chewyBones");
    	plollipop = (ItemFood) new PoisonedFood(5, -1f,false).setUnlocalizedName("lollipop");
    	penderpop = (ItemFood) new PoisonedFood(5, -1f,false).setUnlocalizedName("enderpop");
    	ppopcorn = (ItemFood) new PoisonedFood(2, 0f,false).setUnlocalizedName("popcorn");
    	pcookedRice = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("cookedRice");
    	pblazingChilli = (ItemFood) new PoisonedFood(2, 0f,false).setUnlocalizedName("blazingChilli");
    	puncookedMurkcrawlerMeat = (ItemFood) new PoisonedFood(2, 0f,false).setUnlocalizedName("uncookedMurkcrawlerMeat");
    	pcookedMurkcrawlerMeat = (ItemFood) new PoisonedFood(4, 2f,false).setUnlocalizedName("cookedMurkcrawlerMeat");
    	prawkrakenMeat = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("rawkrakenMeat"); //Food needs to be balanced from here down
    	pkrakenMeat = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("krakenMeat");
    	pbutteredFriedFish = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("butteredFriedFish");
    	pfriedOnionRings = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("friedOnionRings");
    	prawPufferFish = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("rawPufferFish"); //Needs to be changed
    	ppufferFish = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("pufferFish");		// Needs to be changed
    	psashimi = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("sashimi");
    	phoneyedBark = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("honeyedBark");
    	prawEnderDragonMeat = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("rawEnderDragonMeat");
    	penderDragonMeat = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("enderDragonMeat");
    	prawCreepdraChops = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("rawCreepdraChops");
    	pcreepdraChops = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("creepdraChops");  // Needs to be changed
    	phashBrown = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("hashBrown");
    	ppancake = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("pancake");
    	pcottenCandy = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("cottenCandy");
    	pMarshmallow = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("Marshmallow");
    	pCurry = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("Curry");
    	pbananaSplit = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("bananaSplit");
    	piceCream = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("iceCream");
    	pblackHazeSoup = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("blackHazeSoup");
    	pgooSoup = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("gooSoup");
    	pOmurice = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("Omurice");
    	pOmelette = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("Omelette");
    	prawCrabMeat = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("rawCrabMeat");
    	pCrabMeat = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("CrabMeat");
    	pOnigiri = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("Onigiri");
    	prottenSalisburyFlesh = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("rottenSalisburyFlesh");
    	pchocoScorpion = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("chocoScorpion");
    	pscoripianMeat = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("scoripianMeat");
    	pMysticDyebuberry = (ItemFood) new PoisonedFood(20, -1.0f,false).setUnlocalizedName("MysticDyebuberry");
    	pRageChum = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("RageChum");
    	pKingChilliJar = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("KingChilliJar");
    	pham = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("ham");
    	pSharkMeatStew = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("SharkMeatStew");
    	pSharkMeat = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("SharkMeat");
    	prawSharkMeat = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("rawSharkMeat");
    	pgoldenMushroom = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("goldenMushroom");
    	pblackMushroom = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("blackMushroom");
    	ppurpleMushroom = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("purpleMushroom");
    	pshroomSalad = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("shroomSalad");
    	pyellowMushroom = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("yellowMushroom");
    	pgreenMushroom = (ItemFood) new PoisonedFood(4, 1f,false).setUnlocalizedName("greenMushroom");
    	
	}
	
	public static void FoodReg2(){
		GameRegistry.registerItem(squidMeat, "squidMeat");
    	GameRegistry.registerItem(cookedSquidMeat, "cookedSquidMeat");
    	GameRegistry.registerItem(rawMutton, "rawMutton");
    	GameRegistry.registerItem(cookedMutton, "cookedMutton");
    	GameRegistry.registerItem(chips, "Chips");
    	GameRegistry.registerItem(enderFlesh, "EnderFlesh");
    	GameRegistry.registerItem(cookedFlesh, "CookedFlesh");
    	GameRegistry.registerItem(sausage, "sausage");
    	GameRegistry.registerItem(breadSlice, "breadSlice");
    	GameRegistry.registerItem(hotDog, "hotDog");
    	GameRegistry.registerItem(friedEgg, "friedEgg");
    	GameRegistry.registerItem(strawberry, "strawberry");
    	GameRegistry.registerItem(plainDoughnut, "plainDoughnut");
    	GameRegistry.registerItem(chocDoughnut, "chocDoughtnut");
    	GameRegistry.registerItem(strawberryDoughnut, "strawberryDoughnut");
    	GameRegistry.registerItem(sugarDoughnut, "sugarDoughnut");
    	GameRegistry.registerItem(butterEyeball, "butterEyeball");
    	GameRegistry.registerItem(ironApple, "ironApple");
    	GameRegistry.registerItem(popcorn, "popcorn");
    	GameRegistry.registerItem(lollipop, "lollipop");
    	GameRegistry.registerItem(enderpop, "enderpop");
    	GameRegistry.registerItem(cookedRice, "cookedRice");
    	GameRegistry.registerItem(blazingChilli, "blazingChilli");
    	GameRegistry.registerItem(uncookedMurkcrawlerMeat, "uncookedMurkcrawlerMeat");
    	GameRegistry.registerItem(cookedMurkcrawlerMeat, "cookedMurkcrawlerMeat");
    	GameRegistry.registerItem(krakenMeat, "krakenMeat");
    	GameRegistry.registerItem(rawkrakenMeat, "rawkrakenMeat");
    	GameRegistry.registerItem(butteredFriedFish, "butteredFriedFish");
    	GameRegistry.registerItem(friedOnionRings, "friedOnionRings");
    	GameRegistry.registerItem(rawPufferFish, "rawPufferFish");
    	GameRegistry.registerItem(pufferFish, "pufferFish");
    	GameRegistry.registerItem(sashimi, "sashimi");
    	GameRegistry.registerItem(honeyedBark, "honeyedBark");
    	GameRegistry.registerItem(rawEnderDragonMeat, "rawEnderDragonMeat");
    	GameRegistry.registerItem(enderDragonMeat, "enderDragonMeat");
    	GameRegistry.registerItem(rawCreepdraChops, "rawCreepdraChops");
    	GameRegistry.registerItem(creepdraChops, "creepdraChops");
    	GameRegistry.registerItem(hashBrown, "hashBrown");
    	GameRegistry.registerItem(pancake, "pancake");
    	GameRegistry.registerItem(cottenCandy, "cottenCandy");
    	GameRegistry.registerItem(Marshmallow, "Marshmallow");
    	GameRegistry.registerItem(Curry, "Curry");
    	GameRegistry.registerItem(bananaSplit, "bananaSplit");
    	GameRegistry.registerItem(iceCream, "iceCream");
    	GameRegistry.registerItem(blackHazeSoup, "blackHazeSoup");
    	GameRegistry.registerItem(gooSoup, "gooSoup");
    	GameRegistry.registerItem(Omurice, "Omurice");
    	GameRegistry.registerItem(rawCrabMeat, "rawCrabMeat");
    	GameRegistry.registerItem(CrabMeat, "CrabMeat");
    	GameRegistry.registerItem(Onigiri, "Onigiri");
    	GameRegistry.registerItem(rottenSalisburyFlesh, "rottenSalisburyFlesh");
    	GameRegistry.registerItem(chocoScorpion, "chocoScorpion");
    	GameRegistry.registerItem(scoripianMeat, "scoripianMeat");
    	GameRegistry.registerItem(MysticDyebuberry, "MysticDyebuberry");
    	GameRegistry.registerItem(RageChum, "RageChum");
    	GameRegistry.registerItem(KingChilliJar, "KingChilliJar");
    	GameRegistry.registerItem(ham, "ham");
    	GameRegistry.registerItem(SharkMeatStew, "SharkMeatStew");
    	GameRegistry.registerItem(SharkMeat, "SharkMeat");
    	GameRegistry.registerItem(rawSharkMeat, "rawSharkMeat");
    	GameRegistry.registerItem(goldenMushroom, "goldenMushroom");
    	GameRegistry.registerItem(blackMushroom, "blackMushroom");
    	GameRegistry.registerItem(purpleMushroom, "purpleMushroom");
    	GameRegistry.registerItem(shroomSalad, "shroomSalad");
    	GameRegistry.registerItem(yellowMushroom, "yellowMushroom");
    	GameRegistry.registerItem(greenMushroom, "greenMushroom");

    	
    	
    	GameRegistry.registerItem(uncookedChips, "UncookedChips");
    	GameRegistry.registerItem(doughnutCutter, "doughnutCutter");
    	GameRegistry.registerItem(eyeBall, "eyeBall");
    	GameRegistry.registerItem(butter, "butter");
    	GameRegistry.registerItem(skull, "skull");
    	GameRegistry.registerItem(boringCandy, "unsetCandy");
    	GameRegistry.registerItem(corn, "corn");
    	GameRegistry.registerItem(rice, "rice");
    	GameRegistry.registerItem(blazingChilliSeeds, "blazingChilliSeeds");
	}
	
	public static void PFoodReg2(){
		GameRegistry.registerItem(psquidMeat, "psquidMeat");
    	GameRegistry.registerItem(pcookedSquidMeat, "pcookedSquidMeat");
    	GameRegistry.registerItem(prawMutton, "prawMutton");
    	GameRegistry.registerItem(pcookedMutton, "pcookedMutton");
    	GameRegistry.registerItem(pchips, "pChips");
    	GameRegistry.registerItem(penderFlesh, "pEnderFlesh");
    	GameRegistry.registerItem(pcookedFlesh, "pCookedFlesh");
    	GameRegistry.registerItem(psausage, "psausage");
    	GameRegistry.registerItem(pbreadSlice, "pbreadSlice");
    	GameRegistry.registerItem(photDog, "photDog");
    	GameRegistry.registerItem(pfriedEgg, "pfriedEgg");
    	GameRegistry.registerItem(pstrawberry, "pstrawberry");
    	GameRegistry.registerItem(pplainDoughnut, "pplainDoughnut");
    	GameRegistry.registerItem(pchocDoughnut, "pchocDoughtnut");
    	GameRegistry.registerItem(pstrawberryDoughnut, "pstrawberryDoughnut");
    	GameRegistry.registerItem(psugarDoughnut, "psugarDoughnut");
    	GameRegistry.registerItem(pbutterEyeball, "pbutterEyeball");
    	GameRegistry.registerItem(pironApple, "pironApple");
    	GameRegistry.registerItem(ppopcorn, "ppopcorn");
    	GameRegistry.registerItem(plollipop, "plollipop");
    	GameRegistry.registerItem(penderpop, "penderpop");
    	GameRegistry.registerItem(pcookedRice, "pcookedRice");
    	GameRegistry.registerItem(pblazingChilli, "pblazingChilli");
    	GameRegistry.registerItem(puncookedMurkcrawlerMeat, "puncookedMurkcrawlerMeat");
    	GameRegistry.registerItem(pcookedMurkcrawlerMeat, "pcookedMurkcrawlerMeat");
    	GameRegistry.registerItem(pkrakenMeat, "pkrakenMeat");
    	GameRegistry.registerItem(prawkrakenMeat, "prawkrakenMeat");
    	GameRegistry.registerItem(pbutteredFriedFish, "pbutteredFriedFish");
    	GameRegistry.registerItem(pfriedOnionRings, "pfriedOnionRings");
    	GameRegistry.registerItem(prawPufferFish, "prawPufferFish");
    	GameRegistry.registerItem(ppufferFish, "ppufferFish");
    	GameRegistry.registerItem(psashimi, "psashimi");
    	GameRegistry.registerItem(phoneyedBark, "phoneyedBark");
    	GameRegistry.registerItem(prawEnderDragonMeat, "prawEnderDragonMeat");
    	GameRegistry.registerItem(penderDragonMeat, "penderDragonMeat");
    	GameRegistry.registerItem(prawCreepdraChops, "prawCreepdraChops");
    	GameRegistry.registerItem(pcreepdraChops, "pcreepdraChops");
    	GameRegistry.registerItem(phashBrown, "phashBrown");
    	GameRegistry.registerItem(ppancake, "ppancake");
    	GameRegistry.registerItem(pcottenCandy, "pcottenCandy");
    	GameRegistry.registerItem(pMarshmallow, "pMarshmallow");
    	GameRegistry.registerItem(pCurry, "pCurry");
    	GameRegistry.registerItem(pbananaSplit, "pbananaSplit");
    	GameRegistry.registerItem(piceCream, "piceCream");
    	GameRegistry.registerItem(pblackHazeSoup, "pblackHazeSoup");
    	GameRegistry.registerItem(pgooSoup, "pgooSoup");
    	GameRegistry.registerItem(pOmurice, "pOmurice");
    	GameRegistry.registerItem(prawCrabMeat, "prawCrabMeat");
    	GameRegistry.registerItem(pCrabMeat, "pCrabMeat");
    	GameRegistry.registerItem(pOnigiri, "pOnigiri");
    	GameRegistry.registerItem(prottenSalisburyFlesh, "prottenSalisburyFlesh");
    	GameRegistry.registerItem(pchocoScorpion, "pchocoScorpion");
    	GameRegistry.registerItem(pscoripianMeat, "pscoripianMeat");
    	GameRegistry.registerItem(pMysticDyebuberry, "pMysticDyebuberry");
    	GameRegistry.registerItem(pRageChum, "pRageChum");
    	GameRegistry.registerItem(pKingChilliJar, "pKingChilliJar");
    	GameRegistry.registerItem(pham, "pham");
    	GameRegistry.registerItem(pSharkMeatStew, "pSharkMeatStew");
    	GameRegistry.registerItem(pSharkMeat, "pSharkMeat");
    	GameRegistry.registerItem(prawSharkMeat, "prawSharkMeat");
    	GameRegistry.registerItem(pgoldenMushroom, "pgoldenMushroom");
    	GameRegistry.registerItem(pblackMushroom, "pblackMushroom");
    	GameRegistry.registerItem(ppurpleMushroom, "ppurpleMushroom");
    	GameRegistry.registerItem(pshroomSalad, "pshroomSalad");
    	GameRegistry.registerItem(pyellowMushroom, "pyellowMushroom");
    	GameRegistry.registerItem(pgreenMushroom, "pgreenMushroom");
	}
}
