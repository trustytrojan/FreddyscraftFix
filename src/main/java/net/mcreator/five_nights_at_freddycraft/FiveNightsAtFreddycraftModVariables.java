//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/t/Projects/Minecraft-Deobfuscator3000/mappings/1.12"!

//Decompiled by Procyon!

package net.mcreator.five_nights_at_freddycraft;

import net.minecraft.world.storage.*;
import net.minecraft.nbt.*;
import net.minecraft.world.*;
import net.minecraftforge.fml.common.network.simpleimpl.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.client.*;
import io.netty.buffer.*;
import net.minecraftforge.fml.common.network.*;

public class FiveNightsAtFreddycraftModVariables
{
    public static class MapVariables extends WorldSavedData
    {
        public static final String DATA_NAME = "five_nights_at_freddycraft_mapvars";
        
        public MapVariables() {
            super("five_nights_at_freddycraft_mapvars");
        }
        
        public MapVariables(final String s) {
            super(s);
        }
        
        public void readFromNBT(final NBTTagCompound nbt) {
        }
        
        public NBTTagCompound writeToNBT(final NBTTagCompound nbt) {
            return nbt;
        }
        
        public void syncData(final World world) {
            this.markDirty();
            if (world.isRemote) {
                FiveNightsAtFreddycraftMod.PACKET_HANDLER.sendToServer((IMessage)new WorldSavedDataSyncMessage(0, this));
            }
            else {
                FiveNightsAtFreddycraftMod.PACKET_HANDLER.sendToAll((IMessage)new WorldSavedDataSyncMessage(0, this));
            }
        }
        
        public static MapVariables get(final World world) {
            MapVariables instance = (MapVariables)world.getMapStorage().getOrLoadData(MapVariables.class, "five_nights_at_freddycraft_mapvars");
            if (instance == null) {
                instance = new MapVariables();
                world.getMapStorage().setData("five_nights_at_freddycraft_mapvars", (WorldSavedData)instance);
            }
            return instance;
        }
    }
    
    public static class WorldVariables extends WorldSavedData
    {
        public static final String DATA_NAME = "five_nights_at_freddycraft_worldvars";
        
        public WorldVariables() {
            super("five_nights_at_freddycraft_worldvars");
        }
        
        public WorldVariables(final String s) {
            super(s);
        }
        
        public void readFromNBT(final NBTTagCompound nbt) {
        }
        
        public NBTTagCompound writeToNBT(final NBTTagCompound nbt) {
            return nbt;
        }
        
        public void syncData(final World world) {
            this.markDirty();
            if (world.isRemote) {
                FiveNightsAtFreddycraftMod.PACKET_HANDLER.sendToServer((IMessage)new WorldSavedDataSyncMessage(1, this));
            }
            else {
                FiveNightsAtFreddycraftMod.PACKET_HANDLER.sendToDimension((IMessage)new WorldSavedDataSyncMessage(1, this), world.provider.getDimension());
            }
        }
        
        public static WorldVariables get(final World world) {
            WorldVariables instance = (WorldVariables)world.getPerWorldStorage().getOrLoadData(WorldVariables.class, "five_nights_at_freddycraft_worldvars");
            if (instance == null) {
                instance = new WorldVariables();
                world.getPerWorldStorage().setData("five_nights_at_freddycraft_worldvars", (WorldSavedData)instance);
            }
            return instance;
        }
    }
    
    public static class WorldSavedDataSyncMessageHandler implements IMessageHandler<WorldSavedDataSyncMessage, IMessage>
    {
        public IMessage onMessage(final WorldSavedDataSyncMessage message, final MessageContext context) {
            if (context.side == Side.SERVER) {
                context.getServerHandler().player.getServerWorld().addScheduledTask(() -> this.syncData(message, context, context.getServerHandler().player.world));
            }
            else {
                Minecraft.getMinecraft().addScheduledTask(() -> this.syncData(message, context, Minecraft.getMinecraft().player.world));
            }
            return null;
        }
        
        private void syncData(final WorldSavedDataSyncMessage message, final MessageContext context, final World world) {
            if (context.side == Side.SERVER) {
                message.data.markDirty();
                if (message.type == 0) {
                    FiveNightsAtFreddycraftMod.PACKET_HANDLER.sendToAll((IMessage)message);
                }
                else {
                    FiveNightsAtFreddycraftMod.PACKET_HANDLER.sendToDimension((IMessage)message, world.provider.getDimension());
                }
            }
            if (message.type == 0) {
                world.getMapStorage().setData("five_nights_at_freddycraft_mapvars", message.data);
            }
            else {
                world.getPerWorldStorage().setData("five_nights_at_freddycraft_worldvars", message.data);
            }
        }
    }
    
    public static class WorldSavedDataSyncMessage implements IMessage
    {
        public int type;
        public WorldSavedData data;
        
        public WorldSavedDataSyncMessage() {
        }
        
        public WorldSavedDataSyncMessage(final int type, final WorldSavedData data) {
            this.type = type;
            this.data = data;
        }
        
        public void toBytes(final ByteBuf buf) {
            buf.writeInt(this.type);
            ByteBufUtils.writeTag(buf, this.data.writeToNBT(new NBTTagCompound()));
        }
        
        public void fromBytes(final ByteBuf buf) {
            this.type = buf.readInt();
            if (this.type == 0) {
                this.data = new MapVariables();
            }
            else {
                this.data = new WorldVariables();
            }
            this.data.readFromNBT(ByteBufUtils.readTag(buf));
        }
    }
}
