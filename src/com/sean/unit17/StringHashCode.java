package com.sean.unit17;

public class StringHashCode {

	public static void main(String[] args) {
		// 如果程序有多个String对象，都包含相同的字符串序列，那么这些String对象都映射到同一块内存区域
		String[] hellos="Hello Hello".split(" ");
		System.out.println(hellos[0].hashCode());
		System.out.println(hellos[1].hashCode());
		
		System.out.println(hellos[0]==(hellos[1]));
		

	}

}
