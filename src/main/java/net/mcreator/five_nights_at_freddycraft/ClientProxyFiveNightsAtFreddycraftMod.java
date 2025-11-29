//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/t/Projects/Minecraft-Deobfuscator3000/mappings/1.12"!

//Decompiled by Procyon!

package net.mcreator.five_nights_at_freddycraft;

import net.minecraftforge.client.model.obj.*;
import net.minecraftforge.fml.common.event.*;

public class ClientProxyFiveNightsAtFreddycraftMod implements IProxyFiveNightsAtFreddycraftMod
{
    public void init(final FMLInitializationEvent event) {
    }
    
    public void preInit(final FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain("five_nights_at_freddycraft");
    }
    
    public void postInit(final FMLPostInitializationEvent event) {
    }
    
    public void serverLoad(final FMLServerStartingEvent event) {
    }
}
