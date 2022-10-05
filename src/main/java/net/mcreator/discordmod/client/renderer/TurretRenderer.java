
package net.mcreator.discordmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.discordmod.entity.TurretEntity;
import net.mcreator.discordmod.client.model.Modelturret;

public class TurretRenderer extends MobRenderer<TurretEntity, Modelturret<TurretEntity>> {
	public TurretRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelturret(context.bakeLayer(Modelturret.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TurretEntity entity) {
		return new ResourceLocation("discord_mod:textures/entities/22134.png");
	}
}
