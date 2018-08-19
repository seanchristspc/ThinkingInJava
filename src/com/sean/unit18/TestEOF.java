package com.sean.unit18;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestEOF {

	public static void main(String[] args) throws IOException {
		DataInputStream in=new DataInputStream(
				new BufferedInputStream(
						new FileInputStream("F:/workplace/MyeclipseWork/ThinkingInJava/src/com/sean/unit18/PPrint.java")));
		
		while(in.available()!=0)
			System.out.print((char)in.readByte());
	}

}
