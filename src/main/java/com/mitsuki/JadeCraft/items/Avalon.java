package com.mitsuki.JadeCraft.items;

import com.mitsuki.JadeCraft.JadeCraftCore;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Avalon extends Item {
	public Avalon(){
		super();
		setCreativeTab(JadeCraftCore.tabsJade);
		setUnlocalizedName("Avalon");
		setMaxStackSize(1);
	  }
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		int potionID = Potion.heal.id;

		int duration = 10 * 20;

		int amplifier = 20;

		PotionEffect Effect = new PotionEffect(potionID, duration, amplifier);

		boolean isHeal = par3EntityPlayer.isPotionActive(Effect.getPotionID());

		if( !isHeal )
		{
			par3EntityPlayer.swingItem();
			par1ItemStack.damageItem(1, par3EntityPlayer);
 			par3EntityPlayer.addPotionEffect(Effect);
		}
	return par1ItemStack;
	}
}
