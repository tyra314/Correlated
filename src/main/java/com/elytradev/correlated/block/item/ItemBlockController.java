package com.elytradev.correlated.block.item;

import java.util.List;

import com.elytradev.correlated.EnergyHelper;
import com.elytradev.correlated.init.CConfig;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockController extends ItemBlock {

	public ItemBlockController(Block block) {
		super(block);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		if (stack.getMetadata() == 8) {
			tooltip.add(EnergyHelper.formatPotentialUsage(0));
		} else {
			tooltip.add(EnergyHelper.formatPotentialUsage(CConfig.controllerPUsage));
		}
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return stack.getMetadata() >= 8 ? "tile.correlated.cheaty_controller" : "tile.correlated.controller";
	}
	
	@Override
	public boolean getHasSubtypes() {
		return true;
	}
	
	@Override
	public int getMetadata(int damage) {
		return damage;
	}

}
