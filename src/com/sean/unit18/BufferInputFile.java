package com.sean.unit18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * 缓冲输入文件
 * @author sean
 *
 */
public class BufferInputFile {
	//Throw exception to console
	public static String
	read(String filename) throws IOException{
		//Reading input by lines:
		BufferedReader in=new BufferedReader(new FileReader(filename));
		String s;
		StringBuilder sb=new StringBuilder();
		while((s=in.readLine())!=null)
			sb.append(s+"\n");
		in.close();
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		System.out.print(read("F:/workplace/MyeclipseWork/ThinkingInJava/src/com/sean/unit18/readme.txt"));
	}

}
