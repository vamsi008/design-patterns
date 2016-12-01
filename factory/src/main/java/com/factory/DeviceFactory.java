package com.factory;

import com.factory.model.Device;
import com.factory.model.Mobile;
import com.factory.model.Tablet;

public class DeviceFactory {
	
	public static Device getDeviceInstance(String type){
			if(type.equals("Mobile")){
				return new Mobile();
			}
			else{
				return new Tablet();
			}
	}

}
