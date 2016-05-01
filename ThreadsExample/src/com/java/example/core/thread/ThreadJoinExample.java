package com.java.example.core.thread;
/**
 * This class is to test the join() worakablity.
 * In the below method comment and uncomment the t3.join(),t1.join() and t2.join()
 * and check how the code behave. 
 * @author abdus
 *
 */
public class ThreadJoinExample {
public static void main(String[] args) throws InterruptedException {
	Thread3 t3 = new Thread3();
	t3.start();
	// join me after i am done.
	//t3.join();
	//join after t3 is done.
	Thread1 t1 = new Thread1();
	t1.start();
	//t1.join();
	//join after t2 is done.
	Thread2 t2 = new Thread2();
	t2.start();
	t2.join();
}
}

class Thread1 extends Thread{
	@Override
	public void run(){
		for(int i=0;i<90000;i++){
			System.out.println("In thread 1 count " + i );
		}
	}	
}

class Thread2 extends Thread{
	@Override
	public void run(){
		for(int i=0;i<90000;i++){
			System.out.println("In thread 2 count " + i );
		}
	}	
}

class Thread3 extends Thread{
	@Override
	public void run(){
		for(int i=0;i<90000;i++){
			System.out.println("In thread 3 count " + i );
		}
	}	
}
