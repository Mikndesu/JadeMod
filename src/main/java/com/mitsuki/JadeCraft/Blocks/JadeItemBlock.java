package com.mitsuki.JadeCraft.Blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class JadeItemBlock extends ItemBlock {
	public JadeItemBlock(Block block) {
		super(block);
		setUnlocalizedName("JadeBlock");
		setRegistryName("JadeBlock");
	}
}
