package coreJava;

import java.util.ArrayList;
import java.util.List;

public class ThreadMul extends Thread {
	 List<Integer>list1 = new ArrayList<Integer>();
	  public void run() {
	
			 {for(int i=0;i<=500;i++) {
				 list1.add(i);
			 }
		     System.out.println("List One Before Mutiplication\n"+list1.toString());}
		     for (Integer x : list1) {
				 list1.set(x, x*2);
			 }
	System.out.println("List one after Mutilplication \n"+list1.toString());
	 
	 }
	  
	 public static void main (String args[]) {
		 Thread t1 = new Thread(new ThreadMul());
		 //Thread t2 = new Thread(new ThreadMul());
		 t1.start();
		 //t2.start();
		 System.out.println("Thread Started"+" "+t1.getName());
		// System.out.println("Thread Started"+" "+t2.getName());
		 
		 
	 }
			
	

}
