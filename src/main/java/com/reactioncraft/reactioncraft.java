package com.reactioncraft;


import com.reactioncraft.api.ExclusionList;
//Reactioncraft Imports
import com.reactioncraft.core.CommonProxy;
import com.reactioncraft.core.Remapper;
import com.reactioncraft.core.common.biomes.BiomeManager;
import com.reactioncraft.core.common.creativeTab.RCTAB;
import com.reactioncraft.core.common.creativeTab.RCTAB1;
import com.reactioncraft.core.common.creativeTab.RCTAB2;
import com.reactioncraft.core.common.tileEntities.TileEntityRegistry;
import com.reactioncraft.integration.IntegratedBlocksRegistry;
import com.reactioncraft.integration.IntegratedEventRegistry;
import com.reactioncraft.integration.IntegratedItemRegistry;
import com.reactioncraft.integration.IntegratedMaterials;
import com.reactioncraft.integration.IntegratedRecipesRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLMissingMappingsEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

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
    
    //For Wild_Card Values #updated from OreDict (Replace as it pops up)
    public static final int WILDCARD_VALUE = Short.MAX_VALUE;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent evt)
    {
        System.out.println("[REACTIONCRAFT] Pre Initialization Started");
        proxy.registerRenderInformation();
        IntegratedMaterials.initMaterials();
        IntegratedItemRegistry.init();
        IntegratedBlocksRegistry.init();
        BiomeManager.registerBiomes();
        TileEntityRegistry.registerTileEntities();
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	IntegratedEventRegistry.eventInit();
    	IntegratedRecipesRegistry.netrecipyInit();
    	IntegratedRecipesRegistry.machinerecipiesInit();
    }
    
    @Mod.EventHandler
    public void modsLoaded(FMLPostInitializationEvent evt)
    {
    	FMLLog.info("Looks like Reactioncraft Has Fully Loaded!", new Object[0]);
    }
    
    @EventHandler
	public void missingMappings(FMLMissingMappingsEvent event) 
    {
		//Remapper.remap(event.get());
	}
}
