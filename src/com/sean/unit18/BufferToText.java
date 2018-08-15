package com.sean.unit18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class BufferToText {
	private static final int BSIZE=1024;

	public static void main(String[] args) throws IOException {
		FileChannel fc=new FileOutputStream("data2.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text".getBytes()));
		fc.close();
		fc = new FileInputStream("data2.txt").getChannel();
		ByteBuffer buff=ByteBuffer.allocate(BSIZE);
		fc.read(buff);
		buff.flip();
		//Doesn't work:
		System.out.println(buff.asCharBuffer());
		//Decode using this system's defaut Chaset:
		buff.rewind();
		String encoding=System.getProperty("file.encoding");
		System.out.println("Docoded using "+encoding+":"+Charset.forName(encoding).decode(buff));
		//Or,we could encode with something that will print:
		fc=new FileOutputStream("data2.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text".getBytes("UTF-16BE")));
		fc.close();
		
		//Now try reading again
		fc=new FileInputStream("data2.txt").getChannel();
		buff.clear();
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());
		//Use a CharBuffer to write throughh:
		fc=new FileOutputStream("data2.txt").getChannel();
		buff.clear();
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());
		
	}

}