package com.java8.stringjoin;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringJoiner;

public class StringJoin {

	public static void main(String[] args)
	{
		
		
		System.out.println("Example 1------------------------------------");
		ArrayList<String> folderNames = new ArrayList<>();
		
		folderNames.add("com");
		folderNames.add("java8");
		folderNames.add("stringjoin");
		folderNames.add("StringJoin.java");

		String path = String.join("/", folderNames);
		
		System.out.println(path);
		
		System.out.println("Example 2------------------------------------");
		
		String joined = String.join("/","usr","local","bin");
		System.out.println(joined);
		 
		System.out.println("Example 3------------------------------------");
		
		String ids = String.join(", ", ZoneId.getAvailableZoneIds());
		System.out.println(ids);
		
		System.out.println("Example 4------------------------------------");
		HashMap<String, String> values = new HashMap<>();
		values.put("1", "com");
		values.put("2", "java8");
		values.put("3", "stringjoin");
		values.put("4", "StringJoin.java");
		
		System.out.println(String.join("/",values.keySet()));
		System.out.println(String.join("/",values.values()));
		//String.copyValueOf(data)
		
		
		System.out.println("Example 5------------------------------------");
		
		StringJoiner joinNamess = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter   
        
        // Adding values to StringJoiner  
        joinNamess.add("Rahul");  
        joinNamess.add("Raju");  
        
        System.out.println(joinNamess);
  
        // Creating StringJoiner with :(colon) delimiter  
        StringJoiner joinNames2 = new StringJoiner(":", "[", "]");  // passing colon(:) and square-brackets as delimiter   
          
        // Adding values to StringJoiner  
        joinNames2.add("Peter");  
        joinNames2.add("Raheem"); 
        
        System.out.println(joinNames2);
  
        // Merging two StringJoiner  
        StringJoiner merge = joinNamess.merge(joinNames2);   
        System.out.println(merge);  
		
		
        System.out.println("Example 6------------------------------------");
        
        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter   
        
        System.out.println(joinNames);  
        
        // We can set default empty value.  
        joinNames.setEmptyValue("It is empty"); 


        System.out.println(joinNames);  
          
          
        // Adding values to StringJoiner  
        joinNames.add("Rahul");  
        joinNames.add("Raju");  
        System.out.println(joinNames);  
          
        // Returns length of StringJoiner  
        int length = joinNames.length();  
        System.out.println("Length: "+length);  
          
        // Returns StringJoiner as String type   
        String str = joinNames.toString();  
        System.out.println(str);  
          
        // Now, we can apply String methods on it  
        char ch = str.charAt(3);  
        System.out.println("Character at i"
        		+ "ndex 3: "+ch);  
          
        // Adding one more element   
        joinNames.add("Sorabh");  
        System.out.println(joinNames);  
          
        // Returns length  
        int newLength = joinNames.length();  
        System.out.println("New Length: "+newLength);
		
		
		
	}

}
