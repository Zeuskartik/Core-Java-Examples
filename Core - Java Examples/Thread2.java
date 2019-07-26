package coreJava;
import java.util.*;
import java.io.*;
public class Thread2 implements Runnable {
	public String threadCount;
	public int stop;
	public Thread2(String threadCount ,int stop) {
		this.threadCount = threadCount;
		this.stop = stop;
		}
	
	public void run() {
		try {
			Thread.sleep(stop);
			System.out.printf("%s will sleep for %d\n", threadCount,stop);
			
			System.out.printf("%s is now awake\n", threadCount);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main (String Args[]) throws InterruptedException {
		Thread x = new Thread(new Thread2("x",600));
		Thread y = new Thread(new Thread2("y",400));
		Thread z = new Thread(new Thread2("z",500));
		x.start();
		y.start();
		z.start();
		System.out.println("\nThreads Started");
		
		
		
	}

}
