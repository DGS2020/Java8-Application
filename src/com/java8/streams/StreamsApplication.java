package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsApplication {
	
	//Topics covered below are the details:

	//stream()
	//filter()
	//map()
	//collect()
	//count()
	//sorted()
	//sorted(Comparator)
	//min(Comparator)
	//max(Comparator)
	//forEach()
	//toArray() -> Highly recommended due to performance.
	//Stream.of()
	//stream we can use in the collection as well as if any group of elements then also we can use stream
	

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);
		System.out.println("List values " + l);
		
		List<Integer> I2 = l.stream().filter(i -> i%2==0).collect(Collectors.toList());
		
		System.out.println("Streams filter values " +I2);
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(75);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		marks.add(30);
		
		System.out.println("marks value " + marks);
		
		long noOfFailedStudents=marks.stream().filter(m->m<35).count();
		
		System.out.println("Failed students " + noOfFailedStudents);
		
		List<Integer> updatedMarks = marks.stream().map(i-> i+5).collect(Collectors.toList());
				
		System.out.println("Updated Marks value " + updatedMarks);
		
		Comparator<Integer> com = (i1,i2) -> (i1<i2)?1: (i1>i2)?-1:0;
		
		System.out.println("SortedList using comparator " + marks.stream().sorted(com));
		
		ArrayList<String> cricketSA = new ArrayList<>();
		
		cricketSA.add("Jacquas Kallis");
		cricketSA.add("Greme Smith");
		cricketSA.add("Shaun Pollock");
		cricketSA.add("AB Develliers");
		cricketSA.add("David Miller");
		cricketSA.add("Neil Meckenzie");
		
		//System.out.println(cricketSA.stream().sorted().collect(Collectors.toList()));
		
		//default Natural sorting order
		System.out.println(cricketSA.stream().sorted((i1,i2)-> i1.compareTo(i2)).collect(Collectors.toList()));
		System.out.println(cricketSA.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList()));
		//Logic here is String length we have to compare and print the values
		Comparator<String> comp = (s1,s2) -> {
			int l1=s1.length();
			int l2=s2.length();
			if(l1 < l2) return -1;
			else if(l1 > l2) return +1;
			else return s1.compareTo(s2);
		};
		
		List<String> outputCricketPlayers = cricketSA.stream().sorted(comp).collect(Collectors.toList());
		System.out.println("Outputcricket palyers with length " +  outputCricketPlayers);
		
		//Min max using streams examples.
		//Natural sorting ascending order
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(0);
		l1.add(15);
		l1.add(5);
		l1.add(20);
		System.out.println("List values for Min/Max using streams " + l1);
		Integer min = l1.stream().min((i1,i2)-> i1.compareTo(i2)).get();
		System.out.println("min value " + min);
		
		Integer max = l1.stream().max((i1,i2)-> i1.compareTo(i2)).get();
		System.out.println("max value " + max);
		
		//reverse order of sorting i.e descending order
		
		Integer min1 = l1.stream().min((i1,i2)-> -i1.compareTo(i2)).get();
		System.out.println("reverse min value " + min1);
		
		Integer max1 = l1.stream().max((i1,i2)-> -i1.compareTo(i2)).get();
		System.out.println("reverse max value " + max1);
		
		//in Stream we have forEach will return Function, in java 1.8 not required to use iterator to print the collections value, instead of that we can use Method reference.
		Consumer<Integer> f= i->{
			System.out.println("The Square of " + i + "is: " + (i*i));
		};
		
		l1.stream().forEach(f);
		l1.stream().forEach(System.out::println);
		l1.stream().forEach(z -> System.out.println(l));
		
		//toArray()
		//To convert stream of objects into array
		
		Integer[] i =l1.stream().toArray(Integer[]::new); //it is constructor reference
		
		for(Integer i2 : i)
		{
			System.out.println("value of toArray objects " + i2);
		}
		Stream.of(i).forEach(System.out::println);//if Integer Array objects each element we have to print Stream.of need to be implement
	
		//Without collection stream we can use below are the examples
		Stream<Integer> s = Stream.of(9,99,999,9999,99999);
		s.forEach(System.out::println);
		
		Integer[] arr = {100,101,103,104,105};
		Stream.of(arr).forEach(System.out::println);
	}

}
