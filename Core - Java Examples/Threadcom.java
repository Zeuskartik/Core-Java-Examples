package coreJava;
class Lead{
	int num;
	Boolean isSet = false;
	public synchronized void set(int num) {
		while(isSet) {
			try{wait();} catch(Exception e) {}
		}
		this.num= num;
		isSet=true;
		notify();
		System.out.println("SET : "+num);
	}
	public synchronized void get() {
		while(!isSet) {
			try{wait();} catch(Exception e) {}
		}
		System.out.println("GET : " +num);
		isSet=false;
		notify();
	}
	
}
class Master implements Runnable {
	Lead l ;
	public Master(Lead l) {
		this.l=l;
		Thread tx = new Thread(this,"Master");
		tx.start();
	
		
	}
	public void run() {
		int i = 0;
		while (true) {
			l.set(i++);
		try {Thread.sleep(100);}catch(Exception e) {}
		}
	}
	
	
	
}
class Slave implements Runnable{
	Lead l;
	
	public Slave(Lead l) {
		this.l = l;
		Thread ty = new Thread(this,"Slave");
		ty.start();
		
	}

	public void run() {
	        while (true) {
			l.get();
		try {Thread.sleep(2000);}catch(Exception e) {}
		}
	}
	
	
}
public class Threadcom {
public static void main (String args[]) {
	Lead x = new Lead();
	new Master(x);
	new Slave(x);
	
	

}
}
