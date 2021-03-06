package com.reactioncraft.integration;

import com.reactioncraft.reactioncraft;
import com.reactioncraft.core.ItemModelProvider;
import com.reactioncraft.core.common.ItemBaseSword;
import com.reactioncraft.core.common.items.*;
import com.reactioncraft.integration.instances.IntegratedItems;
import com.reactioncraft.net.common.*;
import com.reactioncraft.tools.common.*;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class IntegratedItemRegistry 
{
    public static void init() 
    {
        //Food Related Weapons
        IntegratedItems.meat_cleaver = register(new ItemBase("meat_cleaver")  .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.Knife        = (ItemBaseSword) register(new ItemBaseSword("Knfie", IntegratedMaterials.EnumToolMaterialMeatcleaver)         .setCreativeTab(reactioncraft.ReactioncraftItems));

        //Bone Drop
        IntegratedItems.bones         = register(new ItemBase("bones")        .setCreativeTab(reactioncraft.ReactioncraftItems));


        //Modified Food Drops
        IntegratedItems.raw_human       = register(new ItemFoodBase("raw_human",    3, 0.6f, false));
        IntegratedItems.cooked_human    = register(new ItemFoodBase("cooked_human", 4, 0.8f, false));
        IntegratedItems.raw_lamb        = register(new ItemFoodBase("raw_lamb",     3, 0.6f, false));
        IntegratedItems.cooked_lamb     = register(new ItemFoodBase("cooked_lamb",  8, 0.8f, false));
        IntegratedItems.raw_horse       = register(new ItemFoodBase("raw_horse",    3, 0.6f, false));
        IntegratedItems.cooked_horse    = register(new ItemFoodBase("cooked_horse", 4, 0.8f, false));
        IntegratedItems.chicken_head    = register(new ItemchickenHead("chicken_head", 3, 0.6f, false));
        IntegratedItems.beef_chunk      = register(new ItemFoodBase("raw_beef",     3, 0.6f, false));
        IntegratedItems.pork_chunk      = register(new ItemFoodBase("raw_pork",     3, 0.6f, false));

        //Food Items
        IntegratedItems.AncientFruit       = register(new ItemBase("AncientFruit")      .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.EdibleFlesh        = register(new ItemBase("EdibleFlesh")       .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.cookedCorn         = register(new ItemBase("cookedCorn")        .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.popcornseeds       = register(new ItemBase("popcornseeds")      .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.bagofpopcorn       = register(new ItemBase("bagofpopcorn")      .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.poppedbagofpopcorn = register(new ItemBase("poppedbagofpopcorn").setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.UnwrappedCorn      = register(new ItemBase("UnwrappedCorn")     .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.rawcorn            = register(new ItemBase("rawcorn")           .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.ChickenNuggets     = register(new ItemBase("ChickenNuggets")    .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.RawNuggets         = register(new ItemBase("RawNuggets")        .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.SlicedBread        = register(new ItemBase("SlicedBread")       .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.HamSandwich        = register(new ItemBase("HamSandwich")       .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.Hamburger          = register(new ItemBase("Hamburger")         .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.Cheeseburger       = register(new ItemBase("Cheeseburger")      .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.Bacon              = register(new ItemBase("Bacon")             .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.BaconRaw           = register(new ItemBase("BaconRaw")          .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.cheese             = register(new ItemBase("cheese")            .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.churn              = register(new ItemBase("churn")             .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.buns               = register(new ItemBase("buns")              .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.SamonRaw           = register(new ItemBase("SamonRaw")          .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.Samon              = register(new ItemBase("Samon")             .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.YellowTailRaw      = register(new ItemBase("YellowTailRaw")     .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.SandStonePaste     = register(new ItemBase("YellowTailCooked")  .setCreativeTab(reactioncraft.ReactioncraftItems));

        //Net Items
        IntegratedItems.hilt         = register(new ItemPieceHilt("piece_hilt")       .setCreativeTab(null));
        IntegratedItems.net          = register(new ItemPieceNet("piece_net")         .setCreativeTab(null));
        IntegratedItems.complete_net = register(new ItemCompleteNet("complete_net", IntegratedMaterials.EnumToolMaterialNet));

        //Desert Items
        IntegratedItems.SandStonePaste  = register(new ItemBase("SandStonePaste")     .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.UncutLBGem      = register(new ItemBase("UncutLBGem")         .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.CutLBGem        = register(new ItemBase("CutLBGem")           .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.UncutDBGem      = register(new ItemBase("UncutDBGem")         .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.CutDBGem        = register(new ItemBase("CutDBGem")           .setCreativeTab(reactioncraft.ReactioncraftItems));
        //Make The Scroll Act as a Book...Eventually
        IntegratedItems.scroll          = register(new ItemBase("scroll")             .setCreativeTab(reactioncraft.ReactioncraftItems));

        //Special Tools
        IntegratedItems.Hammer            = register(new ItemBase("Hammer")              .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.bloodstoneHammer  = register(new ItemBase("bloodstoneHammer")    .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.GoldChisel        = register(new ItemBase("GoldChisel")          .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.FlintChisel       = register(new ItemBase("FlintChisel")         .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.DiamondChisel     = register(new ItemBase("DiamondChisel")       .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.BloodstoneChisel  = register(new ItemBase("BloodstoneChisel")    .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.CopperChisel      = register(new ItemBase("CopperChisel")        .setCreativeTab(reactioncraft.ReactioncraftItems));

        //Misc Items
        IntegratedItems.ChainLoop             = register(new ItemBase("ChainLoop")           .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.bloodstoneclump       = register(new ItemBase("bloodstoneclump")     .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.goldrod               = register(new ItemBase("goldrod")             .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.obsidianingot         = register(new ItemBase("obsidianingot")       .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.ingotbloodstone       = register(new ItemBase("ingotbloodstone")     .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.ingotsilver           = register(new ItemBase("ingotsilver")         .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.bloodstonedust        = register(new ItemBase("bloodstonedust")      .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.blackdiamond          = register(new ItemBase("blackdiamond")        .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.dragonstoneshard      = register(new ItemBase("dragonstoneshard")    .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.irondust              = register(new ItemBase("irondust")            .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.gemdragonstone        = register(new ItemBase("gemdragonstone")      .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.superheatedironingot  = register(new ItemBase("superheatedironingot").setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.goldDust              = register(new ItemBase("goldDust")            .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.moltenglass           = register(new ItemBase("moltenglass")         .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.IceBucket             = register(new ItemBase("IceBucket")           .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.ObsidianBucket        = register(new ItemBase("ObsidianBucket")      .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.Mapinabottle          = register(new ItemBase("Mapinabottle")        .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.Shipinabottle         = register(new ItemBase("Shipinabottle")       .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.rcendereye            = register(new ItemBase("rcendereye")          .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.WoodenBookcasedoor    = register(new ItemBase("WoodenBookcasedoor")  .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.IronBookcasedoor      = register(new ItemBase("IronBookcasedoor")    .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.AncientFlower         = register(new ItemBase("AncientFlower")       .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.Wrappedcorn           = register(new ItemBase("Wrappedcorn")         .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.AncientSeeds          = register(new ItemBase("AncientSeeds")        .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.sugarcaneItemBase     = register(new ItemBase("sugarcaneItemBase")   .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.CornSeed              = register(new ItemBase("CornSeed")            .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.stalksItemBase        = register(new ItemBase("stalksItemBase")      .setCreativeTab(reactioncraft.ReactioncraftItems));


        //Currency Items
        IntegratedItems.Bag               = register(new ItemBase("Bag")             .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.Sack              = register(new ItemBase("Sack")            .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.Straw             = register(new ItemBase("Straw")           .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.CoinMould         = register(new ItemBase("CoinMould")       .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.moltengold        = register(new ItemBase("moltengold")      .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.moltensilver      = register(new ItemBase("moltensilver")    .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.moltencopper      = register(new ItemBase("moltencopper")    .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.moltenbronze      = register(new ItemBase("moltenbronze")    .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.copperbucket      = register(new ItemBase("copperbucket")    .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.silverbucket      = register(new ItemBase("silverbucket")    .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.bronzebucket      = register(new ItemBase("bronzebucket")    .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.goldbucket        = register(new ItemBase("goldbucket")      .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.ingotRefinedgold  = register(new ItemBase("ingotRefinedgold").setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.ingotSilver       = register(new ItemBase("ingotSilver")     .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.ingotBronze       = register(new ItemBase("ingotBronze")     .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.ingotCopper       = register(new ItemBase("ingotCopper")     .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.ingotmould        = register(new ItemBase("ingotmould")      .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.ruby              = register(new ItemBase("ruby")            .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.Metadatacoin      = register(new ItemBase("Metadatacoin")    .setCreativeTab(reactioncraft.ReactioncraftItems));

        
        //Armor Items
        IntegratedItems.Crown             = register(new ItemBase("Crown")           .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.KinglyChest       = register(new ItemBase("KinglyChest")     .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.KinglyLegs        = register(new ItemBase("KinglyLegs")      .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.KinglyBoots       = register(new ItemBase("KinglyBoots")     .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.emeraldcrown      = register(new ItemBase("emeraldcrown")    .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.diamondcrown      = register(new ItemBase("diamondcrown")    .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.rubycrown         = register(new ItemBase("rubycrown")       .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.bloodstonehelm    = register(new ItemBase("bloodstonehelm")  .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.bloodstonechest   = register(new ItemBase("bloodstonechest") .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.bloodstonelegs    = register(new ItemBase("bloodstonelegs")  .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.bloodstoneboots   = register(new ItemBase("bloodstoneboots") .setCreativeTab(reactioncraft.ReactioncraftItems));

        //Weapons
        IntegratedItems.Bat                    = register(new ItemBase("Bat")                   .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.ObbySword              = (ItemObsidanSword) register(new ItemObsidanSword("ObbySword", IntegratedMaterials.EnumToolMaterialObby));
        IntegratedItems.ObbyPick               = (ItemObsidanPick)  register(new ItemObsidanPick("ObbyPick", IntegratedMaterials.EnumToolMaterialObby)                              .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.ObbyShovel             = (ItemObsidianShovel) register(new ItemObsidianShovel("ObbyShovel", IntegratedMaterials.EnumToolMaterialObby)                       .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.ObbyAxe                = (ItemObsidianAxe) register(new ItemObsidianAxe("ObbyAxe", IntegratedMaterials.EnumToolMaterialObby)                                .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.ObbyHoe                = (ItemObsidianHoe) register(new ItemObsidianHoe("ObbyHoe", IntegratedMaterials.EnumToolMaterialObby)                                .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.BloodstoneSword        = (ItemBloodstoneSword) register(new ItemBloodstoneSword("BloodstoneSword", IntegratedMaterials.EnumToolMaterialBloodstone)          .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.BloodstonePick         = (ItemBloodstonePick) register(new ItemBloodstonePick("BloodstonePick", IntegratedMaterials.EnumToolMaterialBloodstone)             .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.BloodstoneShovel       = (ItemBloodstoneShovel) register(new ItemBloodstoneShovel("BloodstoneShovel", IntegratedMaterials.EnumToolMaterialBloodstone)       .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.BloodstoneAxe          = (ItemBloodstoneAxe) register(new ItemBloodstoneAxe("BloodstoneAxe", IntegratedMaterials.EnumToolMaterialBloodstone)                .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.BloodstoneHoe          = (ItemBloodstoneHoe) register(new ItemBloodstoneHoe("BloodstoneHoe", IntegratedMaterials.EnumToolMaterialBloodstone)                .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.BloodstoneDiamondPick  = (ItemBlackdiamondPick) register(new ItemBlackdiamondPick("BloodstoneDiamondPick", IntegratedMaterials.EnumToolMaterialBloodstone2) .setCreativeTab(reactioncraft.ReactioncraftItems));
        
        //Weapon Parts
        IntegratedItems.BloodstoneBlade        = register(new ItemBase("BloodstoneBlade")       .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.GoldenSwordFragment    = register(new ItemBase("GoldenSwordFragment")   .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.UnbindedSword          = register(new ItemBase("UnbindedSword")         .setCreativeTab(reactioncraft.ReactioncraftItems));


        //Ores
        IntegratedItems.meltedventinite  = register(new ItemBase("meltedventinite") .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.meltedwizimite   = register(new ItemBase("meltedwizimite")  .setCreativeTab(reactioncraft.ReactioncraftItems));

        //Made For Other Mod Items
        IntegratedItems.scoop            = register(new ItemBase("scoop")           .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.hiveframe        = register(new ItemBase("hiveframe")       .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.honeycomb        = register(new ItemBase("honeycomb")       .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.pollencomb       = register(new ItemBase("pollencomb")      .setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.Blackdiamondbore = register(new ItemBase("Blackdiamondbore").setCreativeTab(reactioncraft.ReactioncraftItems));
        IntegratedItems.Bloodstonebore   = register(new ItemBase("Bloodstonebore")  .setCreativeTab(reactioncraft.ReactioncraftItems));     
    }

    private static void registerRender(Item item) 
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(reactioncraft.MODID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
    }

   
    private static <T extends Item> T register(T item) 
    {
        GameRegistry.register(item);

        if (item instanceof ItemModelProvider) 
        {
            ((ItemModelProvider) item).registerItemModel();
        }

        return item;
    }
}