package net.mcreator.five_nights_at_freddycraft;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;

@Config(modid = "five_nights_at_freddycraft")
@Mod.EventBusSubscriber(modid = "five_nights_at_freddycraft")
public class ModConfig
{
    public static class SpawnConfig
    {
        public int weight;
        public int minGroupSize;
        public int maxGroupSize;
        
        public SpawnConfig(int weight, int minGroupSize, int maxGroupSize) {
            this.weight = weight;
            this.minGroupSize = minGroupSize;
            this.maxGroupSize = maxGroupSize;
        }
    }
    
    public static final SpawnConfig
        Animdude = new SpawnConfig(1, 1, 1),
        BalloonBoy = new SpawnConfig(1, 1, 1),
        Ballora = new SpawnConfig(1, 1, 1),
        Bidybab = new SpawnConfig(1, 1, 1),
        BonBon = new SpawnConfig(1, 1, 1),
        Bonnet = new SpawnConfig(1, 1, 1),
        BonnieTheBunny = new SpawnConfig(1, 1, 1),
        ChicaTheChicken = new SpawnConfig(1, 1, 1),
        CircusBaby = new SpawnConfig(1, 1, 1),
        CryingChild = new SpawnConfig(1, 1, 1),
        Electrobab = new SpawnConfig(1, 1, 1),
        Endo02 = new SpawnConfig(1, 1, 1),
        Endoplush = new SpawnConfig(1, 1, 1),
        Endoskeleton = new SpawnConfig(1, 1, 1),
        Ennard = new SpawnConfig(1, 1, 1),
        FoxyThePirateFox = new SpawnConfig(1, 1, 1),
        Fredbear = new SpawnConfig(1, 1, 1),
        FreddyFazbear = new SpawnConfig(1, 1, 1),
        FuntimeFoxy = new SpawnConfig(1, 1, 1),
        FuntimeFreddy = new SpawnConfig(1, 1, 1),
        GoldenFreddy = new SpawnConfig(1, 1, 1),
        JackOBonnie = new SpawnConfig(1, 1, 1),
        JackOChica = new SpawnConfig(1, 1, 1),
        JJ = new SpawnConfig(1, 1, 1),
        Lolbit = new SpawnConfig(1, 1, 1),
        Mangle = new SpawnConfig(1, 1, 1),
        Minireena = new SpawnConfig(1, 1, 1),
        MrChipper = new SpawnConfig(1, 1, 1),
        Nightmare = new SpawnConfig(1, 1, 1),
        NightmareBB = new SpawnConfig(1, 1, 1),
        NightmareBonnie = new SpawnConfig(1, 1, 1),
        NightmareChica = new SpawnConfig(1, 1, 1),
        NightmareFoxy = new SpawnConfig(1, 1, 1),
        NightmareFredbear = new SpawnConfig(1, 1, 1),
        NightmareFreddy = new SpawnConfig(1, 1, 1),
        NightmareMangle = new SpawnConfig(1, 1, 1),
        Nightmarionne = new SpawnConfig(1, 1, 1),
        Paperpals = new SpawnConfig(1, 1, 1),
        PhantomBB = new SpawnConfig(1, 1, 1),
        PhantomChica = new SpawnConfig(1, 1, 1),
        PhantomFoxy = new SpawnConfig(1, 1, 1),
        PhantomFreddy = new SpawnConfig(1, 1, 1),
        PhantomMangle = new SpawnConfig(1, 1, 1),
        PhantomPuppet = new SpawnConfig(1, 1, 1),
        Plushtrap = new SpawnConfig(1, 1, 1),
        PurpleGuy = new SpawnConfig(1, 1, 1),
        SecurityGuard = new SpawnConfig(1, 1, 1),
        ShadowBonnie = new SpawnConfig(1, 1, 1),
        ShadowFreddy = new SpawnConfig(1, 1, 1),
        Springbonnie = new SpawnConfig(1, 1, 1),
        Springtrap = new SpawnConfig(1, 1, 1),
        ThePuppet = new SpawnConfig(1, 1, 1),
        ToyBonnie = new SpawnConfig(1, 1, 1),
        ToyChica = new SpawnConfig(1, 1, 1),
        ToyFreddy = new SpawnConfig(1, 1, 1),
        VirtuaFreddy = new SpawnConfig(1, 1, 1),
        WitheredBonnie = new SpawnConfig(1, 1, 1),
        WitheredChica = new SpawnConfig(1, 1, 1),
        WitheredFoxy = new SpawnConfig(1, 1, 1),
        WitheredFreddy = new SpawnConfig(1, 1, 1),
        WitheredGoldenFreddy = new SpawnConfig(1, 1, 1),
        Yendo = new SpawnConfig(1, 1, 1);

    public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equals("five_nights_at_freddycraft")) {
            ConfigManager.sync("five_nights_at_freddycraft", Config.Type.INSTANCE);
        }
    }
}
