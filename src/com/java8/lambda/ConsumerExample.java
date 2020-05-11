package com.java8.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

import com.java8.optionalclass.Address;
import com.java8.optionalclass.User;

public class ConsumerExample 
{

	
	public static void print(String s) {
		System.out.println(s);
	}
	
	

	public static void main(String[] args) {
	
		User user = new User();
		user.setName("Gopi");
		Address address = new Address();
		address.setCity("Covi");
		
		ArrayList<String> s = new ArrayList<String>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.forEach(ConsumerExample::print);
//		/Consumer example
		Consumer<String> firstC = x -> System.out.println(x.toLowerCase());
		
		s.forEach(firstC);
		

		
	}
}