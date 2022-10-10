package aggregators;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import client.StockFileApplication;
import fileprocessors.StockFileData;
import fileprocessors.StockFileReader;

public class AggregatorProcessor<T extends Aggregator> {
	
	T agg;
	String fileToRun;
	
	public AggregatorProcessor(T aggIn, String file) {
		super();
		this.agg = aggIn; 
		this.fileToRun = file;
	}
	
	public double runAggregator(int index){
		
		
		try {
			
			if(agg == null) {
				throw new Exception("Aggregator is null");
			}
				
			StockFileReader fr = new StockFileReader(fileToRun);
			List<String> headers = fr.getHeaders();
			
			if(headers.isEmpty()) {
				throw new Exception("No header values found");
			}
			if(index < 1 ||  index > headers.size()) {
				throw new Exception("Index out of bounds");
			}
			
			index -= 1; // to index headers
			
			List<HashMap<String, Double>> dataResult = StockFileApplication.populateStockFileData(headers, fr.readFileData());
			StockFileData fileData = new StockFileData();
			fileData.addData(dataResult);
			
			List<Double> values = fileData.getData(headers.get(index));
			
			agg.add(values);
				
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} 
		
		return agg.calculate();
		
	}
	
	

}
