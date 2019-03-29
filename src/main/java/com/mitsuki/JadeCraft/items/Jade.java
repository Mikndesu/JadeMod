package com.mitsuki.JadeCraft.items;

import com.mitsuki.JadeCraft.JadeCraftCore;

import net.minecraft.item.Item;

public class Jade extends Item {
  
  public Jade(){
	super();
	setCreativeTab(JadeCraftCore.tabsJade);
	setUnlocalizedName("Jade");
	setMaxStackSize(64);
  }
}