package com.mitsuki.JadeCraft.items;

import com.mitsuki.JadeCraft.JadeCraftCore;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Jade_Crystal extends Item {
	public Jade_Crystal() {
		super();
		setCreativeTab(JadeCraftCore.tabsJade);
		setUnlocalizedName("Jade_Crystal");
		setMaxStackSize(1);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
		if (playerIn.capabilities.isCreativeMode) {
		MinecraftServer server = MinecraftServer.getServer();
		 server.getCommandManager().executeCommand(server, "/kill @e[type=!Player]");
        return itemStackIn;
		}
		else {
			--itemStackIn.stackSize;
			MinecraftServer server = MinecraftServer.getServer();
			 server.getCommandManager().executeCommand(server, "/kill @e[type=!Player]");
			 return itemStackIn;
		}
	}
}