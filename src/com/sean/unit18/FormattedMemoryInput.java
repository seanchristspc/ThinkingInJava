package com.sean.unit18;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

public class FormattedMemoryInput {

	public static void main(String[] args) throws IOException {
		try {
			DataInputStream in=
					new DataInputStream(
							new ByteArrayInputStream(BufferInputFile.read("F:/workplace/MyeclipseWork/ThinkingInJava/src/com/sean/unit18/PPrint.java").getBytes()));
			while(true)
				System.out.print((char)in.readByte());
			
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			System.err.println("end of stream");
		}

	}

}
