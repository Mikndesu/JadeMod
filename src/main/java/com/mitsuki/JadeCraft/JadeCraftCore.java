package com.mitsuki.JadeCraft;

import java.util.Random;

import com.mitsuki.JadeCraft.Aromors.JadeArmor;
import com.mitsuki.JadeCraft.Blocks.JadeBlock;
import com.mitsuki.JadeCraft.Blocks.Jade_Ore;
import com.mitsuki.JadeCraft.Blocks.SapphireBlock;
import com.mitsuki.JadeCraft.Blocks.Sapphire_Ore;
import com.mitsuki.JadeCraft.CreativeTabs.CreativeTabJade;
import com.mitsuki.JadeCraft.CreativeTabs.CreativeTabSapphire;
import com.mitsuki.JadeCraft.Tools.Others.Jade.JadeAxe;
import com.mitsuki.JadeCraft.Tools.Others.Jade.JadeHoe;
import com.mitsuki.JadeCraft.Tools.Others.Jade.JadePickaxe;
import com.mitsuki.JadeCraft.Tools.Others.Jade.JadeShovel;
import com.mitsuki.JadeCraft.Tools.Others.Sapphire.SapphireAxe;
import com.mitsuki.JadeCraft.Tools.Others.Sapphire.SapphireHoe;
import com.mitsuki.JadeCraft.Tools.Others.Sapphire.SapphirePickaxe;
import com.mitsuki.JadeCraft.Tools.Others.Sapphire.SapphireShovel;
import com.mitsuki.JadeCraft.Tools.Sword.Caliburn;
import com.mitsuki.JadeCraft.Tools.Sword.Excalibur;
import com.mitsuki.JadeCraft.Tools.Sword.JadeSword;
import com.mitsuki.JadeCraft.Tools.Sword.SapphireSword;
import com.mitsuki.JadeCraft.items.Avalon;
import com.mitsuki.JadeCraft.items.Jade;
import com.mitsuki.JadeCraft.items.Mysterious_Crystal;
import com.mitsuki.JadeCraft.items.Sapphire;
import com.mitsuki.JadeCraft.items.Shining_Crystal;

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
	public static final String MOD_VERSION = "1.40";
	public static final String MOD_DEPENDENCIES = "required-after:Forge@[1.8.9-11.15.1.2318,)";
	public static final String MOD_ACCEPTED_MC_VERSIONS = "[1.8.9]";
	public static final CreativeTabs tabsJade = new CreativeTabJade("Jade");
	public static final CreativeTabs tabsSapphire = new CreativeTabSapphire("Sapphire");

	public static Block jadeBlock;
	public static Block jade_Ore;
	public static Block sapphireBlock;
	public static Block sapphire_Ore;

	public static Item jade;
	public static Item sapphire;
	public static Item mysterious_Crystal;
	public static Item shining_Crystal;

	//Jade Aromor
	public static Item jade_Helmet;
	public static Item jade_Armor;
	public static Item jade_Leggings;
	public static Item jade_Boots;

	//Jade Tool
	public static Item jadeSword;
	public static Item jadePickaxe;
	public static Item jadeAxe;
	public static Item jadeHoe;
	public static Item jadeShovel;

	//Sapphire Tool
	public static Item sapphireSword;
	public static Item sapphirePickaxe;
	public static Item sapphireAxe;
	public static Item sapphireHoe;
	public static Item sapphireShovel;

	//Extra Tool
	public static Item excalibur;
	public static Item caliburn;
	public static Item avalon;

	public static ArmorMaterial JADE_MATERIAL = EnumHelper.addArmorMaterial("JADE", "Jade", 128,
			new int[] { 3, 8, 6, 3 }, 128);
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		 MinecraftForge.ORE_GEN_BUS.register(this);

		  jade = new Jade();
		  sapphire = new Sapphire();
		  shining_Crystal = new Shining_Crystal();
		  mysterious_Crystal = new Mysterious_Crystal();

		  excalibur = new Excalibur();
		  caliburn = new Caliburn();
		  avalon = new Avalon();

		  jadeSword = new JadeSword();
		  jadeHoe = new JadeHoe();
		  jadeAxe = new JadeAxe();
		  jadePickaxe = new JadePickaxe();
		  jadeShovel = new JadeShovel();

		  sapphireSword = new SapphireSword();
		  sapphireHoe = new SapphireHoe();
		  sapphireAxe = new SapphireAxe();
		  sapphirePickaxe = new SapphirePickaxe();
		  sapphireShovel = new SapphireShovel();

		  jade_Ore = new Jade_Ore();
		  sapphire_Ore = new Sapphire_Ore();
		  jadeBlock = new JadeBlock();
		  sapphireBlock = new SapphireBlock();


		  GameRegistry.registerItem(jade, "jade");
		  GameRegistry.registerItem(sapphire, "sapphire");
		  GameRegistry.registerItem(shining_Crystal, "jade_crystal");
		  GameRegistry.registerItem(mysterious_Crystal, "mysterious_crystal");

		  // add Jade Tools
		  GameRegistry.registerItem(jadeSword, "jadesword");
		  GameRegistry.registerItem(jadePickaxe, "jadepickaxe");
		  GameRegistry.registerItem(jadeAxe, "jadeaxe");
		  GameRegistry.registerItem(jadeHoe, "jadehoe");
		  GameRegistry.registerItem(jadeShovel, "jadeshovel");

		  // add Sapphire Tools
		  GameRegistry.registerItem(sapphireSword, "sapphiresword");
		  GameRegistry.registerItem(sapphirePickaxe, "sapphirepickaxe");
		  GameRegistry.registerItem(sapphireAxe, "sapphireaxe");
		  GameRegistry.registerItem(sapphireHoe, "sapphirehoe");
		  GameRegistry.registerItem(sapphireShovel, "sapphireshovel");

		  // add Extra Tools
		  GameRegistry.registerItem(excalibur, "excalibur");
		  GameRegistry.registerItem(caliburn, "Caliburn");
		  GameRegistry.registerItem(avalon, "avalon");

		  // add Jade Aromors
		  GameRegistry.registerItem(
				  jade_Helmet = new JadeArmor("Jade_Helmet", JADE_MATERIAL, "jade", 0),
				  "Jade_Helmet");
		  GameRegistry.registerItem(
				  jade_Armor = new JadeArmor("Jade_Armor", JADE_MATERIAL, "jade", 1),
				  "Jade_Armor");
		  GameRegistry.registerItem(
				  jade_Leggings = new JadeArmor("Jade_Leggings", JADE_MATERIAL, "jade", 2),
				  "Jade_Leggings");
		  GameRegistry.registerItem(
				  jade_Boots = new JadeArmor("Jade_Boots", JADE_MATERIAL, "jade",3),
				  "Jade_Boots");

		  //add ores
		  GameRegistry.registerBlock(jade_Ore, "jade_ore");
		  GameRegistry.registerBlock(sapphire_Ore, "Sapphire_ore");

		  GameRegistry.registerBlock(jadeBlock, "jadeblock");
		  GameRegistry.registerBlock(sapphireBlock, "sapphireblock");

		  //add smelting
		  GameRegistry.addSmelting(jade_Ore, new ItemStack(jade), 1.0F);
		  GameRegistry.addSmelting(sapphire_Ore, new ItemStack(sapphire), 1.0F);

		  if (event.getSide().isClient()) {


			ModelLoader.setCustomModelResourceLocation(jade, 0,
				new	ModelResourceLocation(MOD_ID + ":" + "jade", "inventory"));
			ModelLoader.setCustomModelResourceLocation(sapphire, 0,
				new	ModelResourceLocation(MOD_ID + ":" + "sapphire", "inventory"));
			ModelLoader.setCustomModelResourceLocation(shining_Crystal, 0,
				new	ModelResourceLocation(MOD_ID + ":" + "shining_crystal", "inventory"));
			ModelLoader.setCustomModelResourceLocation(mysterious_Crystal, 0,
				new ModelResourceLocation(MOD_ID + ":" + "mysterious_crystal", "inventory"));

			ModelLoader.setCustomModelResourceLocation(excalibur, 0,
					new ModelResourceLocation(MOD_ID + ":" + "excalibur", "inventory"));
			ModelLoader.setCustomModelResourceLocation(avalon, 0,
					new ModelResourceLocation(MOD_ID + ":" + "avalon", "inventory"));
			ModelLoader.setCustomModelResourceLocation(caliburn, 0,
				new ModelResourceLocation(MOD_ID + ":" + "caliburn", "inventory"));

			ModelLoader.setCustomModelResourceLocation(jade_Helmet, 0,
				new	ModelResourceLocation(MOD_ID + ":" + "jade_helmet", "inventory"));
			ModelLoader.setCustomModelResourceLocation(jade_Armor, 0,
				new	ModelResourceLocation(MOD_ID + ":" + "jade_armor", "inventory"));
			ModelLoader.setCustomModelResourceLocation(jade_Leggings, 0,
				new	ModelResourceLocation(MOD_ID + ":" + "jade_leggings", "inventory"));
			ModelLoader.setCustomModelResourceLocation(jade_Boots, 0,
				new	ModelResourceLocation(MOD_ID + ":" + "jade_boots", "inventory"));

			ModelLoader.setCustomModelResourceLocation(jadeSword, 0,
				new ModelResourceLocation(MOD_ID + ":" + "jadesword", "inventory"));
			ModelLoader.setCustomModelResourceLocation(jadePickaxe, 0,
					new ModelResourceLocation(MOD_ID + ":" + "jadepickaxe", "inventory"));
			ModelLoader.setCustomModelResourceLocation(jadeAxe, 0,
					new ModelResourceLocation(MOD_ID + ":" + "jadeaxe", "inventory"));
			ModelLoader.setCustomModelResourceLocation(jadeHoe, 0,
					new ModelResourceLocation(MOD_ID + ":" + "jadehoe", "inventory"));
			ModelLoader.setCustomModelResourceLocation(jadeShovel, 0,
					new ModelResourceLocation(MOD_ID + ":" + "jadeshovel", "inventory"));

			ModelLoader.setCustomModelResourceLocation(sapphireSword, 0,
				new ModelResourceLocation(MOD_ID + ":" + "sapphiresword", "inventory"));
			ModelLoader.setCustomModelResourceLocation(sapphirePickaxe, 0,
				new ModelResourceLocation(MOD_ID + ":" + "sapphirepickaxe", "inventory"));
			ModelLoader.setCustomModelResourceLocation(sapphireAxe, 0,
				new ModelResourceLocation(MOD_ID + ":" + "sapphireaxe", "inventory"));
			ModelLoader.setCustomModelResourceLocation(sapphireHoe, 0,
					new ModelResourceLocation(MOD_ID + ":" + "sapphirehoe", "inventory"));
			ModelLoader.setCustomModelResourceLocation(sapphireShovel, 0,
				new ModelResourceLocation(MOD_ID + ":" + "sapphireshovel", "inventory"));

			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(jade_Ore), 0,
					new ModelResourceLocation(MOD_ID + ":" + "jade_ore", "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(sapphire_Ore), 0,
					new ModelResourceLocation(MOD_ID + ":" + "sapphire_ore", "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(jadeBlock), 0,
					new ModelResourceLocation(MOD_ID + ":" + "jadeblock", "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(sapphireBlock), 0,
					new ModelResourceLocation(MOD_ID + ":" + "sapphireblock", "inventory"));
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
	public void generateOrePre1(OreGenEvent.Pre event) {
		WorldGenerator BlockGen1 = new WorldGenMinable(jade_Ore.getDefaultState(), 3);

		if (TerrainGen.generateOre(event.world, event.rand, BlockGen1, event.pos,
			OreGenEvent.GenerateMinable.EventType.CUSTOM))
			genStandardOre1(event.world, event.pos, 2, BlockGen1, 30, 50, event.rand);
	}

	protected void genStandardOre1(World world, BlockPos pos, int size, WorldGenerator generator,int minY, int maxY,
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
		BlockPos blockpos = pos.add(rnd.nextInt(10), rnd.nextInt(maxY - minY) + minY, rnd.nextInt(10));
		generator.generate(world, rnd, blockpos);
	  }
	}

	@SubscribeEvent
	public void generateOrePre2(OreGenEvent.Pre event) {
		WorldGenerator BlockGen2 = new WorldGenMinable(sapphire_Ore.getDefaultState(), 3);

		if (TerrainGen.generateOre(event.world, event.rand, BlockGen2, event.pos,
			OreGenEvent.GenerateMinable.EventType.CUSTOM))
			genStandardOre2(event.world, event.pos, 2, BlockGen2, 30, 50, event.rand);
	}

	protected void genStandardOre2(World world, BlockPos pos, int size, WorldGenerator generator,int minY, int maxY,
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
		BlockPos blockpos = pos.add(rnd.nextInt(7), rnd.nextInt(maxY - minY) + minY, rnd.nextInt(7));
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
	 GameRegistry.addRecipe(new ItemStack(shining_Crystal, 1),
			   "DJD",
			   "JNJ",
			   "DJD",
			   'N', Items.nether_star,
			   'D', Items.diamond,
			   'J', jade);
 }
 if (hardmode) {
	 GameRegistry.addRecipe(new ItemStack(shining_Crystal, 1),
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
GameRegistry.addRecipe(new ItemStack(jade_Helmet),
		   "   ",
		   "JJJ",
		   "J J",
		   'J', jade);
GameRegistry.addShapelessRecipe(new ItemStack(jade, 9),
		   jadeBlock);
GameRegistry.addRecipe(new ItemStack(jade_Armor),
		   "J J",
		   "JJJ",
		   "JJJ",
		   'J', jade);
GameRegistry.addRecipe(new ItemStack(jade_Leggings),
		   "JJJ",
		   "J J",
		   "J J",
		   'J', jade);
GameRegistry.addRecipe(new ItemStack(jade_Boots),
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
		   'R', Items.iron_ingot,
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