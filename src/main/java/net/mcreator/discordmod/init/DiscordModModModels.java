
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.discordmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.discordmod.client.model.Modelturret;
import net.mcreator.discordmod.client.model.ModelIronGolemModel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DiscordModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelIronGolemModel.LAYER_LOCATION, ModelIronGolemModel::createBodyLayer);
		event.registerLayerDefinition(Modelturret.LAYER_LOCATION, Modelturret::createBodyLayer);
	}
}
