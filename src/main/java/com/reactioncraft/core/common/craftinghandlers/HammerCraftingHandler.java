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
		int i;

		if (event.crafting.getItem() != Items.IRON_AXE)
		{
			return;
		}
			
		for (i = 0; i < event.player.inventory.getSizeInventory(); i++)
		{
			ItemStack slotStack = event.player.inventory.getStackInSlot(i);
			if (slotStack != null && (slotStack.getItem() == IntegratedItems.Hammer || slotStack.getItem() == IntegratedItems.bloodstoneHammer))
			{
				if (slotStack.getItemDamage() <= 0)
				{
					event.player.inventory.setInventorySlotContents(i, null);
				}
				
				System.out.println("jones");
			}
		}
	}
}