package com.jkgamer2000.blockstuff;

import com.jkgamer2000.blockstuff.handler.ConfigurationHandler;
import com.jkgamer2000.blockstuff.init.ModBlocks;
import com.jkgamer2000.blockstuff.proxy.IProxy;
import com.jkgamer2000.blockstuff.reference.Reference;
import com.jkgamer2000.blockstuff.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class BlockStuff
{
    @Mod.Instance(Reference.MOD_ID)
    public static BlockStuff instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModBlocks.init();


        LogHelper.info("Pre-Initialization Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler
    public void init(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post-Initialization Complete");
    }
}
