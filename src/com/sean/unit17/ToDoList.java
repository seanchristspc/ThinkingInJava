package com.sean.unit17;

import java.util.Deque;
import java.util.PriorityQueue;

public class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {
	
	static class ToDoItem implements Comparable<ToDoList.ToDoItem>{
		private char primary;
		private int secondary;
		private String item;
		public ToDoItem(String id,char pri,int sec) {
			// TODO Auto-generated constructor stub
			primary=pri;
			secondary=sec;
			item=id;
			
		}

		@Override
		public int compareTo(ToDoItem o) {
			// TODO Auto-generated method stub
			if(primary>o.primary)
				return +1;
			if(primary==o.primary)
				if(secondary>o.secondary)
					return +1;
				else if(secondary==o.secondary)
					return 0;
			return -1;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return Character.toString(primary)+secondary+":"+item;
		}
		
	}
	
	public void add(String td,char pri,int sec){
		super.add(new ToDoItem(td, pri, sec));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToDoList toDoList=new ToDoList();
		toDoList.add("Empty trash",'C',4);
		toDoList.add("Feed dog",'A',2);
		toDoList.add("Feed bird",'B',7);
		toDoList.add("Mow lawn",'C',3);
		toDoList.add("Water lawn",'A',1);
		toDoList.add("Feed cat",'B',1);
		while(!toDoList.isEmpty())
			System.out.println(toDoList.remove());
		
	}

}
