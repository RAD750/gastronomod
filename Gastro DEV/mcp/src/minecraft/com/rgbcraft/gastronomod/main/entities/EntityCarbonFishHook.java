package com.rgbcraft.gastronomod.main.entities;

import java.util.List;
import java.util.Random;

import com.rgbcraft.gastronomod.main.items.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatList;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityCarbonFishHook extends EntityFishHook {

	/** The tile this entity is on, X position */
	private int xTile;

	/** The tile this entity is on, Y position */
	private int yTile;

	/** The tile this entity is on, Z position */
	private int zTile;
	private int inTile;
	private boolean inGround;
	private int ticksInGround;
	private int ticksInAir;

	/** the number of ticks remaining until this fish can no longer be caught */
	private int ticksCatchable;

	/**
	 * The entity that the fishing rod is connected to, if any. When you right click on the fishing rod and the hook
	 * falls on to an entity, this it that entity.
	 */
	private int fishPosRotationIncrements;
	private double fishX;
	private double fishY;
	private double fishZ;
	private double fishYaw;
	private double fishPitch;

	public EntityCarbonFishHook(World par1World, EntityPlayer par2EntityPlayer)
	{
		super(par1World, par2EntityPlayer);
		this.xTile = -1;
		this.yTile = -1;
		this.zTile = -1;
		this.inTile = 0;
		this.inGround = false;
		this.shake = 0;
		this.ticksInAir = 0;
		this.ticksCatchable = 0;
		this.bobber = null;
		this.ignoreFrustumCheck = true;
		this.angler = par2EntityPlayer;
		this.angler.fishEntity = this;
		this.setSize(0.25F, 0.25F);
		this.setLocationAndAngles(par2EntityPlayer.posX, par2EntityPlayer.posY + 1.62D - (double)par2EntityPlayer.yOffset, par2EntityPlayer.posZ, par2EntityPlayer.rotationYaw, par2EntityPlayer.rotationPitch);
		this.posX -= (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
		this.posY -= 0.10000000149011612D;
		this.posZ -= (double)(MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
		this.setPosition(this.posX, this.posY, this.posZ);
		this.yOffset = 0.0F;
		float var3 = 0.4F;
		this.motionX = (double)(-MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI) * var3);
		this.motionZ = (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI) * var3);
		this.motionY = (double)(-MathHelper.sin(this.rotationPitch / 180.0F * (float)Math.PI) * var3);
		this.calculateVelocity(this.motionX, this.motionY, this.motionZ, 1.5F, 1.0F);
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	@Override
	public void onUpdate()
	{
		//super.onUpdate();
		super.onEntityUpdate();

		if (this.fishPosRotationIncrements > 0)
		{
			double var21 = this.posX + (this.fishX - this.posX) / (double)this.fishPosRotationIncrements;
			double var22 = this.posY + (this.fishY - this.posY) / (double)this.fishPosRotationIncrements;
			double var23 = this.posZ + (this.fishZ - this.posZ) / (double)this.fishPosRotationIncrements;
			double var7 = MathHelper.wrapAngleTo180_double(this.fishYaw - (double)this.rotationYaw);
			this.rotationYaw = (float)((double)this.rotationYaw + var7 / (double)this.fishPosRotationIncrements);
			this.rotationPitch = (float)((double)this.rotationPitch + (this.fishPitch - (double)this.rotationPitch) / (double)this.fishPosRotationIncrements);
			--this.fishPosRotationIncrements;
			this.setPosition(var21, var22, var23);
			this.setRotation(this.rotationYaw, this.rotationPitch);
		}
		else
		{
			if (!this.worldObj.isRemote)
			{
				ItemStack var1 = this.angler.getCurrentEquippedItem();

				if (this.angler.isDead || !this.angler.isEntityAlive() || var1 == null || var1.getItem() != Items.carbonFishingRod || this.getDistanceSqToEntity(this.angler) > 1024.0D)
				{
					this.setDead();
					this.angler.fishEntity = null;
					return;
				}

				if (this.bobber != null)
				{
					if (!this.bobber.isDead)
					{
						this.posX = this.bobber.posX;
						this.posY = this.bobber.boundingBox.minY + (double)this.bobber.height * 0.8D;
						this.posZ = this.bobber.posZ;
						return;
					}

					this.bobber = null;
				}
			}

			if (this.shake > 0)
			{
				--this.shake;
			}

			if (this.inGround)
			{
				int var19 = this.worldObj.getBlockId(this.xTile, this.yTile, this.zTile);

				if (var19 == this.inTile)
				{
					++this.ticksInGround;

					if (this.ticksInGround == 1200)
					{
						this.setDead();
					}

					return;
				}

				this.inGround = false;
				this.motionX *= (double)(this.rand.nextFloat() * 0.2F);
				this.motionY *= (double)(this.rand.nextFloat() * 0.2F);
				this.motionZ *= (double)(this.rand.nextFloat() * 0.2F);
				this.ticksInGround = 0;
				this.ticksInAir = 0;
			}
			else
			{
				++this.ticksInAir;
			}

			Vec3 var20 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX, this.posY, this.posZ);
			Vec3 var2 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
			MovingObjectPosition var3 = this.worldObj.rayTraceBlocks(var20, var2);
			var20 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX, this.posY, this.posZ);
			var2 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

			if (var3 != null)
			{
				var2 = this.worldObj.getWorldVec3Pool().getVecFromPool(var3.hitVec.xCoord, var3.hitVec.yCoord, var3.hitVec.zCoord);
			}

			Entity var4 = null;
			List var5 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
			double var6 = 0.0D;
			double var13;

			for (int var8 = 0; var8 < var5.size(); ++var8)
			{
				Entity var9 = (Entity)var5.get(var8);

				if (var9.canBeCollidedWith() && (var9 != this.angler || this.ticksInAir >= 5))
				{
					float var10 = 0.3F;
					AxisAlignedBB var11 = var9.boundingBox.expand((double)var10, (double)var10, (double)var10);
					MovingObjectPosition var12 = var11.calculateIntercept(var20, var2);

					if (var12 != null)
					{
						var13 = var20.distanceTo(var12.hitVec);

						if (var13 < var6 || var6 == 0.0D)
						{
							var4 = var9;
							var6 = var13;
						}
					}
				}
			}

			if (var4 != null)
			{
				var3 = new MovingObjectPosition(var4);
			}

			if (var3 != null)
			{
				if (var3.entityHit != null)
				{
					if (var3.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.angler), 0))
					{
						this.bobber = var3.entityHit;
					}
				}
				else
				{
					this.inGround = true;
				}
			}

			if (!this.inGround)
			{
				this.moveEntity(this.motionX, this.motionY, this.motionZ);
				float var24 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
				this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);

				for (this.rotationPitch = (float)(Math.atan2(this.motionY, (double)var24) * 180.0D / Math.PI); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F)
				{
					;
				}

				while (this.rotationPitch - this.prevRotationPitch >= 180.0F)
				{
					this.prevRotationPitch += 360.0F;
				}

				while (this.rotationYaw - this.prevRotationYaw < -180.0F)
				{
					this.prevRotationYaw -= 360.0F;
				}

				while (this.rotationYaw - this.prevRotationYaw >= 180.0F)
				{
					this.prevRotationYaw += 360.0F;
				}

				this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
				this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
				float var25 = 0.92F;

				if (this.onGround || this.isCollidedHorizontally)
				{
					var25 = 0.5F;
				}

				byte var27 = 5;
				double var26 = 0.0D;

				for (int var29 = 0; var29 < var27; ++var29)
				{
					double var14 = this.boundingBox.minY + (this.boundingBox.maxY - this.boundingBox.minY) * (double)(var29 + 0) / (double)var27 - 0.125D + 0.125D;
					double var16 = this.boundingBox.minY + (this.boundingBox.maxY - this.boundingBox.minY) * (double)(var29 + 1) / (double)var27 - 0.125D + 0.125D;
					AxisAlignedBB var18 = AxisAlignedBB.getAABBPool().addOrModifyAABBInPool(this.boundingBox.minX, var14, this.boundingBox.minZ, this.boundingBox.maxX, var16, this.boundingBox.maxZ);

					if (this.worldObj.isAABBInMaterial(var18, Material.water))
					{
						var26 += 1.0D / (double)var27;
					}
				}

				if (var26 > 0.0D)
				{
					if (this.ticksCatchable > 0)
					{
						--this.ticksCatchable;
					}
					else
					{
						short var28 = 500;

						if (this.worldObj.canLightningStrikeAt(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY) + 1, MathHelper.floor_double(this.posZ)))
						{
							var28 = 300;
						}

						if (this.rand.nextInt(var28) == 0)
						{
							this.ticksCatchable = this.rand.nextInt(30) + 10;
							this.motionY -= 0.20000000298023224D;
							this.playSound("random.splash", 0.25F, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
							float var30 = (float)MathHelper.floor_double(this.boundingBox.minY);
							int var15;
							float var17;
							float var31;

							for (var15 = 0; (float)var15 < 1.0F + this.width * 20.0F; ++var15)
							{
								var31 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width;
								var17 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width;
								this.worldObj.spawnParticle("bubble", this.posX + (double)var31, (double)(var30 + 1.0F), this.posZ + (double)var17, this.motionX, this.motionY - (double)(this.rand.nextFloat() * 0.2F), this.motionZ);
							}

							for (var15 = 0; (float)var15 < 1.0F + this.width * 20.0F; ++var15)
							{
								var31 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width;
								var17 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width;
								this.worldObj.spawnParticle("splash", this.posX + (double)var31, (double)(var30 + 1.0F), this.posZ + (double)var17, this.motionX, this.motionY, this.motionZ);
							}
						}
					}
				}

				if (this.ticksCatchable > 0)
				{
					this.motionY -= (double)(this.rand.nextFloat() * this.rand.nextFloat() * this.rand.nextFloat()) * 0.2D;
				}

				var13 = var26 * 2.0D - 1.0D;
				this.motionY += 0.03999999910593033D * var13;

				if (var26 > 0.0D)
				{
					var25 = (float)((double)var25 * 0.9D);
					this.motionY *= 0.8D;
				}

				this.motionX *= (double)var25;
				this.motionY *= (double)var25;
				this.motionZ *= (double)var25;
				this.setPosition(this.posX, this.posY, this.posZ);
			}
		}
	}

	@Override
	public int catchFish()
	{
		if (this.worldObj.isRemote)
		{
			return 0;
		}
		else
		{
			byte var1 = 0;

			if (this.bobber != null)
			{
				double var2 = this.angler.posX - this.posX;
				double var4 = this.angler.posY - this.posY;
				double var6 = this.angler.posZ - this.posZ;
				double var8 = (double)MathHelper.sqrt_double(var2 * var2 + var4 * var4 + var6 * var6);
				double var10 = 0.1D;
				this.bobber.motionX += var2 * var10;
				this.bobber.motionY += var4 * var10 + (double)MathHelper.sqrt_double(var8) * 0.08D;
				this.bobber.motionZ += var6 * var10;
				var1 = 3;
			}
			else if (this.ticksCatchable > 0)
			{
				Random rand = new Random();

				//se il giocatore è in barca nell'oceano, pesca più tonno
				if (angler.isRiding() && (worldObj.getBiomeGenForCoords((int)angler.posX, (int)angler.posZ).equals(BiomeGenBase.ocean))) {
					switch(rand.nextInt(5)) {
					case 0:
						this.spawnFish(new ItemStack(Items.orata));
						break;
					case 1:
						this.spawnFish(new ItemStack(Items.tonno));
						break;
					case 2:
						this.spawnFish(new ItemStack(Items.tonnoPinneGialle));
						break;
					case 4:
						this.spawnFish(new ItemStack(Items.tonno));
						break;
					case 5:
						this.spawnFish(new ItemStack(Items.tonnoPinneGialle));
						break;
					}
					//se il giocatore è in barca in spiaggia, pesca più orata
				} else if (angler.isRiding() && (worldObj.getBiomeGenForCoords((int)angler.posX, (int)angler.posZ).equals(BiomeGenBase.beach))) {
					switch(rand.nextInt(4)) {
					case 0:
						this.spawnFish(new ItemStack(Items.orata));
						break;
					case 1:
						this.spawnFish(new ItemStack(Items.orata));
						break;
					case 2:
						this.spawnFish(new ItemStack(Items.tonno));
						break;
					case 3:
						this.spawnFish(new ItemStack(Items.tonnoPinneGialle));
						break;
					}
					//altrimenti pesca default
				} else {
					switch(rand.nextInt(3)) {
					case 0:
						this.spawnFish(new ItemStack(Items.orata));
						break;
					case 1:
						this.spawnFish(new ItemStack(Items.tonno));
						break;
					case 2:
						this.spawnFish(new ItemStack(Items.tonnoPinneGialle));
						break;
					}
				}

				var1 = 1;
			}

			if (this.inGround)
			{
				var1 = 2;
			}

			this.setDead();
			this.angler.fishEntity = null;
			return var1;
		}
	}

	private void spawnFish(ItemStack itemStack) {
		EntityItem var13 = new EntityItem(this.worldObj, this.posX, this.posY, this.posZ, itemStack);
		double var3 = this.angler.posX - this.posX;
		double var5 = this.angler.posY - this.posY;
		double var7 = this.angler.posZ - this.posZ;
		double var9 = (double)MathHelper.sqrt_double(var3 * var3 + var5 * var5 + var7 * var7);
		double var11 = 0.1D;
		var13.motionX = var3 * var11;
		var13.motionY = var5 * var11 + (double)MathHelper.sqrt_double(var9) * 0.08D;
		var13.motionZ = var7 * var11;
		this.worldObj.spawnEntityInWorld(var13);
		this.angler.addStat(StatList.fishCaughtStat, 1);
		this.angler.worldObj.spawnEntityInWorld(new EntityXPOrb(this.angler.worldObj, this.angler.posX, this.angler.posY + 0.5D, this.angler.posZ + 0.5D, this.rand.nextInt(6) + 1));
	}

}