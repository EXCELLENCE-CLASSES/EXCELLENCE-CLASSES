package com.excellence.classes.comparator;

import java.util.Comparator;

public class MySecondComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		
		
		// TODO Auto-generated method stub
		int i=(((Excellenc)o1).name).compareTo(((Excellenc)o2).name);
		
		if(i>0)
			return 1;
		else if(i<0)
		    return -1;
		else		
		return 0;
		
	
	}

}
