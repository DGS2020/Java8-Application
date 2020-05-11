package com.java8.stream;

import java.util.ArrayList;

public class Student 
{
	
	String name;
	ArrayList<String> book;
	
	public Student() {
		book = new ArrayList<String>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getBook() {
		return book;
	}
	public void setBook(ArrayList<String> book) {
		this.book = book;
	}
	public void addBook(String string) 
	{
		book.add(string);
		
	}
	
}
