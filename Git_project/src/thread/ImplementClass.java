package thread;

public class ImplementClass implements Runnable {
      public void run() {
    	  System.out.println("ashwini");
      }
	     
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementClass sc = new ImplementClass();
		Thread obj = new Thread();
		obj.start();
	}

}
