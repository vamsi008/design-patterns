package com.factory;

import com.factory.model.Device;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Device device1 = DeviceFactory.getDeviceInstance("Mobile");
		device1.getDeviceType();
		Device device2 = DeviceFactory.getDeviceInstance("Tablet");
		device2.getDeviceType();
	}
}
