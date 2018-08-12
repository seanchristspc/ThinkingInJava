package com.sean.unit17;

import java.util.ArrayList;
import java.util.HashSet;

import com.sean.unit16.RandomGenerator;

public class CollectionDataGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ArrayList<String>(
				CollectionData.list(
						new RandomGenerator.String(9), 10)));
		System.out.println(new HashSet<Integer>(
				new CollectionData<Integer>(
						new RandomGenerator.Integer(),10)));
	}

}
