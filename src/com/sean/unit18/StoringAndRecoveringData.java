package com.sean.unit18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StoringAndRecoveringData {

	public static void main(String[] args) throws IOException{
		String filename="F:/workplace/MyeclipseWork/ThinkingInJava/src/com/sean/unit18/Data.txt";
		DataOutputStream out=
				new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(filename)));
		
		out.writeDouble(3.1415);
		out.writeUTF("that was pi");
		out.writeDouble(1.1413);
		out.writeUTF("square root of 2");
		out.close();
		
		DataInputStream in=
				new DataInputStream(
						new BufferedInputStream(
								new FileInputStream(filename)));
		System.out.println(in.readDouble());
		//only readUTF() will recover the Java-UTF String properly:
		System.out.println(in.readUTF());
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
		
		
		
		
		
	}

}
