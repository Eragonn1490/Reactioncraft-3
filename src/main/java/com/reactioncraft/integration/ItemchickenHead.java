package com.reactioncraft.integration;

import com.reactioncraft.food.common.ItemFoodBase;

public class ItemchickenHead extends ItemFoodBase 
{
	public ItemchickenHead(String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(name, amount, saturation, isWolfFood);
		{
			this.setMaxStackSize(1);
		}
	}
}