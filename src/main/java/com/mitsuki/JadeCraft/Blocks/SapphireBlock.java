package com.mitsuki.JadeCraft.Blocks;

import com.mitsuki.JadeCraft.JadeCraftCore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SapphireBlock extends Block{
	public SapphireBlock() {
		super(Material.rock);
		setCreativeTab(JadeCraftCore.tabsSapphire);
		setUnlocalizedName("SapphireBlock");
		setRegistryName("SapphireBlock");
		setHardness(1.5F);
		setResistance(1.0F);
		setStepSound(Block.soundTypeStone);
		disableStats();
		setLightOpacity(1);
   }
}