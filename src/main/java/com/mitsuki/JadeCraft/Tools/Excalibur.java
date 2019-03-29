package com.mitsuki.JadeCraft.Tools;

import com.mitsuki.JadeCraft.JadeCraftCore;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class Excalibur extends ItemSword {

	public static ToolMaterial Holy_Grail = EnumHelper.addToolMaterial("HOLY_GRAIL", 0, 77777, 30.0F, 50.0F, 25);

	public Excalibur() {
		super(Holy_Grail);
		setCreativeTab(JadeCraftCore.tabsJade);
		setUnlocalizedName("Excalibur");
		setFull3D();
		setMaxStackSize(1);
	}

	@Override
	public String getItemStackDisplayName(ItemStack itemstack) {
		return "Excalibur";
	}
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		int potionID = Potion.moveSpeed.id;
		int potionID2 = Potion.healthBoost.id;
		int potionID3 = Potion.heal.id;
		int potionID4 = Potion.nightVision.id;
		int potionID5 = Potion.saturation.id;
		int potionID6 = Potion.waterBreathing.id;
		int potionID7 = Potion.damageBoost.id;
		int potionID8 = Potion.jump.id;

		int duration = 180 * 20;
		int duration2 = 1 * 20;

		int amplifier = 1;
		int amplifier2 = 10;
		int amplifier3 = 0;
		int amplifier4 = 4;
		int amplifier5 = 3;

		PotionEffect Effect = new PotionEffect(potionID, duration, amplifier);
		PotionEffect Effect2 = new PotionEffect(potionID2, duration, amplifier2);
		PotionEffect Effect3 =new PotionEffect(potionID3, duration2, amplifier2);
		PotionEffect Effect4 = new PotionEffect(potionID4, duration, amplifier3);
		PotionEffect Effect5 = new PotionEffect(potionID5, duration, amplifier4);
		PotionEffect Effect6 = new PotionEffect(potionID6, duration, amplifier3);
		PotionEffect Effect7 = new PotionEffect(potionID7, duration, amplifier4);
		PotionEffect Effect8 = new PotionEffect(potionID8, duration, amplifier5);

		boolean isMoveSpeed = par3EntityPlayer.isPotionActive(Effect.getPotionID());
		if( !isMoveSpeed )
		{
			par3EntityPlayer.swingItem();
			par1ItemStack.damageItem(1, par3EntityPlayer);
			par3EntityPlayer.addPotionEffect(Effect);
		}
		boolean isHealthBoost = par3EntityPlayer.isPotionActive(Effect2.getPotionID());
		if( !isHealthBoost ) {
			par3EntityPlayer.swingItem();
			par1ItemStack.damageItem(1, par3EntityPlayer);
			par3EntityPlayer.addPotionEffect(Effect2);
		}
		boolean isHeal = par3EntityPlayer.isPotionActive(Effect3.getPotionID());
		if( !isHeal ) {
			par3EntityPlayer.swingItem();
			par1ItemStack.damageItem(1, par3EntityPlayer);
			par3EntityPlayer.addPotionEffect(Effect3);
		}
		boolean isNightVision = par3EntityPlayer.isPotionActive(Effect4.getPotionID());
		if( !isNightVision ) {
			par3EntityPlayer.swingItem();
			par1ItemStack.damageItem(1, par3EntityPlayer);
			par3EntityPlayer.addPotionEffect(Effect4);
		}
		boolean isSaturation = par3EntityPlayer.isPotionActive(Effect5.getPotionID());
		if( !isSaturation ) {
			par3EntityPlayer.swingItem();
			par1ItemStack.damageItem(1, par3EntityPlayer);
			par3EntityPlayer.addPotionEffect(Effect5);
		}
		boolean isWaterBreathing = par3EntityPlayer.isPotionActive(Effect6.getPotionID());
		if( !isWaterBreathing ) {
			par3EntityPlayer.swingItem();
			par1ItemStack.damageItem(1, par3EntityPlayer);
			par3EntityPlayer.addPotionEffect(Effect6);
		}
		boolean isdamageBoost = par3EntityPlayer.isPotionActive(Effect7.getPotionID());
		if( !isdamageBoost ) {
			par3EntityPlayer.swingItem();
			par1ItemStack.damageItem(1, par3EntityPlayer);
			par3EntityPlayer.addPotionEffect(Effect7);
		}
		boolean isjump = par3EntityPlayer.isPotionActive(Effect8.getPotionID());
		if( !isjump ) {
			par3EntityPlayer.swingItem();
			par1ItemStack.damageItem(1, par3EntityPlayer);
			par3EntityPlayer.addPotionEffect(Effect8);
		}
	return par1ItemStack;
	}
}