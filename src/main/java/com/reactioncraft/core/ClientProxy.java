package com.reactioncraft.core;

import com.reactioncraft.Reactioncraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy
{
    public static String BORE_TEXTURE = "/mods/reactioncraft/textures/railcraft/";

    @Override
    public void registerItemRenderer(Item item, int meta, String id) 
    {
    	ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reactioncraft.MODID + ":" + id, "inventory"));
    }

    @Override
    public void registerRenderInformation()
    {
    	/**
        RenderingRegistry.registerEntityRenderingHandler(EntityBee.class, new RenderBee(new ModelBee(0.2F), 0.2F, 0.2F));
        RenderingRegistry.registerEntityRenderingHandler(EntityJellyfish.class, new RenderJellyfish(new ModelJellyfish(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySeaCreeper.class, new RenderSeaCreeper(new ModelSeaCreeper(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityStalker.class, new RenderStalker(new ModelCreeper(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityZombieCrawling.class, new RenderZombieCrawling(new ModelZombieCrawling(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySkeletonCrawling.class, new RenderSkeletonCrawling(new ModelZombieCrawling(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityHydrolisc.class, new RenderHydrolisc(new ModelHydrolisc(0.65F), 0.65F, 0.65F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTJ.class, new RenderTJ(new ModelTJ(0.2F), 0.2F, 0.2F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPlayerClone.class, new RenderBiped(new ModelBiped(), 0.5F));
        **/
    }

    public int addArmor(String armorName)
    {
    	//when i get to armor uncomment and delete extra line of return 0;
        //return RenderingRegistry.addNewArmourRendererPrefix("Emerald");
        return 0;
    }
}