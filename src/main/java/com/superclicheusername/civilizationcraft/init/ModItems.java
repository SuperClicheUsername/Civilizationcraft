package com.superclicheusername.civilizationcraft.init;

import com.superclicheusername.civilizationcraft.item.ItemCC;
import com.superclicheusername.civilizationcraft.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
	public static final ItemCC mapleLeaf = new ItemMapleLeaf();

	public static void init()
	{
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
