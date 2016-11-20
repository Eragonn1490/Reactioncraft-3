package com.reactioncraft.core.common.craftinghandlers;

import com.reactioncraft.integration.instances.IntegratedItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraftforge.oredict.OreDictionary;

public class MachinesCraftingHandler 
{
	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent event)
	{
		ItemStack irondust = new ItemStack(IntegratedItems.irondust);

		if (event.crafting.getItem() != Items.IRON_AXE)
		{
			return; 
		}

		else if(event.crafting.getItem() == Items.IRON_AXE && event.player.inventoryContainer.inventoryItemStacks.contains(OreDictionary.getOres("hammer")));
		{
			System.out.println("event launched");
			event.player.dropItem(irondust, true);
		}
	}
}