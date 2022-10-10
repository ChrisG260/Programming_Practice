package com.chris.Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApp {

	public static void main(String[] args) {
		
		// Stream that loops from 1 to 10 (stops at 9) prints using foreach loop that terminates the stream
		IntStream
			.range(1, 10)
			.forEach((x) -> System.out.print(x));
	
		System.out.println();
		
		// Stream that loops from 1 to 10 (stops at 9) prints using foreach loop that terminates the stream
		IntStream
			.range(1, 10)
			.skip(5) //skip 5 elements of the stream
			.forEach((x) -> System.out.print(x));
	
		System.out.println();
		
		// Stream that loops from 1 to 10 (stops at 9) sums the numbers using sum to terminate the stream
		int val  = IntStream
					.range(1, 10)
					.sum();
	
		System.out.println(val + "\n");
		
		// Stream of, sorts and find first
		Stream.of("Hello", "Bottle", "Africa")
			.sorted()
			.findFirst()
			.ifPresent((x) -> System.out.print(x));
		
		System.out.println();
		
		// Stream from array, sort, filter and print
		String[] items = {"car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy"};
		Stream.of(items)
			.filter((x) -> x.startsWith("t"))
			.sorted()
			.forEach((x) -> System.out.print(x + " , "));
		System.out.println();
		
		//Average of squares of an int array
		Arrays.stream(new int[] {2,4,6,8,10})
			.map((x) -> x * x)
			.average()
			.ifPresent((n) -> System.out.print(n));
		System.out.println();
		
		// filter through a list of strings, convert to lower case, return words that start with 'c', sort the ones found, print out list
		List<String> listOfItems = Arrays.asList("car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy");
		listOfItems.stream()
			.map((x) -> x.toLowerCase())
			.filter((x)-> x.startsWith("c"))
			.sorted()
			.forEach((x) -> System.out.print(x + " , "));
		System.out.println();
		
		//Stream files
		try (Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"))){
			
			System.out.println();
			System.out.println("Stream from file");
			lines
				.filter((x)-> x.length() > 6)
				.sorted()
				.forEach((x) -> System.out.print(x + " , "));
			System.out.println();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		//Stream files
		try {
			System.out.println();
			List<String> words = Files.lines(Paths.get("files/wordFile.txt"))
					.filter((x)-> x.contains("th"))
					.collect(Collectors.toList());
			System.out.println("Stream from file with words containing 'th'");
			words.forEach((x) -> System.out.print(x + " , "));
			System.out.println();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		//Stream files
		try (Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"))){
			System.out.println();
			long rowCount = rows
					.map((x)-> x.split(","))
					.filter((x)-> x.length > 3)
					.count();
			System.out.println("Stream from file stockdata, rows with input > 3");
			System.out.println(rowCount + " good rows ");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		//Stream files
		try (Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"))){
			System.out.println();
			System.out.println("Stream from file stockdata, rows with input > 3, first value > 15, output ");
			rows.map((x)-> x.split(","))
				.filter((x)-> x.length > 3)
				.filter((x)-> Integer.parseInt(x[1].trim()) > 15)
				.forEach((x) -> System.out.println(x[0].trim() + " " + x[2].trim() + " " + x[3].trim()));;
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
