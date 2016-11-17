package com.reactioncraft.food.common;

<<<<<<< HEAD
import com.reactioncraft.reactioncraft;
=======
import com.reactioncraft.Reactioncraft;
import com.reactioncraft.core.common.ItemBaseSword;
>>>>>>> refs/remotes/origin/master

import net.minecraft.item.ItemSword;

public class ItemKnife extends ItemBaseSword
{
    public ItemKnife(String string)
    {
        super(string, ToolMaterial.IRON);
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