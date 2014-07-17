package com.superclicheusername.civilizationcraft.block;

public class BlockOreTungsten extends BlockCC
{
	public BlockOreTungsten()
	{
		super();
		this.setHardness(3.0f);
		this.setResistance(7.0f);
		this.setBlockName("oretungsten");
		this.setBlockTextureName("oretungsten");
		this.setHarvestLevel("pickaxe", 3);
	}
}
