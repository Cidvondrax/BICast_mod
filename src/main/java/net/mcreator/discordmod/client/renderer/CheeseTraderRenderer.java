
package net.mcreator.discordmod.client.renderer;

public class CheeseTraderRenderer extends HumanoidMobRenderer<CheeseTraderEntity, HumanoidModel<CheeseTraderEntity>> {

	public CheeseTraderRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(CheeseTraderEntity entity) {
		return new ResourceLocation("discord_mod:textures/entities/609aa44a1bab81527b50505f9fca6ed837bf1eb1.png");
	}

}
