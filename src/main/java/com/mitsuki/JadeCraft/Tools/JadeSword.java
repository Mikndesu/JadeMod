package com.mitsuki.JadeCraft.Tools;

import com.mitsuki.JadeCraft.JadeCraftCore;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class JadeSword extends ItemSword {

	public static ToolMaterial Orichalcum = EnumHelper.addToolMaterial("ORICHALCUM", 3, 3000, 20.0F, 20.0F, 30);

	public JadeSword() {
		super(Orichalcum);

		setCreativeTab(JadeCraftCore.tabsJade);
		setUnlocalizedName("JadeSword");
		setFull3D();
		setMaxStackSize(1);
	}

	@Override
	public String getItemStackDisplayName(ItemStack itemstack) {
		return "JadeSword";
	}
}
