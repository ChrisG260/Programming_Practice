package aggregators;

import java.util.ArrayList;
import java.util.List;

public class MinAggregator extends Aggregator{

	public MinAggregator() {
		super();
	}
	
	public MinAggregator(List<Double> numbers) {
		this.numbers = new ArrayList<Double>(numbers);
	}

	@Override
	public double calculate() {
		double min = numbers.get(0);
		int index = 0;
		for(Double number : numbers){
			if(number < min){
				min = number;
				this.csvIndex = index;
			}
			index++;
		}
		this.csvIndex += 2; // CSV file, Header + 1 for 0 offset;
		return min;
	}

	@Override
	public List<Double> getValues() {
		return numbers;
	}

}
