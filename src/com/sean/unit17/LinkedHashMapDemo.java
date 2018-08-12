package com.sean.unit17;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> linkMap=
				new LinkedHashMap<Integer, String>(
						new CountingMapData(9));
		System.out.println(linkMap);
		// Least-recently-used order:
		linkMap=new LinkedHashMap<Integer, String>(16,0.75f,true);
		linkMap.putAll(new CountingMapData(9));
		System.out.println(linkMap);
		for(int i=0;i<6;i++)	//cause access：
			linkMap.get(i);
		System.out.println(linkMap);
		linkMap.get(0);
		System.out.println(linkMap);
			
		

	}

}
