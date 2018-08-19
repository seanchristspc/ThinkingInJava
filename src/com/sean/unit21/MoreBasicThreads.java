package com.sean.unit21;

public class MoreBasicThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++)
			new Thread(new LiftOff()).start();
		System.out.println("waiting for LiftOff");

	}

}
