package com.ridebuilder5.lumbermod.blocks.cherry;

import com.ridebuilder5.lumbermod.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CherryPlanks extends BlockBase {

	public CherryPlanks(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.WOOD);
        setHardness(2.0f);
        setResistance(15.0f);
        setHarvestLevel("axe", 0);
        setLightLevel(0.1f);
        //setLightOpacity(1);
        //setBlockUnbreakable();

	}
}
