package com.chris.Generics;

public class Container<DataType1, DataType2> {
	
	DataType1 item1;
	DataType2 item2;
	
	public Container(DataType1 item1, DataType2 item2){
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public Container() {
		
	}
	
	public DataType1 getItem1() {
		return item1;
	}

	public void setItem1(DataType1 item1) {
		this.item1 = item1;
	}

	public DataType2 getItem2() {
		return item2;
	}

	public void setItem2(DataType2 item2) {
		this.item2 = item2;
	}


	@Override
	public String toString() {
		return "Container [item1=" + item1 + ", item2=" + item2 + "]";
	}
	
	

}
