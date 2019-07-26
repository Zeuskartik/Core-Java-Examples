package coreJava;
import java.util.*;
public class Threading implements Runnable {
	String name;
	int time;
	Random r = new Random();
	public Threading (String x) {
		name = x;
		time = r.nextInt(2000);
	}
	public void run() {
		try {
			System.out.printf("%s is sleeping for %d\n", name,time);
			Thread.sleep(time);
			System.out.printf("%s is completed\n", name);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main (String Args[]) {
		Thread tx = new Thread(new Threading("First"));
		Thread ty = new Thread(new Threading("Second"));
		Thread tz = new Thread(new Threading("Third"));
		Thread ta = new Thread(new Threading("Fourth"));
		Thread tb = new Thread(new Threading("Fifth"));
		Thread tc = new Thread(new Threading("Sixth"));
		tx.start();
		ty.start();
		tz.start();
		ta.start();
		tb.start();
		tc.start();
				
			
				
	}
	}
