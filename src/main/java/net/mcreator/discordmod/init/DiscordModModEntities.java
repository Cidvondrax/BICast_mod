
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.discordmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.discordmod.entity.GorillaEntityProjectile;
import net.mcreator.discordmod.entity.GorillaEntity;
import net.mcreator.discordmod.entity.CrabEntityProjectile;
import net.mcreator.discordmod.entity.CrabEntity;
import net.mcreator.discordmod.entity.BlueCheeseZombieEntity;
import net.mcreator.discordmod.DiscordModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DiscordModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, DiscordModMod.MODID);
	public static final RegistryObject<EntityType<CrabEntity>> CRAB = register("crab",
			EntityType.Builder.<CrabEntity>of(CrabEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(CrabEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CrabEntityProjectile>> CRAB_PROJECTILE = register("projectile_crab",
			EntityType.Builder.<CrabEntityProjectile>of(CrabEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(CrabEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GorillaEntity>> GORILLA = register("gorilla",
			EntityType.Builder.<GorillaEntity>of(GorillaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GorillaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GorillaEntityProjectile>> GORILLA_PROJECTILE = register("projectile_gorilla",
			EntityType.Builder.<GorillaEntityProjectile>of(GorillaEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(GorillaEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlueCheeseZombieEntity>> BLUE_CHEESE_ZOMBIE = register("blue_cheese_zombie",
			EntityType.Builder.<BlueCheeseZombieEntity>of(BlueCheeseZombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueCheeseZombieEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CrabEntity.init();
			GorillaEntity.init();
			BlueCheeseZombieEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CRAB.get(), CrabEntity.createAttributes().build());
		event.put(GORILLA.get(), GorillaEntity.createAttributes().build());
		event.put(BLUE_CHEESE_ZOMBIE.get(), BlueCheeseZombieEntity.createAttributes().build());
	}
}
