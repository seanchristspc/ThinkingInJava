package com.sean.unit21;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Accessor implements Runnable{
	private final int id;
	public Accessor(int idn) {
		// TODO Auto-generated constructor stub
		id=idn;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!Thread.currentThread().isInterrupted()){
			ThreadLocalVariableHolder.increment();
			System.out.println(this);
			Thread.yield();
		}
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+id+": "+ThreadLocalVariableHolder.get();
	}
	
}


public class ThreadLocalVariableHolder {
	
	private static ThreadLocal<Integer> value=new ThreadLocal<Integer>(){
		private Random rand=new Random(47);
		protected synchronized Integer initialValue(){
			return rand.nextInt(10000);
		}
	};

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExecutorService exec=Executors.newCachedThreadPool();
		for(int i=0;i<5;i++)
			exec.execute(new Accessor(i));
		TimeUnit.SECONDS.sleep(3);	//Run for a while
		exec.shutdown();			//All Accessors will quit

	}

	public static int get() {
		// TODO Auto-generated method stub
		return value.get();
	}

	public static void increment() {
		// TODO Auto-generated method stub
		value.set(value.get()+1);
	}

}
