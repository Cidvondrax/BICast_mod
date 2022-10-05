
package net.mcreator.discordmod.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class TurretEntityProjectile extends AbstractArrow implements ItemSupplier {

	public TurretEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(DiscordModModEntities.TURRET_PROJECTILE.get(), world);
	}

	public TurretEntityProjectile(EntityType<? extends TurretEntityProjectile> type, Level world) {
		super(type, world);
	}

	public TurretEntityProjectile(EntityType<? extends TurretEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public TurretEntityProjectile(EntityType<? extends TurretEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Items.GHAST_TEAR);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Items.GHAST_TEAR);
	}
}
