package com.reactioncraft.integration;

import com.reactioncraft.eactioncraft;
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
		IntegratedItems.meat_cleaver = register(new ItemBase("meat_cleaver")  .setCreativeTab(eactioncraft.ReactioncraftItems));
		IntegratedItems.Knfie        = register(new ItemBase("Knfie")         .setCreativeTab(eactioncraft.ReactioncraftItems));
		
		//Bone Drop
		IntegratedItems.bones         = register(new ItemBase("bones")        .setCreativeTab(eactioncraft.ReactioncraftItems));
		
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
        IntegratedItems.AncientFruit       = register(new ItemBase("AncientFruit")      .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.EdibleFlesh        = register(new ItemBase("EdibleFlesh")       .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.cookedCorn         = register(new ItemBase("cookedCorn")        .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.popcornseeds       = register(new ItemBase("popcornseeds")      .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.bagofpopcorn       = register(new ItemBase("bagofpopcorn")      .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.poppedbagofpopcorn = register(new ItemBase("poppedbagofpopcorn").setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.UnwrappedCorn      = register(new ItemBase("UnwrappedCorn")     .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.rawcorn            = register(new ItemBase("rawcorn")           .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.ChickenNuggets     = register(new ItemBase("ChickenNuggets")    .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.RawNuggets         = register(new ItemBase("RawNuggets")        .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.SlicedBread        = register(new ItemBase("SlicedBread")       .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.HamSandwich        = register(new ItemBase("HamSandwich")       .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.Hamburger          = register(new ItemBase("Hamburger")         .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.Cheeseburger       = register(new ItemBase("Cheeseburger")      .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.Bacon              = register(new ItemBase("Bacon")             .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.BaconRaw           = register(new ItemBase("BaconRaw")          .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.cheese             = register(new ItemBase("cheese")            .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.churn              = register(new ItemBase("churn")             .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.buns               = register(new ItemBase("buns")              .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.SamonRaw           = register(new ItemBase("SamonRaw")          .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.Samon              = register(new ItemBase("Samon")             .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.YellowTailRaw      = register(new ItemBase("YellowTailRaw")     .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.SandStonePaste     = register(new ItemBase("YellowTailCooked")  .setCreativeTab(eactioncraft.ReactioncraftItems));
        
        //Net Items
      	IntegratedItems.hilt   		 = register(new ItemPieceHilt("hilt")       .setCreativeTab(null));
      	IntegratedItems.net  		 = register(new ItemPieceNet("net")         .setCreativeTab(null));
      	IntegratedItems.complete_net = register(new ItemCompleteNet(IntegratedMaterials.EnumToolMaterialNet));
      	//IntegratedItems.caught       = register(new ItemCaughtEntity("caught").setCreativeTab(null));
      	IntegratedItems.caughtplayer = register(new ItemBase("caught_player")   .setCreativeTab(null));
      	IntegratedItems.creativeNet  = register(new ItemBase("creative_net")    .setCreativeTab(eactioncraft.ReactioncraftItems));
      	
      	//Desert Items
      	IntegratedItems.SandStonePaste  = register(new ItemBase("SandStonePaste")     .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.UncutLBGem      = register(new ItemBase("UncutLBGem")         .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.CutLBGem        = register(new ItemBase("CutLBGem")           .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.UncutDBGem      = register(new ItemBase("UncutDBGem")         .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.CutDBGem        = register(new ItemBase("CutDBGem")           .setCreativeTab(eactioncraft.ReactioncraftItems));
      		//Make The Scroll Act as a Book...Eventually
      	IntegratedItems.scroll          = register(new ItemBase("scroll")             .setCreativeTab(eactioncraft.ReactioncraftItems));
      	
      	//Special Tools
      	IntegratedItems.Hammer            = register(new ItemBase("Hammer")              .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.bloodstoneHammer  = register(new ItemBase("bloodstoneHammer")    .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.GoldChisel        = register(new ItemBase("GoldChisel")          .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.FlintChisel       = register(new ItemBase("FlintChisel")         .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.DiamondChisel     = register(new ItemBase("DiamondChisel")       .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.BloodstoneChisel  = register(new ItemBase("BloodstoneChisel")    .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.CopperChisel      = register(new ItemBase("CopperChisel")        .setCreativeTab(eactioncraft.ReactioncraftItems));
      	
      	
      	//Misc Items
      	IntegratedItems.ChainLoop             = register(new ItemBase("ChainLoop")           .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.bloodstoneclump       = register(new ItemBase("bloodstoneclump")     .setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.goldrod               = register(new ItemBase("goldrod")             .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.obsidianingot         = register(new ItemBase("obsidianingot")       .setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.ingotbloodstone       = register(new ItemBase("ingotbloodstone")     .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.ingotsilver           = register(new ItemBase("ingotsilver")         .setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.bloodstonedust        = register(new ItemBase("bloodstonedust")      .setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.blackdiamond          = register(new ItemBase("blackdiamond")        .setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.dragonstoneshard      = register(new ItemBase("dragonstoneshard")    .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.irondust              = register(new ItemBase("irondust")            .setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.gemdragonstone        = register(new ItemBase("gemdragonstone")      .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.superheatedironingot  = register(new ItemBase("superheatedironingot").setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.goldDust              = register(new ItemBase("goldDust")            .setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.moltenglass           = register(new ItemBase("moltenglass")         .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.IceBucket             = register(new ItemBase("IceBucket")           .setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.ObsidianBucket        = register(new ItemBase("ObsidianBucket")      .setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.Mapinabottle          = register(new ItemBase("Mapinabottle")        .setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.Shipinabottle         = register(new ItemBase("Shipinabottle")       .setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.rcendereye            = register(new ItemBase("rcendereye")          .setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.WoodenBookcasedoor    = register(new ItemBase("WoodenBookcasedoor")  .setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.IronBookcasedoor      = register(new ItemBase("IronBookcasedoor")    .setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.AncientFlower         = register(new ItemBase("AncientFlower")       .setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.Wrappedcorn           = register(new ItemBase("Wrappedcorn")         .setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.AncientSeeds          = register(new ItemBase("AncientSeeds")        .setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.sugarcaneItemBase     = register(new ItemBase("sugarcaneItemBase")   .setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.CornSeed              = register(new ItemBase("CornSeed")            .setCreativeTab(eactioncraft.ReactioncraftItems));
    	IntegratedItems.stalksItemBase        = register(new ItemBase("stalksItemBase")      .setCreativeTab(eactioncraft.ReactioncraftItems));
    	
    	
      	//Currency Items
      	IntegratedItems.Bag               = register(new ItemBase("Bag")			 .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.Sack              = register(new ItemBase("Sack")			 .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.Straw             = register(new ItemBase("Straw")			 .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.CoinMould         = register(new ItemBase("CoinMould")		 .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.moltengold        = register(new ItemBase("moltengold")		 .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.moltensilver      = register(new ItemBase("moltensilver")	 .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.moltencopper      = register(new ItemBase("moltencopper")	 .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.moltenbronze      = register(new ItemBase("moltenbronze")	 .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.copperbucket      = register(new ItemBase("copperbucket")	 .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.silverbucket      = register(new ItemBase("silverbucket")	 .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.bronzebucket      = register(new ItemBase("bronzebucket")    .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.goldbucket        = register(new ItemBase("goldbucket")      .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.ingotRefinedgold  = register(new ItemBase("ingotRefinedgold").setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.ingotSilver       = register(new ItemBase("ingotSilver")     .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.ingotBronze       = register(new ItemBase("ingotBronze")     .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.ingotCopper       = register(new ItemBase("ingotCopper")     .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.ingotmould        = register(new ItemBase("ingotmould")      .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.ruby              = register(new ItemBase("ruby")            .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.Metadatacoin      = register(new ItemBase("Metadatacoin")    .setCreativeTab(eactioncraft.ReactioncraftItems));
      	
      	//Armor Items
      	IntegratedItems.Crown             = register(new ItemBase("Crown")           .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.KinglyChest       = register(new ItemBase("KinglyChest")     .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.KinglyLegs        = register(new ItemBase("KinglyLegs")      .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.KinglyBoots       = register(new ItemBase("KinglyBoots")     .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.emeraldcrown      = register(new ItemBase("emeraldcrown")    .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.diamondcrown      = register(new ItemBase("diamondcrown")    .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.rubycrown         = register(new ItemBase("rubycrown")       .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.bloodstonehelm    = register(new ItemBase("bloodstonehelm")  .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.bloodstonechest   = register(new ItemBase("bloodstonechest") .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.bloodstonelegs    = register(new ItemBase("bloodstonelegs")  .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.bloodstoneboots   = register(new ItemBase("bloodstoneboots") .setCreativeTab(eactioncraft.ReactioncraftItems));
      	
      	//Weapons
      	IntegratedItems.ObbySword              = register(new ItemBase("ObbySword")             .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.ObbyPick               = register(new ItemBase("ObbyPick")              .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.ObbyShovel             = register(new ItemBase("ObbyShovel")            .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.ObbyAxe                = register(new ItemBase("ObbyAxe")               .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.ObbyHoe                = register(new ItemBase("ObbyHoe")               .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.BloodstoneSword        = register(new ItemBase("BloodstoneSword")       .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.BloodstonePick         = register(new ItemBase("BloodstonePick")        .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.BloodstoneShovel       = register(new ItemBase("BloodstoneShovel")      .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.BloodstoneAxe          = register(new ItemBase("BloodstoneAxe")         .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.BloodstoneHoe          = register(new ItemBase("BloodstoneHoe")         .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.BloodstoneBlade        = register(new ItemBase("BloodstoneBlade")       .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.GoldenSwordFragment    = register(new ItemBase("GoldenSwordFragment")   .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.UnbindedSword          = register(new ItemBase("UnbindedSword")         .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.BloodstoneDiamondPick  = register(new ItemBase("BloodstoneDiamondPick") .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.Bat                    = register(new ItemBase("Bat")                   .setCreativeTab(eactioncraft.ReactioncraftItems));
      	
      	//Ores
      	IntegratedItems.meltedventinite  = register(new ItemBase("meltedventinite") .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.meltedwizimite   = register(new ItemBase("meltedwizimite")  .setCreativeTab(eactioncraft.ReactioncraftItems));
      	
      	//Made For Other Mod Items
      	IntegratedItems.scoop            = register(new ItemBase("scoop")           .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.hiveframe        = register(new ItemBase("hiveframe")       .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.honeycomb        = register(new ItemBase("honeycomb")       .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.pollencomb       = register(new ItemBase("pollencomb")      .setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.Blackdiamondbore = register(new ItemBase("Blackdiamondbore").setCreativeTab(eactioncraft.ReactioncraftItems));
      	IntegratedItems.Bloodstonebore   = register(new ItemBase("Bloodstonebore")  .setCreativeTab(eactioncraft.ReactioncraftItems));    	
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
		item.setCreativeTab(eactioncraft.Reactioncraftfood);
		item.setRegistryName(registryName);
		item.setUnlocalizedName(registryName);

        return GameRegistry.register(item);
    }
	private static void registerRender(Item item) 
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(eactioncraft.MODID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
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