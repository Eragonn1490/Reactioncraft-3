package com.reactioncraft.core.common.craftinghandlers;

import com.reactioncraft.integration.IntegratedItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class NetCraftingHandler 
{
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix)
    {
        if (item.getItem().equals(IntegratedItems.complete_net))
        {
            item.setTagCompound(new NBTTagCompound());
            ItemStack hilt = null;
            ItemStack net = null;
            
            for (int i = 0; i < craftMatrix.getSizeInventory(); ++i)
            {
                ItemStack is = craftMatrix.getStackInSlot(i);

                if (is != null)
                {
                    if (is.getItem() == IntegratedItems.hilt)
                    {
                        hilt = is;
                    }
                    else
                    {
                        net = is;
                    }
                }
            }

            if (hilt != null && net != null)
            {
                item.getTagCompound().setInteger("hilt", hilt.getTagCompound().getInteger("str1"));
                item.getTagCompound().setInteger("net", net.getTagCompound().getInteger("str2"));
            }
        }
    }
}