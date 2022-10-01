
package net.mcreator.discordmod.world.features.ores;

public class SlimeOreFeature extends OreFeature {

	public static SlimeOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new SlimeOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("discord_mod:slime_ore", FEATURE,
				new OreConfiguration(SlimeOreFeatureRuleTest.INSTANCE, DiscordModModBlocks.SLIME_ORE.get().defaultBlockState(), 7));
		PLACED_FEATURE = PlacementUtils.register("discord_mod:slime_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(11), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(1), VerticalAnchor.absolute(63)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public SlimeOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class SlimeOreFeatureRuleTest extends RuleTest {

		static final SlimeOreFeatureRuleTest INSTANCE = new SlimeOreFeatureRuleTest();

		private static final com.mojang.serialization.Codec<SlimeOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<SlimeOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("discord_mod:slime_ore_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.STONE);
			}

			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
