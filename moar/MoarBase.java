package moar;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="MoarBase", name="Moar base mod", version="1.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class MoarBase {
	@Instance("MoarBase")
	public static MoarBase instance;
	public static Configuration config = null;
	@SidedProxy(clientSide="moar.Client", serverSide="moar.Proxy")
	public static Proxy proxy;
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		config = new Configuration(event.getSuggestedConfigurationFile());
		System.out.println("Config located at " + event.getSuggestedConfigurationFile().getAbsolutePath());
		readConfig();
	}
	public void readConfig()
	{
		config.load();
		//Put configuration-reading code here
		config.save();
	}
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
	@Init
	public void load(FMLInitializationEvent event) {
		
	}
}
