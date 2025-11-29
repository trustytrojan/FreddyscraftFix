//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/t/Projects/Minecraft-Deobfuscator3000/mappings/1.12"!

//Decompiled by Procyon!

package net.mcreator.five_nights_at_freddycraft.item;

import net.mcreator.five_nights_at_freddycraft.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.client.event.*;
import net.minecraft.client.renderer.block.model.*;
import net.minecraftforge.client.model.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.block.state.*;


public class ItemBalloon extends ElementsFiveNightsAtFreddycraftMod.ModElement
{
    @GameRegistry.ObjectHolder("five_nights_at_freddycraft:balloon")
    public static final Item block;
    
    public ItemBalloon(final ElementsFiveNightsAtFreddycraftMod instance) {
        super(instance, 21);
    }
    
    @Override
    public void initElements() {
        this.elements.items.add(() -> new ItemCustom());
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(final ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(ItemBalloon.block, 0, new ModelResourceLocation("five_nights_at_freddycraft:balloon", "inventory"));
    }
    
    static {
        block = null;
    }
    
    public static class ItemCustom extends Item
    {
        public ItemCustom() {
            this.setMaxDamage(0);
            this.maxStackSize = 1;
            this.setUnlocalizedName("balloon");
            this.setRegistryName("balloon");
            this.setCreativeTab(CreativeTabs.DECORATIONS);
        }
        
        public int getItemEnchantability() {
            return 0;
        }
        
        public int getMaxItemUseDuration(final ItemStack itemstack) {
            return 0;
        }
        
        public float getDestroySpeed(final ItemStack par1ItemStack, final IBlockState par2Block) {
            return 1.0f;
        }
    }
}
