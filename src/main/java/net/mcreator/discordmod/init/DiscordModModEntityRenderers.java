
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.discordmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.discordmod.client.renderer.GorillaRenderer;
import net.mcreator.discordmod.client.renderer.CrabRenderer;
import net.mcreator.discordmod.client.renderer.BlueCheeseZombieRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DiscordModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DiscordModModEntities.CRAB.get(), CrabRenderer::new);
		event.registerEntityRenderer(DiscordModModEntities.CRAB_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DiscordModModEntities.GORILLA.get(), GorillaRenderer::new);
		event.registerEntityRenderer(DiscordModModEntities.GORILLA_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DiscordModModEntities.BLUE_CHEESE_ZOMBIE.get(), BlueCheeseZombieRenderer::new);
	}
}
