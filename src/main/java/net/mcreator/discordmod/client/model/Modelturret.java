package net.mcreator.discordmod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelturret<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("discord_mod", "modelturret"), "main");
	public final ModelPart group2;
	public final ModelPart group;

	public Modelturret(ModelPart root) {
		this.group2 = root.getChild("group2");
		this.group = root.getChild("group");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition group2 = partdefinition.addOrReplaceChild("group2",
				CubeListBuilder.create().texOffs(40, 0).addBox(-5.0F, -19.0F, -13.0F, 10.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(40, 42)
						.addBox(-5.0F, -14.0F, -11.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 42)
						.addBox(4.0F, -14.0F, -12.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 16)
						.addBox(-5.0F, -12.0F, -13.0F, 10.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(30, 42)
						.addBox(-8.0F, -22.0F, 6.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 40)
						.addBox(6.0F, -22.0F, 6.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 43)
						.addBox(-8.0F, -22.0F, -8.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(2, 44).mirror()
						.addBox(6.0F, -22.0F, -8.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(12, 20)
						.addBox(-3.0F, -16.0F, -10.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 42)
						.addBox(-5.0F, -17.0F, -11.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 42)
						.addBox(4.0F, -17.0F, -12.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 0)
						.addBox(-7.0F, -21.0F, -7.0F, 14.0F, 12.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.0F, 16.0F, 8.0F));
		PartDefinition group = partdefinition.addOrReplaceChild("group",
				CubeListBuilder.create().texOffs(10, 34).addBox(-3.0F, -9.0F, -1.0F, 6.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 36)
						.addBox(-1.0F, -9.0F, -3.0F, 2.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-8.0F, 6.0F, -8.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(10, 0).mirror()
						.addBox(-5.0F, 3.0F, -5.0F, 10.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-8.0F, 16.0F, 8.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		group2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.group2.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.group2.xRot = headPitch / (180F / (float) Math.PI);
	}
}
