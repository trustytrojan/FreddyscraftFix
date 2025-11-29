package net.mcreator.five_nights_at_freddycraft;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = "five_nights_at_freddycraft")
@Mod.EventBusSubscriber(modid = "five_nights_at_freddycraft")
public class ModConfig
{
    @Config.Comment("Spawn weights for all FNAF entities")
    public static final SpawnWeights spawnWeights = new SpawnWeights();
    
    public static class SpawnWeights
    {
        public int Animdude = 1;
        public int BalloonBoy = 2;
        public int Ballora = 2;
        public int Bidybab = 2;
        public int BonBon = 2;
        public int Bonnet = 2;
        public int BonnieTheBunny = 3;
        public int ChicaTheChicken = 3;
        public int CircusBaby = 1;
        public int CryingChild = 1;
        public int Electrobab = 2;
        public int Endo02 = 3;
        public int Endoplush = 2;
        public int Endoskeleton = 2;
        public int Ennard = 1;
        public int FoxyThePirateFox = 2;
        public int Fredbear = 2;
        public int FreddyFazbear = 3;
        public int FuntimeFoxy = 2;
        public int FuntimeFreddy = 2;
        public int GoldenFreddy = 1;
        public int JackOBonnie = 1;
        public int JackOChica = 1;
        public int JJ = 2;
        public int Lolbit = 1;
        public int Mangle = 2;
        public int Minireena = 2;
        public int MrChipper = 1;
        public int Nightmare = 1;
        public int NightmareBB = 1;
        public int NightmareBonnie = 1;
        public int NightmareChica = 1;
        public int NightmareFoxy = 1;
        public int NightmareFredbear = 1;
        public int NightmareFreddy = 1;
        public int NightmareMangle = 1;
        public int Nightmarionne = 1;
        public int Paperpals = 1;
        public int PhantomBB = 1;
        public int PhantomChica = 1;
        public int PhantomFoxy = 1;
        public int PhantomFreddy = 1;
        public int PhantomMangle = 1;
        public int PhantomPuppet = 1;
        public int Plushtrap = 1;
        public int PurpleGuy = 1;
        public int SecurityGuard = 1;
        public int ShadowBonnie = 1;
        public int ShadowFreddy = 1;
        public int Springbonnie = 2;
        public int Springtrap = 1;
        public int ThePuppet = 2;
        public int ToyBonnie = 2;
        public int ToyChica = 2;
        public int ToyFreddy = 2;
        public int VirtuaFreddy = 1;
        public int WitheredBonnie = 2;
        public int WitheredChica = 2;
        public int WitheredFoxy = 2;
        public int WitheredFreddy = 2;
        public int WitheredGoldenFreddy = 1;
        public int Yendo = 1;
    }
    
    @SubscribeEvent
    public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equals("five_nights_at_freddycraft")) {
            ConfigManager.sync("five_nights_at_freddycraft", Config.Type.INSTANCE);
        }
    }
}
