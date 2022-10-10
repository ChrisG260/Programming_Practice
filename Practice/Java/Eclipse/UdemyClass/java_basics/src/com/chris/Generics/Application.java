package com.chris.Generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Application {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Container<Integer, String> container = new Container<>(12, "hello");
		
		System.out.println(container);
		
		Set<String> mysetStr = new HashSet<String>();
		mysetStr.add("first");
		mysetStr.add("second");
		mysetStr.add("third");
		
		Set<String> mysetStr2 = new HashSet<String>();
		mysetStr2.add("first");
		mysetStr2.add("second");
		mysetStr2.add("Computer");
		
		Set<String> mysetStrU = union(mysetStr, mysetStr2);
		
		System.out.println(mysetStrU);
		
		Iterator<String> itr = mysetStrU.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Wildcards, ?, array lists can be anything, creates rawtype		
		ArrayList<?> accountants = new ArrayList<>();
		
		// A list that accepts employee class, as well as it's children
		// Upper bound class Employee
		ArrayList< ? extends Employee> employees = new ArrayList<>();
		
		// A list that only accepts the class named with wild card and parents of that class, no children allowed
		// Lower bound class Employee, lowest you can go in inheritance chain
		ArrayList< ? super Employee> employeesSuper = new ArrayList<>();
		
		
		ArrayList<Employee> employees2 = new ArrayList<>();
		employees2.add(new Employee());
		employees2.add(new Employee());
		employees2.add(new Accountant());
		
		makeEmployeeWork(employees2);
		
		ArrayList<Accountant> accountants2 = new ArrayList<>();
		accountants2.add(new Accountant());
		accountants2.add(new Accountant());
		
		makeEmployeeWork(accountants2);

	}
	
	// Generic Method
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		
		Set<E> result = new HashSet<E>(set1);
		result.addAll(set2);
		return result;
		
	}

	public static void makeEmployeeWork(List<? extends Employee> employees)
	{
		for(Employee employee : employees) {
			employee.work();
		}
	}
}
