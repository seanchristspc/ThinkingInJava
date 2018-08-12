package com.sean.unit18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList2 {
	public static FilenameFilter filter(final String regex){
		// Creation of anoymouse inner class:
		return new FilenameFilter() {
			
			private Pattern pattern=Pattern.compile(regex);
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return pattern.matcher(name).matches();
			}
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path=new File(".");
		String[] list;
		if(args.length==0)
			list=path.list();
		else
			list=path.list(filter(args[0]));
		
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for(String dirItem:list)
			System.out.println(dirItem);
	}

}
