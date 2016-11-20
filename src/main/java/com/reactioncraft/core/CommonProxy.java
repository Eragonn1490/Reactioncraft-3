package com.reactioncraft.core;

import com.reactioncraft.reactioncraft;
import com.reactioncraft.core.common.tileEntities.*;
import com.reactioncraft.machines.common.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.*;

public class CommonProxy implements IGuiHandler
{
	public void registerItemRenderer(Item item, int meta, String id) 
	{
	}

	public void registerRenderInformation() 
	{
	}

    public int addArmor(String armorName)
    {
        return 0;
    }

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}
}