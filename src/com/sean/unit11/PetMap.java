package com.sean.unit11;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class PetMap {

	public static void main(String[] args) {
		Map<String,String> petMap=new HashMap<String, String>();
		petMap.put("My Cat", "Cat");
		petMap.put("My dog", "Dog");
		petMap.put("My Hamster", "Bosco");
		
		System.out.println(petMap);
		
		String dog=petMap.get("My dog");
		System.out.println(dog);
		
		System.out.println(petMap.containsKey("My dog"));
		System.out.println(petMap.containsValue(dog));
		
		
	
	}

}
