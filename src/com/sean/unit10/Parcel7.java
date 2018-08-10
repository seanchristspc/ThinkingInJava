package com.sean.unit10;

public class Parcel7 {
	public Contents contents(){
		return new Contents() {
			private int i=11;
			@Override
			public int value() {
				// TODO Auto-generated method stub
				return i;
			}
		};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parcel7 p=new Parcel7();
		Contents c=p.contents();
	}

}
