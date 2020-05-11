package com.java8.methodreferance;

import java.util.function.BiFunction;

import com.sun.xml.internal.ws.util.StringUtils;

public class InstanceMethodReference 
{
	
	interface Sayable{  
	    void say();  
	} 
	

		public Integer add(Integer a,Integer b)
		{
			return a+b;
		}
		
	

	
	public void saySomething()
	{  
		System.out.println("Hello, this is non-static method.");  
	}
	

	
	public static void main(String[] args) 
	{  
	       
	     
	       // Referring non-static method using anonymous object  
	       Sayable sayable = new InstanceMethodReference()::saySomething; // You can use anonymous object also  
	       // Calling interface method  
	       sayable.say();  
	       InstanceMethodReference iunstanceMethodReference = new InstanceMethodReference();
	       Sayable sayables = iunstanceMethodReference::saySomething; // You can use anonymous object also  
	       // Calling interface method  
	       sayable.say();  
	       
	       //we cant use new or instance for static method 
	       // Referring static method using anonymous object  
	       Sayable sayable2 = MethodReference_Static::saySomething; // You can use anonymous object also  
	       // Calling interface method  
	       sayable2.say();  
	       
	       Thread t2=new Thread(MethodReference_Static::saySomething);  
	        t2.start(); 
	        
	        
	        BiFunction<Integer, Integer, Integer>adder = new InstanceMethodReference()::add;  
	        int result = adder.apply(10, 20);  
	        System.out.println(result);
	     
	        
	   /* 
	    *  // key = id, value - websites
        Map<Integer, String> result1 = list.stream().collect(
                Collectors.toMap(Hosting::getId, Hosting::getName));

        System.out.println("Result 1 : " + result1);

        // key = name, value - websites
        Map<String, Long> result2 = list.stream().collect(
                Collectors.toMap(Hosting::getName, Hosting::getWebsites));

        System.out.println("Result 2 : " + result2);

        // Same with result1, just different syntax
        // key = id, value = name
        Map<Integer, String> result3 = list.stream().collect(
                Collectors.toMap(x -> x.getId(), x -> x.getName()));

        System.out.println("Result 3 : " + result3);
	    * 
	    */
	}

}
