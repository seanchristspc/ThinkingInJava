package com.sean.unit17;

import java.util.AbstractList;

public class CountingIntegerList extends AbstractList<Integer> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new CountingIntegerList(30));

	}
	private int size;
	public CountingIntegerList(int size) {
		// TODO Auto-generated constructor stub
		this.size=size<0?0:size;
	}
	@Override
	public Integer get(int index) {
		// TODO Auto-generated method stub
		return Integer.valueOf(index);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}
