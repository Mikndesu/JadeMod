package com.mitsuki.JadeCraft;

import java.util.Random;

import com.mitsuki.JadeCraft.Aromors.JadeArmor;
import com.mitsuki.JadeCraft.Blocks.JadeBlock;
import com.mitsuki.JadeCraft.Blocks.Jade_Ore;
import com.mitsuki.JadeCraft.Blocks.SapphireBlock;
import com.mitsuki.JadeCraft.Blocks.Sapphire_Ore;
import com.mitsuki.JadeCraft.CreativeTabs.CreativeTabJade;
import com.mitsuki.JadeCraft.CreativeTabs.CreativeTabSapphire;
import com.mitsuki.JadeCraft.Tools.Caliburn;
import com.mitsuki.JadeCraft.Tools.Excalibur;
import com.mitsuki.JadeCraft.Tools.JadeAxe;
import com.mitsuki.JadeCraft.Tools.JadeHoe;
import com.mitsuki.JadeCraft.Tools.JadePickaxe;
import com.mitsuki.JadeCraft.Tools.JadeShovel;
import com.mitsuki.JadeCraft.Tools.JadeSword;
import com.mitsuki.JadeCraft.items.Avalon;
import com.mitsuki.JadeCraft.items.Jade;
import com.mitsuki.JadeCraft.items.Jade_Crystal;
import com.mitsuki.JadeCraft.items.Mysterious_Crystal;
import com.mitsuki.JadeCraft.items.Sapphire;

import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = JadeCraftCore.MOD_ID, name = JadeCraftCore.MOD_NAME, version = JadeCraftCore.MOD_VERSION, dependencies = JadeCraftCore.MOD_DEPENDENCIES, acceptedMinecraftVersions = JadeCraftCore.MOD_ACCEPTED_MC_VERSIONS, useMetadata = true)
public class JadeCraftCore {
	boolean hardmode;
	public static final String MOD_ID = "JadeCraft";
	public static final String MOD_NAME = "JadeCraft";
	public static final String MOD_VERSION = "1.20";
	public static final String MOD_DEPENDENCIES = "required-after:Forge@[1.8.9-11.15.1.2318,)";
	public static final String MOD_ACCEPTED_MC_VERSIONS = "[1.8.9]";
	public static final CreativeTabs tabsJade = new CreativeTabJade("Jade");
	public static final CreativeTabs tabsSapphire = new CreativeTabSapphire("Sapphire");

	public static Block jadeBlock;
	public static Block jade_Ore;
	public static Block sapphireBlock;
	public static Block sapphire_Ore;

	public static Item jade;
	public static Item jade_Crystal;
	public static Item sapphire;
	public static Item mysterious_Crystal;
	public static Item caliburn;
	public static Item avalon;

	public static Item jadeHelmet;
	public static Item jadeArmor;
	public static Item jadeLeggings;
	public static Item jadeBoots;

	public static Item jadeSword;
	public static Item excalibur;
	public static Item jadeHoe;
	public static Item jadeAxe;
	public static Item jadePickaxe;
	public static Item jadeShovel;

	public static ArmorMaterial JADE_MATERIAL = EnumHelper.addArmorMaterial("JADE", "Jade", 128,
			new int[] { 3, 8, 6, 3 }, 128);
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		 MinecraftForge.ORE_GEN_BUS.register(this);
		  jadeBlock = new JadeBlock();
		  jade_Ore = new Jade_Ore();
		  sapphireBlock = new SapphireBlock();
		  sapphire_Ore = new Sapphire_Ore();
		  jade = new Jade();
		  sapphire = new Sapphire();
		  jade_Crystal = new Jade_Crystal();
		  mysterious_Crystal = new Mysterious_Crystal();
		  caliburn = new Caliburn();
		  avalon = new Avalon();
		  jadeSword = new JadeSword();
		  excalibur = new Excalibur();
		  jadeHoe = new JadeHoe();
		  jadeAxe = new JadeAxe();
		  jadePickaxe = new JadePickaxe();
		  jadeShovel = new JadeShovel();

		  GameRegistry.registerBlock(jadeBlock, "jadeblock");
		  GameRegistry.registerBlock(jade_Ore, "jade_ore");
		  GameRegistry.registerBlock(sapphireBlock, "sapphireblock");

		  GameRegistry.registerItem(jade, "jade");
		  GameRegistry.registerItem(jade_Crystal, "jade_crystal");
		  GameRegistry.registerItem(mysterious_Crystal, "mysterious_crystal");
		  GameRegistry.registerItem(caliburn, "Caliburn");
		  GameRegistry.registerItem(
			  jadeHelmet = new JadeArmor("JadeHelmet", JADE_MATERIAL, "jade", 0),
			  "JadeHelmet");
		  GameRegistry.registerItem(
			  jadeArmor = new JadeArmor("JadeArmor", JADE_MATERIAL, "jade", 1),
			  "JadeArmor");
		  GameRegistry.registerItem(
			  jadeLeggings = new JadeArmor("JadeLeggings", JADE_MATERIAL, "jade", 2),
			  "JadeLeggings");
		  GameRegistry.registerItem(
			  jadeBoots = new JadeArmor("JadeBoots", JADE_MATERIAL, "jade",3),
			  "JadeBoots");
		  GameRegistry.registerItem(jadeSword, "jadesword");
		  GameRegistry.registerItem(avalon, "avalon");
		  GameRegistry.registerItem(excalibur, "excalibur");
		  GameRegistry.registerItem(jadeHoe, "jadehoe");
		  GameRegistry.registerItem(jadePickaxe, "jadepickaxe");
		  GameRegistry.registerItem(jadeShovel, "jadeshovel");
		  GameRegistry.registerItem(jadeAxe, "jadeaxe");
		  GameRegistry.addSmelting(jade_Ore, new ItemStack(jade), 1.0F);
		  if (event.getSide().isClient()) {

			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(jadeBlock), 0,
			    new ModelResourceLocation(MOD_ID +":" + "jadeblock", "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(jade_Ore), 0,
				new ModelResourceLocation(MOD_ID +":" + "jade_ore", "inventory"));

			ModelLoader.setCustomModelResourceLocation(jade, 0,
				new	ModelResourceLocation(MOD_ID + ":" + "jade", "inventory"));
			ModelLoader.setCustomModelResourceLocation(jade_Crystal, 0,
				new	ModelResourceLocation(MOD_ID + ":" + "jade_crystal", "inventory"));
			ModelLoader.setCustomModelResourceLocation(mysterious_Crystal, 0,
				new ModelResourceLocation(MOD_ID + ":" + "mysterious_crystal", "inventory"));
			ModelLoader.setCustomModelResourceLocation(caliburn, 0,
				new ModelResourceLocation(MOD_ID + ":" + "caliburn", "inventory"));

			ModelLoader.setCustomModelResourceLocation(jadeHelmet, 0,
				new	ModelResourceLocation(MOD_ID + ":" + "jadehelmet", "inventory"));
			ModelLoader.setCustomModelResourceLocation(jadeArmor, 0,
				new	ModelResourceLocation(MOD_ID + ":" + "jadearmor", "inventory"));
			ModelLoader.setCustomModelResourceLocation(jadeLeggings, 0,
				new	ModelResourceLocation(MOD_ID + ":" + "jadeleggings", "inventory"));
			ModelLoader.setCustomModelResourceLocation(jadeBoots, 0,
				new	ModelResourceLocation(MOD_ID + ":" + "jadeboots", "inventory"));
			ModelLoader.setCustomModelResourceLocation(jadeSword, 0,
				new ModelResourceLocation(MOD_ID + ":" + "jadesword", "inventory"));
			ModelLoader.setCustomModelResourceLocation(avalon, 0,
					new ModelResourceLocation(MOD_ID + ":" + "avalon", "inventory"));
			ModelLoader.setCustomModelResourceLocation(excalibur, 0,
				new ModelResourceLocation(MOD_ID + ":" + "excalibur", "inventory"));
			ModelLoader.setCustomModelResourceLocation(jadeHoe, 0,
				new ModelResourceLocation(MOD_ID + ":" + "jadehoe", "inventory"));
			ModelLoader.setCustomModelResourceLocation(jadePickaxe, 0,
				new ModelResourceLocation(MOD_ID + ":" + "jadepickaxe", "inventory"));
			ModelLoader.setCustomModelResourceLocation(jadeShovel, 0,
				new ModelResourceLocation(MOD_ID + ":" + "jadeshovel", "inventory"));
			ModelLoader.setCustomModelResourceLocation(jadeAxe, 0,
				new ModelResourceLocation(MOD_ID + ":" + "jadeaxe", "inventory"));
		  }
		}

	@EventHandler
	public void init(FMLPreInitializationEvent event) {
	        Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
	        cfg.load();
	        hardmode = cfg.getBoolean("hardmode", "mode", false, "isHardmode?");
	        cfg.save();
	    }

	@SubscribeEvent
	public void generateOrePre(OreGenEvent.Pre event) {
		WorldGenerator chrowa3BlockGen = new WorldGenMinable(jade_Ore.getDefaultState(), 3);

		if (TerrainGen.generateOre(event.world, event.rand, chrowa3BlockGen, event.pos,
			OreGenEvent.GenerateMinable.EventType.CUSTOM))
			genStandardOre(event.world, event.pos, 2, chrowa3BlockGen, 30, 50, event.rand);
	}

	protected void genStandardOre(World world, BlockPos pos, int size, WorldGenerator generator,int minY, int maxY,
		Random rnd) {
	  int l;

	  if (minY < minY) {
		l = minY;
		minY = maxY;
		maxY = l;
	  } else if (maxY == minY) {
		if (minY < 255)
		  ++maxY;
		else
		  --minY;
	  }

	  for (l = 0; l < size; ++l) {
		BlockPos blockpos = pos.add(rnd.nextInt(16), rnd.nextInt(maxY - minY) + minY, rnd.nextInt(16));
		generator.generate(world, rnd, blockpos);
	  }
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
 if (hardmode) {
	 GameRegistry.addRecipe(new ItemStack(mysterious_Crystal, 1),
			   "DJD",
			   "JNJ",
			   "DJD",
			   'D', Items.diamond,
			   'N', Items.nether_star,
			   'J', jade);
	  }
 if (!hardmode) {
	 GameRegistry.addRecipe(new ItemStack(jade_Crystal, 1),
			   "DJD",
			   "JNJ",
			   "DJD",
			   'N', Items.nether_star,
			   'D', Items.diamond,
			   'J', jade);
 }
 if (hardmode) {
	 GameRegistry.addRecipe(new ItemStack(jade_Crystal, 1),
			   "MDM",
			   "DJD",
			   "MDM",
			   'M', mysterious_Crystal,
			   'D', Items.diamond,
			   'J', jadeSword);
 }
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
