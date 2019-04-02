package com.mitsuki.JadeCraft.Aromors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mitsuki.JadeCraft.JadeCraftCore;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class JadeArmor extends ItemArmor {
	public String textureName;

	public JadeArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {

		super(material, 0, type);
		setCreativeTab(JadeCraftCore.tabsJade);
		setUnlocalizedName(unlocalizedName);
		setMaxStackSize(1);
		this.textureName = textureName;
	}

	@Override
	public String getItemStackDisplayName(ItemStack itemstack) {
		String armorName = itemstack.getUnlocalizedName();
		String RegexArmor = "Jade_Armor";
		String RegexLegg = "Jade_Leggings";
		String RegexHelm = "Jade_Helm";
		String RegexBoots = "Jade_Boots";

		Pattern ArmorPat = Pattern.compile(RegexArmor);
		Pattern LeggPat = Pattern.compile(RegexLegg);
		Pattern HelmPat = Pattern.compile(RegexHelm);
		Pattern BootsPat = Pattern.compile(RegexBoots);

		Matcher Armor = ArmorPat.matcher(armorName);
		Matcher Helm = HelmPat.matcher(armorName);
		Matcher Legg = LeggPat.matcher(armorName);
		Matcher Boots = BootsPat.matcher(armorName);

		if (Armor.find())
			return "Jade_Armor";
		if (Boots.find())
			return "Jade_Boots";
		if (Helm.find())
			return "Jade_Helm";
		if (Legg.find())
			return "Jade_Leggings";

		return "UnKnown";
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return "jadecraft:textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
}
