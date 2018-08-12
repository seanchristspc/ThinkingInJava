package com.sean.unit17;

public class Individual implements Comparable<Individual> {
	private static long counter=0;
	private final long id=counter++;
	private String name;
	public Individual(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName()+(name==null ? "":" "+name);
		
	}
	public long id(){
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return obj instanceof Individual && id==((Individual)obj).id;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int result=17;
		if(name!=null)
			result=37*result+name.hashCode();
		result=37*result+(int)id;
		return result;
	}

	@Override
	public int compareTo(Individual o) {
		// TODO Auto-generated method stub
		//Compare by class name first
		String first=getClass().getSimpleName();
		String oFirst=o.getClass().getSimpleName();
		int firstCompare=first.compareTo(oFirst);
		if(firstCompare!=0)
			return firstCompare;
		if(name!=null && o.name!=null){
			int secondCompare=name.compareTo(o.name);
			if(secondCompare!=0)
				return secondCompare;
		}
		return (o.id<id?-1:(o.id==id ? 0 : 1));
		
	}

	
}
