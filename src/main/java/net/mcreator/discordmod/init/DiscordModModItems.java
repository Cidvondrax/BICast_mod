
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
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.discordmod.item.SlimeArmorArmorItem;
import net.mcreator.discordmod.item.RennetItem;
import net.mcreator.discordmod.item.MuenstercheesedimensionItem;
import net.mcreator.discordmod.item.MozzarellaBallItem;
import net.mcreator.discordmod.item.GelSwordItem;
import net.mcreator.discordmod.item.CurdItem;
import net.mcreator.discordmod.item.BluecheeseItem;
import net.mcreator.discordmod.DiscordModMod;

public class DiscordModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DiscordModMod.MODID);
	public static final RegistryObject<Item> COCONUJPEG = block(DiscordModModBlocks.COCONUJPEG, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CRAB = REGISTRY.register("crab_spawn_egg",
			() -> new ForgeSpawnEggItem(DiscordModModEntities.CRAB, -3407872, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> GORILLA = REGISTRY.register("gorilla_spawn_egg",
			() -> new ForgeSpawnEggItem(DiscordModModEntities.GORILLA, -13426407, -15396848, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CHEESEBLACKONE = block(DiscordModModBlocks.CHEESEBLACKONE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SWISS_CHEESE_BLOCK = block(DiscordModModBlocks.SWISS_CHEESE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> KRAFT = block(DiscordModModBlocks.KRAFT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MONSTER_CHEESE = block(DiscordModModBlocks.MONSTER_CHEESE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BLUECHEESE_BUCKET = REGISTRY.register("bluecheese_bucket", () -> new BluecheeseItem());
	public static final RegistryObject<Item> CHEESEDOOR = doubleBlock(DiscordModModBlocks.CHEESEDOOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MUENSTERCHEESEDIMENSION = REGISTRY.register("muenstercheesedimension",
			() -> new MuenstercheesedimensionItem());
	public static final RegistryObject<Item> AZTEC_BRICK = block(DiscordModModBlocks.AZTEC_BRICK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AZTEC_SMOOTH_STONE = block(DiscordModModBlocks.AZTEC_SMOOTH_STONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RENNET = REGISTRY.register("rennet", () -> new RennetItem());
	public static final RegistryObject<Item> SLIME_GRASS = block(DiscordModModBlocks.SLIME_GRASS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CURD = REGISTRY.register("curd", () -> new CurdItem());
	public static final RegistryObject<Item> MOZZARELLA_BALL = REGISTRY.register("mozzarella_ball", () -> new MozzarellaBallItem());
	public static final RegistryObject<Item> MOZZARELLA_BLOCK = block(DiscordModModBlocks.MOZZARELLA_BLOCK, CreativeModeTab.TAB_FOOD);
	public static final RegistryObject<Item> BLUECHEESEBLOCK = block(DiscordModModBlocks.BLUECHEESEBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MUENSTER_CHEESE_WOOD = block(DiscordModModBlocks.MUENSTER_CHEESE_WOOD,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MUENSTER_CHEESE_LOG = block(DiscordModModBlocks.MUENSTER_CHEESE_LOG,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MUENSTER_CHEESE_PLANKS = block(DiscordModModBlocks.MUENSTER_CHEESE_PLANKS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MUENSTER_CHEESE_LEAVES = block(DiscordModModBlocks.MUENSTER_CHEESE_LEAVES,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MUENSTER_CHEESE_STAIRS = block(DiscordModModBlocks.MUENSTER_CHEESE_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MUENSTER_CHEESE_SLAB = block(DiscordModModBlocks.MUENSTER_CHEESE_SLAB,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MUENSTER_CHEESE_FENCE = block(DiscordModModBlocks.MUENSTER_CHEESE_FENCE,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MUENSTER_CHEESE_FENCE_GATE = block(DiscordModModBlocks.MUENSTER_CHEESE_FENCE_GATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> MUENSTER_CHEESE_PRESSURE_PLATE = block(DiscordModModBlocks.MUENSTER_CHEESE_PRESSURE_PLATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> MUENSTER_CHEESE_BUTTON = block(DiscordModModBlocks.MUENSTER_CHEESE_BUTTON,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GEL_SWORD = REGISTRY.register("gel_sword", () -> new GelSwordItem());
	public static final RegistryObject<Item> SLIME_ARMOR_ARMOR_HELMET = REGISTRY.register("slime_armor_armor_helmet",
			() -> new SlimeArmorArmorItem.Helmet());
	public static final RegistryObject<Item> SLIME_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("slime_armor_armor_chestplate",
			() -> new SlimeArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> SLIME_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("slime_armor_armor_leggings",
			() -> new SlimeArmorArmorItem.Leggings());
	public static final RegistryObject<Item> SLIME_ARMOR_ARMOR_BOOTS = REGISTRY.register("slime_armor_armor_boots",
			() -> new SlimeArmorArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
