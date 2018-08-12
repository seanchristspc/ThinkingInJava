package com.sean.unit17;

public abstract class Test<C> {
	String name;
	public Test(String name) {
		this.name=name;
	}
	//Override this method for different tests
	//Return actual number of repetitions of test.
	abstract int test(C container,TestParam tp);
}
