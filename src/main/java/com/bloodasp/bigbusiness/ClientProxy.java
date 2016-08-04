package com.bloodasp.bigbusiness;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	public void preInit(FMLPreInitializationEvent event){
		super.preInit(event);
		RegistryManager.registerItemRenderers();
}
	

}
