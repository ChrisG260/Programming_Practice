package aggregators;

import java.util.ArrayList;
import java.util.List;

public abstract class Aggregator {
	
	List<Double> numbers;
	int csvIndex;
	
	public Aggregator(){
		numbers = new ArrayList<Double>();
	}
	
	public Aggregator(List<Double> numbers){
		numbers = new ArrayList<Double>(numbers);
	}
	
	public int getIndex()
	{
		return this.csvIndex;
	}
	
	/**
	 * add data to the given collection
	 * 
	 */
	public void add(double number) {
		numbers.add(number);
	}
	
	/**
	 * add data to the given collection
	 * 
	 */
	public void add(List<Double> numbers) {
		this.numbers.addAll(numbers);
	}
	
	
	/**
	 * Any class that is a derivative of the abstract class
	 * Aggregator must implement the calculate method.
	 * @return double
	 */
	public abstract double calculate();
	
	public abstract List<Double> getValues();
	
}
