package com.chris.Threads.ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerApplication {

	public static void main(String[] args) {
		
		List<Integer> questionList = new ArrayList<Integer>();
		
		Thread producerThread = new Thread(new Producer(questionList));
		Thread consumerThread = new Thread(new Consumer(questionList));
		
		producerThread.start();
		consumerThread.start();

	}

}
