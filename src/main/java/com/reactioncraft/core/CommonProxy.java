package com.reactioncraft.core;

/**
import Reactioncraft.machines.common.ContainerBrickOven;
import Reactioncraft.machines.common.ContainerClayalizer;
import Reactioncraft.machines.common.ContainerFreezer;
import Reactioncraft.machines.common.GuiBrickoven;
import Reactioncraft.machines.common.GuiClayalizer;
import Reactioncraft.machines.common.GuiFreezer;
import Reactioncraft.machines.common.TileEntityBrickOven;
import Reactioncraft.machines.common.TileEntityClayalizer;
import Reactioncraft.machines.common.TileEntityFreezer;
**/

import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class CommonProxy implements IGuiHandler
{
	public void registerItemRenderer(Item item, int meta, String id) 
	{
		 
	}
	
	public static void registerRenderInformation() 
	{
		
	}
    
    public int addArmor(String armorName)
    {
        return 0;
    }

	@Override
	public Object getServerGuiElement(int ID, net.minecraft.entity.player.EntityPlayer player, World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		//TileEntity tileEntity;
	    //return tileEntity == null ? null : (ID == 0 && tileEntity instanceof TileEntityClayalizer ? new GuiClayalizer(player.inventory, (TileEntityClayalizer)tileEntity) : (ID == 1 && tileEntity instanceof TileEntityBrickOven ? new GuiBrickoven(player.inventory, (TileEntityBrickOven)tileEntity) : (ID == 2 && tileEntity instanceof TileEntityFreezer ? new GuiFreezer(player.inventory, (TileEntityFreezer)tileEntity) : null)));
		//remove comments at later date to update machines
		return null;
	}
}