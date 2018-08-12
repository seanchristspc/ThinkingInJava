package com.sean.unit17;

import java.util.LinkedHashSet;
import java.util.Set;

import com.sean.unit15.Generator;

class Government implements Generator<String>{
	String[] foundation=("strange women lying in ponds "+
			"distributing swords is no basis for a system of government").split(" ");
	private int index;
	

	@Override
	public String next() {
		// TODO Auto-generated method stub
		return foundation[index++];
	}
	
}

public class CollectionDataTest {
	
	public static void main(String[] args) {
		Set<String> set=new LinkedHashSet<String>(
				new CollectionData<String>(new Government(), 15));
		// Using the convenience method
		//set.addAll(CollectionData.list(new Government(), 15));
		System.out.println(set);
		

	}

}
