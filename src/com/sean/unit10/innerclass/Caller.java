package com.sean.unit10.innerclass;

public class Caller {
	private Incrementable callbackReference;
	Caller(Incrementable cbn){
		callbackReference=cbn;
	}
	void go(){
		callbackReference.increment();
	}
}
