package com.sean.unit10;

public class Parcel1 {
	class Contents{
		private int i=11;
		public int value(){
			return i;
		}
	}
	class Destination{
		private String lable;
		public Destination(String whereTo) {
			// TODO Auto-generated constructor stub
			lable=whereTo;
		}
		String readLable(){
			return lable;
		}
	}
	public void ship(String dest){
		Contents c=new Contents();
		Destination d=new Destination(dest);
		System.out.println(d.readLable());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel1 p=new Parcel1();
		p.ship("Tasmania");

	}

}
