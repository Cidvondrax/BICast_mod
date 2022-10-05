
package net.mcreator.discordmod.world.dimension;

@Mod.EventBusSubscriber
public class CheesyDimensionDimension {

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Fixers {

		@SubscribeEvent
		public static void registerFillerBlocks(FMLCommonSetupEvent event) {
			Set<Block> replaceableBlocks = new HashSet<>();
			replaceableBlocks.add(DiscordModModBlocks.CHHURPISTONE.get());

			replaceableBlocks.add(DiscordModModBlocks.DERBY_CHEESE_BLOCK.get());
			replaceableBlocks.add(DiscordModModBlocks.PINK_DERBY_BLOCK.get());
			replaceableBlocks.add(DiscordModModBlocks.PINK_DERBY_BLOCK.get());
			replaceableBlocks.add(DiscordModModBlocks.PINK_DERBY_BLOCK.get());
			replaceableBlocks.add(DiscordModModBlocks.SWISS_CHEESE_BLOCK.get());
			replaceableBlocks.add(DiscordModModBlocks.SWISS_CHEESE_BLOCK.get());
			replaceableBlocks.add(DiscordModModBlocks.DERBY_CHEESE_BLOCK.get());
			replaceableBlocks.add(DiscordModModBlocks.PINK_DERBY_BLOCK.get());

			event.enqueueWork(() -> {
				WorldCarver.CAVE.replaceableBlocks = new ImmutableSet.Builder<Block>().addAll(WorldCarver.CAVE.replaceableBlocks)
						.addAll(replaceableBlocks).build();

				WorldCarver.CANYON.replaceableBlocks = new ImmutableSet.Builder<Block>().addAll(WorldCarver.CANYON.replaceableBlocks)
						.addAll(replaceableBlocks).build();
			});
		}

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void registerDimensionSpecialEffects(FMLClientSetupEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(128, true, DimensionSpecialEffects.SkyType.NORMAL, false, false) {

				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return new Vec3(1, 0.952941176471, 0.803921568627);
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return false;
				}

			};

			event.enqueueWork(() -> DimensionSpecialEffects.EFFECTS.put(new ResourceLocation("discord_mod:cheesy_dimension"), customEffect));
		}

	}

}
