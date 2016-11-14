package com.reactioncraft.food.common;

//Reactioncraft
import com.reactioncraft.eactioncraft;
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
		setCreativeTab(eactioncraft.Reactioncraftfood);
	}

	@Override
	public void registerItemModel(Item item) 
	{
		eactioncraft.proxy.registerItemRenderer(this, 0, "raw_lamb");
	}

	@Override
	public void initOreDict() 
	{
		OreDictionary.registerOre("raw_lamb", this);
	}
}