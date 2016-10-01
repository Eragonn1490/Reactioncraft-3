package com.reactioncraft.food.common;

//Reactioncraft
import com.reactioncraft.reactioncraft;
import com.reactioncraft.core.ItemModelProvider;
import com.reactioncraft.core.OreDictionaryInterface;

//Vanilla
import net.minecraft.item.*;

//Forge
import net.minecraftforge.oredict.OreDictionary;

public class ItemPork extends ItemFood implements ItemModelProvider, OreDictionaryInterface
{
	public ItemPork() 
	{
		super(3, 0.6f, false);
		setUnlocalizedName("raw_pork");
		setRegistryName("raw_pork");
		setCreativeTab(reactioncraft.Reactioncraftfood);
	}

	@Override
	public void registerItemModel(Item item) 
	{
		reactioncraft.proxy.registerItemRenderer(this, 0, "raw_pork");
	}

	@Override
	public void initOreDict() 
	{
		OreDictionary.registerOre("raw_pork", this);
	}
}