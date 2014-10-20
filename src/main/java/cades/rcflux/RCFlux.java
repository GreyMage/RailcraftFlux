package cades.rcflux;

import mods.railcraft.api.crafting.IBlastFurnaceCraftingManager;
import mods.railcraft.api.crafting.RailcraftCraftingManager;
import mods.railcraft.api.events.CartLockdownEvent;
import mods.railcraft.api.helpers.StructureHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = RCFlux.MODID, version = RCFlux.VERSION)
public class RCFlux
{
    public static final String MODID = "rcflux";
    public static final String VERSION = "1.0";
    
    public final static Block blockFluxFeeder = new BlockFluxFeeder(Material.rock);
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("RC Flux >> "+Blocks.dirt.getUnlocalizedName());
        
        // config Block
        GameRegistry.registerBlock(blockFluxFeeder, "blockFluxFeeder");
        
        ItemStack dirt = new ItemStack(Blocks.dirt,1);
        ItemStack stone = new ItemStack(Blocks.cobblestone,1);
        RailcraftCraftingManager.blastFurnace.addRecipe(dirt, false, false, 5, stone);
        
        
    }
}
