package com.reactioncraft.food.common;

//Reactioncraft
import com.reactioncraft.Reactioncraft;
import com.reactioncraft.core.ItemModelProvider;
import com.reactioncraft.core.OreDictionaryInterface;

//Vanilla
import net.minecraft.item.*;

//Forge
import net.minecraftforge.oredict.OreDictionary;

public class ItemCookedHorse extends ItemFood implements ItemModelProvider, OreDictionaryInterface
{
	public ItemCookedHorse() 
	{
		super(4, 0.8f, false);
		setUnlocalizedName("cooked_horse");
		setRegistryName("cooked_horse");
		setCreativeTab(Reactioncraft.Reactioncraftfood);
	}

	@Override
	public void registerItemModel(Item item) 
	{
		Reactioncraft.proxy.registerItemRenderer(this, 0, "cooked_horse");
	}

	@Override
	public void initOreDict() 
	{
		OreDictionary.registerOre("cooked_horse", this);
	}
}