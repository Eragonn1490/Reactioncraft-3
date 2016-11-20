package com.reactioncraft.core.common.items;

import com.reactioncraft.reactioncraft;
import com.reactioncraft.core.ItemModelProvider;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ItemBaseHammer extends ItemSword implements ItemModelProvider
{
	protected String name;
	
    public ItemBaseHammer(String name)
    {
        super(ToolMaterial.WOOD);
        this.name = name;
        this.setMaxStackSize(1);
        this.setMaxDamage(10);
        this.setCreativeTab(reactioncraft.ReactioncraftItems);
        this.setRegistryName(new ResourceLocation(reactioncraft.MODID, name));
		this.setUnlocalizedName(reactioncraft.MODID + "." + name);
    }
    
    @Override
    public void registerItemModel() 
    {
        reactioncraft.proxy.registerItemRenderer(this, 0, this.name);
    }
    
	public void onUpdate(ItemStack par1ItemStack, World par2World, EntityPlayer par3Entity, int par4, boolean par5) 
    {
   
    }
}