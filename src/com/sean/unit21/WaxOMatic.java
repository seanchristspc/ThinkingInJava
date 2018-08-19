package com.sean.unit21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Car{
	private boolean waxOn=false;
	public synchronized void waxed(){
		waxOn=true;		//Ready to buff
		notifyAll();
	}
	public synchronized void buffed(){
		waxOn=false;		//Ready for another coat of wax
		notifyAll();
	}
	public synchronized void waitForWaxing() throws InterruptedException{
		while(waxOn==true)
			wait();
	}
	public synchronized void waitForBuffing() throws InterruptedException{
		// TODO Auto-generated method stub
		while(waxOn==true)
			wait();
		
	}
}

class WaxOn implements Runnable{
	private Car car;
	public WaxOn(Car c) {
		// TODO Auto-generated constructor stub
		car=c;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(!Thread.interrupted()){
				System.out.print("Wax On! ");
				TimeUnit.MILLISECONDS.sleep(200);
				car.waxed();
				car.waitForBuffing();
			}
		}catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Exiting via interrupt");
		}
		System.out.println("Ending Wax On task");
		
	}
	
}

class WaxOff implements Runnable{
	private Car car;
	public WaxOff(Car c) {
		// TODO Auto-generated constructor stub
		car=c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(!Thread.interrupted()){
				car.waitForWaxing();
				System.out.print("Wax off! ");
				TimeUnit.MILLISECONDS.sleep(200);
				car.buffed();
			}
		}catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Exiting via interrupt");
		}
		System.out.println("Ending Wax off task");		
	}
	
}

public class WaxOMatic {

	public static void main(String[] args) throws Exception {
		Car car=new Car();
		ExecutorService exec=Executors.newCachedThreadPool();
		exec.execute(new WaxOff(car));
		exec.execute(new WaxOn(car));
		
		TimeUnit.SECONDS.sleep(5); 		//run for a while ....
		exec.shutdownNow();			//interrupt all task

	}

}
