package com.reactioncraft.net.common;

import java.util.List;
import com.reactioncraft.Reactioncraft;
import com.reactioncraft.core.ItemBase;
import com.reactioncraft.core.ItemModelProvider;
import com.reactioncraft.core.OreDictionaryInterface;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class ItemPieceNet extends ItemBase implements ItemModelProvider, OreDictionaryInterface
{
    public ItemPieceNet(String string)
    {
        super(string);
        this.setUnlocalizedName("pieceNet");
        this.setCreativeTab((CreativeTabs)null);
        this.setMaxStackSize(1);
    }

    public String getItemDisplayName(ItemStack par1ItemStack)
    {
        return "Net Piece";
    }

    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer player, List<String> list, boolean par4)
    {
        if (itemStack.getTagCompound() != null)
        {
            list.add("Level: " + itemStack.getTagCompound().getInteger("str2"));
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
		Reactioncraft.proxy.registerItemRenderer(this, 0, "net");
	}
}
