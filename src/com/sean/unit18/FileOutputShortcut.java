package com.sean.unit18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
/**
 * 文本文件输出的快捷方式
 * @author sean
 *
 */
public class FileOutputShortcut {
	static String file="FileOutputShortcut.out";
	
	public static void main(String[] args) throws IOException {
		BufferedReader in=
				new BufferedReader(
						new StringReader(BufferInputFile.read("F:/workplace/MyeclipseWork/ThinkingInJava/src/com/sean/unit18/FileOutputShortcut.java")));
		
		//Here's the shortcut:
		PrintWriter out=new PrintWriter("F:/workplace/MyeclipseWork/ThinkingInJava/src/com/sean/"+file);
		
		int lineCount=1;
		String s;
		while((s=in.readLine())!=null)
			out.println(lineCount++ +": "+s);
		out.close();
		
		//show the stored file
		System.out.println(BufferInputFile.read("F:/workplace/MyeclipseWork/ThinkingInJava/src/com/sean/"+file));
	}

}
