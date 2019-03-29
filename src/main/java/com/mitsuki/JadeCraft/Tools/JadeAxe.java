package com.mitsuki.JadeCraft.Tools;

import com.mitsuki.JadeCraft.JadeCraftCore;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class JadeAxe extends ItemAxe {
	public static ToolMaterial Orichalcum = EnumHelper.addToolMaterial("ORICHALCUM", 3, 3000, 20.0F, 20.0F, 30);

	public JadeAxe() {
		super(Orichalcum);

		setCreativeTab(JadeCraftCore.tabsJade);
		setUnlocalizedName("JadeAxe");
		setFull3D();
		setMaxStackSize(1);
	}

	@Override
	public String getItemStackDisplayName(ItemStack itemstack) {
		return "JadeAxe";
	}
}
 