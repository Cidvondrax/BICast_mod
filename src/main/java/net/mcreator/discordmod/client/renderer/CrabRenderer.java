
package net.mcreator.discordmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.discordmod.entity.CrabEntity;

public class CrabRenderer extends HumanoidMobRenderer<CrabEntity, HumanoidModel<CrabEntity>> {
	public CrabRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
		this.addLayer(new EyesLayer<CrabEntity, HumanoidModel<CrabEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("discord_mod:textures/entities/418036760ff5d603.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CrabEntity entity) {
		return new ResourceLocation("discord_mod:textures/entities/418036760ff5d603.png");
	}
}
