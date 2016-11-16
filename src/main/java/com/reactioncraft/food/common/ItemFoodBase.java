package com.reactioncraft.food.common;

import com.reactioncraft.Reactioncraft;
import com.reactioncraft.core.ItemModelProvider;
import com.reactioncraft.core.OreDictionaryInterface;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;

public class ItemFoodBase extends ItemFood implements ItemModelProvider, OreDictionaryInterface
{
    protected final String name;

    public ItemFoodBase(String name, int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);

        this.name = name;
        this.setRegistryName(new ResourceLocation(Reactioncraft.MODID, this.name));
        this.setUnlocalizedName(Reactioncraft.MODID + "." + this.name);
        this.setCreativeTab(Reactioncraft.Reactioncraftfood);
    }

    @Override
    public void initOreDict(String key, Item item) 
    {
        OreDictionary.registerOre(key, item);
    }

    @Override
    public void registerItemModel() 
    {
        Reactioncraft.proxy.registerItemRenderer(this, 0, this.name);
    }
}