
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.discordmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.discordmod.world.biome.SwissWasteLandBiome;
import net.mcreator.discordmod.world.biome.DerbyBiomeBiome;
import net.mcreator.discordmod.DiscordModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DiscordModModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, DiscordModMod.MODID);
	public static final RegistryObject<Biome> SWISS_WASTE_LAND = REGISTRY.register("swiss_waste_land", () -> SwissWasteLandBiome.createBiome());
	public static final RegistryObject<Biome> DERBY_BIOME = REGISTRY.register("derby_biome", () -> DerbyBiomeBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SwissWasteLandBiome.init();
			DerbyBiomeBiome.init();
		});
	}
}
