package com.reactioncraft.desert.common;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import javax.swing.Icon;
import com.google.common.collect.ImmutableMap;
import com.reactioncraft.reactioncraft;
import com.reactioncraft.core.ItemMulti;
import com.reactioncraft.core.common.blocks.BlockBase;
import com.reactioncraft.integration.instances.IntegratedBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockHireoMulti extends BlockBase
{
	protected String name;
	
	public static final PropertyEnum<EnumHireoTypes> COLOR = PropertyEnum.<EnumHireoTypes>create("color", EnumHireoTypes.class);
	
    public BlockHireoMulti(String name, Material material)
    {
        super(material, name);
        this.name = name;
		this.setCreativeTab(reactioncraft.Reactioncraft);
    }

    public void registerItemModel(ItemMulti itemBlock) 
	{
		reactioncraft.proxy.registerItemRenderer(itemBlock, 0, name);
	}
    
    /**
     * Returns the ID of the items to drop on destruction.
     */
    public BlockHireoMulti idDropped(int i, Random random, int j)
    {
        switch (i)
        {
            case 0:
                return IntegratedBlocks.HireoMulti;

            case 1:
                return IntegratedBlocks.HireoMulti;

            case 2:
                return IntegratedBlocks.HireoMulti;

            case 3:
                return IntegratedBlocks.HireoMulti;

            case 4:
                return IntegratedBlocks.HireoMulti;

            case 5:
                return IntegratedBlocks.HireoMulti;

            case 6:
                return IntegratedBlocks.HireoMulti;

            case 7:
                return IntegratedBlocks.HireoMulti;

            case 8:
                return IntegratedBlocks.HireoMulti;

            case 9:
                return IntegratedBlocks.HireoMulti;

            case 10:
                return IntegratedBlocks.HireoMulti;

            case 11:
                return IntegratedBlocks.HireoMulti;

            case 12:
                return IntegratedBlocks.HireoMulti;

            case 13:
                return IntegratedBlocks.HireoMulti;

            case 14:
                return IntegratedBlocks.HireoMulti;

            case 15:
                return IntegratedBlocks.HireoMulti;

            default:
                return IntegratedBlocks.HireoMulti;
        }
    }

    public int quantityDropped(int i, int j, Random random)
    {
        switch (i)
        {
            case 0:
                return 1;

            case 1:
                return 1;

            case 2:
                return 1;

            case 3:
                return 1;

            case 4:
                return 1;

            case 5:
                return 1;

            case 6:
                return 1;

            case 7:
                return 1;

            case 8:
                return 1;

            case 9:
                return 1;

            case 10:
                return 1;

            case 11:
                return 1;

            case 12:
                return 1;

            case 13:
                return 1;

            case 14:
                return 1;

            case 15:
                return 1;

            default:
                return 1;
        }
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int i)
    {
        switch (i)
        {
            case 0:
                return 11;

            case 1:
                return 11;

            case 2:
                return 11;

            case 3:
                return 11;

            case 4:
                return 11;

            case 5:
                return 11;

            case 6:
                return 11;

            case 7:
                return 11;

            case 8:
                return 11;

            case 9:
                return 9;

            case 10:
                return 10;

            case 11:
                return 11;

            case 12:
                return 12;

            case 13:
                return 13;

            case 14:
                return 14;

            case 15:
                return 15;

            default:
                return 0;
        }
    }
    
//    /**
//     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
//     * returns the metadata of the dropped item based on the old metadata of the block.
//     */
//    public int damageDropped(IBlockState state)
//    {
//        return ((EnumHireoTypes)state.getValue(COLOR)).getMetadata();
//    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list)
    {
        for (EnumHireoTypes enumdyecolor : EnumHireoTypes.values())
        {
            list.add(new ItemStack(itemIn, 1, enumdyecolor.getMetadata()));
        }
    }

    /**
     * Get the MapColor for this Block and the given BlockState
     */
    public MapColor getMapColor(IBlockState state)
    {
        return ((EnumHireoTypes)state.getValue(COLOR)).getMapColor();
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(COLOR, EnumHireoTypes.byMetadata(meta));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        return ((EnumHireoTypes)state.getValue(COLOR)).getMetadata();
    }

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {COLOR});
    }
}