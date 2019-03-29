package com.mitsuki.JadeCraft.Blocks;

import com.mitsuki.JadeCraft.JadeCraftCore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class JadeBlock extends Block {
	
  public JadeBlock() {
	super(Material.rock);
	setCreativeTab(JadeCraftCore.tabsJade);
	setUnlocalizedName("JadeBlock");
	setRegistryName("JadeBlock");
	setHardness(1.5F);
	setResistance(1.0F);
	setStepSound(Block.soundTypeStone);
	disableStats();
	setLightOpacity(1);
  }
}
