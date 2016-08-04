package com.bloodasp.bigbusiness.blocks;

import com.bloodasp.bigbusiness.BigBusiness;
import com.bloodasp.bigbusiness.tileentity.TileEntityShop;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockShop extends TEBlockBase implements ITileEntityProvider{

	public BlockShop(){
		super(Material.WOOD);
		setUnlocalizedName("shop");
		setCreativeTab(CreativeTabs.MISC);
		setHardness(100.0f);
	}
	
	@SideOnly(Side.CLIENT)
	public void initModel(){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(),"inventory"));
}
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityShop();
}
}
