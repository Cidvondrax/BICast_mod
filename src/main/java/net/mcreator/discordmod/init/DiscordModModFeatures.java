
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.discordmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.discordmod.world.features.ores.SlimeOreFeature;
import net.mcreator.discordmod.world.features.ores.PinkSlimeBlockFeature;
import net.mcreator.discordmod.world.features.ores.CoconujpegFeature;
import net.mcreator.discordmod.world.features.ores.BlueSlimeBlockFeature;
import net.mcreator.discordmod.world.features.RuinType1Feature;
import net.mcreator.discordmod.DiscordModMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class DiscordModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, DiscordModMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> COCONUJPEG = register("coconujpeg", CoconujpegFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CoconujpegFeature.GENERATE_BIOMES, CoconujpegFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BLUE_SLIME_BLOCK = register("blue_slime_block", BlueSlimeBlockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BlueSlimeBlockFeature.GENERATE_BIOMES,
					BlueSlimeBlockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PINK_SLIME_BLOCK = register("pink_slime_block", PinkSlimeBlockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PinkSlimeBlockFeature.GENERATE_BIOMES,
					PinkSlimeBlockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SLIME_ORE = register("slime_ore", SlimeOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SlimeOreFeature.GENERATE_BIOMES, SlimeOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUIN_TYPE_1 = register("ruin_type_1", RuinType1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, RuinType1Feature.GENERATE_BIOMES, RuinType1Feature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
