package com.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample 
{
	
	/*//https://mkyong.com/java8/java-8-predicate-examples/
	 * Predicate is a functional interface, which accepts an argument and returns a
	 * boolean. Usually, it used to apply in a filter for a collection of objects.
	 * 
	 * @FunctionalInterface public interface Predicate<T> { boolean test(T t); }
	 */
	public static void main(String[] args) 
	{
		System.out.println("------------------- 1 -----------------------");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       
		Predicate<Integer> noGreaterThan5 =  x -> x > 5;
		
		//List<Integer> collect = list.stream().filter(x -> x > 5).collect(Collectors.toList());
        //or can be use as below are above
		List<Integer> collect = list.stream().filter(noGreaterThan5).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
		System.out.println("------------------- 2 -----------------------Predicate.and()");
		//Predicate.and()
		
		//x -> x > 5 && x < 8 can be used as below
		
		Predicate<Integer> noLessThan8 = x -> x < 8;
		
		collect = list.stream().filter(noGreaterThan5.and(noLessThan8)).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
        
		System.out.println("------------------- 3 -----------------------Predicate.or()");
		//Predicate.or()
		
		Predicate<Integer> multipleof2 = x -> (x % 2) == 0;
		Predicate<Integer> multipleof7 = x -> (x % 7) == 0;
		
		collect = list.stream().filter(multipleof2.or(multipleof7)).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
		System.out.println("------------------- 4 -----------------------Predicate.negate()");
		//Predicate.negate()
		
		collect = list.stream().filter(multipleof2.negate()).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
		
		System.out.println("------------------- 5 -----------------------Predicate.test()");
		//Predicate.test()
		
		collect = list.stream().filter(multipleof2::test).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
		System.out.println("------------------- 6 -----------------------Predicate.test()");
		
		Predicate<String> startWithA = x -> x.startsWith("a");

        // start with "a" or "m"
        boolean result = startWithA.or(x -> x.startsWith("m")).test("mkyong");
		System.out.println("Result : "+result);
		
		//.orElseThrow(RuntimeException::new);
		
	}

}
