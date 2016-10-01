package com.reactioncraft.food.common;

//Reactioncraft
import com.reactioncraft.reactioncraft;
import com.reactioncraft.core.ItemModelProvider;
import com.reactioncraft.core.OreDictionaryInterface;

//Vanilla
import net.minecraft.item.*;

//Forge
import net.minecraftforge.oredict.OreDictionary;

public class ItemBeef extends ItemFood implements ItemModelProvider, OreDictionaryInterface
{
	public ItemBeef() 
	{
		super(3, 0.6f, false);
		this.setUnlocalizedName("raw_beef");
		this.setRegistryName("raw_beef");
		this.setCreativeTab(reactioncraft.Reactioncraftfood);
	}

	@Override
	public void registerItemModel(Item item) 
	{
		reactioncraft.proxy.registerItemRenderer(this, 0, "raw_beef");
	}

	@Override
	public void initOreDict() 
	{
		OreDictionary.registerOre("raw_beef", this);
	}
}