package coreJava;


import java.util.concurrent.locks.ReentrantLock;

class A implements Runnable{
	private final ReentrantLock Lock = new ReentrantLock();

	public void run() {
		Lock.lock();
	for	( int i = 1; i<=5;i++) {
		System.out.println("Startx");
		try{Thread.sleep(600);}catch(Exception e) {}
	}
	Lock.unlock();
	
	}
}
class B implements Runnable{
	
	public void run() {
	for	( int i = 1; i<=5;i++) {
		System.out.println("Labs");
		try{Thread.sleep(600);}catch(Exception e) {}
	}
	}
}

public class ThreadSleep {
public static void main (String Args[]) throws InterruptedException {

	Thread a= new Thread(new A());
	Thread b= new Thread(new B());
	a.setName("Thread A");
	b.setName("Thread B");
	System.out.println(a.getName());
	System.out.println(b.getName());
	a.start();
    b.start();
    a.setPriority(10);
    b.setPriority(1);
    System.out.println(a.getPriority());
    System.out.println(b.getPriority());
   // System.out.println("Befor Join A"+" "+a.isAlive());
    //System.out.println("Before Join B"+" "+b.isAlive());
    a.join();
    b.join();
    //System.out.println("After Join A"+" "+a.isAlive());
    //System.out.println("After Join B"+" "+b.isAlive());
    
    System.out.println("Pvt.Ltd.");
    
	}}
