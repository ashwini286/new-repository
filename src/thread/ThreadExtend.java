package thread;

 //import thread.ThreadExtend.Demo1;

public class ThreadExtend  extends Thread{
 public void run() {
		 for(int i=0;i<=10;i++) {
			 System.out.println("child class : " +i);
		 }
 }
	 }
  class Demo1 extends Thread{
	 public void run() {
		 for(int i=1;i<=20;i++) {
			 System.out.println(" child class 2 : " +i);
		 }
	 }
 }
 class Mainnn{
	 
	public static void main(String[] args) {
		ThreadExtend t = new ThreadExtend();
		t.start(); 
	Demo1 t1 = new Demo1();
		t1.start();

	}

}

