package cades.rcflux;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import mods.railcraft.api.carts.CartTools;
import mods.railcraft.api.electricity.IElectricGrid;
import mods.railcraft.api.electricity.IElectricGrid.ChargeHandler.ConnectType;
import mods.railcraft.api.tracks.RailTools;
import mods.railcraft.api.tracks.TrackInstanceBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockFluxFeeder extends Block implements ITileEntityProvider {
	
	protected BlockFluxFeeder(Material material) {
		super(material);
		setHardness(4.0F); // 33% harder than diamond
		setStepSound(Block.soundTypePiston); // sounds got renamed, look in Block class for what blocks have what sounds
		setBlockName("fluxTrackLoader"); // changed in 1.7
		this.setCreativeTab(CreativeTabs.tabTransport);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileFluxFeeder();
	}

}
