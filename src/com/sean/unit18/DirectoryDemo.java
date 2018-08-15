package com.sean.unit18;

import java.io.File;

public class DirectoryDemo {

	public static void main(String[] args) {
		// All directories:
		PPrint.pprint(Directory.walk(".").dirs);
		//All files beginning with 'C'
		for(File file : Directory.local("F:/workplace/MyeclipseWork/ThinkingInJava/src/com/sean/unit17", "C.*"))
			System.out.println(file.getName());
		System.out.println("---------------------------");
		
		for(File file : Directory.local("F:/workplace/MyeclipseWork/ThinkingInJava/src/com/sean/unit18", "D.*\\.java"))
			System.out.println(file.getName());
		System.out.println("==========================");
		
		for(File file: Directory.walk(".",".*[Zz].*\\.class"))
			System.out.println(file);
		
		
	}

}
