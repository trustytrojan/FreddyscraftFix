//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/t/Projects/Minecraft-Deobfuscator3000/mappings/1.12"!

//Decompiled by Procyon!

package net.mcreator.five_nights_at_freddycraft;

import net.minecraftforge.fml.common.network.simpleimpl.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.network.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.event.*;
import net.minecraft.block.*;
import net.minecraftforge.registries.*;
import java.util.function.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.item.*;
import net.minecraft.world.biome.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraft.potion.*;
import net.minecraft.util.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraftforge.fluids.*;

@Mod(modid = "five_nights_at_freddycraft", version = "1.0.0", acceptedMinecraftVersions = "[1.12.2]")
public class FiveNightsAtFreddycraftMod
{
    public static final String MODID = "five_nights_at_freddycraft";
    public static final String VERSION = "1.0.0";
    public static final SimpleNetworkWrapper PACKET_HANDLER;
    @SidedProxy(clientSide = "net.mcreator.five_nights_at_freddycraft.ClientProxyFiveNightsAtFreddycraftMod", serverSide = "net.mcreator.five_nights_at_freddycraft.ServerProxyFiveNightsAtFreddycraftMod")
    public static IProxyFiveNightsAtFreddycraftMod proxy;
    @Mod.Instance("five_nights_at_freddycraft")
    public static FiveNightsAtFreddycraftMod instance;
    public ElementsFiveNightsAtFreddycraftMod elements;
    
    public FiveNightsAtFreddycraftMod() {
        this.elements = new ElementsFiveNightsAtFreddycraftMod();
    }
    
    @Mod.EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        GameRegistry.registerWorldGenerator((IWorldGenerator)this.elements, 5);
        GameRegistry.registerFuelHandler((IFuelHandler)this.elements);
        NetworkRegistry.INSTANCE.registerGuiHandler(this, (IGuiHandler)new ElementsFiveNightsAtFreddycraftMod.GuiHandler());
        this.elements.preInit(event);
        MinecraftForge.EVENT_BUS.register(this.elements);
        this.elements.getElements().forEach(element -> element.preInit(event));
        FiveNightsAtFreddycraftMod.proxy.preInit(event);
    }
    
    @Mod.EventHandler
    public void init(final FMLInitializationEvent event) {
        this.elements.getElements().forEach(element -> element.init(event));
        FiveNightsAtFreddycraftMod.proxy.init(event);
    }
    
    @Mod.EventHandler
    public void postInit(final FMLPostInitializationEvent event) {
        FiveNightsAtFreddycraftMod.proxy.postInit(event);
    }
    
    @Mod.EventHandler
    public void serverLoad(final FMLServerStartingEvent event) {
        this.elements.getElements().forEach(element -> element.serverLoad(event));
        FiveNightsAtFreddycraftMod.proxy.serverLoad(event);
    }
    
    @SubscribeEvent
    public void registerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(this.elements.getBlocks().stream().map(Supplier::get).toArray(Block[]::new));
    }
    
    @SubscribeEvent
    public void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(this.elements.getItems().stream().map(Supplier::get).toArray(Item[]::new));
    }
    
    @SubscribeEvent
    public void registerBiomes(final RegistryEvent.Register<Biome> event) {
        event.getRegistry().registerAll(this.elements.getBiomes().stream().map(Supplier::get).toArray(Biome[]::new));
    }
    
    @SubscribeEvent
    public void registerEntities(final RegistryEvent.Register<EntityEntry> event) {
        event.getRegistry().registerAll(this.elements.getEntities().stream().map(Supplier::get).toArray(EntityEntry[]::new));
    }
    
    @SubscribeEvent
    public void registerPotions(final RegistryEvent.Register<Potion> event) {
        event.getRegistry().registerAll(this.elements.getPotions().stream().map(Supplier::get).toArray(Potion[]::new));
    }
    
    @SubscribeEvent
    public void registerSounds(final RegistryEvent.Register<SoundEvent> event) {
        this.elements.registerSounds(event);
    }
    
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void registerModels(final ModelRegistryEvent event) {
        this.elements.getElements().forEach(element -> element.registerModels(event));
    }
    
    static {
        PACKET_HANDLER = NetworkRegistry.INSTANCE.newSimpleChannel("five_nights_at_fre:a");
        FluidRegistry.enableUniversalBucket();
    }
}
