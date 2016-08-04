package com.bloodasp.bigbusiness;


import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

@Mod(modid = BigBusiness.MODID, version = BigBusiness.VERSION, name = BigBusiness.NAME)
public class BigBusiness
{
    public static final String MODID = "bigbusiness";
    public static final String NAME = "Big Business";
    public static final String VERSION = "0.1.0";
    
    @Instance
    public static BigBusiness instance;
    
    @SidedProxy(clientSide = "com.bloodasp.bigbusiness.ClientProxy", serverSide = "com.bloodasp.bigbusiness.ServerProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	proxy.postInit(event);
}
}
