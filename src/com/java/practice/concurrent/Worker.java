package com.java.practice.concurrent;

import java.util.concurrent.CountDownLatch;

public class Worker extends Thread{
private int delay;
private CountDownLatch latch;

public Worker(int delay,CountDownLatch latch,String name){
	super(name);
	this.delay=delay;
	this.latch = latch;
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			Thread.sleep(delay);
			latch.countDown();
			System.out.println(Thread.currentThread().getName() + " has finished");
		}catch(Exception e){
			
		}
	}

}
