
package net.mcreator.discordmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.discordmod.entity.CheeseCowEntity;

public class CheeseCowRenderer extends MobRenderer<CheeseCowEntity, CowModel<CheeseCowEntity>> {
	public CheeseCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CheeseCowEntity entity) {
		return new ResourceLocation("discord_mod:textures/entities/cheese_cow.png");
	}
}
