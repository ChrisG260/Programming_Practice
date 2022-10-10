package com.chris.Threads.ProducerConsumerConcurrentQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerApp {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> questionQueue = new ArrayBlockingQueue<Integer>(5);
		
		Thread prodThread = new Thread(new Producer(questionQueue));
		Thread consThread = new Thread(new Consumer(questionQueue));
		
		prodThread.start();
		consThread.start();

	}

}
