package com.reactioncraft.food.common;

//Reactioncraft
import com.reactioncraft.Reactioncraft;
import com.reactioncraft.core.ItemModelProvider;
import com.reactioncraft.core.OreDictionaryInterface;

//Vanilla
import net.minecraft.item.*;

//Forge
import net.minecraftforge.oredict.OreDictionary;

public class ItemChickenHead extends ItemFood implements ItemModelProvider, OreDictionaryInterface
{
	public ItemChickenHead() 
	{
		super(3, 0.6f, false);
		setUnlocalizedName("chicken_head");
		setRegistryName("chicken_head");
		setCreativeTab(Reactioncraft.Reactioncraftfood);
	}

	@Override
	public void registerItemModel(Item item) 
	{
		Reactioncraft.proxy.registerItemRenderer(this, 0, "chicken_head");
	}

	@Override
	public void initOreDict() 
	{
		OreDictionary.registerOre("chicken_head", this);
	}
}