package com.sean.unit18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {
	private static final int BSIZE=1024;
	

	public static void main(String[] args) throws IOException {
		String path="F:/workplace/MyeclipseWork/ThinkingInJava/src/com/sean/unit18/";

		//Write a file
		FileChannel fc=new FileOutputStream(path+"data.txt").getChannel();
		fc.write(ByteBuffer.wrap("some text".getBytes()));
		fc.close();
		//Add to the end of the file:
		fc=new RandomAccessFile(path+"data.txt", "rw").getChannel();
		fc.position(fc.size());	//Move to the end
		fc.write(ByteBuffer.wrap("some more".getBytes()));
		fc.close();
		
		//read the file
		fc=new FileInputStream(path+"data.txt").getChannel();
		ByteBuffer buff=ByteBuffer.allocate(BSIZE);
		fc.read(buff);
		buff.flip();
		while(buff.hasRemaining())
			System.out.print((char)buff.get());
		
	}

}
