package com.reactioncraft.net.common;

import java.util.List;
import javax.annotation.Nullable;
import com.reactioncraft.eactioncraft;
import com.reactioncraft.core.ItemBase;
import com.reactioncraft.core.ItemModelProvider;
import com.reactioncraft.integration.instances.IntegratedItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagDouble;
import net.minecraft.nbt.NBTTagFloat;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ItemCaughtEntity extends ItemBase implements ItemModelProvider
{
    public ItemCaughtEntity(String string)
    {
        super(string);
        this.setUnlocalizedName("caught");
        this.setRegistryName("caught");
    }
    
    @Override
	public void registerItemModel(Item item) 
	{
		eactioncraft.proxy.registerItemRenderer(this, 0, "caught");
	}

    public String getItemDisplayName(ItemStack itemStack)
    {
        return itemStack.getTagCompound().getString("entity") == "player" ? "Caught " + itemStack.getTagCompound().getString("playerUser") + " DNA" : "Caught " + itemStack.getTagCompound().getString("entity");
    }

    @Nullable
    public static Entity spawnCreature(World worldIn, @Nullable String entityID, double x, double y, double z)
    {
    	ItemStack caught = new ItemStack(IntegratedItems.caught);
    	
    	Entity entity = EntityList.createEntityByName(caught.getTagCompound().getString("entity"), worldIn);
        
    	if (entityID != null)
        {
            for (int i = 0; i < 1; ++i)
            {
                entity = EntityList.createEntityByIDFromName(entityID, worldIn);

                if (entity instanceof EntityLivingBase)
                {
                    EntityLiving entityliving = (EntityLiving)entity;
                    entity.setLocationAndAngles(x, y, z, MathHelper.wrapDegrees(worldIn.rand.nextFloat() * 360.0F), 0.0F);
                    entityliving.rotationYawHead = entityliving.rotationYaw;
                    entityliving.renderYawOffset = entityliving.rotationYaw;
                    entityliving.onInitialSpawn(worldIn.getDifficultyForLocation(new BlockPos(entityliving)), (IEntityLivingData)null);
                    worldIn.spawnEntityInWorld(entity);
                    entityliving.playLivingSound();
                }
            }

            return entity;
        }
        else
        {
            return null;
        }
    }

    public static NBTTagList newDoubleNBTList(double ... par1ArrayOfDouble)
    {
        NBTTagList var2 = new NBTTagList();
        double[] var3 = par1ArrayOfDouble;
        int var4 = par1ArrayOfDouble.length;

        for (int var5 = 0; var5 < var4; ++var5)
        {
            double var6 = var3[var5];
            var2.appendTag(new NBTTagDouble(var6));
        }

        return var2;
    }

    public static NBTTagList newFloatNBTList(float ... par1ArrayOfFloat)
    {
        NBTTagList var2 = new NBTTagList();
        float[] var3 = par1ArrayOfFloat;
        int var4 = par1ArrayOfFloat.length;

        for (int var5 = 0; var5 < var4; ++var5)
        {
            float var6 = var3[var5];
            var2.appendTag(new NBTTagFloat(var6));
        }

        return var2;
    }

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer player, List<String> list, boolean par4)
    {
        if (itemStack.getTagCompound() != null)
        {
            list.add("Caught " + itemStack.getTagCompound().getString("entity"));
        }
        else
        {
            list.add("Please craft to see results");
        }

        super.addInformation(itemStack, player, list, par4);
    }
}
