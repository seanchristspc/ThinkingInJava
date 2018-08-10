package com.sean.unit10;

import com.sean.unit10.Parcel1.Contents;
import com.sean.unit10.Parcel1.Destination;

public class Parcel2 {

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
	public Destination to(String s){
		return new Destination(s);
	}
	public Contents contents(){
		return new Contents();
	}
	public void ship(String dest){
		Contents c=new Contents();
		Destination d=new Destination(dest);
		System.out.println(d.readLable());
	}
	
	public static void main(String[] args) {
		Parcel2 p=new Parcel2();
		p.ship("Tasmania");
		Parcel2 q=new Parcel2();
		Parcel2.Contents c=q.contents();
		Parcel2.Destination d=q.to("Borneo");

	}

}
