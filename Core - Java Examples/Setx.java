package coreJava;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setx {

	public static void main(String[] args) {
		//Set<Integer> s1 = new TreeSet<>();
		Set<Integer> s1 = new HashSet<>();
		s1.add(1);
		s1.add(5);
		s1.add(789);
		s1.add(9);
		s1.add(22);

		for(Integer s:s1) {
			System.out.println(s);
		}



	}

}
