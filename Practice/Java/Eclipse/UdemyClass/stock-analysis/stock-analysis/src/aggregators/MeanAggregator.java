package aggregators;

import java.util.ArrayList;
import java.util.List;

public class MeanAggregator extends Aggregator{
	
	public MeanAggregator() {
		super();
	}
	
	public MeanAggregator(List<Double> numbers) {
		this.numbers = new ArrayList<Double>(numbers);
	}
	
	public double calculate() {
		double result = 0;
		if(!numbers.isEmpty()){
			double value = 0.00;
			for(Double number : numbers){
				value+=number;
			}
			result = value/numbers.size();
		}
		return result;
	}

	@Override
	public List<Double> getValues() {
		return numbers;
	}

}
