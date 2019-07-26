package coreJava;

public class Threader {
	public static void main (String Args[]) {
		Thread t1 = new Thread(new Threading("Pehla"));
		Thread t2 = new Thread(new Threading("Dusra"));
		Thread t3 = new Thread(new Threading("Tesra"));
		Thread t4 = new Thread(new Threading("Akhri"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
