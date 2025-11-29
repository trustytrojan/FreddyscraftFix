//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/t/Projects/Minecraft-Deobfuscator3000/mappings/1.12"!

//Decompiled by Procyon!

package net.mcreator.five_nights_at_freddycraft;

import net.minecraftforge.fml.common.*;
import java.util.function.*;
import net.minecraft.block.*;
import net.minecraft.world.biome.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraft.potion.*;
import net.minecraft.util.*;
import net.minecraftforge.fml.common.discovery.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraftforge.fml.common.network.simpleimpl.*;
import net.minecraftforge.event.*;
import net.minecraft.world.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.chunk.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.world.storage.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.*;
import net.minecraftforge.fml.common.network.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.client.event.*;
import java.lang.annotation.*;

public class ElementsFiveNightsAtFreddycraftMod implements IFuelHandler, IWorldGenerator
{
    public final List<ModElement> elements;
    public final List<Supplier<Block>> blocks;
    public final List<Supplier<Item>> items;
    public final List<Supplier<Biome>> biomes;
    public final List<Supplier<EntityEntry>> entities;
    public final List<Supplier<Potion>> potions;
    public static Map<ResourceLocation, SoundEvent> sounds;
    private int messageID;
    
    public ElementsFiveNightsAtFreddycraftMod() {
        this.elements = new ArrayList<ModElement>();
        this.blocks = new ArrayList<Supplier<Block>>();
        this.items = new ArrayList<Supplier<Item>>();
        this.biomes = new ArrayList<Supplier<Biome>>();
        this.entities = new ArrayList<Supplier<EntityEntry>>();
        this.potions = new ArrayList<Supplier<Potion>>();
        this.messageID = 0;
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.freddy.ambient"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.freddy.ambient")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.fnaf1.death"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.fnaf1.death")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.bonniechica.ambient"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.bonniechica.ambient")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.foxy.ambient"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.foxy.ambient")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.goldenfreddy.ambient"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.goldenfreddy.ambient")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.goldenfreddy.death"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.goldenfreddy.death")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.fnaf2.death"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.fnaf2.death")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.mangle.ambient"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.mangle.ambient")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.bbjj.laugh"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.bbjj.laugh")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.puppet.ambient"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.puppet.ambient")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.fnaf3.death"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.fnaf3.death")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.phantommangle.ambient"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.phantommangle.ambient")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.phantompuppet.ambient"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.phantompuppet.ambient")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.fnaf4.death"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.fnaf4.death")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.fredbear.laugh"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.fredbear.laugh")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.nightmare.death"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.nightmare.death")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.plushtrap.death"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.plushtrap.death")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.fredbear.death"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.fredbear.death")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.baby.ambient"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.baby.ambient")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.fnafsl.death"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.fnafsl.death")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.ballora.ambient"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.ballora.ambient")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.funtimefreddy.ambient"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.funtimefreddy.ambient")));
        ElementsFiveNightsAtFreddycraftMod.sounds.put(new ResourceLocation("five_nights_at_freddycraft", "entity.funtimefoxy.ambient"), new SoundEvent(new ResourceLocation("five_nights_at_freddycraft", "entity.funtimefoxy.ambient")));
    }
    
    public void preInit(final FMLPreInitializationEvent event) {
        try {
            for (final ASMDataTable.ASMData asmData : event.getAsmData().getAll(ModElement.Tag.class.getName())) {
                final Class<?> clazz = Class.forName(asmData.getClassName());
                if (clazz.getSuperclass() == ModElement.class) {
                    this.elements.add((ModElement)clazz.getConstructor(this.getClass()).newInstance(this));
                }
            }
        }
        catch (final Exception e) {
            e.printStackTrace();
        }
        Collections.sort(this.elements);
        this.elements.forEach(ModElement::initElements);
        this.addNetworkMessage(FiveNightsAtFreddycraftModVariables.WorldSavedDataSyncMessageHandler.class, FiveNightsAtFreddycraftModVariables.WorldSavedDataSyncMessage.class, new Side[] { Side.SERVER, Side.CLIENT });
    }
    
    public void registerSounds(final RegistryEvent.Register<SoundEvent> event) {
        for (final Map.Entry<ResourceLocation, SoundEvent> sound : ElementsFiveNightsAtFreddycraftMod.sounds.entrySet()) {
            event.getRegistry().register(sound.getValue().setRegistryName((ResourceLocation)sound.getKey()));
        }
    }
    
    public void generate(final Random random, final int chunkX, final int chunkZ, final World world, final IChunkGenerator cg, final IChunkProvider cp) {
        this.elements.forEach(element -> element.generateWorld(random, chunkX * 16, chunkZ * 16, world, world.provider.getDimension(), cg, cp));
    }
    
    public int getBurnTime(final ItemStack fuel) {
        for (final ModElement element : this.elements) {
            final int ret = element.addFuel(fuel);
            if (ret != 0) {
                return ret;
            }
        }
        return 0;
    }
    
    @SubscribeEvent
    public void onPlayerLoggedIn(final PlayerEvent.PlayerLoggedInEvent event) {
        if (!event.player.world.isRemote) {
            final WorldSavedData mapdata = (WorldSavedData)FiveNightsAtFreddycraftModVariables.MapVariables.get(event.player.world);
            final WorldSavedData worlddata = (WorldSavedData)FiveNightsAtFreddycraftModVariables.WorldVariables.get(event.player.world);
            if (mapdata != null) {
                FiveNightsAtFreddycraftMod.PACKET_HANDLER.sendTo((IMessage)new FiveNightsAtFreddycraftModVariables.WorldSavedDataSyncMessage(0, mapdata), (EntityPlayerMP)event.player);
            }
            if (worlddata != null) {
                FiveNightsAtFreddycraftMod.PACKET_HANDLER.sendTo((IMessage)new FiveNightsAtFreddycraftModVariables.WorldSavedDataSyncMessage(1, worlddata), (EntityPlayerMP)event.player);
            }
        }
    }
    
    @SubscribeEvent
    public void onPlayerChangedDimension(final PlayerEvent.PlayerChangedDimensionEvent event) {
        if (!event.player.world.isRemote) {
            final WorldSavedData worlddata = (WorldSavedData)FiveNightsAtFreddycraftModVariables.WorldVariables.get(event.player.world);
            if (worlddata != null) {
                FiveNightsAtFreddycraftMod.PACKET_HANDLER.sendTo((IMessage)new FiveNightsAtFreddycraftModVariables.WorldSavedDataSyncMessage(1, worlddata), (EntityPlayerMP)event.player);
            }
        }
    }
    
    public <T extends IMessage, V extends IMessage> void addNetworkMessage(final Class<? extends IMessageHandler<T, V>> handler, final Class<T> messageClass, final Side... sides) {
        for (final Side side : sides) {
            FiveNightsAtFreddycraftMod.PACKET_HANDLER.registerMessage(handler, messageClass, this.messageID, side);
        }
        ++this.messageID;
    }
    
    public List<ModElement> getElements() {
        return this.elements;
    }
    
    public List<Supplier<Block>> getBlocks() {
        return this.blocks;
    }
    
    public List<Supplier<Item>> getItems() {
        return this.items;
    }
    
    public List<Supplier<Biome>> getBiomes() {
        return this.biomes;
    }
    
    public List<Supplier<EntityEntry>> getEntities() {
        return this.entities;
    }
    
    public List<Supplier<Potion>> getPotions() {
        return this.potions;
    }
    
    static {
        ElementsFiveNightsAtFreddycraftMod.sounds = new HashMap<ResourceLocation, SoundEvent>();
    }
    
    public static class GuiHandler implements IGuiHandler
    {
        public Object getServerGuiElement(final int id, final EntityPlayer player, final World world, final int x, final int y, final int z) {
            return null;
        }
        
        public Object getClientGuiElement(final int id, final EntityPlayer player, final World world, final int x, final int y, final int z) {
            return null;
        }
    }
    
    public static class ModElement implements Comparable<ModElement>
    {
        protected final ElementsFiveNightsAtFreddycraftMod elements;
        protected final int sortid;
        
        public ModElement(final ElementsFiveNightsAtFreddycraftMod elements, final int sortid) {
            this.elements = elements;
            this.sortid = sortid;
        }
        
        public void initElements() {
        }
        
        public void init(final FMLInitializationEvent event) {
        }
        
        public void preInit(final FMLPreInitializationEvent event) {
        }
        
        public void generateWorld(final Random random, final int posX, final int posZ, final World world, final int dimID, final IChunkGenerator cg, final IChunkProvider cp) {
        }
        
        public void serverLoad(final FMLServerStartingEvent event) {
        }
        
        public void registerModels(final ModelRegistryEvent event) {
        }
        
        public int addFuel(final ItemStack fuel) {
            return 0;
        }
        
        @Override
        public int compareTo(final ModElement other) {
            return this.sortid - other.sortid;
        }
        
        @Retention(RetentionPolicy.RUNTIME)
        public @interface Tag {
        }
    }
}
