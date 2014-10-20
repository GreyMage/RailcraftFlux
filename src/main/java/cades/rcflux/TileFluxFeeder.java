package cades.rcflux;

import mods.railcraft.api.electricity.IElectricGrid;
import mods.railcraft.api.electricity.IElectricGrid.ChargeHandler;
import mods.railcraft.api.electricity.IElectricGrid.ChargeHandler.ConnectType;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import cofh.api.energy.IEnergyHandler;

public class TileFluxFeeder extends TileEntity implements IElectricGrid {

	private final ChargeHandler chargeHandler = new ChargeHandler(this, ConnectType.BLOCK, 1.0D);

	@Override
	public void updateEntity() {
		super.updateEntity();
		if (!this.worldObj.isRemote) {
			this.chargeHandler.tick();
		}
	}

	@Override
	public void readFromNBT(NBTTagCompound data) {
		super.readFromNBT(data);
		this.chargeHandler.readFromNBT(data);
	}
	 
	@Override
	public void writeToNBT(NBTTagCompound data) {
		super.writeToNBT(data);
		this.chargeHandler.writeToNBT(data);
	}
	
	@Override
	public boolean canConnectEnergy(ForgeDirection from) {
		return true;
	}

	@Override
		public ChargeHandler getChargeHandler() {
			// TODO Auto-generated method stub
		return chargeHandler;
	}
	
	@Override
	public TileEntity getTile() {
		// TODO Auto-generated method stub
		return this;
	}
	
}
