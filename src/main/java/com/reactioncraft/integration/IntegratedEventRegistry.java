package com.reactioncraft.integration;

import com.reactioncraft.core.common.craftinghandlers.*;
import com.reactioncraft.core.common.events.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class IntegratedEventRegistry 
{
	//All Events Registered Here
	public static void eventInit() 
	{
		MinecraftForge.EVENT_BUS.register(new ButcherEventClass());
		MinecraftForge.EVENT_BUS.register(new EntityAIEventClass());
		MinecraftForge.EVENT_BUS.register(new EventContainerClass());
		MinecraftForge.EVENT_BUS.register(new NetCraftingHandler());
		MinecraftForge.EVENT_BUS.register(new MachinesCraftingHandler());
		MinecraftForge.EVENT_BUS.register(new ChiselCraftingHandler());
		MinecraftForge.EVENT_BUS.register(new HammerCraftingHandler());
	}
}