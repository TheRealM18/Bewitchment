package com.bewitchment.client.model.entity.spirit.demon;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * demoness2 - cybercat5555
 * Created using Tabula 5.1.0
 */
@SuppressWarnings("WeakerAccess")
public class ModelDemoness extends ModelBiped {
	public final ModelRenderer bipedBody;
	public final ModelRenderer tail00;
	public final ModelRenderer leftWing00;
	public final ModelRenderer rightWing00;
	public final ModelRenderer boobs;
	public final ModelRenderer bipedHead;
	public final ModelRenderer bipedLeftArm;
	public final ModelRenderer bipedRightArm;
	public final ModelRenderer lowerbipedBody;
	public final ModelRenderer bipedLeftLeg;
	public final ModelRenderer bipedRightLeg;
	public final ModelRenderer tail01;
	public final ModelRenderer tail02;
	public final ModelRenderer tail03;
	public final ModelRenderer tail04;
	public final ModelRenderer tail05;
	public final ModelRenderer tail06;
	public final ModelRenderer leftWing01;
	public final ModelRenderer leftWing02;
	public final ModelRenderer leftWingMembrane;
	public final ModelRenderer leftWing03;
	public final ModelRenderer rightWing01;
	public final ModelRenderer rightWing02;
	public final ModelRenderer rightWingMembrane;
	public final ModelRenderer rightWing03;
	public final ModelRenderer leftHorn00;
	public final ModelRenderer rightHorn00;
	public final ModelRenderer hair00;
	public final ModelRenderer hair01;
	public final ModelRenderer leftHorn01a;
	public final ModelRenderer leftHorn01b;
	public final ModelRenderer leftHorn01c;
	public final ModelRenderer leftHorn01d;
	public final ModelRenderer leftHorn02a;
	public final ModelRenderer leftHorn02b;
	public final ModelRenderer leftHorn02c;
	public final ModelRenderer leftHorn02d;
	public final ModelRenderer leftHorn03;
	public final ModelRenderer leftHorn04;
	public final ModelRenderer rightHorn01a;
	public final ModelRenderer rightHorn01b;
	public final ModelRenderer rightHorn01c;
	public final ModelRenderer rightHorn01d;
	public final ModelRenderer rightHorn02a;
	public final ModelRenderer rightHorn02b;
	public final ModelRenderer rightHorn02c;
	public final ModelRenderer rightHorn02d;
	public final ModelRenderer rightHorn03;
	public final ModelRenderer rightHorn04;
	public final ModelRenderer loincloth00;
	public final ModelRenderer loincloth01;
	public final ModelRenderer leftLeg01;
	public final ModelRenderer leftLeg02;
	public final ModelRenderer leftHoof;
	public final ModelRenderer rightLeg01;
	public final ModelRenderer rightLeg02;
	public final ModelRenderer rightHoof;
	
	public ModelDemoness() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.tail02 = new ModelRenderer(this, 15, 45);
		this.tail02.setRotationPoint(0, 0, 2.9f);
		this.tail02.addBox(-0.5f, -0.5f, 0, 1, 1, 5, 0);
		this.setRotateAngle(tail02, 0.07f, 0, 0);
		this.rightHorn02b = new ModelRenderer(this, 0, 4);
		this.rightHorn02b.mirror = true;
		this.rightHorn02b.setRotationPoint(0, 0, 0);
		this.rightHorn02b.addBox(-0.3f, -2, -0.7f, 1, 2, 1, 0);
		this.rightWing00 = new ModelRenderer(this, 26, 38);
		this.rightWing00.mirror = true;
		this.rightWing00.setRotationPoint(-2.5f, 3.2f, 1.4f);
		this.rightWing00.addBox(-1, -1.5f, 0, 2, 3, 5, 0);
		this.setRotateAngle(rightWing00, 0.27f, -0.52f, 0);
		this.loincloth00 = new ModelRenderer(this, 48, 0);
		this.loincloth00.setRotationPoint(0, 4.6f, -1.9f);
		this.loincloth00.addBox(-3, 0, -0.5f, 6, 8, 1, 0);
		this.setRotateAngle(loincloth00, -0.23f, 0, 0);
		this.tail03 = new ModelRenderer(this, 15, 45);
		this.tail03.setRotationPoint(0, 0, 4.9f);
		this.tail03.addBox(-0.5f, -0.5f, 0, 1, 1, 5, 0);
		this.setRotateAngle(tail03, 0.14f, 0, 0);
		this.rightWing02 = new ModelRenderer(this, 29, 54);
		this.rightWing02.mirror = true;
		this.rightWing02.setRotationPoint(-0.1f, -0.5f, 7.1f);
		this.rightWing02.addBox(-1, 0, -1, 2, 8, 2, 0);
		this.setRotateAngle(rightWing02, 0.21f, 0, 0);
		this.bipedBody = new ModelRenderer(this, 19, 17);
		this.bipedBody.setRotationPoint(0, -6, 0);
		this.bipedBody.addBox(-4, 0, -2, 8, 6, 4, 0);
		this.rightHorn01d = new ModelRenderer(this, 0, 4);
		this.rightHorn01d.mirror = true;
		this.rightHorn01d.setRotationPoint(0, 0, 0);
		this.rightHorn01d.addBox(-0.2f, -2, -0.2f, 1, 2, 1, 0);
		this.lowerbipedBody = new ModelRenderer(this, 19, 27);
		this.lowerbipedBody.setRotationPoint(0, 6, 0);
		this.lowerbipedBody.addBox(-3.5f, 0, -2, 7, 7, 4, 0);
		this.leftHorn02d = new ModelRenderer(this, 0, 4);
		this.leftHorn02d.setRotationPoint(0, 0, 0);
		this.leftHorn02d.addBox(-0.3f, -2, -0.3f, 1, 2, 1, 0);
		this.hair01 = new ModelRenderer(this, 25, 0);
		this.hair01.mirror = true;
		this.hair01.setRotationPoint(0, -6.9f, 3.2f);
		this.hair01.addBox(-4, 0, -0.1f, 8, 8, 1, 0);
		this.setRotateAngle(hair01, 0.35f, 0, 0);
		this.leftHorn04 = new ModelRenderer(this, 43, 0);
		this.leftHorn04.setRotationPoint(0, -2.7f, 0);
		this.leftHorn04.addBox(-0.5f, -2.1f, -0.5f, 1, 2, 1, 0);
		this.setRotateAngle(leftHorn04, 0.05f, 0, -0.14f);
		this.rightLeg02 = new ModelRenderer(this, 0, 41);
		this.rightLeg02.mirror = true;
		this.rightLeg02.setRotationPoint(0, 5.2f, 0.2f);
		this.rightLeg02.addBox(-1, 0, -1.5f, 2, 7, 3, 0);
		this.setRotateAngle(rightLeg02, -0.42f, 0, 0);
		this.hair00 = new ModelRenderer(this, 25, 0);
		this.hair00.setRotationPoint(0, -4.4f, 3.2f);
		this.hair00.addBox(-4, 0, -0.1f, 8, 8, 1, 0);
		this.setRotateAngle(hair00, 0.21f, 0, 0);
		this.leftHorn02a = new ModelRenderer(this, 0, 4);
		this.leftHorn02a.setRotationPoint(0, -1.6f, 0);
		this.leftHorn02a.addBox(-0.7f, -2, -0.7f, 1, 2, 1, 0);
		this.setRotateAngle(leftHorn02a, -0.1f, 0, 0.1f);
		this.leftHorn01a = new ModelRenderer(this, 0, 4);
		this.leftHorn01a.setRotationPoint(0, -1.7f, 0);
		this.leftHorn01a.addBox(-0.8f, -2, -0.8f, 1, 2, 1, 0);
		this.setRotateAngle(leftHorn01a, -0.17f, 0, 0.05f);
		this.leftHoof = new ModelRenderer(this, 0, 51);
		this.leftHoof.setRotationPoint(0, 6.8f, 0);
		this.leftHoof.addBox(-1.5f, 0, -2.9f, 3, 1, 4, 0);
		this.bipedHead = new ModelRenderer(this, 0, 1);
		this.bipedHead.setRotationPoint(0, 0, 0);
		this.bipedHead.addBox(-4, -8, -4, 8, 8, 8, 0);
		this.bipedRightArm = new ModelRenderer(this, 44, 16);
		this.bipedRightArm.mirror = true;
		this.bipedRightArm.setRotationPoint(-5, 2, 0);
		this.bipedRightArm.addBox(-2, -2, -2, 3, 14, 4, 0);
		this.setRotateAngle(bipedRightArm, 0, 0, 0.1f);
		this.tail06 = new ModelRenderer(this, 25, 51);
		this.tail06.setRotationPoint(0, 0.1f, 0.8f);
		this.tail06.addBox(-1.5f, -0.5f, -0.5f, 2, 1, 2, 0);
		this.setRotateAngle(tail06, 0, 0.79f, 0);
		this.leftHorn01c = new ModelRenderer(this, 0, 4);
		this.leftHorn01c.setRotationPoint(0, 0, 0);
		this.leftHorn01c.addBox(-0.8f, -2, -0.2f, 1, 2, 1, 0);
		this.leftHorn01d = new ModelRenderer(this, 0, 4);
		this.leftHorn01d.setRotationPoint(0, 0, 0);
		this.leftHorn01d.addBox(-0.2f, -2, -0.2f, 1, 2, 1, 0);
		this.rightHorn01c = new ModelRenderer(this, 0, 4);
		this.rightHorn01c.mirror = true;
		this.rightHorn01c.setRotationPoint(0, 0, 0);
		this.rightHorn01c.addBox(-0.8f, -2, -0.2f, 1, 2, 1, 0);
		this.rightHorn02c = new ModelRenderer(this, 0, 4);
		this.rightHorn02c.mirror = true;
		this.rightHorn02c.setRotationPoint(0, 0, 0);
		this.rightHorn02c.addBox(-0.7f, -2, -0.3f, 1, 2, 1, 0);
		this.rightHorn02d = new ModelRenderer(this, 0, 4);
		this.rightHorn02d.mirror = true;
		this.rightHorn02d.setRotationPoint(0, 0, 0);
		this.rightHorn02d.addBox(-0.3f, -2, -0.3f, 1, 2, 1, 0);
		this.tail00 = new ModelRenderer(this, 13, 38);
		this.tail00.setRotationPoint(0, 11.4f, 1.3f);
		this.tail00.addBox(-1, -1, 0, 2, 2, 4, 0);
		this.setRotateAngle(tail00, -0.87f, 0, 0);
		this.boobs = new ModelRenderer(this, 0, 57);
		this.boobs.setRotationPoint(0, 1.3f, -0.3f);
		this.boobs.addBox(-3.5f, 0, -2, 7, 4, 3, 0);
		this.setRotateAngle(boobs, -0.49f, 0, 0);
		this.leftWing01 = new ModelRenderer(this, 38, 52);
		this.leftWing01.setRotationPoint(0.1f, 0.2f, 4.3f);
		this.leftWing01.addBox(-1, -1, 0, 2, 2, 8, 0);
		this.setRotateAngle(leftWing01, 0.52f, 0, 0);
		this.leftWing02 = new ModelRenderer(this, 29, 54);
		this.leftWing02.setRotationPoint(0.1f, -0.5f, 7.1f);
		this.leftWing02.addBox(-1, 0, -1, 2, 8, 2, 0);
		this.setRotateAngle(leftWing02, 0.21f, 0, 0);
		this.rightHoof = new ModelRenderer(this, 0, 51);
		this.rightHoof.mirror = true;
		this.rightHoof.setRotationPoint(0, 6.8f, 0);
		this.rightHoof.addBox(-1.5f, 0, -2.9f, 3, 1, 4, 0);
		this.rightHorn03 = new ModelRenderer(this, 4, 4);
		this.rightHorn03.mirror = true;
		this.rightHorn03.setRotationPoint(0, -1.7f, 0);
		this.rightHorn03.addBox(-0.5f, -3, -0.5f, 1, 3, 1, 0);
		this.setRotateAngle(rightHorn03, 0.052f, 0, -0.14f);
		this.bipedRightLeg = new ModelRenderer(this, 0, 17);
		this.bipedRightLeg.mirror = true;
		this.bipedRightLeg.setRotationPoint(-2.1f, 12.2f, 0.1f);
		this.bipedRightLeg.addBox(-2, -1, -2.5f, 4, 8, 5, 0);
		this.setRotateAngle(bipedRightLeg, -0.26f, 0, 0.1f);
		this.rightWing01 = new ModelRenderer(this, 38, 52);
		this.rightWing01.mirror = true;
		this.rightWing01.setRotationPoint(-0.1f, 0.2f, 4.3f);
		this.rightWing01.addBox(-1, -1, 0, 2, 2, 8, 0);
		this.setRotateAngle(rightWing01, 0.52f, 0, 0);
		this.leftHorn02c = new ModelRenderer(this, 0, 4);
		this.leftHorn02c.setRotationPoint(0, 0, 0);
		this.leftHorn02c.addBox(-0.7f, -2, -0.3f, 1, 2, 1, 0);
		this.rightHorn04 = new ModelRenderer(this, 43, 0);
		this.rightHorn04.mirror = true;
		this.rightHorn04.setRotationPoint(0, -2.7f, 0);
		this.rightHorn04.addBox(-0.5f, -2.1f, -0.5f, 1, 2, 1, 0);
		this.setRotateAngle(rightHorn04, 0.05f, 0, 0.14f);
		this.leftHorn02b = new ModelRenderer(this, 0, 4);
		this.leftHorn02b.setRotationPoint(0, 0, 0);
		this.leftHorn02b.addBox(-0.3f, -2, -0.7f, 1, 2, 1, 0);
		this.leftWingMembrane = new ModelRenderer(this, 41, 26);
		this.leftWingMembrane.setRotationPoint(0, 0, 0);
		this.leftWingMembrane.addBox(0, 0.4f, -2.2f, 0, 14, 11, 0);
		this.setRotateAngle(leftWingMembrane, -0.09f, 0, 0);
		this.leftWing03 = new ModelRenderer(this, 24, 55);
		this.leftWing03.setRotationPoint(0, 7.7f, 0);
		this.leftWing03.addBox(-0.5f, 0, -0.5f, 1, 8, 1, 0);
		this.setRotateAngle(leftWing03, -0.42f, 0, 0);
		this.leftLeg01 = new ModelRenderer(this, 0, 30);
		this.leftLeg01.setRotationPoint(0, 5.7f, -0.4f);
		this.leftLeg01.addBox(-1.5f, 0, -2, 3, 6, 4, 0);
		this.setRotateAngle(leftLeg01, 0.7f, 0, 0.1f);
		this.rightHorn02a = new ModelRenderer(this, 0, 4);
		this.rightHorn02a.mirror = true;
		this.rightHorn02a.setRotationPoint(0, -1.6f, 0);
		this.rightHorn02a.addBox(-0.7f, -2, -0.7f, 1, 2, 1, 0);
		this.setRotateAngle(rightHorn02a, -0.1f, 0, -0.1f);
		this.leftHorn03 = new ModelRenderer(this, 4, 4);
		this.leftHorn03.setRotationPoint(0, -1.7f, 0);
		this.leftHorn03.addBox(-0.5f, -3, -0.5f, 1, 3, 1, 0);
		this.setRotateAngle(leftHorn03, 0.05f, 0, 0.14f);
		this.leftHorn00 = new ModelRenderer(this, 0, 0);
		this.leftHorn00.setRotationPoint(2.9f, -7.4f, -0.5f);
		this.leftHorn00.addBox(-1, -2, -1, 2, 2, 2, 0);
		this.setRotateAngle(leftHorn00, -0.17f, 0.14f, 0.14f);
		this.rightWingMembrane = new ModelRenderer(this, 41, 26);
		this.rightWingMembrane.mirror = true;
		this.rightWingMembrane.setRotationPoint(0, 0, 0);
		this.rightWingMembrane.addBox(0, 0.4f, -2.2f, 0, 14, 11, 0);
		this.setRotateAngle(rightWingMembrane, -0.09f, 0, 0);
		this.bipedLeftArm = new ModelRenderer(this, 44, 16);
		this.bipedLeftArm.setRotationPoint(5, 2, -0);
		this.bipedLeftArm.addBox(-1, -2, -2, 3, 14, 4, 0);
		this.setRotateAngle(bipedLeftArm, 0, 0, -0.1f);
		this.rightHorn00 = new ModelRenderer(this, 0, 0);
		this.rightHorn00.mirror = true;
		this.rightHorn00.setRotationPoint(-2.9f, -7.4f, -0.5f);
		this.rightHorn00.addBox(-1, -2, -1, 2, 2, 2, 0);
		this.setRotateAngle(rightHorn00, -0.17f, -0.14f, -0.14f);
		this.tail04 = new ModelRenderer(this, 15, 45);
		this.tail04.setRotationPoint(0, 0, 4.9f);
		this.tail04.addBox(-0.5f, -0.5f, 0, 1, 1, 5, 0);
		this.setRotateAngle(tail04, 0.23f, 0, 0);
		this.leftWing00 = new ModelRenderer(this, 26, 38);
		this.leftWing00.setRotationPoint(2.5f, 3.2f, 1.4f);
		this.leftWing00.addBox(-1, -1.5f, 0, 2, 3, 5, 0);
		this.setRotateAngle(leftWing00, 0.27f, 0.52f, 0);
		this.bipedLeftLeg = new ModelRenderer(this, 0, 17);
		this.bipedLeftLeg.setRotationPoint(2.1f, 12.2f, 0.1f);
		this.bipedLeftLeg.addBox(-2, -1, -2.5f, 4, 8, 5, 0);
		this.setRotateAngle(bipedLeftLeg, -0.26f, 0, -0.1f);
		this.leftHorn01b = new ModelRenderer(this, 0, 4);
		this.leftHorn01b.setRotationPoint(0, 0, 0);
		this.leftHorn01b.addBox(-0.2f, -2, -0.8f, 1, 2, 1, 0);
		this.rightHorn01a = new ModelRenderer(this, 0, 4);
		this.rightHorn01a.mirror = true;
		this.rightHorn01a.setRotationPoint(0, -1.7f, 0);
		this.rightHorn01a.addBox(-0.8f, -2, -0.8f, 1, 2, 1, 0);
		this.setRotateAngle(rightHorn01a, -0.17f, 0, -0.05f);
		this.rightHorn01b = new ModelRenderer(this, 0, 4);
		this.rightHorn01b.mirror = true;
		this.rightHorn01b.setRotationPoint(0, 0, 0);
		this.rightHorn01b.addBox(-0.2f, -2, -0.8f, 1, 2, 1, 0);
		this.rightLeg01 = new ModelRenderer(this, 0, 30);
		this.rightLeg01.mirror = true;
		this.rightLeg01.setRotationPoint(0, 5.7f, -0.4f);
		this.rightLeg01.addBox(-1.5f, 0, -2, 3, 6, 4, 0);
		this.setRotateAngle(rightLeg01, 0.7f, 0, -0.1f);
		this.tail01 = new ModelRenderer(this, 13, 38);
		this.tail01.setRotationPoint(0, 0, 3.8f);
		this.tail01.addBox(-1, -1, 0, 2, 2, 4, 0);
		this.setRotateAngle(tail01, -0.14f, 0, 0);
		this.loincloth01 = new ModelRenderer(this, 48, 8);
		this.loincloth01.setRotationPoint(0, 7.8f, 0);
		this.loincloth01.addBox(-3, 0.05f, -0.53f, 6, 6, 1, 0);
		this.setRotateAngle(loincloth01, 0.23f, 0, 0);
		this.leftLeg02 = new ModelRenderer(this, 0, 41);
		this.leftLeg02.setRotationPoint(0, 5.2f, 0.2f);
		this.leftLeg02.addBox(-1, 0, -1.5f, 2, 7, 3, 0);
		this.setRotateAngle(leftLeg02, -0.42f, 0, 0);
		this.tail05 = new ModelRenderer(this, 16, 52);
		this.tail05.setRotationPoint(0, 0, 4.5f);
		this.tail05.addBox(-1, -0.5f, 0, 2, 1, 2, 0);
		this.setRotateAngle(tail05, 0.26f, 0, 0);
		this.rightWing03 = new ModelRenderer(this, 24, 55);
		this.rightWing03.mirror = true;
		this.rightWing03.setRotationPoint(0, 7.7f, 0);
		this.rightWing03.addBox(-0.5f, 0, -0.5f, 1, 8, 1, 0);
		this.setRotateAngle(rightWing03, -0.42f, 0, 0);
		this.tail01.addChild(this.tail02);
		this.rightHorn02a.addChild(this.rightHorn02b);
		this.bipedBody.addChild(this.rightWing00);
		this.lowerbipedBody.addChild(this.loincloth00);
		this.tail02.addChild(this.tail03);
		this.rightWing01.addChild(this.rightWing02);
		this.rightHorn01a.addChild(this.rightHorn01d);
		this.bipedBody.addChild(this.lowerbipedBody);
		this.leftHorn02a.addChild(this.leftHorn02d);
		this.bipedHead.addChild(this.hair01);
		this.leftHorn03.addChild(this.leftHorn04);
		this.rightLeg01.addChild(this.rightLeg02);
		this.bipedHead.addChild(this.hair00);
		this.leftHorn01a.addChild(this.leftHorn02a);
		this.leftHorn00.addChild(this.leftHorn01a);
		this.leftLeg02.addChild(this.leftHoof);
		this.bipedBody.addChild(this.bipedHead);
		this.bipedBody.addChild(this.bipedRightArm);
		this.tail05.addChild(this.tail06);
		this.leftHorn01a.addChild(this.leftHorn01c);
		this.leftHorn01a.addChild(this.leftHorn01d);
		this.rightHorn01a.addChild(this.rightHorn01c);
		this.rightHorn02a.addChild(this.rightHorn02c);
		this.rightHorn02a.addChild(this.rightHorn02d);
		this.bipedBody.addChild(this.tail00);
		this.bipedBody.addChild(this.boobs);
		this.leftWing00.addChild(this.leftWing01);
		this.leftWing01.addChild(this.leftWing02);
		this.rightLeg02.addChild(this.rightHoof);
		this.rightHorn02a.addChild(this.rightHorn03);
		this.bipedBody.addChild(this.bipedRightLeg);
		this.rightWing00.addChild(this.rightWing01);
		this.leftHorn02a.addChild(this.leftHorn02c);
		this.rightHorn03.addChild(this.rightHorn04);
		this.leftHorn02a.addChild(this.leftHorn02b);
		this.leftWing01.addChild(this.leftWingMembrane);
		this.leftWing02.addChild(this.leftWing03);
		this.bipedLeftLeg.addChild(this.leftLeg01);
		this.rightHorn01a.addChild(this.rightHorn02a);
		this.leftHorn02a.addChild(this.leftHorn03);
		this.bipedHead.addChild(this.leftHorn00);
		this.rightWing01.addChild(this.rightWingMembrane);
		this.bipedBody.addChild(this.bipedLeftArm);
		this.bipedHead.addChild(this.rightHorn00);
		this.tail03.addChild(this.tail04);
		this.bipedBody.addChild(this.leftWing00);
		this.bipedBody.addChild(this.bipedLeftLeg);
		this.leftHorn01a.addChild(this.leftHorn01b);
		this.rightHorn00.addChild(this.rightHorn01a);
		this.rightHorn01a.addChild(this.rightHorn01b);
		this.bipedRightLeg.addChild(this.rightLeg01);
		this.tail00.addChild(this.tail01);
		this.loincloth00.addChild(this.loincloth01);
		this.leftLeg01.addChild(this.leftLeg02);
		this.tail04.addChild(this.tail05);
		this.rightWing02.addChild(this.rightWing03);
	}
	
	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float age, float yaw, float pitch, float scale) {
		this.bipedBody.render(scale);
	}
	
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
		bipedHead.rotateAngleX = scaleFactor / 57.29578F;
		bipedHead.rotateAngleY = headPitch / 57.29578F;
		
		bipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.25f) * 0.5F * limbSwingAmount + -0.26f;
		bipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.25f) * 0.5F * limbSwingAmount + -0.26f;
		bipedLeftLeg.rotateAngleX = MathHelper.sin(limbSwing * 0.25f) * 0.5F * limbSwingAmount + -0.26f;
		bipedLeftLeg.rotateAngleX = MathHelper.sin(limbSwing * 0.25f) * 0.5F * limbSwingAmount + -0.26f;
		
		bipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.25f) * 0.5F * limbSwingAmount + 0f;
		bipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.25f) * 0.5F * limbSwingAmount + 0f;
		bipedRightArm.rotateAngleX = MathHelper.sin(limbSwing * 0.25f) * 0.5F * limbSwingAmount + 0f;
		bipedRightArm.rotateAngleX = MathHelper.sin(limbSwing * 0.25f) * 0.5F * limbSwingAmount + 0f;
	}
	
	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer renderer, float x, float y, float z) {
		renderer.rotateAngleX = x;
		renderer.rotateAngleY = y;
		renderer.rotateAngleZ = z;
	}
}