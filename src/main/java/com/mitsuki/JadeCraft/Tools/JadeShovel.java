package com.mitsuki.JadeCraft.Tools;

import com.mitsuki.JadeCraft.JadeCraftCore;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class JadeShovel extends ItemSpade {

	public static ToolMaterial Orichalcum = EnumHelper.addToolMaterial("ORICHALCUM", 3, 3000, 20.0F, 20.0F, 30);

	public JadeShovel() {
		super(Orichalcum);
		setCreativeTab(JadeCraftCore.tabsJade);
		setUnlocalizedName("JadeShovel");
		setFull3D();
		setMaxStackSize(1);
	}

	@Override
	public String getItemStackDisplayName(ItemStack itemstack) {
		return "JadeShovel";
	}
}
 