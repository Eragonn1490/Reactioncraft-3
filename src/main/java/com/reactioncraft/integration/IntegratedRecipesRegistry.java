package com.reactioncraft.integration;

import com.reactioncraft.integration.instances.IntegratedBlocks;
import com.reactioncraft.integration.instances.IntegratedItems;

import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class IntegratedRecipesRegistry
{
	public static void netrecipyInit() 
	{
		//Below is the crafting Recipe's for making the multi-Level / extra use Nets.
		Object[] levels = new Object[] {Blocks.PLANKS, Items.LEATHER, Items.IRON_INGOT, Items.GOLD_INGOT, Items.DIAMOND};

		for (int i = 0; i < levels.length; ++i)
		{
			Object[] hiltRec = new Object[] {" XI", "XIX", "IX ", 'X', Items.STICK, 'I', levels[i]};
			Object[] netRec = new Object[] {"IXI", "XIX", "IXI", 'X', Items.STRING, 'I', levels[i]};
			ItemStack hiltIs = new ItemStack(IntegratedItems.hilt);
			ItemStack netIs = new ItemStack(IntegratedItems.net);

			hiltIs.setTagCompound(new NBTTagCompound());
			netIs.setTagCompound(new NBTTagCompound());

			hiltIs.getTagCompound().setInteger("str1", i + 1);
			netIs.getTagCompound() .setInteger("str2", i + 1);
			GameRegistry.addRecipe(hiltIs, hiltRec);
			GameRegistry.addRecipe(netIs, netRec);
		}
        GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.complete_net), new Object[] {IntegratedItems.hilt, IntegratedItems.net});
	}

	public static void machinerecipiesInit() 
	{
		//GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.FreezerIdle), new Object[] {Blocks.DIRT});
	}
}