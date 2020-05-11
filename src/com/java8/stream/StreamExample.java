package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample 
{
	public static void main(String[] args) 
	{
		
		//https://www.javatpoint.com/java-8-collectors
		//https://howtodoinjava.com/java8/stream-map-vs-flatmap/
		//https://mkyong.com/java8/java-8-streams-map-examples/
		//https://mkyong.com/java8/java-8-flatmap-example/
		//https://www.javatpoint.com/java-8-stream
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		
		Stream<String> streamObj = strings.stream().filter(string -> !string.isEmpty()).map(String::toUpperCase);
		List<String> filtered = streamObj.collect(Collectors.toList());
		System.out.println(filtered.toString());
		
		
		
		Student obj1 = new Student();
        obj1.setName("mkyong");
        obj1.addBook("Java 8 in Action");
        obj1.addBook("Spring Boot in Action");
        obj1.addBook("Effective Java (2nd Edition)");

        Student obj2 = new Student();
        obj2.setName("zilap");
        obj2.addBook("Learning Python, 5th Edition");
        obj2.addBook("Effective Java (2nd Edition)");

        List<Student> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);

        List<String> collect = list.stream().map(x -> x.getBook()).flatMap(x -> {System.out.println("Fmap"+x); return x.stream();}).distinct().collect(Collectors.toList());      //Stream<Set<String>>
                       // .flatMap(x -> x.stream())   //Stream<String>
                       // .distinct()
                       // .collect(Collectors.toList());

        collect.forEach(x -> System.out.println(x));

		
		
        List numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        @SuppressWarnings("unchecked")
		IntSummaryStatistics stats = numbers.stream().mapToInt(x -> (int)x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
		
		
		
	}
}
