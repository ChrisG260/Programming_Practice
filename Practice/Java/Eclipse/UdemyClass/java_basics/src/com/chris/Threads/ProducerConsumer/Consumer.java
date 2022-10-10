package com.chris.Threads.ProducerConsumer;

import java.util.List;

public class Consumer implements Runnable{

	List<Integer> questionList = null;
	
	public Consumer(List<Integer> questionList) {
		super();
		this.questionList = questionList;
	}
	
	public void answerQuestion() throws InterruptedException {
		
		if(questionList == null) return;
		
		// Thread Waits until there is a question to answer
		synchronized(questionList) {
			while(questionList.isEmpty()) {
				System.out.println("Waiting for questions...");
				questionList.wait();
			}
		}
		
		// Thread Answers Question
		synchronized(questionList) {
			Thread.sleep(2000);
			System.out.println("Answer Question: " + questionList.remove(0));
			questionList.notify(); //notify producer question answered, so it can add a question

		}
		
	}
	
	
	@Override
	public void run() {
		
		while(true) {
			try {
				answerQuestion();
			} catch (InterruptedException e) {
			}
		}

		
	}
}
