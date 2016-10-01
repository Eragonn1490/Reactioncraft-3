package com.reactioncraft.core.common.events;

import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.passive.*;//Replace with Reactioncraft Tracker Jacker
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EntityAIEventClass
{
	@SubscribeEvent
    public void onEntityJoinWorld(EntityJoinWorldEvent event)
    {
        if (event.getEntity() instanceof EntityVillager)
        {
            EntityVillager fleetj = (EntityVillager)event.getEntity();
            fleetj.tasks.addTask(1, new EntityAIAvoidEntity(fleetj, EntitySheep.class, 2.0F, 0.8D, 1.33D));
        }															//Remember to Replace with Tracker Jacker.
    }
}