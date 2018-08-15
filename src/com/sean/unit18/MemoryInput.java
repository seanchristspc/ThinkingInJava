package com.sean.unit18;
import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {

	public static void main(String[] args) throws IOException {
		StringReader in=
				new StringReader(BufferInputFile.read(
						"F:/workplace/MyeclipseWork/ThinkingInJava/src/com/sean/unit18/readme.txt"));
		
		int c;
		while((c=in.read())!=-1)
			System.out.print((char)c);
	}

}
