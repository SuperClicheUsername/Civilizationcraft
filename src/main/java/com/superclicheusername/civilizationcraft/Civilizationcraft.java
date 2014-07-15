package com.superclicheusername.civilizationcraft;

import com.superclicheusername.civilizationcraft.handler.ConfigurationHandler;
import com.superclicheusername.civilizationcraft.init.ModBlocks;
import com.superclicheusername.civilizationcraft.init.ModItems;
import com.superclicheusername.civilizationcraft.proxy.IProxy;
import com.superclicheusername.civilizationcraft.reference.Reference;
import com.superclicheusername.civilizationcraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class Civilizationcraft {
	@Mod.Instance(Reference.MOD_ID)
	public static Civilizationcraft instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS, modId = Reference.MOD_ID)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

		ModItems.init();

		ModBlocks.init();

		LogHelper.info("Pre Initialization Complete!");
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		LogHelper.info("Initialization Complete!");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LogHelper.info("Post Initialization Complete!");
	}
}
