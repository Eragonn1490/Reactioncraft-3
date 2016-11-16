package com.reactioncraft.integration;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class IntegratedMaterials
{
	public static ToolMaterial EnumToolMaterialNet;
	
	public static void initMaterials()
	{
		//final EnumArmorMaterial EmeraldArmor = EnumHelper.addArmorMaterial("emerald", 55, new int[] {1, 2, 2, 1}, 0);
		//final EnumArmorMaterial BloodstoneArmor = EnumHelper.addArmorMaterial("bloodstone", 33, new int[] {3, 8, 6, 3}, 10);
		EnumToolMaterialNet         = EnumHelper.addToolMaterial("Net", 3, 1, 2.0F, 2.0F, 15);
		//final Item.ToolMaterial EnumToolMaterialMeatcleaver = EnumHelper.addToolMaterial("MeatCleaver", 2, 280, 6.0F, 2.0F, 14);
		//final Item.ToolMaterial EnumToolMaterialBat         = EnumHelper.addToolMaterial("Bat", 1, 79, 2.0F, 1.0F, 15);
		//final Item.ToolMaterial EnumToolMaterialObby        = EnumHelper.addToolMaterial("Obby", 3, 2024, 7.0F, 2.0F, 15);
		//final Item.ToolMaterial EnumToolMaterialBloodstone  = EnumHelper.addToolMaterial("Bloodstone", 3, 4200, 7.0F, 2.0F, 15);
		//final Item.ToolMaterial EnumToolMaterialBloodstone2 = EnumHelper.addToolMaterial("Bloodstone", 3, 4800, 7.0F, 3.0F, 15);
	}
}