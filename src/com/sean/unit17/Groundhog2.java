package com.sean.unit17;

public class Groundhog2 extends Groundhog {

	public Groundhog2(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
	public int hashCode(){
		return number;
	}
	public boolean equals(Object o){
		return o instanceof Groundhog && (number==((Groundhog2)o).number);
	}
	

}
