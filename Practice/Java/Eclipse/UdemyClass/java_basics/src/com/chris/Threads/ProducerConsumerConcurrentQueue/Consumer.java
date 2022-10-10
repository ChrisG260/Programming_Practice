package com.chris.Threads.ProducerConsumerConcurrentQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	BlockingQueue<Integer> questionQueue = null;
	
	
	
	
	/**
	 * @param questionQueue
	 */
	public Consumer(BlockingQueue<Integer> questionQueue) {
		super();
		this.questionQueue = questionQueue;
	}




	@Override
	public void run() {
		
		while(true) {
			try {
				answerNextQuestion();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	// Work done in synchronized method to ensure thread safety
	private synchronized void answerNextQuestion() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Answered Question: " + 
				questionQueue.take() + 
				" (Questions remaining in queue: " + questionQueue.size() + " )");
	}
}
