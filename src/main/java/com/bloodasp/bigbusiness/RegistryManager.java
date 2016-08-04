package com.bloodasp.bigbusiness;

import com.bloodasp.bigbusiness.blocks.BlockShop;
import com.bloodasp.bigbusiness.items.ItemUpgrade;
import com.bloodasp.bigbusiness.tileentity.TileEntityShop;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RegistryManager {

	public static Item upgrade;
	public static Block shop;
	
	public static void init(){
		//Register Items
		GameRegistry.registerItem(upgrade = new ItemUpgrade(), "itemUpgrade");
		
		//Register Blocks
		GameRegistry.registerBlock(shop = new BlockShop(), "shop");
		
		//Register TileEntities
		GameRegistry.registerTileEntity(TileEntityShop.class, "TileEntityShop");
	}
	
	public static void registerRecipes(){
		
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerItemRenderers(){
		((ItemUpgrade)upgrade).initModel();
		
		((BlockShop)shop).initModel();
	}
}
