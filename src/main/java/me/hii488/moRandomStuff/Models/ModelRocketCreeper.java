// Date: 1/10/2015 3:59:53 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package me.hii488.moRandomStuff.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRocketCreeper extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer Fin1;
    ModelRenderer RocketBody;
    ModelRenderer Fin3;
    ModelRenderer RocketTop;
    ModelRenderer Fin2;
  
  public ModelRocketCreeper()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 6F, 0F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 6F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      leg3 = new ModelRenderer(this, 0, 16);
      leg3.addBox(-2F, 0F, -2F, 4, 6, 4);
      leg3.setRotationPoint(-2F, 18F, -4F);
      leg3.setTextureSize(64, 32);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 0F);
      leg4 = new ModelRenderer(this, 0, 16);
      leg4.addBox(-2F, 0F, -2F, 4, 6, 4);
      leg4.setRotationPoint(2F, 18F, -4F);
      leg4.setTextureSize(64, 32);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 16);
      leg1.addBox(0F, 0F, -2F, 4, 6, 4);
      leg1.setRotationPoint(-4F, 18F, 4F);
      leg1.setTextureSize(64, 32);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 0, 16);
      leg2.addBox(-2F, 0F, -2F, 4, 6, 4);
      leg2.setRotationPoint(2F, 18F, 4F);
      leg2.setTextureSize(64, 32);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      Fin1 = new ModelRenderer(this, 33, 0);
      Fin1.addBox(0F, 0F, 0F, 2, 3, 1);
      Fin1.setRotationPoint(1.533333F, 15F, 3.5F);
      Fin1.setTextureSize(64, 32);
      Fin1.mirror = true;
      setRotation(Fin1, 0.2617994F, 1.570796F, 0F);
      RocketBody = new ModelRenderer(this, 40, 0);
      RocketBody.addBox(0F, 0F, 0F, 5, 12, 5);
      RocketBody.setRotationPoint(-2.5F, 5F, 0F);
      RocketBody.setTextureSize(64, 32);
      RocketBody.mirror = true;
      setRotation(RocketBody, 0F, 0F, 0F);
      Fin3 = new ModelRenderer(this, 33, 5);
      Fin3.addBox(0F, 0F, 0F, 2, 3, 1);
      Fin3.setRotationPoint(-1.466667F, 15F, 1.5F);
      Fin3.setTextureSize(64, 32);
      Fin3.mirror = true;
      setRotation(Fin3, 0.2617994F, -1.570796F, 0F);
      RocketTop = new ModelRenderer(this, 40, 17);
      RocketTop.addBox(0F, 0F, 0F, 4, 2, 4);
      RocketTop.setRotationPoint(-2F, 3F, 0.5F);
      RocketTop.setTextureSize(64, 32);
      RocketTop.mirror = true;
      setRotation(RocketTop, 0F, 0F, 0F);
      Fin2 = new ModelRenderer(this, 33, 10);
      Fin2.addBox(0F, 0F, 0F, 2, 3, 1);
      Fin2.setRotationPoint(-1F, 15F, 4F);
      Fin2.setTextureSize(64, 32);
      Fin2.mirror = true;
      setRotation(Fin2, 0.2617994F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    head.render(f5);
    body.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    Fin1.render(f5);
    RocketBody.render(f5);
    Fin3.render(f5);
    RocketTop.render(f5);
    Fin2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
