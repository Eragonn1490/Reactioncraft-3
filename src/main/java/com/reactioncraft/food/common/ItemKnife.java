package com.reactioncraft.food.common;

import com.reactioncraft.reactioncraft;

import net.minecraft.item.ItemSword;

public class ItemKnife extends ItemSword
{
    public ItemKnife(int par1)
    {
        super(ToolMaterial.WOOD);
        this.setMaxStackSize(1);
        this.setMaxDamage(25);
        this.setCreativeTab(reactioncraft.ReactioncraftItems);
        this.setNoRepair();
    }

    /**
     * Returns true if players can use this item to affect the world (e.g. placing blocks, placing ender eyes in portal)
     * when not in creative
     */
    public boolean canItemEditBlocks()
    {
        return false;
    }
}