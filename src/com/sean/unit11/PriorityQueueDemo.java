package com.sean.unit11;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

import javax.sound.midi.Soundbank;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorytyQueue=new PriorityQueue<Integer>();
		Random rand=new Random(47);
		for(int i=0;i<10;i++){
			priorytyQueue.offer(rand.nextInt(10));
		}
		System.out.println(priorytyQueue);
		
		List<Integer> ints=Arrays.asList(25,22,20,18,14,9,3,1,1,2,3,9,14,18,21,23,25);
		System.out.println(ints);
		priorytyQueue=new PriorityQueue<Integer>(ints.size(),Collections.reverseOrder());
		priorytyQueue.addAll(ints);
		System.out.println(priorytyQueue);
		
		String fact= "EDUCATION SHOULD ESCHEW OBFUSATION";
		List<String> strings=Arrays.asList(fact.split(""));
		PriorityQueue<String> stringPQ=new PriorityQueue<String>(strings);
		System.out.println(stringPQ);
		
		stringPQ = new PriorityQueue<String>(strings.size(),Collections.reverseOrder());
		stringPQ.addAll(strings);
		
		Set<Character> charset =new HashSet<Character>();
		for(char c:fact.toCharArray()){
			charset.add(c);//autoboxing
		}
		PriorityQueue<Character> characterPQ=new PriorityQueue<Character>(charset);
		System.out.println(characterPQ);
		
	}

}
