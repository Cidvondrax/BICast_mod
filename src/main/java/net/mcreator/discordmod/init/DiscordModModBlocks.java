
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.discordmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.discordmod.block.SwissCheeseBlockBlock;
import net.mcreator.discordmod.block.SlimeGrassBlock;
import net.mcreator.discordmod.block.RubbleBlockBlock;
import net.mcreator.discordmod.block.MuensterCheeseWoodBlock;
import net.mcreator.discordmod.block.MuensterCheeseStairsBlock;
import net.mcreator.discordmod.block.MuensterCheeseSlabBlock;
import net.mcreator.discordmod.block.MuensterCheesePressurePlateBlock;
import net.mcreator.discordmod.block.MuensterCheesePlanksBlock;
import net.mcreator.discordmod.block.MuensterCheeseLogBlock;
import net.mcreator.discordmod.block.MuensterCheeseLeavesBlock;
import net.mcreator.discordmod.block.MuensterCheeseFenceGateBlock;
import net.mcreator.discordmod.block.MuensterCheeseFenceBlock;
import net.mcreator.discordmod.block.MuensterCheeseButtonBlock;
import net.mcreator.discordmod.block.MozzarellaBlockBlock;
import net.mcreator.discordmod.block.DerbyCheeseBlockBlock;
import net.mcreator.discordmod.block.CoconujpegBlock;
import net.mcreator.discordmod.block.CheesyDimensionPortalBlock;
import net.mcreator.discordmod.block.CheeseblackoneBlock;
import net.mcreator.discordmod.block.BLUECHEESEBLOCKBlock;
import net.mcreator.discordmod.block.AztecSmoothStoneBlock;
import net.mcreator.discordmod.block.AztecBrickBlock;
import net.mcreator.discordmod.DiscordModMod;

public class DiscordModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DiscordModMod.MODID);
	public static final RegistryObject<Block> COCONUJPEG = REGISTRY.register("coconujpeg", () -> new CoconujpegBlock());
	public static final RegistryObject<Block> CHEESEBLACKONE = REGISTRY.register("cheeseblackone", () -> new CheeseblackoneBlock());
	public static final RegistryObject<Block> AZTEC_BRICK = REGISTRY.register("aztec_brick", () -> new AztecBrickBlock());
	public static final RegistryObject<Block> AZTEC_SMOOTH_STONE = REGISTRY.register("aztec_smooth_stone", () -> new AztecSmoothStoneBlock());
	public static final RegistryObject<Block> SLIME_GRASS = REGISTRY.register("slime_grass", () -> new SlimeGrassBlock());
	public static final RegistryObject<Block> MOZZARELLA_BLOCK = REGISTRY.register("mozzarella_block", () -> new MozzarellaBlockBlock());
	public static final RegistryObject<Block> BLUECHEESEBLOCK = REGISTRY.register("bluecheeseblock", () -> new BLUECHEESEBLOCKBlock());
	public static final RegistryObject<Block> MUENSTER_CHEESE_WOOD = REGISTRY.register("muenster_cheese_wood", () -> new MuensterCheeseWoodBlock());
	public static final RegistryObject<Block> MUENSTER_CHEESE_LOG = REGISTRY.register("muenster_cheese_log", () -> new MuensterCheeseLogBlock());
	public static final RegistryObject<Block> MUENSTER_CHEESE_PLANKS = REGISTRY.register("muenster_cheese_planks",
			() -> new MuensterCheesePlanksBlock());
	public static final RegistryObject<Block> MUENSTER_CHEESE_LEAVES = REGISTRY.register("muenster_cheese_leaves",
			() -> new MuensterCheeseLeavesBlock());
	public static final RegistryObject<Block> MUENSTER_CHEESE_STAIRS = REGISTRY.register("muenster_cheese_stairs",
			() -> new MuensterCheeseStairsBlock());
	public static final RegistryObject<Block> MUENSTER_CHEESE_SLAB = REGISTRY.register("muenster_cheese_slab", () -> new MuensterCheeseSlabBlock());
	public static final RegistryObject<Block> MUENSTER_CHEESE_FENCE = REGISTRY.register("muenster_cheese_fence",
			() -> new MuensterCheeseFenceBlock());
	public static final RegistryObject<Block> MUENSTER_CHEESE_FENCE_GATE = REGISTRY.register("muenster_cheese_fence_gate",
			() -> new MuensterCheeseFenceGateBlock());
	public static final RegistryObject<Block> MUENSTER_CHEESE_PRESSURE_PLATE = REGISTRY.register("muenster_cheese_pressure_plate",
			() -> new MuensterCheesePressurePlateBlock());
	public static final RegistryObject<Block> MUENSTER_CHEESE_BUTTON = REGISTRY.register("muenster_cheese_button",
			() -> new MuensterCheeseButtonBlock());
	public static final RegistryObject<Block> CHEESY_DIMENSION_PORTAL = REGISTRY.register("cheesy_dimension_portal",
			() -> new CheesyDimensionPortalBlock());
	public static final RegistryObject<Block> SWISS_CHEESE_BLOCK = REGISTRY.register("swiss_cheese_block", () -> new SwissCheeseBlockBlock());
	public static final RegistryObject<Block> DERBY_CHEESE_BLOCK = REGISTRY.register("derby_cheese_block", () -> new DerbyCheeseBlockBlock());
	public static final RegistryObject<Block> RUBBLE_BLOCK = REGISTRY.register("rubble_block", () -> new RubbleBlockBlock());
}
