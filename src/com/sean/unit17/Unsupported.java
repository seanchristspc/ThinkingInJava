package com.sean.unit17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Unsupported {
	static void test(String msg,List<String> list){
		System.out.println("---"+msg+"---");
		Collection<String> c=list;
		Collection<String> sublist=list.subList(1, 8);
		//Copy of the sublist:
		Collection<String> c2=new ArrayList<String>(sublist);
		try{
			c.retainAll(c2);
		}catch(Exception e){
			System.out.println("retainAll():"+e);
		}
		
		try{
			c.clear();		
		}catch(Exception e){
			System.out.println("clear()"+e);
		}
		try{
			c.add("x");
		}catch(Exception e){
			System.out.println("add():"+e);
		}
		
		try{
			c.addAll(c2);
		}catch(Exception e){
			System.out.println("addAll():"+e);
		}
		
		try{
			c.remove("C");
		}catch(Exception e){
			System.out.println("remove():"+e);
		}
		//The list.set() method modified the value but doesn't change the size of the data structure
		try{
			list.set(0, "X");
		}catch(Exception e){
			System.out.println("list.set():"+e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".split(" "));
		test("Modifiable Copy",new ArrayList<String>(list));
		test("Arrays.asList()",list);
		test("unmodifiableList()",Collections.unmodifiableList(new ArrayList<String>(list)));
	}

}
