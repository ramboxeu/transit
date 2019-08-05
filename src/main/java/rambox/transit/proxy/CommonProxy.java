package rambox.transit.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import rambox.transit.Transit;
import rambox.transit.block.TransitBlocks;
import rambox.transit.item.TransitItems;

@Mod.EventBusSubscriber
public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        Transit.logger.info("Registering {} blocks!", TransitBlocks.BLOCKS.size());
        for(Block block : TransitBlocks.BLOCKS)
        {
            event.getRegistry().register(block);
        }
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        Transit.logger.info("Registering {} items!", TransitItems.ITEMS.size());
        for(Item item : TransitItems.ITEMS)
        {
            event.getRegistry().register(item);
        }
    }
}
