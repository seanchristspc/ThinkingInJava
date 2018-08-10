package com.sean.unit5;

public class TerminationCondition {

	public static void main(String[] args) {
		Book novel=new Book(true);
		// Proper cleanUp
		novel.checkIn();
		// Drop the reference,forget to clean up:
		new Book(true);
		// Force garbage collection & finalization:
		System.gc();

	}

}

class Book{
	boolean checkedOut = false;
	Book(boolean checkOut){
		checkedOut=checkOut;
	}
	void checkIn(){
		checkedOut=false;
	}
	protected void finalize(){
		if(checkedOut)
			System.out.println("Error: checked out");
		// Normally,you'll also do this:
		// super.finalize();	//call the base-class version
		
	}
}