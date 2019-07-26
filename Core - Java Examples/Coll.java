package coreJava;

import java.util.ArrayList;
import java.util.Collection;

public class Coll {
	Collection<Integer> x = new ArrayList<>();
	public void add() {

	//x.add("hey");
	x.add(23);
	x.add(null);
	x.add(null);
	x.add(null);
	x.add(null);
	x.add(null);
	x.add(null);
	x.add(null);
	x.add(null);
	x.add(null);
	//x.add(452.90);
	//x.add(900l);
	System.out.println("Elements added");
	
	}
	public void compare() {
		
		if(x.contains(null)) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
		
			
	}
	

	public static void main(String[] args) {
		
 Coll x=new Coll();
 x.add();
 x.compare();


	}

}
