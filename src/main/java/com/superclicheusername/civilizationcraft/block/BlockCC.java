package com.superclicheusername.civilizationcraft.block;

import com.superclicheusername.civilizationcraft.creativetab.CreativeTabCC;
import com.superclicheusername.civilizationcraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockCC extends Block
{
	public BlockCC(Material material)
	{
		super(material);
		this.setHardness(3.0f);
		this.setResistance(7.0f);
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(CreativeTabCC.CC_TAB);
	}

	public BlockCC()
	{
		this(Material.rock);
	}

	@Override
	public String getUnlocalizedName()
	{
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}
