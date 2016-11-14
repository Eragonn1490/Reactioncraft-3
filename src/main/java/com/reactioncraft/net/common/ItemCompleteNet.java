package com.reactioncraft.net.common;

import java.util.List;
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import com.reactioncraft.Reactioncraft;
import com.reactioncraft.core.ItemModelProvider;
import com.reactioncraft.integration.instances.IntegratedItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemCompleteNet extends ItemSword implements ItemModelProvider
{
	public int retunedAmt;
	protected final String name;

	public ItemCompleteNet(String name, ToolMaterial mat)
	{
		super(mat);
		//damageVsEntity = 0.0F;
		//attackSpeed = 0.0F;
		this.name = name;
		this.setRegistryName(new ResourceLocation(Reactioncraft.MODID, name));
		this.setUnlocalizedName(Reactioncraft.MODID + "." + name);
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
		if (entity != null || !Reactioncraft.exclusionList.isExcluded(entity) && entity instanceof EntityLiving)
		{
			if (entity instanceof EntityPlayer)
			{
				return false;
			}
			else
			{
				NBTTagCompound entityTag = new NBTTagCompound();
				entity.writeToNBTOptional(entityTag);
				entityTag.removeTag("Pos");
				entityTag.removeTag("Motion");
				entityTag.removeTag("Rotation");
				entityTag.removeTag("Dimension");
				entityTag.removeTag("PortalCooldown");
				entityTag.removeTag("InLove");
				entityTag.removeTag("HurtTime");
				entityTag.removeTag("DeathTime");
				entityTag.removeTag("AttackTime");

				ItemStack is = new ItemStack(IntegratedItems.caught);
				NBTTagCompound nbt = new NBTTagCompound();
				nbt.setTag("EntityData", entityTag);
				is.setTagCompound(nbt);
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

	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List<String> list, boolean par4)
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
    public void registerItemModel()
    {
        Reactioncraft.proxy.registerItemRenderer(this, 0, this.name);
    }
}