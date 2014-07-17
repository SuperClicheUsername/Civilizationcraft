package com.superclicheusername.civilizationcraft.creativetab;

import com.superclicheusername.civilizationcraft.init.ModBlocks;
import com.superclicheusername.civilizationcraft.init.ModItems;
import com.superclicheusername.civilizationcraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCC
{
	public static final CreativeTabs CC_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.mapleLeaf;
		}
	};
}
