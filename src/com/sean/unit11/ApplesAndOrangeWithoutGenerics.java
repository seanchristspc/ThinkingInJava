package com.sean.unit11;

import java.util.ArrayList;

class Apple{
	private static long counter;
	private final long id =counter++;
	public long id(){
		return id;
	}
}

class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}
class Orange{
	
}



public class ApplesAndOrangeWithoutGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Apple> apples=new ArrayList<Apple>();
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Braeburn());
		
		// !apples.add(new Orange());
		for(int i=0;i<apples.size();i++){
			
			System.out.println(apples.get(i).id());
		}
		for(Apple a:apples){
			System.out.println(a);
		}

	}

}
