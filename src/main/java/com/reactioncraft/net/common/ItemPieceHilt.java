package com.reactioncraft.net.common;

import java.util.List;
import com.reactioncraft.eactioncraft;
import com.reactioncraft.core.ItemBase;
import com.reactioncraft.core.ItemModelProvider;
import com.reactioncraft.core.OreDictionaryInterface;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class ItemPieceHilt extends ItemBase implements ItemModelProvider, OreDictionaryInterface
{
    public ItemPieceHilt(String string)
    {
        super(string);
        this.setUnlocalizedName("pieceHilt");
        this.setCreativeTab((CreativeTabs)null);
        this.setMaxStackSize(1);
    }

    public String getItemDisplayName(ItemStack par1ItemStack)
    {
        return "Hilt Piece";
    }

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer player, List<String> list, boolean par4)
    {
        if (itemStack.getTagCompound() != null)
        {
            list.add("Level: " + itemStack.getTagCompound().getInteger("str1"));
        }
        else
        {
            list.add("Please craft to see results");
        }

        super.addInformation(itemStack, player, list, par4);
    }

	@Override
	public void initOreDict() 
	{	
	}

	@Override
	public void registerItemModel(Item item) 
	{
		eactioncraft.proxy.registerItemRenderer(this, 0, "hilt");
	}
}
