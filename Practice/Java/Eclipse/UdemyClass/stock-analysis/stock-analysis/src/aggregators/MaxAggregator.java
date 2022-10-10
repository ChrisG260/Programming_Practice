package aggregators;

import java.util.ArrayList;
import java.util.List;

public class MaxAggregator extends Aggregator{
	
	public MaxAggregator() {
		super();
	}
	
	public MaxAggregator(List<Double> numbers) {
		this.numbers = new ArrayList<Double>(numbers);
	}

	@Override
	public double calculate() {
		double max = numbers.get(0);
		int index = 0; 
		for(Double number : numbers){
			if(number > max){
				max = number;
				this.csvIndex = index; 
			}
			index++;
		}
		this.csvIndex += 2; // CSV file, Header + 1 for 0 offset;
		return max;
	}

	@Override
	public List<Double> getValues() {
		return numbers;
	}
	
}
