package com.java8.lambda;

import java.util.ArrayList;
import java.util.HashMap;

class  FuncInterfaceTest
{ 
    public static void main(String args[]) 
    { 
    	
    	System.out.println("Example 1------------------------------------------------------------------------");
    	//Example 1------------------------------------------------------------------------------------------------
    	
    	
        // lambda expression to implement above 
        // functional interface. This interface 
        // by default implements abstractFun() 
        FuncInterface fobj = (int x)->System.out.println(2*x); 
  
        fobj = (int x)->System.out.println(3*x); 
        // This calls above lambda expression and prints 10. 
        fobj.abstractFun(5); 
        
        
        
        System.out.println("Example 2------------------------------------------------------------------------");
        //Example 2------------------------------------------------------------------------------------------------
        
        ArrayList<Integer> arrL = new ArrayList<Integer>(); 
        arrL.add(1); 
        arrL.add(2); 
        arrL.add(3); 
        arrL.add(4); 
  
        // Using lambda expression to print all elements 
        // of arrL 
        arrL.forEach(n -> System.out.println(n)); 
        
        arrL.forEach(o -> System.out.println(0)); 
  
        // Using lambda expression to print even elements 
        // of arrL 
        arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); });
        
        
        
        
        System.out.println("Example 3------------------------------------------------------------------------");
        //Example 3------------------------------------------------------------------------------------------------
        ///HashMap
        HashMap<Integer, String> hMapNumbers = new HashMap<Integer, String>();
        
        //add key-value pairs
        hMapNumbers.put(1, "One");
        hMapNumbers.put(2, "Two");
        hMapNumbers.put(3, "Three");
       
        hMapNumbers.forEach((K,V) -> System.out.println( K + " => " + V ));
        
        System.out.println("Example 4------------------------------------------------------------------------");
        //Example4 4------------------------------------------------------------------------------------------------
        // declare a reference to GenericInterface
        // the GenericInterface operates on String data
        // assign a lambda expression to it
        FuncInterfaceGeneric<String> reverse = (str) -> {

            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
            result += str.charAt(i);
            return result;
        };

        System.out.println("Lambda reversed = " + reverse.func("Lambda"));

        System.out.println("Example 5------------------------------------------------------------------------");
        //Example 5-----------------------------------------------------------------------------------------------
        // declare another reference to GenericInterface
        // the GenericInterface operates on Integer data
        // assign a lambda expression to it
        FuncInterfaceGeneric<Integer> factorial = (n) -> {

            int result = 1;
            for (int i = 1; i <= n; i++)
            result = i * result;
            return result;
        };

        System.out.println("factorial of 5 = " + factorial.func(5));
        
        
        System.out.println("Example 6------------------------------------------------------------------------");
        
        Runnable r = () -> System.out.println("I just implemented the Runnable Functional Interface.");
        
        new Thread(r).start();
        
        new Thread(
        	    () -> System.out.println("My Runnable")
        	).start();
        
        System.out.println("Example 7------------------------------------------------------------------------");
        FuncInterfaceNoParam pivalue;
        
        // lambda expression
        pivalue = () -> 3.1415;
        
        System.out.println("Value of Pi = " + pivalue.method());
        
        
        ///https://www.programiz.com/java-programming/lambda-expression
        System.out.println("Example 8------------------------------------------------------------------------");
        ArrayList<String> places = new ArrayList<String>();
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");
        
        places.stream()
        .filter((p) -> p.startsWith("Nepal"))
        .map((p) -> p.toUpperCase())
        .sorted()
        .forEach((p) -> System.out.println(p));
        
 
        
        
    } 
}