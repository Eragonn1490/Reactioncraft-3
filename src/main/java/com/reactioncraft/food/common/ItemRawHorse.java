package com.reactioncraft.food.common;

//Reactioncraft
import com.reactioncraft.eactioncraft;
import com.reactioncraft.core.ItemModelProvider;
import com.reactioncraft.core.OreDictionaryInterface;

//Vanilla
import net.minecraft.item.*;

//Forge
import net.minecraftforge.oredict.OreDictionary;

public class ItemRawHorse extends ItemFood implements ItemModelProvider, OreDictionaryInterface
{
	public ItemRawHorse() 
	{
		super(3, 0.6f, false);
		setUnlocalizedName("raw_horse");
		setRegistryName("raw_horse");
		setCreativeTab(eactioncraft.Reactioncraftfood);
	}

	@Override
	public void registerItemModel(Item item) 
	{
		eactioncraft.proxy.registerItemRenderer(this, 0, "raw_horse");
	}

	@Override
	public void initOreDict() 
	{
		OreDictionary.registerOre("raw_horse", this);
	}
}