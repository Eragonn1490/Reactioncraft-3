package com.reactioncraft.net.common;

import java.util.List;
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.reactioncraft.reactioncraft;
import com.reactioncraft.core.ItemModelProvider;
import com.reactioncraft.integration.IntegratedItems;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemCompleteNet extends ItemSword implements ItemModelProvider
{
	public int retunedAmt;

	public ItemCompleteNet(ToolMaterial mat) 
	{
		super(mat);
		//damageVsEntity = 0.0F;
		//attackSpeed = 0.0F;
		this.setRegistryName("complete_net");
		this.setUnlocalizedName("complete_net");
		this.setMaxStackSize(1);
		this.setCreativeTab(null);
	}

	@Override
	public Set<String> getToolClasses(ItemStack stack) {
		return ImmutableSet.of("pickaxe", "axe", "shovel", "sword");
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
	{
		ItemStack net = new ItemStack(IntegratedItems.complete_net);
		
		if (entity != null || !reactioncraft.exclusionList.isExcluded(entity) && entity instanceof EntityLiving)
		{
			if (entity instanceof EntityPlayer)
			{
				return false;
			}
			else
			{
				NBTTagCompound entityplayer = new NBTTagCompound();
				entity.writeToNBT(entityplayer);
				entityplayer.removeTag("Pos");
				entityplayer.removeTag("Motion");
				entityplayer.removeTag("Rotation");
				entityplayer.removeTag("Dimension");
				entityplayer.removeTag("PortalCooldown");
				entityplayer.removeTag("InLove");
				entityplayer.removeTag("HurtTime");
				entityplayer.removeTag("DeathTime");
				entityplayer.removeTag("AttackTime");
				ItemStack is = new ItemStack(IntegratedItems.caught);
				is.setTagCompound(new NBTTagCompound());
				is.getTagCompound().setString("entity", EntityList.getEntityString(entity));
				is.getTagCompound().setTag("entityData", entityplayer);
				player.dropItem(is, true);
				stack.damageItem(1, player);
				entity.setDead();

				if (stack.getItemDamage() >= stack.getMaxDamage() - 1 && player instanceof EntityPlayer)
				{
					--stack.stackSize;
				}

				return true;
			}
		}
		else
		{
			return false;
		}
	}

	/**
	 * allows items to add custom lines of information to the mouseover description
	 */
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4)
	{
		if (itemStack.getTagCompound() != null)
		{
			list.add("Hilt: " + itemStack.getTagCompound().getInteger("hilt"));
			list.add("Net: " + itemStack.getTagCompound().getInteger("net"));
		}
		else
		{
			if(itemStack.getTagCompound() != null)
			{
				list.add("Hilt: " + itemStack.getTagCompound().getInteger("hilt"));
				list.add("Net: " + itemStack.getTagCompound().getInteger("net"));
			}
		}
		super.addInformation(itemStack, player, list, par4);
	}


	/**
	 * Returns True is the item is renderer in full 3D when hold.
	 */
	@SideOnly(Side.CLIENT)
	public boolean isFull3D()
	{
		return true;
	}

	/**
	 * Returns true if this item should be rotated by 180 degrees around the Y axis when being held in an entities
	 * hands.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public boolean shouldRotateAroundWhenRendering()
	{
		return false;
	}
	
	@Override
	public int getMaxDamage(ItemStack stack)
	{
		NBTTagCompound compound = stack.getTagCompound();
		try
		{
			int e = compound.getInteger("hilt");
			int netLevel = compound.getInteger("net");
			retunedAmt = (e * 10 + netLevel * 10);
			return retunedAmt;
		}
		catch (NullPointerException var5)
		{
			retunedAmt = 20;
			return retunedAmt;
		}
	}

	@Override
	public void registerItemModel(Item item) 
	{
		reactioncraft.proxy.registerItemRenderer(this, 0, "complete_Net");
	}
}