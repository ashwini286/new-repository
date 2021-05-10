package thread;

public class ImplementsThread implements Runnable {
public void run() {
	for(int i=0;i<9;i++) {
		System.out.println("child class : " +i);
		System.out.println("ashwini code");
	}
}
	public static void main(String[] args) {
		ImplementsThread t = new ImplementsThread();
		Thread t1 = new Thread();
		t1.start();

	}

}
