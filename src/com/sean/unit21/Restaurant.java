package com.sean.unit21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Meal{
	private final int orderNum;
	public Meal(int orderNum) {
		// TODO Auto-generated constructor stub
		this.orderNum=orderNum;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Meal "+orderNum;
	}
}

class WaitPerson implements Runnable{
	private Restaurant restaurant;
	public WaitPerson(Restaurant r) {
		// TODO Auto-generated constructor stub
		restaurant=r;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(!Thread.interrupted()){
				synchronized (this) {
					while(restaurant.meal==null)
						wait(); //... for the chef to produce a meal
				}
				System.out.println("Waitperson got "+restaurant.meal);
				synchronized (restaurant.chef) {
					restaurant.meal=null;
					restaurant.chef.notifyAll(); 	//Ready for another
				}
			}
		}catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("WaitPerson interrupted");
		}
		
	}
	
}

class Chef implements Runnable{
	private Restaurant restaurant;
	private int count=0;
	public Chef(Restaurant r) {
		// TODO Auto-generated constructor stub
		restaurant=r;
	}

	@Override
	public void run() {
	
		try{
			while(!Thread.interrupted()){
				synchronized (this) {
					while(restaurant.meal==null)
						wait(); //... for the meal to be taken
				}
				if(++count==10){
					System.out.println("Out of food ,closing");
					restaurant.exec.shutdownNow();
				}
				System.out.println("Order up! ");
				synchronized (restaurant.waitPerson) {
					restaurant.meal=new Meal(count);
					restaurant.waitPerson.notifyAll();
				}
				TimeUnit.MILLISECONDS.sleep(100);
			}
		}catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Chef interrupted");
		}
		
	}
	
}

public class Restaurant {
	Meal meal;
	ExecutorService exec=Executors.newCachedThreadPool();
	WaitPerson waitPerson=new WaitPerson(this);
	Chef chef=new Chef(this);
	public Restaurant() {
		// TODO Auto-generated constructor stub
		exec.execute(chef);
		exec.execute(waitPerson);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Restaurant();
	}

}
