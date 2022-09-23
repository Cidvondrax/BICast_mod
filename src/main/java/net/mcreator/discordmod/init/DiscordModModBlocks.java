
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.discordmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.discordmod.block.SlimeGrassBlock;
import net.mcreator.discordmod.block.MuenstercheesedimensionPortalBlock;
import net.mcreator.discordmod.block.MozzarellaBlockBlock;
import net.mcreator.discordmod.block.MonsterCheeseBlock;
import net.mcreator.discordmod.block.KraftBlock;
import net.mcreator.discordmod.block.CoconujpegBlock;
import net.mcreator.discordmod.block.CheesedoorBlock;
import net.mcreator.discordmod.block.CheeseblockstwoBlock;
import net.mcreator.discordmod.block.CheeseblackoneBlock;
import net.mcreator.discordmod.block.BluecheeseBlock;
import net.mcreator.discordmod.block.BLUECHEESEBLOCKBlock;
import net.mcreator.discordmod.block.AztecSmoothStoneBlock;
import net.mcreator.discordmod.block.AztecBrickBlock;
import net.mcreator.discordmod.DiscordModMod;

public class DiscordModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DiscordModMod.MODID);
	public static final RegistryObject<Block> COCONUJPEG = REGISTRY.register("coconujpeg", () -> new CoconujpegBlock());
	public static final RegistryObject<Block> CHEESEBLACKONE = REGISTRY.register("cheeseblackone", () -> new CheeseblackoneBlock());
	public static final RegistryObject<Block> SWISS_CHEESE_BLOCK = REGISTRY.register("swiss_cheese_block", () -> new CheeseblockstwoBlock());
	public static final RegistryObject<Block> KRAFT = REGISTRY.register("kraft", () -> new KraftBlock());
	public static final RegistryObject<Block> MONSTER_CHEESE = REGISTRY.register("monster_cheese", () -> new MonsterCheeseBlock());
	public static final RegistryObject<Block> BLUECHEESE = REGISTRY.register("bluecheese", () -> new BluecheeseBlock());
	public static final RegistryObject<Block> CHEESEDOOR = REGISTRY.register("cheesedoor", () -> new CheesedoorBlock());
	public static final RegistryObject<Block> MUENSTERCHEESEDIMENSION_PORTAL = REGISTRY.register("muenstercheesedimension_portal",
			() -> new MuenstercheesedimensionPortalBlock());
	public static final RegistryObject<Block> AZTEC_BRICK = REGISTRY.register("aztec_brick", () -> new AztecBrickBlock());
	public static final RegistryObject<Block> AZTEC_SMOOTH_STONE = REGISTRY.register("aztec_smooth_stone", () -> new AztecSmoothStoneBlock());
	public static final RegistryObject<Block> SLIME_GRASS = REGISTRY.register("slime_grass", () -> new SlimeGrassBlock());
	public static final RegistryObject<Block> MOZZARELLA_BLOCK = REGISTRY.register("mozzarella_block", () -> new MozzarellaBlockBlock());
	public static final RegistryObject<Block> BLUECHEESEBLOCK = REGISTRY.register("bluecheeseblock", () -> new BLUECHEESEBLOCKBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CheesedoorBlock.registerRenderLayer();
		}
	}
}
