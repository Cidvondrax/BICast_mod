
package net.mcreator.discordmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.discordmod.entity.FEntity;

public class FRenderer extends MobRenderer<FEntity, CowModel<FEntity>> {
	public FRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FEntity entity) {
		return new ResourceLocation("discord_mod:textures/entities/2020_07_01_gorilla-14721546.png");
	}
}
