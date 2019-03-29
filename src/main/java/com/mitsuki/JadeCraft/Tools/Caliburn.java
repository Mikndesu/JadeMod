package com.mitsuki.JadeCraft.Tools;

import com.mitsuki.JadeCraft.JadeCraftCore;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class Caliburn extends ItemSword {
	public static ToolMaterial Imagine = EnumHelper.addToolMaterial("IMAGINE", 3, 7777, 25.0F, 25.0F, 40);

	public Caliburn() {
		super(Imagine);

		setCreativeTab(JadeCraftCore.tabsJade);
		setUnlocalizedName("Caliburn");
		setFull3D();
		setMaxStackSize(1);
	}

	@Override
	public String getItemStackDisplayName(ItemStack itemstack) {
		return "Caliburn";
	}
}
