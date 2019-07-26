package coreJava;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Mapx {
	public static void main (String Args[]) {
//		Map<Integer,String> m1 = new Hashtable<>();
		//Map<Integer,String> m1 = new HashMap<>();
		Map<Integer,String> m1 = new LinkedHashMap<>();
		//Map<Integer,String> m1 = new TreeMap<>();
		m1.put(1, "abc");
		m1.put(2, "xyz");
		m1.put(3, "pqr");
		m1.put(4, "mno");
		m1.put(6, "mno");
		m1.put(7, "mno");
		m1.put(56,"cde");
		m1.put(9, "jkl");
		m1.put(5, "qrs");
		Set <Integer> keys = m1.keySet();
		Set<Map.Entry<Integer,String>> val = m1.entrySet();
		for(Map.Entry<Integer,String> v: val) {
			System.out.println("Key - "+v.getKey()+" "+"Value - "+v.getValue());
			}
		for ( Integer x :keys) {
			System.out.println("Key - "+x+" "+"Value - "+m1.get(x));
		}
	
	}

}
