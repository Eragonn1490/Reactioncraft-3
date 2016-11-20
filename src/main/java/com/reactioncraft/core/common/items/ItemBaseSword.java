package com.reactioncraft.core.common.items;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.reactioncraft.reactioncraft;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemBaseSword extends ItemSword
{
	public ItemBaseSword(String unlocalizedName, ToolMaterial material)
	{
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(reactioncraft.MODID, unlocalizedName));
	}
	
	@Override
	public Set<String> getToolClasses(ItemStack stack) 
	{
		return ImmutableSet.of("sword");
	}
}