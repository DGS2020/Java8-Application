package com.java8.tmp;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Tmp 
{
	
	public static void main(String[] args)
	{
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(0);
		l1.add(15);
		l1.add(5);
		l1.add(20);
		
		///l1.stream().forEach(System.out::println);
		l1.stream().forEach(System.out::println);
		l1.stream().forEach(l -> System.out.println(l));
		l1.forEach(l -> System.out.println(l));
		
		Consumer<Integer> f= i->{
			System.out.println("The Square of " + i + "is: " + (i*i));
		};
		l1.stream().forEach(f);
	}

}
