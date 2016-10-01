package com.reactioncraft.integration;

import com.reactioncraft.core.common.events.*;

import net.minecraftforge.common.MinecraftForge;

public class IntegratedEventRegistry 
{
	//All Events Registered Here
	public static void eventInit() 
	{
		MinecraftForge.EVENT_BUS.register(new ButcherEventClass());
		MinecraftForge.EVENT_BUS.register(new EntityAIEventClass());
		MinecraftForge.EVENT_BUS.register(new EventContainerClass());
	}
}