package com.reactioncraft.food.common;

//Reactioncraft
import com.reactioncraft.reactioncraft;
import com.reactioncraft.core.ItemModelProvider;
import com.reactioncraft.core.OreDictionaryInterface;

//Vanilla
import net.minecraft.item.*;

//Forge
import net.minecraftforge.oredict.OreDictionary;

public class ItemRawLamb extends ItemFood implements ItemModelProvider, OreDictionaryInterface
{
	public ItemRawLamb() 
	{
		super(3, 0.6f, false);
		setUnlocalizedName("raw_lamb");
		setRegistryName("raw_lamb");
		setCreativeTab(reactioncraft.Reactioncraftfood);
	}

	@Override
	public void registerItemModel(Item item) 
	{
		reactioncraft.proxy.registerItemRenderer(this, 0, "raw_lamb");
	}

	@Override
	public void initOreDict() 
	{
		OreDictionary.registerOre("raw_lamb", this);
	}
}