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
	     ItemStack getItemUses;
		
		if (event.crafting.getItem() != Items.IRON_AXE)
			return;

		if(event.crafting.getItem() == Items.IRON_AXE)
		{
			for (int i = 0; i < event.player.inventory.getSizeInventory(); i++)
			{
				ItemStack slotStack = event.player.inventory.getStackInSlot(i);
				if (slotStack != null && (slotStack.getItem() == IntegratedItems.Hammer || slotStack.getItem() == IntegratedItems.bloodstoneHammer))
				{
					 getItemUses = new ItemStack(IntegratedItems.Hammer, 1, slotStack.getItemDamage() + 1);
					
					 if (getItemUses.stackSize == 0)
                     {
						 --getItemUses.stackSize;
                     }
					 event.player.inventory.setInventorySlotContents(i, getItemUses);
				}
			}
		}
	}
}