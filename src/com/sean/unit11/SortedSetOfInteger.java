package com.sean.unit11;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOfInteger {

	public static void main(String[] args) {
		Random rand=new Random();
		SortedSet<Integer> intset=new TreeSet<Integer>();
		for(int i=0;i<10000;i++)
			intset.add(rand.nextInt(30));
		System.out.println(intset);

	}

}
