package com.reactioncraft.core.common.craftinghandlers;

import com.reactioncraft.integration.instances.IntegratedItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraftforge.oredict.OreDictionary;

public class HammerCraftingHandler 
{

	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent event)
	{
		int i;
		ItemStack findItem;
		ItemStack getItemUses;


		//round two.5 fixed.
		if (event.crafting.getItem() == Items.IRON_AXE)  //Check for Item Crafted 
		{
			for (i = 0; i < event.player.inventory.getSizeInventory(); ++i) //Loop through inventory
			{
				findItem = event.player.inventory.getStackInSlot(i);        //Check for Item in slot

				if (findItem.getItem() != null) //if item is not null
				{
					if(findItem.getItem() == IntegratedItems.Hammer) //If slot is not empty && is a hammer skip to next
					{
						getItemUses = new ItemStack(IntegratedItems.Hammer, 1, findItem.getItemDamage() + 1); //should be found by now and damage the item

						if (getItemUses.getItemDamage() >= getItemUses.getMaxDamage()) //If item uses < 0 break it
						{
							--findItem.stackSize;//Actually Break it
						}

						event.player.inventory.setInventorySlotContents(i, findItem); //Change the item to be damaged
					}
					else{}
				}
				else{}
			}
		}
		else {}

		//		//fixed hopefully
		//		for (i = 0; i < event.player.inventory.getSizeInventory(); ++i)
		//        {
		//			findItem = event.player.inventory.getStackInSlot(i);
		//			 
		//            if (findItem.getItem() != null && findItem.getItem() == IntegratedItems.Hammer)
		//            {
		//                getItemUses = new ItemStack(IntegratedItems.Hammer, 1, findItem.getItemDamage() + 1);
		//                
		//                if (event.crafting.getItem() == Items.IRON_AXE)
		//                {
		//                	
		//                	findItem = new ItemStack(IntegratedItems.Hammer, 1, findItem.getItemDamage() + 1);
		//                    if (getItemUses.getItemDamage() >= getItemUses.getMaxDamage())
		//                    {
		//                        --findItem.stackSize;
		//                    }
		//
		//                    event.player.inventory.setInventorySlotContents(i, findItem);
		//                	
		//                }
		//                else {}
		//            }
		//            else {}
		//            
		//        }

		//Damaging From Inventory if not used in crafting recipe
		//		for (i = 0; i < event.player.inventory.getSizeInventory(); ++i)
		//        {
		//            if (event.player.inventory.getStackInSlot(i) != null)//inventory cant be null
		//            {
		//                findItem = event.player.inventory.getStackInSlot(i);
		// 
		//                if (findItem.getItem() != null && findItem.getItem() == IntegratedItems.Hammer)
		//                {
		//                    getItemUses = new ItemStack(IntegratedItems.Hammer, 1, findItem.getItemDamage() + 1);
		// 
		//                    if (event.crafting.getItem() == Items.IRON_AXE)
		//                    {
		//                    	findItem = new ItemStack(IntegratedItems.Hammer, 1, findItem.getItemDamage() + 1);
		//                        if (getItemUses.getItemDamage() >= getItemUses.getMaxDamage())
		//                        {
		//                            --findItem.stackSize;
		//                        }
		// 
		//                        event.player.inventory.setInventorySlotContents(i, findItem);
		//                    }
		//                }
		//                else{}
		//            }
		//        }

		//Havent modified yet
		for (i = 0; i < event.player.inventory.getSizeInventory(); ++i)
		{
			if (event.crafting.getItem() == Items.IRON_AXE)
			{
				if (event.player.inventory.getStackInSlot(i) != null)
				{
					findItem = event.player.inventory.getStackInSlot(i);

					if (findItem.getItem() != null && findItem.getItem() == IntegratedItems.bloodstoneHammer)
					{
						getItemUses = new ItemStack(IntegratedItems.bloodstoneHammer, 2, findItem.getItemDamage() + 1);

						if (getItemUses.getItemDamage() >= getItemUses.getMaxDamage())
						{
							--getItemUses.stackSize;
						}

						event.player.inventory.setInventorySlotContents(i, getItemUses);
					}
				}
			}
		}

		//Damaging Item Used in Crafting Recipe
	}
}