package coreJava;

public class Task implements Runnable {

	@Override
	public void run() {
	
			System.out.println("Thread Running"+"  "+Thread.currentThread().getName());
		

	}

}
