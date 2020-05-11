package com.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiPredicateExample 
{
	
	/*//https://mkyong.com/java8/java-8-bipredicate-examples/
	 * 
	 * @FunctionalInterface public interface Predicate<T> { boolean test(T t,U u); }
	 */
	
	
	public static void main(String[] args) 
	{
		System.out.println("------------------- 1 -----------------------");
		
		List<Domain> domains = Arrays.asList(new Domain("google.com", 1),new Domain("i-am-spammer.com", 10),
                new Domain("mkyong.com", 0),
                new Domain("microsoft.com", 2));
		
		BiPredicate<String, Integer> bi = (domain, score) -> {
            return (domain.equalsIgnoreCase("google.com") || score == 0);
        };
        
        List<Domain> list = domains.stream()
        .filter(x -> bi.test(x.getName(), x.getScore()))
        .collect(Collectors.toList());
        
        list.forEach(x -> System.out.println(x.getName() + " "+ x.getScore()));
		
	}

}

