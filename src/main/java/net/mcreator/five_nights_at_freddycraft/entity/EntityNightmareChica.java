//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/t/Projects/Minecraft-Deobfuscator3000/mappings/1.12"!

//Decompiled by Procyon!

package net.mcreator.five_nights_at_freddycraft.entity;

import net.mcreator.five_nights_at_freddycraft.*;
import net.minecraft.world.biome.*;
import net.minecraft.util.registry.*;
import java.util.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.client.registry.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.entity.layers.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraft.entity.monster.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.ai.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import net.minecraft.client.model.*;


@ElementsFiveNightsAtFreddycraftMod.ModElement.Tag
public class EntityNightmareChica extends ElementsFiveNightsAtFreddycraftMod.ModElement
{
    public static final int ENTITYID = 65;
    public static final int ENTITYID_RANGED = 66;
    
    public EntityNightmareChica(final ElementsFiveNightsAtFreddycraftMod instance) {
        super(instance, 44);
    }
    
    @Override
    public void initElements() {
        this.elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("five_nights_at_freddycraft", "nightmarechica"), 65).name("nightmarechica").tracker(64, 3, true).egg(-13261, -10066432).build());
    }
    
    @Override
    public void init(final FMLInitializationEvent event) {
        final Biome[] spawnBiomes = this.allbiomes((RegistryNamespaced<ResourceLocation, Biome>)Biome.REGISTRY);
        EntityRegistry.addSpawn(EntityCustom.class, ModConfig.spawnWeights.NightmareChica, 3, 30, EnumCreatureType.MONSTER, spawnBiomes);
    }
    
    private Biome[] allbiomes(final RegistryNamespaced<ResourceLocation, Biome> in) {
        final Iterator<Biome> itr = in.iterator();
        final ArrayList<Biome> ls = new ArrayList<Biome>();
        while (itr.hasNext()) {
            ls.add(itr.next());
        }
        return ls.toArray(new Biome[ls.size()]);
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void preInit(final FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
            final RenderBiped customRender = new RenderBiped(renderManager, new ModelBiped(), 0.5f) {
                protected ResourceLocation getEntityTexture(final Entity entity) {
                    return new ResourceLocation("five_nights_at_freddycraft:textures/nightmare_chica.png");
                }
            };
            customRender.addLayer(new LayerBipedArmor(customRender) {
                protected void initArmor() {
                    this.modelLeggings = new ModelBiped(0.5f);
                    this.modelArmor = new ModelBiped(1.0f);
                }
            });
            return customRender;
        });
    }
    
    public static class EntityCustom extends EntityMob
    {
        public EntityCustom(final World world) {
            super(world);
            this.setSize(0.6f, 1.8f);
            this.experienceValue = 5;
            this.setNoAI(this.isImmuneToFire = false);
        }
        
        protected void initEntityAI() {
            super.initEntityAI();
            this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true, true));
            this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayerMP.class, true, true));
            this.tasks.addTask(3, new EntityAIAttackMelee(this, 1.0, false));
            this.targetTasks.addTask(4, new EntityAIHurtByTarget(this, true, new Class[0]));
            this.tasks.addTask(5, new EntityAIWander(this, 1.0));
            this.tasks.addTask(6, new EntityAILookIdle(this));
            this.tasks.addTask(7, new EntityAISwimming(this));
            this.targetTasks.addTask(8, new EntityAIHurtByTarget(this, false, new Class[0]));
        }
        
        public EnumCreatureAttribute getCreatureAttribute() {
            return EnumCreatureAttribute.UNDEFINED;
        }
        
        protected Item getDropItem() {
            return new ItemStack(Items.GOLD_INGOT, 1).getItem();
        }
        
        public SoundEvent getAmbientSound() {
            return SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
        }
        
        public SoundEvent getHurtSound(final DamageSource ds) {
            return SoundEvent.REGISTRY.getObject(new ResourceLocation("block.anvil.place"));
        }
        
        public SoundEvent getDeathSound() {
            return SoundEvent.REGISTRY.getObject(new ResourceLocation("five_nights_at_freddycraft:entity.fnaf4.death"));
        }
        
        protected float getSoundVolume() {
            return 1.0f;
        }
        
        protected void applyEntityAttributes() {
            super.applyEntityAttributes();
            if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null) {
                this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0.0);
            }
            if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null) {
                this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);
            }
            if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null) {
                this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(50.0);
            }
            if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null) {
                this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0);
            }
        }
    }
}
