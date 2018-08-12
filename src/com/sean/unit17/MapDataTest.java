package com.sean.unit17;

import java.util.Iterator;

import com.sean.unit15.Generator;
import com.sean.unit16.CountingGenerator;
import com.sean.unit16.RandomGenerator;
import com.sean.unit16.RandomGenerator.Character;

class Letters implements Generator<Pair<Integer, String>>,Iterable<Integer>{
	private int size=9;
	private int number=1;
	private char letter='A';
	
	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return number<size;
			}

			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				return number++;
			}
			
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}

	@Override
	public Pair<Integer, String> next() {
		// TODO Auto-generated method stub
		return new Pair<Integer, String>(number++, ""+letter++);
	}
	
}

public class MapDataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pair Generator
		System.out.println(MapData.map(new Letters(), 11));
		
		//Two seperate generators
		System.out.println(MapData.map(
				new CountingGenerator.Character(), new RandomGenerator.String(), 8));
		// A key Generator and a single value
		System.out.println(MapData.map(
				new CountingGenerator.Character(), "Value",6));
		
		//An Iterable and a value Generator
		System.out.println(MapData.map(new Letters(), new RandomGenerator.String(3)));
		
		//An Iterable and a single value
		System.out.println(MapData.map(new Letters(), "Pop"));
		
		

	}

}
