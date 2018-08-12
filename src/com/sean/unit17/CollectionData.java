package com.sean.unit17;

import java.util.ArrayList;

import com.sean.unit15.Generator;

public class CollectionData<T> extends ArrayList<T> {
	public CollectionData(Generator<T> gen,int quantity) {
		// TODO Auto-generated constructor stub
		for(int i=0;i<quantity;i++)
			add(gen.next());
	}
	
	//A generic convenience method:
	public static <T> CollectionData<T> list(Generator<T> gen,int quantity){
		return new CollectionData<T>(gen, quantity);
				
	}

}
