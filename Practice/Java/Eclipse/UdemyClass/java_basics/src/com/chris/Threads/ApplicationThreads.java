package com.chris.Threads;

public class ApplicationThreads {

	public static void main(String[] args) {
		
		System.out.println("Starting Thread 1");
		Task thread = new Task("Thread A");
		thread.start();
		
		System.out.println("Starting Thread 2");
		Task thread2 = new Task("Thread B");
		thread2.start();
		
		//Alternative thread creation Implement Runnable class
		System.out.println("Starting Thread 1 (Runnable)");
		TaskRunable taskR = new TaskRunable("Thread A (Runnable)");
		Thread threadR1 = new Thread(taskR);
		threadR1.start();
		
		System.out.println("Starting Thread 2 (Runnable)");
		TaskRunable taskR2 = new TaskRunable("Thread B (Runnable)");
		Thread threadR2 = new Thread(taskR2);
		threadR2.start();
		
		//Alternative thread creation using anonymous runnable
		System.out.println("Starting Thread 3 (Runnable)");
		Thread threadAR3 = new Thread(new Runnable() {

			String threadName = "Thread 3 (Runnable)";
			
			@Override
			public void run() {
				
				Thread t = Thread.currentThread();
				
				if(threadName != null && !threadName.isEmpty()) {
					t.setName(threadName);
				}
				
				
				for(int x = 0 ; x < 100; x++) {
					System.out.println(t.getName() +": " + x);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		});
		threadAR3.start();
		
		System.out.println("Starting Thread 4 (Runnable)");
		Thread threadAR4 = new Thread(new Runnable() {

			String threadName = "Thread 4 (Runnable)";
			
			@Override
			public void run() {
				
				Thread t = Thread.currentThread();
				
				if(threadName != null && !threadName.isEmpty()) {
					t.setName(threadName);
				}
				
				
				for(int x = 0 ; x < 100; x++) {
					System.out.println(t.getName() +": " + x);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		});
		threadAR4.start();

	}

}

class Task extends Thread {

	String threadName;
	
	public Task() {
		super();
		
	}
	
	public Task(String threadName) {
		super();
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		
		Thread t = Thread.currentThread();
		
		if(threadName != null && !threadName.isEmpty()) {
			t.setName(threadName);
		}
		
		
		for(int x = 0 ; x < 100; x++) {
			System.out.println(t.getName() +": " + x);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class TaskRunable implements Runnable {

	String threadName;
	
	public TaskRunable() {
		super();
		
	}
	
	public TaskRunable(String threadName) {
		super();
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		
		Thread t = Thread.currentThread();
		
		if(threadName != null && !threadName.isEmpty()) {
			t.setName(threadName);
		}
		
		
		for(int x = 0 ; x < 100; x++) {
			System.out.println(t.getName() +": " + x);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
