package com.chris.Threads.ProducerConsumerConcurrentQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

	int questionNum = 0;
	BlockingQueue<Integer> questionQueue = null;
	
		
	/**
	 * @param questionQueue
	 */
	public Producer(BlockingQueue<Integer> questionQueue) {
		super();
		this.questionQueue = questionQueue;
	}



	@Override
	public void run() {
	
		while(true) {
			try {
				addNextQuestion();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	// Work done in synchronized method to ensure thread safety
	private synchronized void addNextQuestion() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Added Question : " + ++questionNum);
		// put is thread safe, .add is not thread safe
		questionQueue.put(questionNum);
	}

}
