//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "/home/t/Projects/Minecraft-Deobfuscator3000/mappings/1.12"!

//Decompiled by Procyon!

package net.mcreator.five_nights_at_freddycraft;

import net.minecraftforge.fml.common.event.*;

public interface IProxyFiveNightsAtFreddycraftMod
{
    void preInit(final FMLPreInitializationEvent p0);
    
    void init(final FMLInitializationEvent p0);
    
    void postInit(final FMLPostInitializationEvent p0);
    
    void serverLoad(final FMLServerStartingEvent p0);
}
