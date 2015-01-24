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
import me.hii488.moRandomStuff.main.HelperMethods;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;

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
    	enderFlesh = (ItemFood) new SgRandomEffectFood(2,1.0f,false).setUnlocalizedName("enderFlesh");
    	cookedFlesh = (ItemFood) new JustFood(3,1.0f,false).setUnlocalizedName("cookedFlesh");
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


    	uncookedChips = new SimpleItem().setUnlocalizedName("uncookedChips").setCreativeTab(MRSTabRegistry.MRFtab);
    	doughnutCutter = new SimpleItem().setUnlocalizedName("doughnutCutter");
    	eyeBall = new SimpleItem().setUnlocalizedName("eyeBall");
    	butter = new SimpleItem().setUnlocalizedName("butter");
    	skull = new SimpleItem().setUnlocalizedName("skull");
    	boringCandy = new SimpleItem().setUnlocalizedName("unsetCandy");
    	corn = new SimpleItem().setUnlocalizedName("corn");
    	rice = new ItemSeeds(MRSBlockRegistry.riceCrop, Blocks.farmland).setCreativeTab(MRSTabRegistry.MRFtab).setUnlocalizedName("rice");
    	blazingChilliSeeds = new ItemSeeds(MRSBlockRegistry.blazingChilliCrop, Blocks.farmland).setCreativeTab(MRSTabRegistry.MRFtab).setUnlocalizedName("blazingChilliSeeds");
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
		HelperMethods.GameAndOreRegistry(squidMeat, "squidMeat");
    	HelperMethods.GameAndOreRegistry(cookedSquidMeat, "cookedSquidMeat");
    	HelperMethods.GameAndOreRegistry(rawMutton, "rawMutton");
    	HelperMethods.GameAndOreRegistry(cookedMutton, "cookedMutton");
    	HelperMethods.GameAndOreRegistry(chips, "chips");
    	HelperMethods.GameAndOreRegistry(enderFlesh, "enderFlesh");
    	HelperMethods.GameAndOreRegistry(cookedFlesh, "cookedFlesh");
    	HelperMethods.GameAndOreRegistry(sausage, "sausage");
    	HelperMethods.GameAndOreRegistry(breadSlice, "breadSlice");
    	HelperMethods.GameAndOreRegistry(hotDog, "hotDog");
    	HelperMethods.GameAndOreRegistry(friedEgg, "friedEgg");
    	HelperMethods.GameAndOreRegistry(strawberry, "strawberry");
    	HelperMethods.GameAndOreRegistry(plainDoughnut, "plainDoughnut");
    	HelperMethods.GameAndOreRegistry(chocDoughnut, "chocDoughtnut");
    	HelperMethods.GameAndOreRegistry(strawberryDoughnut, "strawberryDoughnut");
    	HelperMethods.GameAndOreRegistry(sugarDoughnut, "sugarDoughnut");
    	HelperMethods.GameAndOreRegistry(butterEyeball, "butterEyeball");
    	HelperMethods.GameAndOreRegistry(ironApple, "ironApple");
    	HelperMethods.GameAndOreRegistry(popcorn, "popcorn");
    	HelperMethods.GameAndOreRegistry(lollipop, "lollipop");
    	HelperMethods.GameAndOreRegistry(enderpop, "enderpop");
    	HelperMethods.GameAndOreRegistry(cookedRice, "cookedRice");
    	HelperMethods.GameAndOreRegistry(blazingChilli, "blazingChilli");
    	HelperMethods.GameAndOreRegistry(uncookedMurkcrawlerMeat, "uncookedMurkcrawlerMeat");
    	HelperMethods.GameAndOreRegistry(cookedMurkcrawlerMeat, "cookedMurkcrawlerMeat");
    	HelperMethods.GameAndOreRegistry(krakenMeat, "krakenMeat");
    	HelperMethods.GameAndOreRegistry(rawkrakenMeat, "rawkrakenMeat");
    	HelperMethods.GameAndOreRegistry(butteredFriedFish, "butteredFriedFish");
    	HelperMethods.GameAndOreRegistry(friedOnionRings, "friedOnionRings");
    	HelperMethods.GameAndOreRegistry(rawPufferFish, "rawPufferFish");
    	HelperMethods.GameAndOreRegistry(pufferFish, "pufferFish");
    	HelperMethods.GameAndOreRegistry(sashimi, "sashimi");
    	HelperMethods.GameAndOreRegistry(honeyedBark, "honeyedBark");
    	HelperMethods.GameAndOreRegistry(rawEnderDragonMeat, "rawEnderDragonMeat");
    	HelperMethods.GameAndOreRegistry(enderDragonMeat, "enderDragonMeat");
    	HelperMethods.GameAndOreRegistry(rawCreepdraChops, "rawCreepdraChops");
    	HelperMethods.GameAndOreRegistry(creepdraChops, "creepdraChops");
    	HelperMethods.GameAndOreRegistry(hashBrown, "hashBrown");
    	HelperMethods.GameAndOreRegistry(pancake, "pancake");
    	HelperMethods.GameAndOreRegistry(cottenCandy, "cottenCandy");
    	HelperMethods.GameAndOreRegistry(Marshmallow, "Marshmallow");
    	HelperMethods.GameAndOreRegistry(Curry, "Curry");
    	HelperMethods.GameAndOreRegistry(bananaSplit, "bananaSplit");
    	HelperMethods.GameAndOreRegistry(iceCream, "iceCream");
    	HelperMethods.GameAndOreRegistry(blackHazeSoup, "blackHazeSoup");
    	HelperMethods.GameAndOreRegistry(gooSoup, "gooSoup");
    	HelperMethods.GameAndOreRegistry(Omurice, "Omurice");
    	HelperMethods.GameAndOreRegistry(rawCrabMeat, "rawCrabMeat");
    	HelperMethods.GameAndOreRegistry(CrabMeat, "CrabMeat");
    	HelperMethods.GameAndOreRegistry(Onigiri, "Onigiri");
    	HelperMethods.GameAndOreRegistry(rottenSalisburyFlesh, "rottenSalisburyFlesh");
    	HelperMethods.GameAndOreRegistry(chocoScorpion, "chocoScorpion");
    	HelperMethods.GameAndOreRegistry(scoripianMeat, "scoripianMeat");
    	HelperMethods.GameAndOreRegistry(MysticDyebuberry, "MysticDyebuberry");
    	HelperMethods.GameAndOreRegistry(RageChum, "RageChum");
    	HelperMethods.GameAndOreRegistry(KingChilliJar, "KingChilliJar");
    	HelperMethods.GameAndOreRegistry(ham, "ham");
    	HelperMethods.GameAndOreRegistry(SharkMeatStew, "SharkMeatStew");
    	HelperMethods.GameAndOreRegistry(SharkMeat, "SharkMeat");
    	HelperMethods.GameAndOreRegistry(rawSharkMeat, "rawSharkMeat");
    	HelperMethods.GameAndOreRegistry(goldenMushroom, "goldenMushroom");
    	HelperMethods.GameAndOreRegistry(blackMushroom, "blackMushroom");
    	HelperMethods.GameAndOreRegistry(purpleMushroom, "purpleMushroom");
    	HelperMethods.GameAndOreRegistry(shroomSalad, "shroomSalad");
    	HelperMethods.GameAndOreRegistry(yellowMushroom, "yellowMushroom");
    	HelperMethods.GameAndOreRegistry(greenMushroom, "greenMushroom");

    	
    	
    	HelperMethods.GameAndOreRegistry(uncookedChips, "UncookedChips");
    	HelperMethods.GameAndOreRegistry(doughnutCutter, "doughnutCutter");
    	HelperMethods.GameAndOreRegistry(eyeBall, "eyeBall");
    	HelperMethods.GameAndOreRegistry(butter, "butter");
    	HelperMethods.GameAndOreRegistry(skull, "skull");
    	HelperMethods.GameAndOreRegistry(boringCandy, "unsetCandy");
    	HelperMethods.GameAndOreRegistry(corn, "corn");
    	HelperMethods.GameAndOreRegistry(rice, "rice");
    	HelperMethods.GameAndOreRegistry(blazingChilliSeeds, "blazingChilliSeeds");
	}
	
	public static void PFoodReg2(){
		HelperMethods.GameAndOreRegistry(psquidMeat, "psquidMeat");
    	HelperMethods.GameAndOreRegistry(pcookedSquidMeat, "pcookedSquidMeat");
    	HelperMethods.GameAndOreRegistry(prawMutton, "prawMutton");
    	HelperMethods.GameAndOreRegistry(pcookedMutton, "pcookedMutton");
    	HelperMethods.GameAndOreRegistry(pchips, "pChips");
    	HelperMethods.GameAndOreRegistry(penderFlesh, "pEnderFlesh");
    	HelperMethods.GameAndOreRegistry(pcookedFlesh, "pCookedFlesh");
    	HelperMethods.GameAndOreRegistry(psausage, "psausage");
    	HelperMethods.GameAndOreRegistry(pbreadSlice, "pbreadSlice");
    	HelperMethods.GameAndOreRegistry(photDog, "photDog");
    	HelperMethods.GameAndOreRegistry(pfriedEgg, "pfriedEgg");
    	HelperMethods.GameAndOreRegistry(pstrawberry, "pstrawberry");
    	HelperMethods.GameAndOreRegistry(pplainDoughnut, "pplainDoughnut");
    	HelperMethods.GameAndOreRegistry(pchocDoughnut, "pchocDoughtnut");
    	HelperMethods.GameAndOreRegistry(pstrawberryDoughnut, "pstrawberryDoughnut");
    	HelperMethods.GameAndOreRegistry(psugarDoughnut, "psugarDoughnut");
    	HelperMethods.GameAndOreRegistry(pbutterEyeball, "pbutterEyeball");
    	HelperMethods.GameAndOreRegistry(pironApple, "pironApple");
    	HelperMethods.GameAndOreRegistry(ppopcorn, "ppopcorn");
    	HelperMethods.GameAndOreRegistry(plollipop, "plollipop");
    	HelperMethods.GameAndOreRegistry(penderpop, "penderpop");
    	HelperMethods.GameAndOreRegistry(pcookedRice, "pcookedRice");
    	HelperMethods.GameAndOreRegistry(pblazingChilli, "pblazingChilli");
    	HelperMethods.GameAndOreRegistry(puncookedMurkcrawlerMeat, "puncookedMurkcrawlerMeat");
    	HelperMethods.GameAndOreRegistry(pcookedMurkcrawlerMeat, "pcookedMurkcrawlerMeat");
    	HelperMethods.GameAndOreRegistry(pkrakenMeat, "pkrakenMeat");
    	HelperMethods.GameAndOreRegistry(prawkrakenMeat, "prawkrakenMeat");
    	HelperMethods.GameAndOreRegistry(pbutteredFriedFish, "pbutteredFriedFish");
    	HelperMethods.GameAndOreRegistry(pfriedOnionRings, "pfriedOnionRings");
    	HelperMethods.GameAndOreRegistry(prawPufferFish, "prawPufferFish");
    	HelperMethods.GameAndOreRegistry(ppufferFish, "ppufferFish");
    	HelperMethods.GameAndOreRegistry(psashimi, "psashimi");
    	HelperMethods.GameAndOreRegistry(phoneyedBark, "phoneyedBark");
    	HelperMethods.GameAndOreRegistry(prawEnderDragonMeat, "prawEnderDragonMeat");
    	HelperMethods.GameAndOreRegistry(penderDragonMeat, "penderDragonMeat");
    	HelperMethods.GameAndOreRegistry(prawCreepdraChops, "prawCreepdraChops");
    	HelperMethods.GameAndOreRegistry(pcreepdraChops, "pcreepdraChops");
    	HelperMethods.GameAndOreRegistry(phashBrown, "phashBrown");
    	HelperMethods.GameAndOreRegistry(ppancake, "ppancake");
    	HelperMethods.GameAndOreRegistry(pcottenCandy, "pcottenCandy");
    	HelperMethods.GameAndOreRegistry(pMarshmallow, "pMarshmallow");
    	HelperMethods.GameAndOreRegistry(pCurry, "pCurry");
    	HelperMethods.GameAndOreRegistry(pbananaSplit, "pbananaSplit");
    	HelperMethods.GameAndOreRegistry(piceCream, "piceCream");
    	HelperMethods.GameAndOreRegistry(pblackHazeSoup, "pblackHazeSoup");
    	HelperMethods.GameAndOreRegistry(pgooSoup, "pgooSoup");
    	HelperMethods.GameAndOreRegistry(pOmurice, "pOmurice");
    	HelperMethods.GameAndOreRegistry(prawCrabMeat, "prawCrabMeat");
    	HelperMethods.GameAndOreRegistry(pCrabMeat, "pCrabMeat");
    	HelperMethods.GameAndOreRegistry(pOnigiri, "pOnigiri");
    	HelperMethods.GameAndOreRegistry(prottenSalisburyFlesh, "prottenSalisburyFlesh");
    	HelperMethods.GameAndOreRegistry(pchocoScorpion, "pchocoScorpion");
    	HelperMethods.GameAndOreRegistry(pscoripianMeat, "pscoripianMeat");
    	HelperMethods.GameAndOreRegistry(pMysticDyebuberry, "pMysticDyebuberry");
    	HelperMethods.GameAndOreRegistry(pRageChum, "pRageChum");
    	HelperMethods.GameAndOreRegistry(pKingChilliJar, "pKingChilliJar");
    	HelperMethods.GameAndOreRegistry(pham, "pham");
    	HelperMethods.GameAndOreRegistry(pSharkMeatStew, "pSharkMeatStew");
    	HelperMethods.GameAndOreRegistry(pSharkMeat, "pSharkMeat");
    	HelperMethods.GameAndOreRegistry(prawSharkMeat, "prawSharkMeat");
    	HelperMethods.GameAndOreRegistry(pgoldenMushroom, "pgoldenMushroom");
    	HelperMethods.GameAndOreRegistry(pblackMushroom, "pblackMushroom");
    	HelperMethods.GameAndOreRegistry(ppurpleMushroom, "ppurpleMushroom");
    	HelperMethods.GameAndOreRegistry(pshroomSalad, "pshroomSalad");
    	HelperMethods.GameAndOreRegistry(pyellowMushroom, "pyellowMushroom");
    	HelperMethods.GameAndOreRegistry(pgreenMushroom, "pgreenMushroom");
	}
}
