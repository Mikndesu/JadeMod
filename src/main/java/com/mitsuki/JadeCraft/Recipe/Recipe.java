package com.mitsuki.JadeCraft.Recipe;

import com.mitsuki.JadeCraft.JadeCraftCore;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipe extends JadeCraftCore {
    @Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.addRecipe(new ItemStack(jadeBlock, 1),
				   "###",
				   "###",
				   "###",
				   '#', jade);
		GameRegistry.addRecipe(new ItemStack(jadeHelmet),
				   "   ",
				   "JJJ",
				   "J J",
				   'J', jade);
		GameRegistry.addShapelessRecipe(new ItemStack(jade, 9),
				   jadeBlock);
	    GameRegistry.addRecipe(new ItemStack(jadeArmor),
				   "J J",
				   "JJJ",
				   "JJJ",
				   'J', jade);
		GameRegistry.addRecipe(new ItemStack(jadeLeggings),
				   "JJJ",
				   "J J",
				   "J J",
				   'J', jade);
		GameRegistry.addRecipe(new ItemStack(jadeBoots),
				   "   ",
				   "J J",
				   "J J",
				   'J', jade);
		GameRegistry.addRecipe(new ItemStack(jadeSword),
				   " J ",
				   " J ",
				   " S ",
				   'J', jade,
				   'S', Items.stick);
		GameRegistry.addShapelessRecipe(new ItemStack(excalibur),
					caliburn,
					avalon);
		GameRegistry.addRecipe(new ItemStack(caliburn),
				   "MDM",
				   "GSG",
				   "RIR",
				   'M', mysterious_Crystal,
				   'G', Items.gold_ingot,
				   'R', Items.dye,
				   'I', Items.stick,
				   'S', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(avalon),
				   "IGI",
				   "DMD",
				   "SOS",
				   'I', Blocks.iron_block,
				   'D', Items.diamond_sword,
				   'S', Items.string,
				   'O', Blocks.obsidian,
				   'M', Items.emerald);
		GameRegistry.addRecipe(new ItemStack(jadeHoe),
				   "JJ ",
				   " S ",
				   " S ",
				   'J', jade,
				   'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(jadePickaxe),
				   "JJJ",
				   " S ",
				   " S ",
				   'J', jade,
				   'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(jadeShovel),
				   " J ",
				   " S ",
				   " S ",
				   'J', jade,
				   'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(jadeAxe),
				   "JJ ",
				   "JS ",
				   " S ",
				   'J', jade,
				   'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Items.wooden_pickaxe,3,57),
				   "SSS",
				   " S ",
				   " S ",
				   'S', Items.stick);
		 }

	}

