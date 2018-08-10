package com.sean.unit11;

import java.util.Collection;
import java.util.Iterator;

public class InterfaceVsIterator {
	public static void display(Iterator<String> it){
		while(it.hasNext()){
			String s=it.next();
			System.out.print(s+"  ");
		}
		System.out.println();
	}
	public static void display(Collection<String> strs){
		for(String s:strs){
			System.out.println(s+"  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		

	}

}
