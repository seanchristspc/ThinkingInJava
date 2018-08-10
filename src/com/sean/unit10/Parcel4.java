package com.sean.unit10;

public class Parcel4 {
	private class PContents implements Contents{
		private int i=11;
		@Override
		public int value() {
			// TODO Auto-generated method stub
			return i;
		}
		
	}
	protected class PDestination implements Destination{

		private String label;
		private PDestination(String whereTO) {
			label=whereTO;
		}
		@Override
		public String readLable() {
			return label;
		}
		
	}
	public Destination destination(String s){
		return new PDestination(s);
	}
	public Contents contents(){
		return new PContents();
	}
	

}
