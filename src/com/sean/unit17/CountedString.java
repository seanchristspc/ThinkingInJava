package com.sean.unit17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountedString {
	
	private static List<String> created=new ArrayList<String>();
	private String s;
	private int id=0;
	public CountedString(String str) {
		// TODO Auto-generated constructor stub
		s=str;
		created.add(s);
		//id  is the total number of instances
		//of this strring in use by CountedString:
		for(String s2:created)
			if(s2.equals(s))
				id++;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "String: "+s+" id: "+id+" hashCode(): "+hashCode();
	}
	
	public int hashCode(){
		//The very simpel approch return s.hashCode()*id;
		//Using Joshua Bloch's 
		int result=17;
		result=37*result+s.hashCode();
		result=37*result+id;
		return result;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return obj instanceof CountedString && 
				s.equals(((CountedString)obj).s) && 
				id==((CountedString)obj).id;
	}

	public static void main(String[] args) {
		Map<CountedString,Integer> map=new HashMap<CountedString, Integer>();
		CountedString[] cs=new CountedString[5];
		for(int i=0;i<cs.length;i++){
			cs[i]=new CountedString("hi");
			map.put(cs[i], i);
		}
		System.out.println(map);
		for(CountedString cstring: cs){
			System.out.println("Looking up "+cstring);
			System.out.println(map.get(cstring));
		}

	}

}
