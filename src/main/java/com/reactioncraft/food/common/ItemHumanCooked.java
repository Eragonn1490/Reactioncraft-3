package com.reactioncraft.food.common;

//Reactioncraft
import com.reactioncraft.reactioncraft;
import com.reactioncraft.core.ItemModelProvider;
import com.reactioncraft.core.OreDictionaryInterface;

//Vanilla
import net.minecraft.item.*;

//Forge
import net.minecraftforge.oredict.OreDictionary;

public class ItemHumanCooked extends ItemFood implements ItemModelProvider, OreDictionaryInterface
{
	public ItemHumanCooked() 
	{
		super(4, 0.8f, false);
		setUnlocalizedName("cooked_human");
		setRegistryName("cooked_human");
		setCreativeTab(reactioncraft.Reactioncraftfood);
	}

	@Override
	public void registerItemModel(Item item) 
	{
		reactioncraft.proxy.registerItemRenderer(this, 0, "cooked_human");
	}

	@Override
	public void initOreDict() 
	{
		OreDictionary.registerOre("cooked_human", this);
	}
}