package com.reactioncraft.core;

import com.reactioncraft.Reactioncraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemBase extends Item implements ItemModelProvider
{
	protected String name;

	public ItemBase(String name) 
	{
		this.name = name;
		this.setRegistryName(new ResourceLocation(Reactioncraft.MODID, name));
		this.setUnlocalizedName(Reactioncraft.MODID + "." + this.name);
	}

	@Override
	public void registerItemModel() 
	{
		Reactioncraft.proxy.registerItemRenderer(this, 0, this.name);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) 
	{
		super.setCreativeTab(tab);
		return this;
	}
}