package com.excellence.classes.comparable;

public class MyComparable implements Comparable {
	
	
	public String name;
	public int excellenceId;
	
	public MyComparable(String name,int excellenceId) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.excellenceId=excellenceId;
	}
	
	

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int i1=name.compareTo(((MyComparable)o).name);
		if(i1>0)
			return 1;
		else if(i1<0)
			return -1;
		else return 0;
					
	}

}
