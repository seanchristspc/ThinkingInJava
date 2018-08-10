package com.sean.unit11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroups {

	public static void main(String[] args) {
		Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		Integer[] moreInts={8,9,10,11,12};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection, 13,14,15);
		Collections.addAll(collection, moreInts);
		
		List<Integer> list=Arrays.asList(16,17,18,19,20);
		list.set(1, 99);
		
		
		
		

	}

}
