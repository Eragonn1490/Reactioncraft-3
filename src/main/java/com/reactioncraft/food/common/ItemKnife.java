package com.reactioncraft.food.common;


import com.reactioncraft.reactioncraft;
import com.reactioncraft.core.common.items.ItemBaseSword;

import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;

public class ItemKnife extends ItemBaseSword
{
    public ItemKnife(String name)
    {
        super(name, ToolMaterial.IRON);
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