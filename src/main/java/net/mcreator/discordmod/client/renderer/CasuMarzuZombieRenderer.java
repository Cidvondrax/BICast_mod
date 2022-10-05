
package net.mcreator.discordmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.discordmod.entity.CasuMarzuZombieEntity;

public class CasuMarzuZombieRenderer extends HumanoidMobRenderer<CasuMarzuZombieEntity, HumanoidModel<CasuMarzuZombieEntity>> {
	public CasuMarzuZombieRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(CasuMarzuZombieEntity entity) {
		return new ResourceLocation("discord_mod:textures/entities/casu_marzu_zombie.png");
	}
}
