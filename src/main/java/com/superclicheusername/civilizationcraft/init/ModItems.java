package com.superclicheusername.civilizationcraft.init;

import com.superclicheusername.civilizationcraft.item.ItemCC;
import com.superclicheusername.civilizationcraft.item.ItemMapleLeaf;
import com.superclicheusername.civilizationcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
	public static final ItemCC mapleLeaf = new ItemMapleLeaf();

	public static void init()
	{
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
