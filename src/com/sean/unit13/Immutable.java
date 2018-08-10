package com.sean.unit13;

public class Immutable {
	public static String upcase(String s){
		return s.toUpperCase();
	}

	public static void main(String[] args) {
		String q="honey";
		System.out.println(q);
		String qq=upcase(q);
		System.out.println(q);
		System.out.println(qq);
		

	}

}
