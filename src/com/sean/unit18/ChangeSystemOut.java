package com.sean.unit18;

import java.io.PrintWriter;

public class ChangeSystemOut {

	public static void main(String[] args) {
		PrintWriter out=new PrintWriter(System.out,true);
		out.println("hello,world");
	}

}
