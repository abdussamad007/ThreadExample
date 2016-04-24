package com.java.practice.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class CountdownLatchExample {
public static void main(String[] args) throws InterruptedException{
	CountDownLatch latch = new CountDownLatch(4);
	CyclicBarrier x = new CyclicBarrier(1);
	Worker first = new Worker(1000, latch, "WORKER-1"); 
	Worker second = new Worker(2000, latch, "WORKER-2"); 
	Worker third = new Worker(3000, latch, "WORKER-3"); 
	Worker fourth = new Worker(4000, latch, "WORKER-4");

	first.start();
    second.start();
    third.start();
    fourth.start();
    
 // Main thread will wait until all thread finished 
    latch.await();

    System.out.println(Thread.currentThread().getName() + " has finished");
}
}
