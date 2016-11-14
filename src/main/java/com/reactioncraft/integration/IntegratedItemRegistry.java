package com.reactioncraft.integration;

import com.reactioncraft.Reactioncraft;
import com.reactioncraft.core.ItemBase;
import com.reactioncraft.food.common.ItemBeef;
import com.reactioncraft.food.common.ItemChickenHead;
import com.reactioncraft.food.common.ItemCookedHorse;
import com.reactioncraft.food.common.ItemCookedLamb;
import com.reactioncraft.food.common.ItemHumanCooked;
import com.reactioncraft.food.common.ItemPork;
import com.reactioncraft.food.common.ItemRawHorse;
import com.reactioncraft.food.common.ItemRawLamb;
import com.reactioncraft.integration.instances.IntegratedItems;
import com.reactioncraft.net.common.ItemCompleteNet;
import com.reactioncraft.net.common.ItemPieceHilt;
import com.reactioncraft.net.common.ItemPieceNet;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class IntegratedItemRegistry 
{
	
	public static void init() 
	{
		//Food Related Weapons
		IntegratedItems.meat_cleaver = register(new ItemBase("meat_cleaver")  .setCreativeTab(Reactioncraft.ReactioncraftItems));
		IntegratedItems.Knfie        = register(new ItemBase("Knfie")         .setCreativeTab(Reactioncraft.ReactioncraftItems));
		
		//Bone Drop
		IntegratedItems.bones         = register(new ItemBase("bones")        .setCreativeTab(Reactioncraft.ReactioncraftItems));
		
		//Modified Food Drops
        //IntegratedItems.raw_human     = register(new ItemHumanRaw());
        IntegratedItems.cooked_human  = register(new ItemHumanCooked());
        IntegratedItems.raw_lamb      = register(new ItemRawLamb());
        IntegratedItems.cooked_lamb   = register(new ItemCookedLamb());  
        IntegratedItems.raw_horse     = register(new ItemRawHorse());    
        IntegratedItems.cooked_horse  = register(new ItemCookedHorse());  
        IntegratedItems.chicken_head  = register(new ItemChickenHead());  
        IntegratedItems.beef_chunk    = register(new ItemBeef());  
        IntegratedItems.pork_chunk    = register(new ItemPork());  
        
        IntegratedItems.raw_human = registerItemFood("raw_human", 1, 3.0f, false);
        
        //Food Items
        IntegratedItems.AncientFruit       = register(new ItemBase("AncientFruit")      .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.EdibleFlesh        = register(new ItemBase("EdibleFlesh")       .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.cookedCorn         = register(new ItemBase("cookedCorn")        .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.popcornseeds       = register(new ItemBase("popcornseeds")      .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.bagofpopcorn       = register(new ItemBase("bagofpopcorn")      .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.poppedbagofpopcorn = register(new ItemBase("poppedbagofpopcorn").setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.UnwrappedCorn      = register(new ItemBase("UnwrappedCorn")     .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.rawcorn            = register(new ItemBase("rawcorn")           .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.ChickenNuggets     = register(new ItemBase("ChickenNuggets")    .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.RawNuggets         = register(new ItemBase("RawNuggets")        .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.SlicedBread        = register(new ItemBase("SlicedBread")       .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.HamSandwich        = register(new ItemBase("HamSandwich")       .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.Hamburger          = register(new ItemBase("Hamburger")         .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.Cheeseburger       = register(new ItemBase("Cheeseburger")      .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.Bacon              = register(new ItemBase("Bacon")             .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.BaconRaw           = register(new ItemBase("BaconRaw")          .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.cheese             = register(new ItemBase("cheese")            .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.churn              = register(new ItemBase("churn")             .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.buns               = register(new ItemBase("buns")              .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.SamonRaw           = register(new ItemBase("SamonRaw")          .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.Samon              = register(new ItemBase("Samon")             .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.YellowTailRaw      = register(new ItemBase("YellowTailRaw")     .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.SandStonePaste     = register(new ItemBase("YellowTailCooked")  .setCreativeTab(Reactioncraft.ReactioncraftItems));
        
        //Net Items
      	IntegratedItems.hilt   		 = register(new ItemPieceHilt("hilt")       .setCreativeTab(null));
      	IntegratedItems.net  		 = register(new ItemPieceNet("net")         .setCreativeTab(null));
      	IntegratedItems.complete_net = register(new ItemCompleteNet(IntegratedMaterials.EnumToolMaterialNet));
      	//IntegratedItems.caught       = register(new ItemCaughtEntity("caught").setCreativeTab(null));
      	IntegratedItems.caughtplayer = register(new ItemBase("caught_player")   .setCreativeTab(null));
      	IntegratedItems.creativeNet  = register(new ItemBase("creative_net")    .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	
      	//Desert Items
      	IntegratedItems.SandStonePaste  = register(new ItemBase("SandStonePaste")     .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.UncutLBGem      = register(new ItemBase("UncutLBGem")         .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.CutLBGem        = register(new ItemBase("CutLBGem")           .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.UncutDBGem      = register(new ItemBase("UncutDBGem")         .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.CutDBGem        = register(new ItemBase("CutDBGem")           .setCreativeTab(Reactioncraft.ReactioncraftItems));
      		//Make The Scroll Act as a Book...Eventually
      	IntegratedItems.scroll          = register(new ItemBase("scroll")             .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	
      	//Special Tools
      	IntegratedItems.Hammer            = register(new ItemBase("Hammer")              .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.bloodstoneHammer  = register(new ItemBase("bloodstoneHammer")    .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.GoldChisel        = register(new ItemBase("GoldChisel")          .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.FlintChisel       = register(new ItemBase("FlintChisel")         .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.DiamondChisel     = register(new ItemBase("DiamondChisel")       .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.BloodstoneChisel  = register(new ItemBase("BloodstoneChisel")    .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.CopperChisel      = register(new ItemBase("CopperChisel")        .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	
      	
      	//Misc Items
      	IntegratedItems.ChainLoop             = register(new ItemBase("ChainLoop")           .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.bloodstoneclump       = register(new ItemBase("bloodstoneclump")     .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.goldrod               = register(new ItemBase("goldrod")             .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.obsidianingot         = register(new ItemBase("obsidianingot")       .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.ingotbloodstone       = register(new ItemBase("ingotbloodstone")     .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.ingotsilver           = register(new ItemBase("ingotsilver")         .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.bloodstonedust        = register(new ItemBase("bloodstonedust")      .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.blackdiamond          = register(new ItemBase("blackdiamond")        .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.dragonstoneshard      = register(new ItemBase("dragonstoneshard")    .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.irondust              = register(new ItemBase("irondust")            .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.gemdragonstone        = register(new ItemBase("gemdragonstone")      .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.superheatedironingot  = register(new ItemBase("superheatedironingot").setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.goldDust              = register(new ItemBase("goldDust")            .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.moltenglass           = register(new ItemBase("moltenglass")         .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.IceBucket             = register(new ItemBase("IceBucket")           .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.ObsidianBucket        = register(new ItemBase("ObsidianBucket")      .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.Mapinabottle          = register(new ItemBase("Mapinabottle")        .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.Shipinabottle         = register(new ItemBase("Shipinabottle")       .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.rcendereye            = register(new ItemBase("rcendereye")          .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.WoodenBookcasedoor    = register(new ItemBase("WoodenBookcasedoor")  .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.IronBookcasedoor      = register(new ItemBase("IronBookcasedoor")    .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.AncientFlower         = register(new ItemBase("AncientFlower")       .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.Wrappedcorn           = register(new ItemBase("Wrappedcorn")         .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.AncientSeeds          = register(new ItemBase("AncientSeeds")        .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.sugarcaneItemBase     = register(new ItemBase("sugarcaneItemBase")   .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.CornSeed              = register(new ItemBase("CornSeed")            .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	IntegratedItems.stalksItemBase        = register(new ItemBase("stalksItemBase")      .setCreativeTab(Reactioncraft.ReactioncraftItems));
    	
    	
      	//Currency Items
      	IntegratedItems.Bag               = register(new ItemBase("Bag")			 .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.Sack              = register(new ItemBase("Sack")			 .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.Straw             = register(new ItemBase("Straw")			 .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.CoinMould         = register(new ItemBase("CoinMould")		 .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.moltengold        = register(new ItemBase("moltengold")		 .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.moltensilver      = register(new ItemBase("moltensilver")	 .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.moltencopper      = register(new ItemBase("moltencopper")	 .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.moltenbronze      = register(new ItemBase("moltenbronze")	 .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.copperbucket      = register(new ItemBase("copperbucket")	 .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.silverbucket      = register(new ItemBase("silverbucket")	 .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.bronzebucket      = register(new ItemBase("bronzebucket")    .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.goldbucket        = register(new ItemBase("goldbucket")      .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.ingotRefinedgold  = register(new ItemBase("ingotRefinedgold").setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.ingotSilver       = register(new ItemBase("ingotSilver")     .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.ingotBronze       = register(new ItemBase("ingotBronze")     .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.ingotCopper       = register(new ItemBase("ingotCopper")     .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.ingotmould        = register(new ItemBase("ingotmould")      .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.ruby              = register(new ItemBase("ruby")            .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.Metadatacoin      = register(new ItemBase("Metadatacoin")    .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	
      	//Armor Items
      	IntegratedItems.Crown             = register(new ItemBase("Crown")           .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.KinglyChest       = register(new ItemBase("KinglyChest")     .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.KinglyLegs        = register(new ItemBase("KinglyLegs")      .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.KinglyBoots       = register(new ItemBase("KinglyBoots")     .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.emeraldcrown      = register(new ItemBase("emeraldcrown")    .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.diamondcrown      = register(new ItemBase("diamondcrown")    .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.rubycrown         = register(new ItemBase("rubycrown")       .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.bloodstonehelm    = register(new ItemBase("bloodstonehelm")  .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.bloodstonechest   = register(new ItemBase("bloodstonechest") .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.bloodstonelegs    = register(new ItemBase("bloodstonelegs")  .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.bloodstoneboots   = register(new ItemBase("bloodstoneboots") .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	
      	//Weapons
      	IntegratedItems.ObbySword              = register(new ItemBase("ObbySword")             .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.ObbyPick               = register(new ItemBase("ObbyPick")              .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.ObbyShovel             = register(new ItemBase("ObbyShovel")            .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.ObbyAxe                = register(new ItemBase("ObbyAxe")               .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.ObbyHoe                = register(new ItemBase("ObbyHoe")               .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.BloodstoneSword        = register(new ItemBase("BloodstoneSword")       .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.BloodstonePick         = register(new ItemBase("BloodstonePick")        .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.BloodstoneShovel       = register(new ItemBase("BloodstoneShovel")      .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.BloodstoneAxe          = register(new ItemBase("BloodstoneAxe")         .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.BloodstoneHoe          = register(new ItemBase("BloodstoneHoe")         .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.BloodstoneBlade        = register(new ItemBase("BloodstoneBlade")       .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.GoldenSwordFragment    = register(new ItemBase("GoldenSwordFragment")   .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.UnbindedSword          = register(new ItemBase("UnbindedSword")         .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.BloodstoneDiamondPick  = register(new ItemBase("BloodstoneDiamondPick") .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.Bat                    = register(new ItemBase("Bat")                   .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	
      	//Ores
      	IntegratedItems.meltedventinite  = register(new ItemBase("meltedventinite") .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.meltedwizimite   = register(new ItemBase("meltedwizimite")  .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	
      	//Made For Other Mod Items
      	IntegratedItems.scoop            = register(new ItemBase("scoop")           .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.hiveframe        = register(new ItemBase("hiveframe")       .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.honeycomb        = register(new ItemBase("honeycomb")       .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.pollencomb       = register(new ItemBase("pollencomb")      .setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.Blackdiamondbore = register(new ItemBase("Blackdiamondbore").setCreativeTab(Reactioncraft.ReactioncraftItems));
      	IntegratedItems.Bloodstonebore   = register(new ItemBase("Bloodstonebore")  .setCreativeTab(Reactioncraft.ReactioncraftItems));    	
	}

	//Custom Methods
	public static void registerRenders()
	{
		
		//Foods
		registerRender(IntegratedItems.raw_human);
	}

	private static Item registerItemFood(String registryName, int amount, float sat, boolean isWolfFood) 
	{
		Item item = new ItemFood(amount, sat, isWolfFood);
		item.setCreativeTab(Reactioncraft.Reactioncraftfood);
		item.setRegistryName(registryName);
		item.setUnlocalizedName(registryName);

        return GameRegistry.register(item);
    }
	private static void registerRender(Item item) 
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reactioncraft.MODID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
	}
	
	//Register Basic Items
	private static <T extends Item> T register(T item) 
	{
		GameRegistry.register(item);

		if (item instanceof ItemBase) 
		{
			((ItemBase)item).registerItemModel();
		}
		return item;
	}
}