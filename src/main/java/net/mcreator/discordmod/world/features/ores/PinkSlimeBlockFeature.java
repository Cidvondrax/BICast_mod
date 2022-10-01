
package net.mcreator.discordmod.world.features.ores;

public class PinkSlimeBlockFeature extends OreFeature {

	public static PinkSlimeBlockFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new PinkSlimeBlockFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("discord_mod:pink_slime_block", FEATURE,
				new OreConfiguration(PinkSlimeBlockFeatureRuleTest.INSTANCE, DiscordModModBlocks.PINK_SLIME_BLOCK.get().defaultBlockState(), 16));
		PLACED_FEATURE = PlacementUtils.register("discord_mod:pink_slime_block", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(10), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("discord_mod:slime_biome"));

	private final Set<ResourceKey<Level>> generate_dimensions = Set
			.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("discord_mod:deleted_mod_element")));

	public PinkSlimeBlockFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class PinkSlimeBlockFeatureRuleTest extends RuleTest {

		static final PinkSlimeBlockFeatureRuleTest INSTANCE = new PinkSlimeBlockFeatureRuleTest();

		private static final com.mojang.serialization.Codec<PinkSlimeBlockFeatureRuleTest> CODEC = com.mojang.serialization.Codec
				.unit(() -> INSTANCE);
		private static final RuleTestType<PinkSlimeBlockFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("discord_mod:pink_slime_block_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(DiscordModModBlocks.SLIME_GRASS.get(), DiscordModModBlocks.SLIME_DIRT.get());
			}

			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
