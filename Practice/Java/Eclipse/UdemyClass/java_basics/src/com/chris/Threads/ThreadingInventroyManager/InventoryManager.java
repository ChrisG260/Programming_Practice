package com.chris.Threads.ThreadingInventroyManager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
	
	//CopyOnWriteArrayList thread safe collection, uses synchronize to control writeing and reading
	List<Product> soldProductsList = new CopyOnWriteArrayList<>();
	List<Product> purchasedProductsList = new ArrayList<>();
	
	int limit = 0;
	
	public InventoryManager(int limit) {
		super();
		this.limit = limit;
	}
	
	public void populateSoldProducts() {
		for(int i = 0; i < limit; i++ ){
			Product prod = new Product(i, ("Itemsold_" + i));
			System.out.println("Add Product("+ Thread.currentThread().getName() +"): " + prod);
			soldProductsList.add(prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void displaySoldProduct() {
		for(Product prod : soldProductsList) {
			System.out.println("Sold Product("+ Thread.currentThread().getName() +"): " + prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
