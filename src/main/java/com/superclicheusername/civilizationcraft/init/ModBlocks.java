package com.superclicheusername.civilizationcraft.init;

import com.superclicheusername.civilizationcraft.block.*;
import com.superclicheusername.civilizationcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
	public static final BlockCC flag = new BlockFlag();
	public static final BlockCC OreAluminum = new BlockOreAluminum();
	public static final BlockCC OreChromium = new BlockOreChromium();
	public static final BlockCC OreCinnabar = new BlockOreCinnabar();
	public static final BlockCC OreCobalt = new BlockOreCobalt();
	public static final BlockCC OreCopper = new BlockOreCopper();
	public static final BlockCC OreLead = new BlockOreLead();
	public static final BlockCC OreLithium = new BlockOreLithium();
	public static final BlockCC OreMagnesium = new BlockOreMagnesium();
	public static final BlockCC OreMithril = new BlockOreMithril();
	public static final BlockCC OreNickel = new BlockOreNickel();
	public static final BlockCC OreSilver = new BlockOreSilver();
	public static final BlockCC OreThorium = new BlockOreThorium();
	public static final BlockCC OreTin = new BlockOreTin();
	public static final BlockCC OreTitanium = new BlockOreTitanium();
	public static final BlockCC OreTungsten = new BlockOreTungsten();
	public static final BlockCC OreUranium = new BlockOreUranium();
	public static final BlockCC OreZinc = new BlockOreZinc();

	public static void init()
	{
		GameRegistry.registerBlock(flag, "flag");
		GameRegistry.registerBlock(OreAluminum, "orealuminum");
		GameRegistry.registerBlock(OreChromium, "orechromium");
		GameRegistry.registerBlock(OreCinnabar, "orecinnabar");
		GameRegistry.registerBlock(OreCobalt, "orecobalt");
		GameRegistry.registerBlock(OreCopper, "orecopper");
		GameRegistry.registerBlock(OreLead, "orelead");
		GameRegistry.registerBlock(OreLithium, "orelithium");
		GameRegistry.registerBlock(OreMagnesium, "oremagnesium");
		GameRegistry.registerBlock(OreMithril, "oremithril");
		GameRegistry.registerBlock(OreNickel, "orenickel");
		GameRegistry.registerBlock(OreSilver, "oresilver");
		GameRegistry.registerBlock(OreThorium, "orethorium");
		GameRegistry.registerBlock(OreTin, "oretin");
		GameRegistry.registerBlock(OreTitanium, "oretitanium");
		GameRegistry.registerBlock(OreTungsten, "oretungsten");
		GameRegistry.registerBlock(OreUranium, "oreuranium");
		GameRegistry.registerBlock(OreZinc, "orezinc");
	}
}
