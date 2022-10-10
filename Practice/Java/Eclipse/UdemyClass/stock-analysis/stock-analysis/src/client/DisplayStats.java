package client;

import java.util.List;

import aggregators.Aggregator;
import aggregators.MaxAggregator;
import aggregators.MeanAggregator;
import aggregators.MinAggregator;
import fileprocessors.StockFileData;

public class DisplayStats {
	
	StockFileData fileData;
	
	public DisplayStats(StockFileData fileData) {
		this.fileData = fileData;
	}
	
	public void displayStats(List<String> headers)
	{
		if(!headers.isEmpty()) {
			for(String header : headers) {
				displayStats(header);
			}
		}
		
	}
	
	public void displayStats(String col)
	{
		if(fileData == null) return;
		
		List<Double> values = fileData.getData(col);
		if(!values.isEmpty()){
			Aggregator minValue = new MinAggregator(values);
			Aggregator meanValue = new MeanAggregator(values);
			Aggregator maxValue = new MaxAggregator(values);
			System.out.println("\n" + col);
			System.out.println("  Min:  " + String.format("%,.2f", minValue.calculate()) + " (csv file index:" + minValue.getIndex() + ") ");
			System.out.println("  Mean: " + String.format("%,.2f", meanValue.calculate()));
			System.out.println("  Max:  " + String.format("%,.2f", maxValue.calculate()) + " (csv file index:" + maxValue.getIndex() + ") ");
		}
	}

}
