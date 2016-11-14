package com.reactioncraft.food.common;

//Reactioncraft
import com.reactioncraft.eactioncraft;
import com.reactioncraft.core.ItemModelProvider;
import com.reactioncraft.core.OreDictionaryInterface;

//Vanilla
import net.minecraft.item.*;

//Forge
import net.minecraftforge.oredict.OreDictionary;

public class ItemHumanRaw extends ItemFood implements ItemModelProvider, OreDictionaryInterface
{
	public ItemHumanRaw() 
	{
		super(3, 0.6f, false);
		this.setRegistryName("raw_human");
		this.setUnlocalizedName("raw_human");
		this.setCreativeTab(eactioncraft.Reactioncraftfood);
	}

	@Override
	public void registerItemModel(Item item) 
	{
		eactioncraft.proxy.registerItemRenderer(this, 0, this.getUnlocalizedName());
	}

	@Override
	public void initOreDict() 
	{
		OreDictionary.registerOre("raw_human", this);
	}
}