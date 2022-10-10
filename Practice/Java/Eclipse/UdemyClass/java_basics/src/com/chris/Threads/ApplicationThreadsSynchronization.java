package com.chris.Threads;

public class ApplicationThreadsSynchronization {

	public static void main(String[] args) {
		
		Sequence sequence = new Sequence();
		
		Worker worker1 = new Worker(sequence);
		worker1.setName("Worker 1");
		worker1.start();
		
		Worker worker2 = new Worker(sequence);
		worker2.setName("Worker 2");
		worker2.start();
		

	}

}

class Worker extends Thread {
	
	Sequence sequence  = null;
	
	public Worker() {
		this.sequence = new Sequence();
	}
	
	public Worker(Sequence sequence) {
		this.sequence = sequence;
	}
	
	@Override
	public void run() {
		for(int  x=0; x < 10; x++) {
			System.out.println(Thread.currentThread().getName() + " value : " + sequence.getNext()); 
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
