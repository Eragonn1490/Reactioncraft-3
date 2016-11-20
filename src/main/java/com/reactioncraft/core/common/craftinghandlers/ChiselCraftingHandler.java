package com.reactioncraft.core.common.craftinghandlers;

import com.reactioncraft.integration.instances.IntegratedItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

public class ChiselCraftingHandler
{
	@SubscribeEvent
    public void onCrafting(ItemCraftedEvent event)
    {
        int G;
        ItemStack j;
        ItemStack k;

        for (G = 0; G < event.craftMatrix.getSizeInventory(); ++G)
        {
            if (event.craftMatrix.getStackInSlot(G) != null)
            {
                j = event.craftMatrix.getStackInSlot(G);

                if (j.getItem() != null && j.getItem() == IntegratedItems.GoldChisel)
                {
                    k = new ItemStack(IntegratedItems.GoldChisel, 2, j.getItemDamage() + 1);

                    if (k.getItemDamage() >= k.getMaxDamage())
                    {
                        --k.stackSize;
                    }

                    event.craftMatrix.setInventorySlotContents(G, k);
                }
            }
        }

        for (G = 0; G < event.craftMatrix.getSizeInventory(); ++G)
        {
            if (event.craftMatrix.getStackInSlot(G) != null)
            {
                j = event.craftMatrix.getStackInSlot(G);

                if (j.getItem() != null && j.getItem() == IntegratedItems.FlintChisel)
                {
                    k = new ItemStack(IntegratedItems.FlintChisel, 2, j.getItemDamage() + 1);

                    if (k.getItemDamage() >= k.getMaxDamage())
                    {
                        --k.stackSize;
                    }

                    event.craftMatrix.setInventorySlotContents(G, k);
                }
            }
        }

        for (G = 0; G < event.craftMatrix.getSizeInventory(); ++G)
        {
            if (event.craftMatrix.getStackInSlot(G) != null)
            {
                j = event.craftMatrix.getStackInSlot(G);

                if (j.getItem() != null && j.getItem() == IntegratedItems.DiamondChisel)
                {
                    k = new ItemStack(IntegratedItems.DiamondChisel, 2, j.getItemDamage() + 1);

                    if (k.getItemDamage() >= k.getMaxDamage())
                    {
                        --k.stackSize;
                    }

                    event.craftMatrix.setInventorySlotContents(G, k);
                }
            }
        }

        for (G = 0; G < event.craftMatrix.getSizeInventory(); ++G)
        {
            if (event.craftMatrix.getStackInSlot(G) != null)
            {
                j = event.craftMatrix.getStackInSlot(G);

                if (j.getItem() != null && j.getItem() == IntegratedItems.BloodstoneChisel)
                {
                    k = new ItemStack(IntegratedItems.BloodstoneChisel, 2, j.getItemDamage() + 1);

                    if (k.getItemDamage() >= k.getMaxDamage())
                    {
                        --k.stackSize;
                    }

                    event.craftMatrix.setInventorySlotContents(G, k);
                }
            }
        }

        for (G = 0; G < event.craftMatrix.getSizeInventory(); ++G)
        {
            if (event.craftMatrix.getStackInSlot(G) != null)
            {
                j = event.craftMatrix.getStackInSlot(G);

                if (j.getItem() != null && j.getItem() == IntegratedItems.CopperChisel)
                {
                    k = new ItemStack(IntegratedItems.CopperChisel, 2, j.getItemDamage() + 1);

                    if (k.getItemDamage() >= k.getMaxDamage())
                    {
                        --k.stackSize;
                    }

                    event.craftMatrix.setInventorySlotContents(G, k);
                }
            }
        }
    }
}