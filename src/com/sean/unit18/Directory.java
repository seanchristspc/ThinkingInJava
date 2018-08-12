package com.sean.unit18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class Directory {
	public static File[] local(File dir,final String regex){
		return dir.listFiles(new FilenameFilter() {
			private Pattern pattern=Pattern.compile(regex);
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return pattern.matcher(new File(name).getName()).matches();
			}
		});
	}
	
	public static File[]
	local(String path,final String regex){
		//Overload
		return local(new File(path), regex);
	}
	
	//A two-tuple for returning a pair of object
	public static class TreeInfo implements Iterable<File>{
		public List<File> files=new ArrayList<File>();
		
		public List<File> dirs=new ArrayList<File>();
		
		
		@Override
		public Iterator<File> iterator() {
			// TODO Auto-generated method stub
			return files.iterator();
		}
		void addAll(TreeInfo other){
			files.addAll(other.files);
			dirs.addAll(other.dirs);
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "dirs: "+PPrint.pformat(dirs)+"\n\n files:"+PPrint.pformat(files);
		}
	}
	
	public static TreeInfo 
	walk(String start,String regex){
		//begin recursion
		return recurseDirs(new File(start), regex);
	}
	

	public static TreeInfo 
	walk(File start,String regex){
		//Overload
		return recurseDirs(start, regex);
	}
	

	public static TreeInfo 
	walk(File start){
		//Everything
		return recurseDirs(start, ".*");
	}

	public static TreeInfo
	walk(String start){
		return recurseDirs(new File(start), ".*");
	}
	
	static TreeInfo recurseDirs(File startDir,String regex){
		TreeInfo result=new TreeInfo();
		for(File item:startDir.listFiles()){
			if(item.isDirectory()){
				result.dirs.add(item);
				result.addAll(recurseDirs(item, regex));
			}else{
				//Regular file
				if(item.getName().matches(regex))
					result.files.add(item);
			}
		}
		return result;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		if(args.length==0)
			System.out.println(walk("."));
		else
			for(String arg:args)
				System.out.println(walk(arg));

	}

}
