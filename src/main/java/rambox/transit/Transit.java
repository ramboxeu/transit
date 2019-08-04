package rambox.transit;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import rambox.transit.proxy.CommonProxy;

@Mod(modid="transit")
public class Transit
{
    @Mod.Instance
    public static Transit instance;

    @SidedProxy(clientSide = "rambox.transit.proxy.ClientProxy", serverSide = "rambox.transit.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static Logger logger;

    public static final String version = "0.1";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        logger.debug("====[TRANSIT]====\nWelcome to Transit v{}\n\nMaking Minecraft more technical since 2019.================", version);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
