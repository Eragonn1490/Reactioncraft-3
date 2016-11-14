package com.reactioncraft.core.common.events;

import com.reactioncraft.integration.instances.IntegratedItems;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventContainerClass
{
	public static double rand;

	//@SubscribeEvent
	//public void onItemPickupWood(EntityItemPickupEvent e)
	//{
	//	if (e.getItem().getEntityItem() == IntegratedBlocks.Cherrywood.blockID)
	//	{
	//		e.getEntityPlayer().hasAchievement(AchievementList.MINE_WOOD);
	//	}
	//}


	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event)
	{
		rand = Math.random();

		if (event.getSource().getDamageType().equals("player"))
		{
			if (event.getEntityLiving() instanceof EntityPig && rand < 1.0D)
			{
				event.getEntityLiving().dropItem(IntegratedItems.bones, 1);
			}

			if (event.getEntityLiving() instanceof EntityChicken && rand < 1.0D)
			{
				event.getEntityLiving().dropItem(IntegratedItems.bones, 1);
			}

			if (event.getEntityLiving() instanceof EntityBat && rand < 1.0D)
			{
				event.getEntityLiving().dropItem(IntegratedItems.bones, 1);
			}

			if (event.getEntityLiving() instanceof EntityCow && rand < 1.0D)
			{
				event.getEntityLiving().dropItem(IntegratedItems.bones, 1);
			}

			if (event.getEntityLiving() instanceof EntityHorse && rand < 1.0D)
			{
				event.getEntityLiving().dropItem(IntegratedItems.bones, 1);
			}

			if (event.getEntityLiving() instanceof EntityMooshroom && rand < 1.0D)
			{
				event.getEntityLiving().dropItem(IntegratedItems.bones, 1);
			}

			if (event.getEntityLiving() instanceof EntityOcelot && rand < 1.0D)
			{
				event.getEntityLiving().dropItem(IntegratedItems.bones, 1);
			}

			if (event.getEntityLiving() instanceof EntitySheep && rand < 1.0D)
			{
				event.getEntityLiving().dropItem(IntegratedItems.bones, 1);
			}

			//if (event.getEntityLiving() instanceof EntitySquid && rand < 1.0D)
			//{
			//	event.getEntityLiving().dropItem(IntegratedItems.bones, 1);
			//}

			if (event.getEntityLiving() instanceof EntityVillager && rand < 1.0D)
			{
				event.getEntityLiving().dropItem(IntegratedItems.bones, 1);
			}

			if (event.getEntityLiving() instanceof EntityWolf && rand < 1.0D)
			{
				event.getEntityLiving().dropItem(IntegratedItems.bones, 1);
			}

			if (event.getEntityLiving() instanceof EntityPlayer && rand < 1.0D)
			{
				event.getEntityLiving().dropItem(IntegratedItems.bones, 1);
			}

			if (event.getEntityLiving() instanceof EntityCreeper && rand < 1.0D)
			{
				event.getEntityLiving().dropItem(IntegratedItems.bones, 1);
			}

			if (event.getEntityLiving() instanceof EntityPigZombie && rand < 1.0D)
			{
				event.getEntityLiving().dropItem(IntegratedItems.bones, 1);
			}

			if (event.getEntityLiving() instanceof EntityWitch && rand < 1.0D)
			{
				event.getEntityLiving().dropItem(IntegratedItems.bones, 1);
			}

			if (event.getEntityLiving() instanceof EntityZombie && rand < 1.0D)
			{
				event.getEntityLiving().dropItem(IntegratedItems.bones, 1);
			}
		}
	}
}