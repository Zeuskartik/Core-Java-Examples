package coreJava;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class Colls {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<> ();
		for(int i = 1; i <=30; i++) {
			v.add(i);
		}
		List <Integer>l1 = new ArrayList<>();				
		for(int i = 1; i<=50; i++) {
			l1.add(i);
		}
		List <Integer> l2 = new LinkedList<>();
		for(int i = 1; i<=50; i++) {
			l2.add(i);
		}
		Set <Integer> s1 = new HashSet<>();
		for(int i = 1; i <= 60; i++) {
			s1.add(i);
		}
		Set <Integer> s2 = new TreeSet<>();
		for (int i = 1 ; i <= 70; i++) {
			s2.add(i);
		}
		Map<Integer,Integer> m1 = new HashMap<>();
		for ( int i=1; i <=50; i++) {
			m1.put(i, i);
		}
		Map<Integer,Integer> m2 = new Hashtable<>();
		for(int i = 1 ; i <= 10;i++) {
			m2.put(i, i);
		}
		Map<Integer,Integer> m3 = new LinkedHashMap<>();
		for(int i = 1 ; i <= 10;i++) {
			m3.put(i, i);
		}
		Map<Integer,Integer> m4 = new ConcurrentHashMap <>();
		for(int i = 1 ; i <= 10;i++) {
			m4.put(i, i);
		}
		System.out.println(v.capacity());
		for(Integer y : v) {
			System.out.println("Vector contents "+y.toString());
		}
		for(int y :l1) {
			System.out.println("List Contents "+y);
		}
		for(int y :l2) {
			System.out.println("LinkedList contents "+y);
		}
		for(int y :s1) {
			System.out.println("HashSet contents "+y);
		}
		for(int y :s2) {
			System.out.println("Treeset contents "+y);
		}
 System.out.println("HashMap contents"+m1.toString());
 System.out.println("HashTbale contents"+m2.toString());
 System.out.println("Linked Hashmap contents"+m3.toString());
 System.out.println("Concurrent Hashmap contents"+m4.toString());
	
		
		

	}

}
