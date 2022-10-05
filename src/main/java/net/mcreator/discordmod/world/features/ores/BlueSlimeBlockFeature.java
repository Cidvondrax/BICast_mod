
package net.mcreator.discordmod.world.features.ores;

public class BlueSlimeBlockFeature extends OreFeature {

	public static BlueSlimeBlockFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new BlueSlimeBlockFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("discord_mod:blue_slime_block", FEATURE,
				new OreConfiguration(BlueSlimeBlockFeatureRuleTest.INSTANCE, DiscordModModBlocks.BLUE_SLIME_BLOCK.get().defaultBlockState(), 28));
		PLACED_FEATURE = PlacementUtils.register("discord_mod:blue_slime_block", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(16), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of();

	private final Set<ResourceKey<Level>> generate_dimensions = Set
			.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("discord_mod:slime_dimension")));

	public BlueSlimeBlockFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class BlueSlimeBlockFeatureRuleTest extends RuleTest {

		static final BlueSlimeBlockFeatureRuleTest INSTANCE = new BlueSlimeBlockFeatureRuleTest();

		private static final com.mojang.serialization.Codec<BlueSlimeBlockFeatureRuleTest> CODEC = com.mojang.serialization.Codec
				.unit(() -> INSTANCE);
		private static final RuleTestType<BlueSlimeBlockFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("discord_mod:blue_slime_block_match"), CUSTOM_MATCH);
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
