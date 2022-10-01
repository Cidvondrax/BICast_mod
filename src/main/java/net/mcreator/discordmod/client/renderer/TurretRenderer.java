
package net.mcreator.discordmod.client.renderer;

public class TurretRenderer extends MobRenderer<TurretEntity, Modelturret<TurretEntity>> {

	public TurretRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelturret(context.bakeLayer(Modelturret.LAYER_LOCATION)), 1f);

	}

	@Override
	public ResourceLocation getTextureLocation(TurretEntity entity) {
		return new ResourceLocation("discord_mod:textures/entities/22134.png");
	}

}
