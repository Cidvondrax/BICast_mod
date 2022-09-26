
package net.mcreator.discordmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.discordmod.entity.IrongolemtestEntity;
import net.mcreator.discordmod.client.model.ModelIronGolemModel;

public class IrongolemtestRenderer extends MobRenderer<IrongolemtestEntity, ModelIronGolemModel<IrongolemtestEntity>> {
	public IrongolemtestRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelIronGolemModel(context.bakeLayer(ModelIronGolemModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IrongolemtestEntity entity) {
		return new ResourceLocation("discord_mod:textures/entities/iron_golem.png");
	}
}
