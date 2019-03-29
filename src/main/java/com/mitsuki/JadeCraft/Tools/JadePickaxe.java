package com.mitsuki.JadeCraft.Tools;

import com.mitsuki.JadeCraft.JadeCraftCore;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class JadePickaxe extends ItemPickaxe {

	public static ToolMaterial Orichalcum = EnumHelper.addToolMaterial("ORICHALCUM", 3, 3000, 20.0F, 20.0F, 30);

	public JadePickaxe() {
		super(Orichalcum);

		setCreativeTab(JadeCraftCore.tabsJade);
		setUnlocalizedName("JadePickaxe");
		setFull3D();
		setMaxStackSize(1);
	}

	@Override
	public String getItemStackDisplayName(ItemStack itemstack) {
		return "JadePickaxe";
	}
}
 