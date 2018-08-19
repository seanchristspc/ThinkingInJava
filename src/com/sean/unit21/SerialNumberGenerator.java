package com.sean.unit21;

public class SerialNumberGenerator {
	private static volatile int serialNumber=0;
	

	public static synchronized int nextSerialNumber() {
		return serialNumber++;	//Not thread-safe

	}

}
