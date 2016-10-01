package com.reactioncraft.core.common.creativeTab;

import com.reactioncraft.reactioncraft;
import com.reactioncraft.integration.IntegratedItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;

public class RCTAB1 extends CreativeTabs
{
    public RCTAB1(String x0)
    {
        super(x0);
        this.setBackgroundImageName("item_search.png");
    }
    
    public boolean hasSearchBar()
    {
        return true;
    }

	@Override
	public Item getTabIconItem() 
	{
		return IntegratedItems.meat_cleaver;
	}
}