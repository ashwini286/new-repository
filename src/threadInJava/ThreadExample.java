package threadInJava;

public class ThreadExample extends Thread {
 public void run() {
	Thread.currentThread().setPriority(MIN_PRIORITY);
	 System.out.println( Thread.currentThread().getName());
	 for(int i=0;i<=5;i++) {
		/*  sleep mode for the specified number of milliseconds
			  2nd method sleep mode */
			 
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				
					System.out.println("child class = " +i);
				}
				
			if(i%2==0) {
				System.out.println("number is sum = " +i);
			}
			else
			{
				System.out.println("number is odd = " +i);
			}
			Thread.currentThread().setName("ram");
			System.out.println("child thread name  : " +Thread.currentThread().getName());
			Thread.currentThread().setPriority(MIN_PRIORITY);;
			System.out.println(" child thread priority  " +Thread.currentThread().getPriority());
	 }
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main thread priority  : " +Thread.currentThread().getName());
		System.out.println("child thread priority  : " +Thread.currentThread().getPriority());
		
		ThreadExample obj = new ThreadExample();
		obj.start();
		obj.sum();
	//	ThreadExample t1 = new ThreadExample();
		//t1.sum();
		}
	void sum() {
		int a = 10;
		int b = 30;
		int c = a+b;
				System.out.println(c);
				try {
					t1.join(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				Thread.currentThread().setName("shyam");
				System.out.println("Thread " +Thread.currentThread().getName());
			Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("main thread name  "   +Thread.currentThread().getPriority());
		System.out.println("ashwini");

		
	}
	}
 class Sub extends Thread {
	 
	
	public void run () {
		
		for(int i=0;i<=9;i++) {
			System.out.println(i);
		}
	}

	}
 
	