package client;

import aggregators.AggregatorProcessor;
import aggregators.MaxAggregator;
import aggregators.MeanAggregator;
import aggregators.MinAggregator;

public class Application {

	public static void main(String[] args) {
		
//		Aggregator values = new MeanAggregator();
//		values.add(100.93);
//		values.add(101.32);
//		values.add(103.41);
//		values.add(107.87);
//		values.add(100.90);
//		values.add(98.76);
//		
//		Aggregator minValue = new MinAggregator(values.getValues());
//				
//		double result = minValue.calculate();
//		
//		System.out.println(result);
		
		MinAggregator minAgg = new MinAggregator();
		MeanAggregator meanAgg = new MeanAggregator();
		MaxAggregator maxAgg = new MaxAggregator();
		
		AggregatorProcessor<MinAggregator> aggMinProc = new AggregatorProcessor<MinAggregator>(minAgg, "table.csv");
		System.out.println("Min: " + aggMinProc.runAggregator(1));
		
		AggregatorProcessor<MeanAggregator> aggMeanProc = new AggregatorProcessor<MeanAggregator>(meanAgg, "table.csv");
		System.out.println("Mean: " + aggMeanProc.runAggregator(3));
		
		AggregatorProcessor<MaxAggregator> aggMaxProc = new AggregatorProcessor<MaxAggregator>(maxAgg, "table.csv");
		System.out.println("Max: " + aggMaxProc.runAggregator(3));
		
	}

}
