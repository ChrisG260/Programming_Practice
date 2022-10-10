package com.chris.Threads.ProducerConsumer;

import java.util.List;

public class Producer implements Runnable{

	List<Integer> questionList = null;
	
	final int LIMIT = 5;
	private int questionNum;
	
	public Producer(List<Integer> questionList) {
		super();
		this.questionList = questionList;
	}
	
	public void readQuestion(int questionNum) throws InterruptedException {
		
		if(questionList == null) return;
		
		synchronized(questionList) {
			while(questionList.size() == LIMIT) {
				System.out.println("Questions have piled up, please wait...");
				questionList.wait();
			}
		}
		
		synchronized(questionList) {
			System.out.println("New Question: " + questionNum);
			questionList.add(questionNum);
			Thread.sleep(10);
			questionList.notify();
		}
		
	}
	
	
	@Override
	public void run() {
		
		while(true) {
			try {
				readQuestion(questionNum++);
			} catch (InterruptedException e) {
			}
		}

		
	}

}
