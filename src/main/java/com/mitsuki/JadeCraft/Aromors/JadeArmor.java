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
		String RegexArmor = "JadeArmor";
		String RegexLegg = "JadeLeggings";
		String RegexHelm = "JadeHelm";
		String RegexBoots = "JadeBoots";

		Pattern ArmorPat = Pattern.compile(RegexArmor);
		Pattern LeggPat = Pattern.compile(RegexLegg);
		Pattern HelmPat = Pattern.compile(RegexHelm);
		Pattern BootsPat = Pattern.compile(RegexBoots);

		Matcher Armor = ArmorPat.matcher(armorName);
		Matcher Helm = HelmPat.matcher(armorName);
		Matcher Legg = LeggPat.matcher(armorName);
		Matcher Boots = BootsPat.matcher(armorName);

		if (Armor.find())
			return "JadeArmor";
		if (Boots.find())
			return "JadeBoots";
		if (Helm.find())
			return "JadeHelm";
		if (Legg.find())
			return "JadeLeggings";

		return "UnKnown";
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return "jadecraft:textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
}
