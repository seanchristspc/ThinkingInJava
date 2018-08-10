package com.sean.unit10;

public class Outer {
	class Inner{
		
	}
	public Inner getInner(){
		return new Inner();
	}
	public static void main(String[] args) {
		Outer o=new Outer();
	Outer.Inner p =o.getInner();
	System.out.println(p.getClass().getSimpleName());

	}

}
