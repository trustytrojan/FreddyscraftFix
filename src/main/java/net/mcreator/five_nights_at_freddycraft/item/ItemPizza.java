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


public class ItemPizza extends ElementsFiveNightsAtFreddycraftMod.ModElement
{
    @GameRegistry.ObjectHolder("five_nights_at_freddycraft:pizza")
    public static final Item block;
    
    public ItemPizza(final ElementsFiveNightsAtFreddycraftMod instance) {
        super(instance, 62);
    }
    
    @Override
    public void initElements() {
        this.elements.items.add(() -> new ItemFoodCustom());
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(final ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(ItemPizza.block, 0, new ModelResourceLocation("five_nights_at_freddycraft:pizza", "inventory"));
    }
    
    static {
        block = null;
    }
    
    public static class ItemFoodCustom extends ItemFood
    {
        public ItemFoodCustom() {
            super(8, 0.3f, false);
            this.setUnlocalizedName("pizza");
            this.setRegistryName("pizza");
            this.setCreativeTab(CreativeTabs.FOOD);
            this.setMaxStackSize(64);
        }
        
        public EnumAction getItemUseAction(final ItemStack par1ItemStack) {
            return EnumAction.EAT;
        }
    }
}
