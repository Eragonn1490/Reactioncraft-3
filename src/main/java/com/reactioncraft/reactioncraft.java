package com.reactioncraft;

//Vanilla Imports
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

//Forge - FML Imports
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

//Reactioncraft Imports
import com.reactioncraft.core.*;
import com.reactioncraft.core.common.biomes.BiomeManager;
import com.reactioncraft.core.common.creativeTab.*;
import com.reactioncraft.core.common.events.*;
import com.reactioncraft.integration.*;
import com.reactioncraft.api.*;

@Mod(modid = reactioncraft.MODID, name = reactioncraft.name, version = reactioncraft.version, acceptedMinecraftVersions = "[1.10.2]")

public class reactioncraft
{
	public static final String name = "Reactioncraft 3: Rebirth";
    public static final String MODID = "reactioncraft";
    public static final String version = "1.0.0";
    
    //Proxies
    @SidedProxy(serverSide = "com.reactioncraft.core.CommonProxy", clientSide = "com.reactioncraft.core.ClientProxy")
    public static CommonProxy proxy;
    
    //Instance
    @Mod.Instance(MODID)
	public static reactioncraft instance;
    
    //Creative Tabs
    public static CreativeTabs ReactioncraftItems = new RCTAB ("ReactioncraftItems");
    public static CreativeTabs Reactioncraft      = new RCTAB1("Reactioncraft");
    public static CreativeTabs Reactioncraftfood  = new RCTAB2("Reactioncraftfood");
    
    //Exclusion List for Mobs
    public static ExclusionList exclusionList;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent evt)
    {
        System.out.println("[REACTIONCRAFT] Pre Initialization Started");
        proxy.registerRenderInformation();
        IntegratedMaterials.initMaterials();
        IntegratedItemRegistry.init();
        IntegratedBlocksRegistry.init();
        BiomeManager.registerBiomes();
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	IntegratedEventRegistry.eventInit();
    	IntegratedRecipesRegistry.netrecipyInit();
    }
    
    @Mod.EventHandler
    public void modsLoaded(FMLPostInitializationEvent evt)
    {
    	FMLLog.info("Looks like Reactioncraft Has Fully Loaded!", new Object[0]);
    }
}