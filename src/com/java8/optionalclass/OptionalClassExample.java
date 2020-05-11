package com.java8.optionalclass;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Random;
import java.util.function.BiPredicate;
import java.util.stream.Stream;



public class OptionalClassExample {

	public static void main(String[] args) {

	     /* flat map example*/   
        String[][] data = new String[][]{{"ad", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);
        
        //Stream<String>, GOOD!
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));

        //Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));
/*
        stringStream.forEach(System.out::println);
        
        
        HashMap<String, String> fMap = new HashMap<>();
        
        fMap.put("k", "j");
        fMap.put("a", "h");
        fMap.put("s", "n");
        fMap.put("d", "i");
        fMap.put("f", "p");
        
        BiPredicate<String, Integer> filter = (x, y) -> {return x.length() == y;};
        
        Stream<Entry<String, String>> streammp = fMap.entrySet().stream().filter(x -> x.getKey().equals("a"));
        
System.out.println("str");
        streammp.forEach(System.out::println);
        
        Stream<String> streamvalue = fMap.values().stream().filter(x -> x.equals("i"));
        
        System.out.println("str");
        streamvalue.forEach(System.out::println); // getting error if stream used secondtime @dev @suthersan call me and remind me on this
        
        */
        
		
        
        
		User user = new User();
		user.setName("Gopi");
		Address address = new Address();
		address.setCity("Covi");
		Optional<User> u =Optional.ofNullable(user);
		System.out.println(u.ofNullable(user).ofNullable(user.getAddress()).get().getCity() );
		

		
		
		
		
		
		
		Integer value1 = null;
	    Integer value2 = new Integer(10);
			
	    //Optional.ofNullable - allows passed parameter to be null.
	    Optional<Integer> a = Optional.ofNullable(value1);
			
	    //Optional.of - throws NullPointerException if passed parameter is null
	    Optional<Integer> b = Optional.of(value2);
	   
	  //Optional.equals
	    System.out.println(a.equals(b));
	    System.out.println(a.equals(value1));
	    System.out.println(b.equals(value2));
	    System.out.println(b.equals(value1));
	    System.out.println(b.equals(b));
	    System.out.println(b.get().equals(value2));

		//Optional.isPresent - checks the value is present or not
		System.out.println("First parameter is present: " + a.isPresent());
	    System.out.println("Second parameter is present: " + b.isPresent());
		

	    //Optional.orElse - returns the value if present otherwise returns
	    //the default value passed.
	    value1 = a.orElse(new Integer(0));
	    
	    value2 = b.get();
	    
	    
	    
	    Integer x = null;
	    
	    
	    Integer y = Optional.ofNullable(x).orElseGet(() -> new Random().nextInt());
	    
	    System.out.println("Y = "+y);



	    System.out.println( value1 + value2); 
	      
	}
	

}
