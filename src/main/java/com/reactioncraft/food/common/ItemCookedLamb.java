package com.reactioncraft.food.common;

//Reactioncraft
import com.reactioncraft.reactioncraft;
import com.reactioncraft.core.ItemModelProvider;
import com.reactioncraft.core.OreDictionaryInterface;

//Vanilla
import net.minecraft.item.*;

//Forge
import net.minecraftforge.oredict.OreDictionary;

public class ItemCookedLamb extends ItemFood implements ItemModelProvider, OreDictionaryInterface
{
	public ItemCookedLamb() 
	{
		super(8, 0.8f, false);
		setUnlocalizedName("cooked_lamb");
		setRegistryName("cooked_lamb");
		setCreativeTab(reactioncraft.Reactioncraftfood);
	}

	@Override
	public void registerItemModel(Item item) 
	{
		reactioncraft.proxy.registerItemRenderer(this, 0, "cooked_lamb");
	}

	@Override
	public void initOreDict() 
	{
		OreDictionary.registerOre("cooked_lamb", this);
	}
}