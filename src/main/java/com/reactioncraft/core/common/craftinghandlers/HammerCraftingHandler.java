package com.reactioncraft.core.common.craftinghandlers;

import com.reactioncraft.integration.instances.IntegratedItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraftforge.oredict.OreDictionary;

/**
 * @author Ordinastie
 *
 */
public class HammerCraftingHandler
{
	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent event)
	{
		if (event.crafting.getItem() != Items.IRON_AXE)
			return;

		for (int i = 0; i < event.player.inventory.getSizeInventory(); i++)
		{
			ItemStack slotStack = event.player.inventory.getStackInSlot(i);
			if (slotStack != null && (slotStack.getItem() == IntegratedItems.Hammer || slotStack.getItem() == IntegratedItems.bloodstoneHammer))
			{
				slotStack.damageItem(1, event.player);

				if (slotStack.stackSize == 0)
					event.player.inventory.setInventorySlotContents(i, null);
			}
			else
			{
				slotStack.damageItem(1, event.player);
				System.out.println("here");
			}

		}
	}
}