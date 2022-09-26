
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.discordmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.discordmod.fluid.NachoCheeseFluid;
import net.mcreator.discordmod.DiscordModMod;

public class DiscordModModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, DiscordModMod.MODID);
	public static final RegistryObject<Fluid> NACHO_CHEESE = REGISTRY.register("nacho_cheese", () -> new NachoCheeseFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_NACHO_CHEESE = REGISTRY.register("flowing_nacho_cheese", () -> new NachoCheeseFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(NACHO_CHEESE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_NACHO_CHEESE.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
