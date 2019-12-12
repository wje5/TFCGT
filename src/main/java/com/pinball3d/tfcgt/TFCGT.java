package com.pinball3d.tfcgt;

import com.pinball3d.tfcgt.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TFCGT.MODID, name = TFCGT.NAME, version = TFCGT.VERSION, dependencies = "required-after:maplelib;required-after:terrafirmacraft;required-after:gregtech")
public class TFCGT {
	public static final String MODID = "tfcgt";
	public static final String NAME = "TFCGregTech";
	public static final String VERSION = "1.0.0";

	@Instance("tfcgt")
	public static TFCGT instance;

	@SidedProxy(clientSide = "com.pinball3d.tfcgt.proxy.ClientProxy", serverSide = "com.pinball3d.tfcgt.proxy.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
}
