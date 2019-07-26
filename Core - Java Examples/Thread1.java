package coreJava;



public class Thread1 {

	public static void main(String[] args) {
		System.out.println("Main Thread Starts");
		Thread t1 =new Firsttask();
		Thread t2 =new Firsttask();
		
		System.out.println("Main Thread ends");

	}

}
class Firsttask extends Thread {
	private static int count = 0;
	private int id;
	public void run () {
		for(int i=10; i>=1;i--) {
			System.out.println(id+" "+"Multithreading"+" "+i);
			try {
				Thread.sleep(200);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
	
		}
	}
	public Firsttask() {
		this.start();
		this.id=++count;
	}
	
}
