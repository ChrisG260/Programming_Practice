package fileprocessors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class StockFileData {
	
	List<HashMap<String, Double>> data = new LinkedList<>();
	
	public void printData(){
		for(HashMap<String, Double> value : data) {
			System.out.println(value);
		}
	}
	
	public void addData(List<HashMap<String, Double>> dataIn){
		data = dataIn;
	}
	
	public List<Double> getData(String key){
		List<Double> numbers = new ArrayList<Double>();
		for(HashMap<String, Double> mapValue : data) {
			if(mapValue.containsKey(key)) {
				numbers.add(mapValue.get(key));
			}
		}
		return numbers;
	}
}
