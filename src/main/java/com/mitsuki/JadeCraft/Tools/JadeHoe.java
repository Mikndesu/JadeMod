package com.mitsuki.JadeCraft.Tools;

import com.mitsuki.JadeCraft.JadeCraftCore;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class JadeHoe extends ItemHoe {

	public static ToolMaterial Orichalcum = EnumHelper.addToolMaterial("ORICHALCUM", 3, 3000, 20.0F, 20.0F, 30);

	public JadeHoe() {
		super(Orichalcum);

		setCreativeTab(JadeCraftCore.tabsJade);
		setUnlocalizedName("JadeHoe");
		setFull3D();
		setMaxStackSize(1);
	}

	@Override
	public String getItemStackDisplayName(ItemStack itemstack) {
		return "JadeHoe";
	}
}
 