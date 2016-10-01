package com.reactioncraft.food.common;

//Java
import javax.annotation.Nullable;

//Reactioncraft
import com.reactioncraft.reactioncraft;
import com.reactioncraft.core.ItemModelProvider;

//Vanilla
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.*;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class ItemFoodMod extends ItemFood implements ItemModelProvider
{
    /** Number of ticks to run while 'EnumAction'ing until result. */
    public final int itemUseDuration;
    /** The amount this food item heals the player. */
    public final int healAmount;
    public final float saturationModifier;
    /** Whether wolves like this food (true for raw and cooked porkchop). */
    public final boolean isWolfsFavoriteMeat;
    /** If this field is true, the food can be consumed even if the player don't need to eat. */
    public boolean alwaysEdible;
    /** represents the potion effect that will occurr upon eating this food. Set by setPotionEffect */
    public PotionEffect potionId;
    /** probably of the set potion effect occurring */
    public float potionEffectProbability;
    
    public static String name;
    
    public ItemFoodMod(String name, int amount, float saturation, boolean isWolfFood)
    {
    	super(amount, saturation, isWolfFood);
        this.itemUseDuration = 32;
        this.healAmount = amount;
        this.isWolfsFavoriteMeat = isWolfFood;
        this.saturationModifier = saturation;
        this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
        this.setCreativeTab(reactioncraft.Reactioncraftfood);
    }

    public ItemFoodMod(int amount, boolean isWolfFood)
    {
        this(name, amount, 0.6F, isWolfFood);
    }
    
    
    /**
     * Called when the player finishes using this Item (E.g. finishes eating.). Not called when the player stops using
     * the Item before the action is complete.
     */
    @Nullable
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        --stack.stackSize;

        if (entityLiving instanceof EntityPlayer)
        {
            EntityPlayer entityplayer = (EntityPlayer)entityLiving;
            entityplayer.getFoodStats().addStats(this, stack);
            worldIn.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
            this.onFoodEaten(stack, worldIn, entityplayer);
            entityplayer.addStat(StatList.getObjectUseStats(this));
        }

        return stack;
    }

    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote && this.potionId != null && worldIn.rand.nextFloat() < this.potionEffectProbability)
        {
            player.addPotionEffect(new PotionEffect(this.potionId));
        }
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 32;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.EAT;
    }

    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
    {
        if (playerIn.canEat(this.alwaysEdible))
        {
            playerIn.setActiveHand(hand);
            return new ActionResult(EnumActionResult.SUCCESS, itemStackIn);
        }
        else
        {
            return new ActionResult(EnumActionResult.FAIL, itemStackIn);
        }
    }

    public int getHealAmount(ItemStack stack)
    {
        return this.healAmount;
    }

    public float getSaturationModifier(ItemStack stack)
    {
        return this.saturationModifier;
    }

    /**
     * Whether wolves like this food (true for raw and cooked porkchop).
     */
    public boolean isWolfsFavoriteMeat()
    {
        return this.isWolfsFavoriteMeat;
    }

    public ItemFoodMod setPotionEffect(PotionEffect p_185070_1_, float p_185070_2_)
    {
        this.potionId = p_185070_1_;
        this.potionEffectProbability = p_185070_2_;
        return this;
    }

    /**
     * Set the field 'alwaysEdible' to true, and make the food edible even if the player don't need to eat.
     */
    public ItemFoodMod setAlwaysEdible()
    {
        this.alwaysEdible = true;
        return this;
    }
    
    public void registerItemModel(Item item) 
    {
    	reactioncraft.proxy.registerItemRenderer(this, 0, getUnlocalizedName());
    }
}