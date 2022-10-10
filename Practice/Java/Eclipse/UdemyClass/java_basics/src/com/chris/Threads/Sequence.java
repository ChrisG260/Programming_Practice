package com.chris.Threads;

public class Sequence {
	
	private int value = 0;
	
	public int getNext() {
		
		// Locks thread until entire block is completed
		synchronized(this) {
			return ++value;
		}
	}
	
	// alternate way to  synchronize, locks thread until entire method is completed
	public synchronized int getNextS() {
		return ++value;
	}
}
