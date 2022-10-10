package com.chris.Threads.ThreadingInventroyManager.client;

import com.chris.Threads.ThreadingInventroyManager.InventoryManager;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		InventoryManager invMang = new InventoryManager(100);
		
		Thread inventoryTask = new Thread(new Runnable() {

			@Override
			public void run() {
				invMang.populateSoldProducts();
			}
			
			
		});
		
		Thread displayTask = new Thread(new Runnable() {

			@Override
			public void run() {
				invMang.displaySoldProduct();
			}
			
			
		});
		
		inventoryTask.start();
		Thread.sleep(1000);
		displayTask.start();
		
		//waits for thread to end first
		//inventoryTask.join();
		
		

	}

}
