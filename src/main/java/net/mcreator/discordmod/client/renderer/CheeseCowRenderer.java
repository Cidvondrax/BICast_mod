
package net.mcreator.discordmod.client.renderer;

public class CheeseCowRenderer extends MobRenderer<CheeseCowEntity, CowModel<CheeseCowEntity>> {

	public CheeseCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(CheeseCowEntity entity) {
		return new ResourceLocation("discord_mod:textures/entities/cheese_cow.png");
	}

}
