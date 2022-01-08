package com.excellence.classes.comparator;

import java.util.Comparator;

public class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		int i1=(((Excellenc)o1).id)-(((Excellenc)o2).id);
		if(i1>0)
			return 1;
		else if(i1<0)
			return -1;
			else
		return 0;
	}

}
