package com.reactioncraft.integration;

import com.reactioncraft.eactioncraft;
import com.reactioncraft.core.BlockBase;
import com.reactioncraft.integration.instances.IntegratedBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class IntegratedBlocksRegistry 
{
	public static void init() 
	{
		//Brick Blocks
		IntegratedBlocks.bloodstonebricks = register(new BlockBase(Material.ROCK, "bloodstonebricks").setCreativeTab(eactioncraft.Reactioncraft));
		
		
		//Wooden Blocks
		IntegratedBlocks.CherryPlanks = register(new BlockBase(Material.WOOD, "CherryPlanks").setCreativeTab(eactioncraft.Reactioncraft));
		//IntegratedBlocks.Cherrywood   = register(new BlockTree());
	}
	
	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock);

		if (block instanceof BlockBase) {
			((BlockBase)block).registerItemModel(itemBlock);
		}

		return block;
	}

	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}
}