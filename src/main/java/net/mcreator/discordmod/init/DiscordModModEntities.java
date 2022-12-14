
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

import net.mcreator.discordmod.entity.TurretEntityProjectile;
import net.mcreator.discordmod.entity.TurretEntity;
import net.mcreator.discordmod.entity.MuensterMozzarellaTraderEntity;
import net.mcreator.discordmod.entity.MozzarellaCheddarTraderEntity;
import net.mcreator.discordmod.entity.IrongolemtestEntity;
import net.mcreator.discordmod.entity.GorillaEntityProjectile;
import net.mcreator.discordmod.entity.GorillaEntity;
import net.mcreator.discordmod.entity.CrabEntityProjectile;
import net.mcreator.discordmod.entity.CrabEntity;
import net.mcreator.discordmod.entity.CheeseCowEntity;
import net.mcreator.discordmod.entity.CheddarSwissTraderEntity;
import net.mcreator.discordmod.entity.CasuMarzuZombieEntity;
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
			EntityType.Builder.<BlueCheeseZombieEntity>of(BlueCheeseZombieEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueCheeseZombieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CheeseCowEntity>> CHEESE_COW = register("cheese_cow",
			EntityType.Builder.<CheeseCowEntity>of(CheeseCowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CheeseCowEntity::new)

					.sized(0.9f, 1.4f));
	public static final RegistryObject<EntityType<IrongolemtestEntity>> IRONGOLEMTEST = register("irongolemtest",
			EntityType.Builder.<IrongolemtestEntity>of(IrongolemtestEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IrongolemtestEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CasuMarzuZombieEntity>> CASU_MARZU_ZOMBIE = register("casu_marzu_zombie",
			EntityType.Builder.<CasuMarzuZombieEntity>of(CasuMarzuZombieEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CasuMarzuZombieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MozzarellaCheddarTraderEntity>> MOZZARELLA_CHEDDAR_TRADER = register("mozzarella_cheddar_trader",
			EntityType.Builder.<MozzarellaCheddarTraderEntity>of(MozzarellaCheddarTraderEntity::new, MobCategory.CREATURE)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MozzarellaCheddarTraderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TurretEntity>> TURRET = register("turret",
			EntityType.Builder.<TurretEntity>of(TurretEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(TurretEntity::new)

					.sized(1.5f, 2f));
	public static final RegistryObject<EntityType<TurretEntityProjectile>> TURRET_PROJECTILE = register("projectile_turret",
			EntityType.Builder.<TurretEntityProjectile>of(TurretEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(TurretEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CheddarSwissTraderEntity>> CHEDDAR_SWISS_TRADER = register("cheddar_swiss_trader",
			EntityType.Builder.<CheddarSwissTraderEntity>of(CheddarSwissTraderEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CheddarSwissTraderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MuensterMozzarellaTraderEntity>> MUENSTER_MOZZARELLA_TRADER = register("muenster_mozzarella_trader",
			EntityType.Builder.<MuensterMozzarellaTraderEntity>of(MuensterMozzarellaTraderEntity::new, MobCategory.CREATURE)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MuensterMozzarellaTraderEntity::new)

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
			CheeseCowEntity.init();
			IrongolemtestEntity.init();
			CasuMarzuZombieEntity.init();
			MozzarellaCheddarTraderEntity.init();
			TurretEntity.init();
			CheddarSwissTraderEntity.init();
			MuensterMozzarellaTraderEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CRAB.get(), CrabEntity.createAttributes().build());
		event.put(GORILLA.get(), GorillaEntity.createAttributes().build());
		event.put(BLUE_CHEESE_ZOMBIE.get(), BlueCheeseZombieEntity.createAttributes().build());
		event.put(CHEESE_COW.get(), CheeseCowEntity.createAttributes().build());
		event.put(IRONGOLEMTEST.get(), IrongolemtestEntity.createAttributes().build());
		event.put(CASU_MARZU_ZOMBIE.get(), CasuMarzuZombieEntity.createAttributes().build());
		event.put(MOZZARELLA_CHEDDAR_TRADER.get(), MozzarellaCheddarTraderEntity.createAttributes().build());
		event.put(TURRET.get(), TurretEntity.createAttributes().build());
		event.put(CHEDDAR_SWISS_TRADER.get(), CheddarSwissTraderEntity.createAttributes().build());
		event.put(MUENSTER_MOZZARELLA_TRADER.get(), MuensterMozzarellaTraderEntity.createAttributes().build());
	}
}
