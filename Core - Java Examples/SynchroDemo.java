package coreJava;
class Counter{
	int countx;
	public /*synchronized*/ void  count() {
		countx++;
	}
}

public class SynchroDemo {
	
public static void main (String Args[]) {
	Counter c = new Counter ();
	Thread tx = new Thread(
			new Runnable() {
				@Override
				public void run() {
				for (int i = 0; i <10000; i++) {
					c.count();
				}
					
					}});
	
	Thread ty = new Thread(new Runnable() {
		@Override
		public void run() {
			for (int i = 0; i <10000; i++) {
				c.count();
		}
		}});
	tx.start();
	ty.start();
	try {
	tx.join();
	ty.join();
	
	}catch(Exception e) {}
System.out.println("Final Count > "+c.countx);				
}}
	
	
	
	


