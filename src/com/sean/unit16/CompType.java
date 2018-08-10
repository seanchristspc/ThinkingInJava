package com.sean.unit16;

import java.util.Random;

import javax.annotation.Generated;

import com.sean.unit15.Generator;

public class CompType implements Comparable<CompType>{
	
	int i;
	int j;
	private static int count=1;
	public CompType(int n1,int n2){
		j=n2;
		i=n1;
	}
	public String toString(){
		String result="[i="+i+",j="+j+"]";
		if(count++%3==0)
			result +="\n";
		return result;
	}
	
	@Override
	public int compareTo(CompType o) {
		// TODO Auto-generated method stub
		return (i<o.j ? -1:(i==o.j ? 0 :1));
	}
	private static Random r=new Random(47);
	public static Generator<CompType> generator(){
		return new Generator<CompType>() {

			@Override
			public CompType next() {
				// TODO Auto-generated method stub
				return new CompType(r.nextInt(100), r.nextInt(100));
			}
			
		};
	}

	public static void main(String[] args) {
		
	}


	

}
