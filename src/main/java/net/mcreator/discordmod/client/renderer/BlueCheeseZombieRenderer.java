
package net.mcreator.discordmod.client.renderer;

public class BlueCheeseZombieRenderer extends HumanoidMobRenderer<BlueCheeseZombieEntity, HumanoidModel<BlueCheeseZombieEntity>> {

	public BlueCheeseZombieRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(BlueCheeseZombieEntity entity) {
		return new ResourceLocation("discord_mod:textures/entities/bluezombie.png");
	}

}
