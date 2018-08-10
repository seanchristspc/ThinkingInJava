package com.sean.unit10;

public class Parcel5 {
	public Destination destination(String s){
		class PDestination implements Destination{
			private String lable;
			
			private PDestination(String whereTo){
				lable=whereTo;
			}
			@Override
			public String readLable() {
				
				return lable;
			}
			
			
		}
		return new PDestination(s);
	}
	
	public static void main(String[] args) {
		Parcel5 p=new Parcel5();
		Destination d=p.destination("Tasmania");

	}

}
