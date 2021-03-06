package com.sean.unit18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TextFile extends ArrayList<String> {
	//read a file as a single string:
	public static String read(String fileName){
		StringBuilder sb=new StringBuilder();	//换行符去掉
		try{
			BufferedReader in=new BufferedReader(
					new FileReader(
							new File(fileName).getAbsoluteFile()));
			try{
				String s;
				while((s=in.readLine())!=null){
					sb.append(s);
					sb.append("\n");
				}
			}finally{
				in.close();
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
		return sb.toString();
	}
	
	//Write a single file in one method call:
	public static void write(String fileName,String text){
		try {
			PrintWriter out=new PrintWriter(new File(fileName).getAbsoluteFile());
			try {
				out.print(text);
			}finally {
				out.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public TextFile(String fileName,String splitter) {
		super(Arrays.asList(read(fileName).split(splitter)));
		
		//Regular expression split() often leaves an empty 
		//String at the first position:
		if(get(0).equals(""))
			remove(0);
		
	}
	//Normally read by lines:
	public TextFile(String fileName){
		this(fileName,"\n");
	}
	public void write(String fileName){
		try{
			PrintWriter out=new PrintWriter(new File(fileName).getAbsoluteFile());
			try{
				for(String item:this)
					out.println(item);
			}finally{
				out.close();
			}
		}catch(IOException e){
			throw new RuntimeException(e);
		}
	}
	
	//Simple test:
	public static void main(String[] args) {
		String path="F:/workplace/MyeclipseWork/ThinkingInJava/src/com/sean/unit18/";
		String file=read(path+"TextFile.java");
		write(path+"test.txt", file);
		TextFile text=new TextFile(path+"test.txt");
		text.write(path+"test2.txt");
		
		//Break into unique sorted list of words:
		TreeSet<String> words=new TreeSet<String>(
				new TextFile(path+"TextFile.java","\\W+"));
		//Display the captalized words:
		System.out.println(words.headSet("a"));

	}

}
