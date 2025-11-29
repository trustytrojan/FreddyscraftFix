//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/t/Projects/Minecraft-Deobfuscator3000/mappings/1.12"!

//Decompiled by Procyon!

package net.mcreator.five_nights_at_freddycraft.item;

import net.mcreator.five_nights_at_freddycraft.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.common.util.*;
import net.minecraft.inventory.*;
import com.google.common.collect.*;
import net.minecraft.entity.ai.attributes.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import java.util.*;
import net.minecraft.creativetab.*;
import net.minecraftforge.client.event.*;
import net.minecraft.client.renderer.block.model.*;
import net.minecraftforge.client.model.*;
import net.minecraftforge.fml.relauncher.*;


public class ItemFreddysMicrophone extends ElementsFiveNightsAtFreddycraftMod.ModElement
{
    @GameRegistry.ObjectHolder("five_nights_at_freddycraft:freddysmicrophone")
    public static final Item block;
    
    public ItemFreddysMicrophone(final ElementsFiveNightsAtFreddycraftMod instance) {
        super(instance, 1);
    }
    
    @Override
    public void initElements() {
        this.elements.items.add(() -> ((Item)new ItemSword(EnumHelper.addToolMaterial("FREDDYSMICROPHONE", 1, 100000, 4.0f, -2.0f, 2)) {
            public Multimap<String, AttributeModifier> getItemAttributeModifiers(final EntityEquipmentSlot slot) {
                final Multimap multimap = super.getItemAttributeModifiers(slot);
                if (slot == EntityEquipmentSlot.MAINHAND) {
                    multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.getAttackDamage(), 0));
                    multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -2.4, 0));
                }
                return (Multimap<String, AttributeModifier>)multimap;
            }
            
            public Set<String> getToolClasses(final ItemStack stack) {
                final HashMap ret = new HashMap();
                ret.put("sword", 1);
                return ret.keySet();
            }
        }.setUnlocalizedName("freddysmicrophone").setRegistryName("freddysmicrophone")).setCreativeTab(CreativeTabs.COMBAT));
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(final ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(ItemFreddysMicrophone.block, 0, new ModelResourceLocation("five_nights_at_freddycraft:freddysmicrophone", "inventory"));
    }
    
    static {
        block = null;
    }
}
