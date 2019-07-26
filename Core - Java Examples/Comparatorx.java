package coreJava;

import java.util.Comparator;

public class Comparatorx implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1%100>o2%100) 
			return 1;
		else
		return -1;
	}
	
	
	


}
