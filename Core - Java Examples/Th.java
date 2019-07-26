package coreJava;

public class Th{

	public static void main(String[] args) {
		new Thread( new Runnable() {
		@Override
		public void run() {
		System.out.println("zthread rinn");
		}
		} ).start();
		Thread.yield();
		System.out.println("Yielded");
		
		}

}
