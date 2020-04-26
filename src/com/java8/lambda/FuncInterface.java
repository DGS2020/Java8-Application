package com.java8.lambda;

interface FuncInterface 
{ 
    // An abstract function 
    void abstractFun(int x); 

  
    // A non-abstract (or default) function 
    default void normalFun() 
    { 
       System.out.println("Hello"); 
    } 
    public default void test()
    {
    	System.out.println("d");
    }
    
    public static void staticMethod()
    {
    	System.out.println("staticMethod");
    }
} 
  

