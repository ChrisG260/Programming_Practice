package client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fileprocessors.StockFileData;
import fileprocessors.StockFileReader;

public class StockFileApplication {
	
	public static void main(String args[]) throws IOException{
		
		StockFileReader fr = new StockFileReader("table.csv");
		
		List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());
		StockFileData fileData = new StockFileData();
		fileData.addData(dataResult);
		fileData.printData();
		System.out.println(dataResult.size());
		
		DisplayStats stats = new DisplayStats(fileData);
		
		stats.displayStats(fr.getHeaders());
		
	}
	
	/**
	 * Complete the method body so that it returns the given structure needed to 
	 * populate the data field in the StockFileData class. 
	 * @param headers
	 * @param lines
	 * @return List
	 */
	public static List<HashMap<String, Double>> populateStockFileData(List<String> headers, List<String> lines){
		
		List<HashMap<String, Double>> dataResult = new ArrayList<>();
		
		// Run through data list
		for(String line : lines) {
			
			//parse each filedata line
			String [] parseLine = line.split(",");
			
			// Create an array of doubles from parsed data
			List<Double> values = new ArrayList<Double>();
			for(String value : parseLine){
				values.add(Double.parseDouble(value));
			}
			
			// Create Hashmap with Header as key and double data as value
			HashMap<String, Double> stockDataMap = new HashMap<>();
			for(int x = 0; x < headers.size(); x++) {
				stockDataMap.put(headers.get(x), values.get(x));
			}
			
			// add data to results list
			dataResult.add(stockDataMap);
		}
		
		return dataResult;
	}
	
	
}
