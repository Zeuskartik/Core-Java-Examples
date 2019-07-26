package coreJava;

public class Multi {
	
	
	public static void main (String args[]) throws InterruptedException {
	    int[]x = {1,2,3,4,5,6};
	    for(Integer c: x) {
	    	System.out.println(c);
	    }
	
		Thread tx = new Thread(
			new Runnable() {
				@Override
				public void run() {
					System.out.println("Thread tx runssss");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.print("Tx is Awake\n");
					for (int i=0;i<=1;i++) {
						x[i]=x[i]*2;
						
					}
					 for(Integer c: x) {
					    	System.out.println(c);
					    }
					
					}});
		tx.start();
		Thread ty = new Thread(
				new Runnable() {
					@Override
					public void run() {
						System.out.println("Thread ty runssss");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.print("Ty is Awake\n");
						for (int i=2;i<=3;i++) {
							x[i]=x[i]*2;
							
						}
						 for(Integer c: x) {
						    	System.out.println(c);
						    }
						
					}});
		ty.start();
		Thread tz = new Thread(
				new Runnable() {
					@Override
					public void run() {
						System.out.println("Thread tz runssss");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.print("Tz is Awake\n");
						for (int i=4;i<=5;i++) {
							x[i]=x[i]*2;
							
						}
			
						 for(Integer c: x) {
						    	System.out.println(c);
						    }
						
					}});
		tz.start();
		
		tx.join();
		ty.join();
		tz.join();
		
		System.out.println("Final Array after mutilplication\n");
		 for(Integer c: x) {
		    	System.out.println("-> "+c);
		    }

		 		
	}


}
