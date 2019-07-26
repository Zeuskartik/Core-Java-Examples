package coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Comparatorz {
	public static void main(String[] args) {
		Comparator<Integer> cm = new Comparatorx();
		List <Integer>l1 = new ArrayList<>();	
		l1.add(235);
		l1.add(664);
		l1.add(967);
		l1.add(323);
		l1.add(798);
		Collections.sort(l1,cm);
       // Collections.reverse(l1);
		l1.forEach(System.out::println);
	}
}
