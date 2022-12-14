package com.chris.Threads.Pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolApp {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService executor = Executors.newFixedThreadPool(2); //using 2 threads
	
		Runnable processor = new MessageProcessor(2);
		executor.execute(processor);
		
		Runnable processor2 = new MessageProcessor(3);
		executor.execute(processor2);
		
		Runnable processor3 = new MessageProcessor(4);
		executor.execute(processor3);
		
		Runnable processor4 = new MessageProcessor(5);
		executor.execute(processor4);
		
		executor.shutdown(); // Rejects any new task to service. Gracefully shuts down the service once threads complete
		
		//executor.shutdownNow(); //Terminates immediately
		//executor.isTerminated(); // returns true when shutdown, can put in while loop to wait for task to finish
		
		executor.awaitTermination(5, TimeUnit.MINUTES); // pauses for given time, before moving on, service still keeps if not enough time is given
		
		System.out.println("Done");

	}

}
