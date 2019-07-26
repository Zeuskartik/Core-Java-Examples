package coreJava;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executorsx {
public static void main (String args[]) {
	System.out.println("main thread starts/........");
	
	//ExecutorService ser = Executors.newFixedThreadPool(10);
//
	ExecutorService ser = Executors.newCachedThreadPool();
//
	//ExecutorService ser = Executors.newSingleThreadExecutor();
	

	//ScheduledExecutorService ser = Executors.newScheduledThreadPool(2);

	//ser.scheduleAtFixedRate(command, initialDelay, period, unit);
	for ( int i = 1; i <=10; i++) {
	//ser.submit(new Task());
		System.out.println("started at "+" "+"Time -> "+new Date());
		//ser.scheduleWithFixedDelay(new Task(), 1, 1,TimeUnit.SECONDS );
		ser.execute(new Task());
		
	}
	ser.shutdown();
	//ser.submit(new Task());
	//ser.execute(new Task());

	System.out.println("Shutdown");
	//try {ser.awaitTermination(5,TimeUnit.MILLISECONDS );} catch(Exception e) {}
	System.out.println("main thread ends/........");
}
}
