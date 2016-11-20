package com.reactioncraft.core.common.items;

import com.reactioncraft.reactioncraft;

import net.minecraft.item.ItemSword;

public class ItemBaseHammer extends ItemSword
{
    public ItemBaseHammer(String string)
    {
        super(ToolMaterial.WOOD);
        this.setMaxStackSize(1);
        this.setMaxDamage(10);
        this.setCreativeTab(reactioncraft.ReactioncraftItems);
        this.setContainerItem(this);
    }
}