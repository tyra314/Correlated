package com.elytradev.correlated.init;

import com.elytradev.correlated.tile.TileEntityBeaconLens;
import com.elytradev.correlated.tile.TileEntityController;
import com.elytradev.correlated.tile.TileEntityDriveBay;
import com.elytradev.correlated.tile.TileEntityImporterChest;
import com.elytradev.correlated.tile.TileEntityInterface;
import com.elytradev.correlated.tile.TileEntityMemoryBay;
import com.elytradev.correlated.tile.TileEntityMicrowaveBeam;
import com.elytradev.correlated.tile.TileEntityNetworkImporter;
import com.elytradev.correlated.tile.TileEntityOldWirelessReceiver;
import com.elytradev.correlated.tile.TileEntityOldWirelessTransmitter;
import com.elytradev.correlated.tile.TileEntityOpticalReceiver;
import com.elytradev.correlated.tile.TileEntityPotentialisticsImporter;
import com.elytradev.correlated.tile.TileEntityTerminal;
import com.elytradev.correlated.tile.TileEntityVTImporter;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class CTiles {

	public static void register() {
		GameRegistry.registerTileEntity(TileEntityController.class, "correlated:controller_new");
		GameRegistry.registerTileEntity(TileEntityDriveBay.class, "correlated:drive_bay");
		GameRegistry.registerTileEntity(TileEntityMemoryBay.class, "correlated:memory_bay");
		GameRegistry.registerTileEntity(TileEntityTerminal.class, "correlated:terminal");
		GameRegistry.registerTileEntity(TileEntityInterface.class, "correlated:interface");
		GameRegistry.registerTileEntity(TileEntityImporterChest.class, "correlated:importer_chest");
		GameRegistry.registerTileEntity(TileEntityMicrowaveBeam.class, "correlated:microwave_beam");
		GameRegistry.registerTileEntity(TileEntityOpticalReceiver.class, "correlated:optical");
		GameRegistry.registerTileEntity(TileEntityBeaconLens.class, "correlated:beacon_lens");
		
		GameRegistry.registerTileEntity(TileEntityNetworkImporter.class, "correlatedpotentialistics:controller");
		GameRegistry.registerTileEntity(TileEntityVTImporter.class, "correlatedpotentialistics:vt");
		
		GameRegistry.registerTileEntity(TileEntityOldWirelessReceiver.class, "correlated:wireless_receiver");
		GameRegistry.registerTileEntity(TileEntityOldWirelessTransmitter.class, "correlated:wireless_transmitter");
		
		GameRegistry.registerTileEntity(TileEntityPotentialisticsImporter.A.class, "correlatedpotentialistics:controller_new");
		GameRegistry.registerTileEntity(TileEntityPotentialisticsImporter.B.class, "correlatedpotentialistics:drive_bay");
		GameRegistry.registerTileEntity(TileEntityPotentialisticsImporter.C.class, "correlatedpotentialistics:memory_bay");
		GameRegistry.registerTileEntity(TileEntityPotentialisticsImporter.D.class, "correlatedpotentialistics:terminal");
		GameRegistry.registerTileEntity(TileEntityPotentialisticsImporter.E.class, "correlatedpotentialistics:interface");
		GameRegistry.registerTileEntity(TileEntityPotentialisticsImporter.F.class, "correlatedpotentialistics:wireless_receiver");
		GameRegistry.registerTileEntity(TileEntityPotentialisticsImporter.G.class, "correlatedpotentialistics:wireless_transmitter");
		GameRegistry.registerTileEntity(TileEntityPotentialisticsImporter.H.class, "correlatedpotentialistics:importer_chest");
	}
	
}
