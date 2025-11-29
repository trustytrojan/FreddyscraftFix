//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/t/Projects/Minecraft-Deobfuscator3000/mappings/1.12"!

//Decompiled by Procyon!

package net.mcreator.five_nights_at_freddycraft.block;

import net.mcreator.five_nights_at_freddycraft.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraft.item.*;
import net.minecraftforge.client.event.*;
import net.minecraft.client.renderer.block.model.*;
import net.minecraftforge.client.model.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.block.material.*;
import net.minecraft.block.*;
import net.minecraft.creativetab.*;


public class BlockFNAFWall extends ElementsFiveNightsAtFreddycraftMod.ModElement
{
    @GameRegistry.ObjectHolder("five_nights_at_freddycraft:fnafwall")
    public static final Block block;
    
    public BlockFNAFWall(final ElementsFiveNightsAtFreddycraftMod instance) {
        super(instance, 40);
    }
    
    public void initElements() {
        this.elements.blocks.add(() -> (Block)new BlockCustom().setRegistryName("fnafwall"));
        this.elements.items.add(() -> (Item)new ItemBlock(BlockFNAFWall.block).setRegistryName(BlockFNAFWall.block.getRegistryName()));
    }
    
    @SideOnly(Side.CLIENT)
    public void registerModels(final ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockFNAFWall.block), 0, new ModelResourceLocation("five_nights_at_freddycraft:fnafwall", "inventory"));
    }
    
    static {
        block = null;
    }
    
    public static class BlockCustom extends Block
    {
        public BlockCustom() {
            super(Material.ROCK);
            this.setUnlocalizedName("fnafwall");
            this.setSoundType(SoundType.STONE);
            this.setHarvestLevel("pickaxe", 1);
            this.setHardness(1.25f);
            this.setResistance(21.0f);
            this.setLightLevel(0.0f);
            this.setLightOpacity(255);
            this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        }
    }
}
