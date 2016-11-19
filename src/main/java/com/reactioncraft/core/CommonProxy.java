package com.reactioncraft.core;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

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