package com.mitsuki.JadeCraft.CreativeTabs;

import com.mitsuki.JadeCraft.JadeCraftCore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabJade extends CreativeTabs {
	public CreativeTabJade(String label)
	{
		super(label);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		return JadeCraftCore.jade;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel()
	{
		return "TabJade";
	}

}