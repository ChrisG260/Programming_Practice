package com.chris.Threads.Pools;

public class MessageProcessor implements Runnable {

	private int message;

	/**
	 * @param message
	 */
	public MessageProcessor(int message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " (Recived) message : " + message);
		respondToMessage();
		System.out.println(Thread.currentThread().getName() + " (Done) processing Message : " + message);
	}
	
	private void respondToMessage() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " (Unable) to process message : " + message);
		}
	}
	
}
