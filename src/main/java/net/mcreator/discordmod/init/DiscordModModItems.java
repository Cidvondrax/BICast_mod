
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.discordmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.discordmod.item.SlimeSwordItem;
import net.mcreator.discordmod.item.SlimeShovelItem;
import net.mcreator.discordmod.item.SlimePickaxeItem;
import net.mcreator.discordmod.item.SlimeItem;
import net.mcreator.discordmod.item.SlimeHoeItem;
import net.mcreator.discordmod.item.SlimeDimensionItem;
import net.mcreator.discordmod.item.SlimeAxeItem;
import net.mcreator.discordmod.item.SlimeArmorArmorItem;
import net.mcreator.discordmod.item.RennetItem;
import net.mcreator.discordmod.item.PinkSlimeArmourArmorItem;
import net.mcreator.discordmod.item.NachoCheeseItem;
import net.mcreator.discordmod.item.MozzarellaBallItem;
import net.mcreator.discordmod.item.GlassShardItem;
import net.mcreator.discordmod.item.GelSwordItem;
import net.mcreator.discordmod.item.DestroyedDimensionItem;
import net.mcreator.discordmod.item.DerbyWheelItem;
import net.mcreator.discordmod.item.CurdItem;
import net.mcreator.discordmod.item.ChhurpiDogTreatItem;
import net.mcreator.discordmod.item.CheesyDimensionItem;
import net.mcreator.discordmod.item.CasuMarzuWheelItem;
import net.mcreator.discordmod.item.BlueCheeseFoodItem;
import net.mcreator.discordmod.DiscordModMod;

public class DiscordModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DiscordModMod.MODID);
	public static final RegistryObject<Item> COCONUJPEG = block(DiscordModModBlocks.COCONUJPEG, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CRAB = REGISTRY.register("crab_spawn_egg",
			() -> new ForgeSpawnEggItem(DiscordModModEntities.CRAB, -3407872, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> GORILLA = REGISTRY.register("gorilla_spawn_egg",
			() -> new ForgeSpawnEggItem(DiscordModModEntities.GORILLA, -13426407, -15396848, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BLUE_SLIME_BLOCK = block(DiscordModModBlocks.BLUE_SLIME_BLOCK, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CHEESEBLACKONE = block(DiscordModModBlocks.CHEESEBLACKONE, DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> AZTEC_BRICK = block(DiscordModModBlocks.AZTEC_BRICK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AZTEC_SMOOTH_STONE = block(DiscordModModBlocks.AZTEC_SMOOTH_STONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RENNET = REGISTRY.register("rennet", () -> new RennetItem());
	public static final RegistryObject<Item> SLIME_GRASS = block(DiscordModModBlocks.SLIME_GRASS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CURD = REGISTRY.register("curd", () -> new CurdItem());
	public static final RegistryObject<Item> MOZZARELLA_BALL = REGISTRY.register("mozzarella_ball", () -> new MozzarellaBallItem());
	public static final RegistryObject<Item> MOZZARELLA_BLOCK = block(DiscordModModBlocks.MOZZARELLA_BLOCK, DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> BLUECHEESEBLOCK = block(DiscordModModBlocks.BLUECHEESEBLOCK, DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> MUENSTER_CHEESE_WOOD = block(DiscordModModBlocks.MUENSTER_CHEESE_WOOD,
			DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> MUENSTER_CHEESE_LOG = block(DiscordModModBlocks.MUENSTER_CHEESE_LOG,
			DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> MUENSTER_CHEESE_PLANKS = block(DiscordModModBlocks.MUENSTER_CHEESE_PLANKS,
			DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> MUENSTER_CHEESE_LEAVES = block(DiscordModModBlocks.MUENSTER_CHEESE_LEAVES,
			DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> MUENSTER_CHEESE_STAIRS = block(DiscordModModBlocks.MUENSTER_CHEESE_STAIRS,
			DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> MUENSTER_CHEESE_SLAB = block(DiscordModModBlocks.MUENSTER_CHEESE_SLAB,
			DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> MUENSTER_CHEESE_FENCE = block(DiscordModModBlocks.MUENSTER_CHEESE_FENCE,
			DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> MUENSTER_CHEESE_FENCE_GATE = block(DiscordModModBlocks.MUENSTER_CHEESE_FENCE_GATE,
			DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> MUENSTER_CHEESE_PRESSURE_PLATE = block(DiscordModModBlocks.MUENSTER_CHEESE_PRESSURE_PLATE,
			DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> MUENSTER_CHEESE_BUTTON = block(DiscordModModBlocks.MUENSTER_CHEESE_BUTTON,
			DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> SLIME_ORE = block(DiscordModModBlocks.SLIME_ORE, DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> SLIME_BLOCK = block(DiscordModModBlocks.SLIME_BLOCK, DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> GEL_SWORD = REGISTRY.register("gel_sword", () -> new GelSwordItem());
	public static final RegistryObject<Item> SLIME_ARMOR_ARMOR_HELMET = REGISTRY.register("slime_armor_armor_helmet",
			() -> new SlimeArmorArmorItem.Helmet());
	public static final RegistryObject<Item> SLIME_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("slime_armor_armor_chestplate",
			() -> new SlimeArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> SLIME_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("slime_armor_armor_leggings",
			() -> new SlimeArmorArmorItem.Leggings());
	public static final RegistryObject<Item> SLIME_ARMOR_ARMOR_BOOTS = REGISTRY.register("slime_armor_armor_boots",
			() -> new SlimeArmorArmorItem.Boots());
	public static final RegistryObject<Item> SLIME_SWORD = REGISTRY.register("slime_sword", () -> new SlimeSwordItem());
	public static final RegistryObject<Item> SLIME_PICKAXE = REGISTRY.register("slime_pickaxe", () -> new SlimePickaxeItem());
	public static final RegistryObject<Item> BLUE_CHEESE_ZOMBIE = REGISTRY.register("blue_cheese_zombie_spawn_egg",
			() -> new ForgeSpawnEggItem(DiscordModModEntities.BLUE_CHEESE_ZOMBIE, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SLIME_AXE = REGISTRY.register("slime_axe", () -> new SlimeAxeItem());
	public static final RegistryObject<Item> SLIME_SHOVEL = REGISTRY.register("slime_shovel", () -> new SlimeShovelItem());
	public static final RegistryObject<Item> BLUE_CHEESE_FOOD = REGISTRY.register("blue_cheese_food", () -> new BlueCheeseFoodItem());
	public static final RegistryObject<Item> SLIME_HOE = REGISTRY.register("slime_hoe", () -> new SlimeHoeItem());
	public static final RegistryObject<Item> SLIME = REGISTRY.register("slime", () -> new SlimeItem());
	public static final RegistryObject<Item> CHEESY_DIMENSION = REGISTRY.register("cheesy_dimension", () -> new CheesyDimensionItem());
	public static final RegistryObject<Item> SWISS_CHEESE_BLOCK = block(DiscordModModBlocks.SWISS_CHEESE_BLOCK,
			DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> DERBY_CHEESE_BLOCK = block(DiscordModModBlocks.DERBY_CHEESE_BLOCK,
			DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> RUBBLE_BLOCK = block(DiscordModModBlocks.RUBBLE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHEESE_COW = REGISTRY.register("cheese_cow_spawn_egg",
			() -> new ForgeSpawnEggItem(DiscordModModEntities.CHEESE_COW, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> NACHO_CHEESE_BUCKET = REGISTRY.register("nacho_cheese_bucket", () -> new NachoCheeseItem());
	public static final RegistryObject<Item> PINK_DERBY_BLOCK = block(DiscordModModBlocks.PINK_DERBY_BLOCK, DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> IRONGOLEMTEST = REGISTRY.register("irongolemtest_spawn_egg",
			() -> new ForgeSpawnEggItem(DiscordModModEntities.IRONGOLEMTEST, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CHHURPISTONE = block(DiscordModModBlocks.CHHURPISTONE, DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> COBBLED_PINK_DERBY_BLOCK = block(DiscordModModBlocks.COBBLED_PINK_DERBY_BLOCK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUST_BLOCK = block(DiscordModModBlocks.RUST_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DERBY_WHEEL = REGISTRY.register("derby_wheel", () -> new DerbyWheelItem());
	public static final RegistryObject<Item> COVERD_AZTEC_BRICK = block(DiscordModModBlocks.COVERD_AZTEC_BRICK,
			DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> CRACKED_AZTEC_BRIVK = block(DiscordModModBlocks.CRACKED_AZTEC_BRIVK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AZTECSLAB = block(DiscordModModBlocks.AZTECSLAB, DiscordModModTabs.TAB_CHEESE_DIMENSION);
	public static final RegistryObject<Item> CHEESE_TRADER = REGISTRY.register("cheese_trader_spawn_egg",
			() -> new ForgeSpawnEggItem(DiscordModModEntities.CHEESE_TRADER, -24832, -13404892, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CRACKEDGLASS = block(DiscordModModBlocks.CRACKEDGLASS, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> GLASS_SHARD = REGISTRY.register("glass_shard", () -> new GlassShardItem());
	public static final RegistryObject<Item> CHHURPI_DOG_TREAT = REGISTRY.register("chhurpi_dog_treat", () -> new ChhurpiDogTreatItem());
	public static final RegistryObject<Item> DESTROYED_DIMENSION = REGISTRY.register("destroyed_dimension", () -> new DestroyedDimensionItem());
	public static final RegistryObject<Item> PINK_SLIME_BLOCK = block(DiscordModModBlocks.PINK_SLIME_BLOCK, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CASU_MARZU_WHEEL = REGISTRY.register("casu_marzu_wheel", () -> new CasuMarzuWheelItem());
	public static final RegistryObject<Item> SLIME_DIRT = block(DiscordModModBlocks.SLIME_DIRT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CASU_MARZU_ZOMBIE = REGISTRY.register("casu_marzu_zombie_spawn_egg",
			() -> new ForgeSpawnEggItem(DiscordModModEntities.CASU_MARZU_ZOMBIE, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> PINK_SLIME_ARMOUR_ARMOR_HELMET = REGISTRY.register("pink_slime_armour_armor_helmet",
			() -> new PinkSlimeArmourArmorItem.Helmet());
	public static final RegistryObject<Item> PINK_SLIME_ARMOUR_ARMOR_CHESTPLATE = REGISTRY.register("pink_slime_armour_armor_chestplate",
			() -> new PinkSlimeArmourArmorItem.Chestplate());
	public static final RegistryObject<Item> PINK_SLIME_ARMOUR_ARMOR_LEGGINGS = REGISTRY.register("pink_slime_armour_armor_leggings",
			() -> new PinkSlimeArmourArmorItem.Leggings());
	public static final RegistryObject<Item> PINK_SLIME_ARMOUR_ARMOR_BOOTS = REGISTRY.register("pink_slime_armour_armor_boots",
			() -> new PinkSlimeArmourArmorItem.Boots());
	public static final RegistryObject<Item> SLIME_DIMENSION = REGISTRY.register("slime_dimension", () -> new SlimeDimensionItem());
	public static final RegistryObject<Item> TURRET = REGISTRY.register("turret_spawn_egg",
			() -> new ForgeSpawnEggItem(DiscordModModEntities.TURRET, -5794434, -11057609, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
