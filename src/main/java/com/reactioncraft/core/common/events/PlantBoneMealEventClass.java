package com.reactioncraft.core.common.events;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;

public class PlantBoneMealEventClass 
{
	/**
	@SubscribeEvent
	public void onUseBonemeal(BonemealEvent event)
	{
		EntityPlayer player = event.getEntityPlayer();
		World world = event.getWorld();

		if (event.ID == IntegratedBlocks.CherryTreeSapling.blockID && !event.getWorld().isRemote)
		{
			((BlockCherryTreeSapling)IntegratedBlocks.CherryTreeSapling).growTree(event.getWorld(), event.getWorld().rand);
			event.setResult(Result.ALLOW);
		}

		if (event.ID == IntegratedBlocks.AncientPlant.blockID && !event.getWorld().isRemote)
		{
			((BlockAncientPlant)IntegratedBlocks.AncientPlant).fertilize(event.getWorld());
			event.setResult(Result.ALLOW);
		}

		if (event.ID == IntegratedBlocks.cornStalk.blockID && !event.getWorld().isRemote)
		{
			((BlockCornStalk)IntegratedBlocks.cornStalk).fertilize(event.getWorld());
			event.setResult(Result.ALLOW);
		}
	}
	**/
}