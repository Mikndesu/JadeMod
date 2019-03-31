package com.mitsuki.JadeCraft.Blocks;

import com.mitsuki.JadeCraft.JadeCraftCore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.IStringSerializable;

public class Sapphire_Ore extends Block {
	public enum EnumType implements IStringSerializable {

		SAPPHIRE_ORE(0, "sapphire_ore");

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
	public static final PropertyEnum TYPE = PropertyEnum.create("type", Sapphire_Ore.EnumType.class);

	@SuppressWarnings("unchecked")
	public Sapphire_Ore() {
		super(Material.rock);
		setCreativeTab(JadeCraftCore.tabsSapphire);
		setUnlocalizedName("SAPPHIRE_ORE");
		setHardness(1.5F);
		setResistance(1.0F);
		setStepSound(Block.soundTypeStone);
		disableStats();
		setLightOpacity(1);
		setLightLevel(0.0F);
		this.setRegistryName("Sapphire_Ore");
		this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumType.SAPPHIRE_ORE));
	}

	@SuppressWarnings("unchecked")
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(TYPE, EnumType.SAPPHIRE_ORE);
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
