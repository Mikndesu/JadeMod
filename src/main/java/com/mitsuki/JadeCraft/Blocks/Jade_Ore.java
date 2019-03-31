package com.mitsuki.JadeCraft.Blocks;

import com.mitsuki.JadeCraft.JadeCraftCore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.IStringSerializable;

public class Jade_Ore extends Block {
	public enum EnumType implements IStringSerializable {

		JADE_ORE(0, "jade_ore");

		private int ID;
		private String name;

		private EnumType(int ID, String name) {
			this.ID = ID;
			this.name = name;
		}

		@Override
		public String getName() {
			return name;
		}

		public int getID() {
			return ID;
		}

		@Override
		public String toString() {
			return getName();
		}
	}

	@SuppressWarnings("rawtypes")
	public static final PropertyEnum TYPE = PropertyEnum.create("type", Jade_Ore.EnumType.class);

	@SuppressWarnings("unchecked")
	public Jade_Ore() {
		super(Material.rock);
		setCreativeTab(JadeCraftCore.tabsJade);
		setUnlocalizedName("JADE_ORE");
		setHardness(50F);
		setResistance(1.0F);
		setStepSound(Block.soundTypeStone);
		disableStats();
		setLightOpacity(1);
		setLightLevel(0.0F);
		this.setRegistryName("Jade_Ore");
		this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumType.JADE_ORE));
	}

	@SuppressWarnings("unchecked")
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(TYPE, EnumType.JADE_ORE);
	}

	@SuppressWarnings("unchecked")
	@Override
	public int getMetaFromState(IBlockState state) {
		EnumType type = (EnumType) state.getValue(TYPE);
		return type.getID();
	}

	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}

	@Override
	protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[] { TYPE });
	}
}
