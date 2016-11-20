package com.reactioncraft.core.common.items;

import com.reactioncraft.reactioncraft;

import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;

public class ItemBaseChisel extends ItemSword
{
    public ItemBaseChisel(String unlocalizedName)
    {
        super(ToolMaterial.WOOD);
        this.setMaxStackSize(1);
        this.setMaxDamage(10);
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