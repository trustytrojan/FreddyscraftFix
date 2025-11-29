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


public class ItemCheese extends ElementsFiveNightsAtFreddycraftMod.ModElement
{
    @GameRegistry.ObjectHolder("five_nights_at_freddycraft:cheese")
    public static final Item block;
    
    public ItemCheese(final ElementsFiveNightsAtFreddycraftMod instance) {
        super(instance, 64);
    }
    
    @Override
    public void initElements() {
        this.elements.items.add(() -> new ItemFoodCustom());
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(final ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(ItemCheese.block, 0, new ModelResourceLocation("five_nights_at_freddycraft:cheese", "inventory"));
    }
    
    static {
        block = null;
    }
    
    public static class ItemFoodCustom extends ItemFood
    {
        public ItemFoodCustom() {
            super(2, 0.3f, false);
            this.setUnlocalizedName("cheese");
            this.setRegistryName("cheese");
            this.setCreativeTab(CreativeTabs.FOOD);
            this.setMaxStackSize(64);
        }
        
        public EnumAction getItemUseAction(final ItemStack par1ItemStack) {
            return EnumAction.EAT;
        }
    }
}
