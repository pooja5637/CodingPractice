package com.practice.core.java8;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public List<Book> getBooks(){
		
		List<Book> books = new ArrayList<>();
		
		books.add(new Book(2,"JSP",339));
		books.add(new Book(3,"Python",225));
		books.add(new Book(4,"SpringBoot",115));
		books.add(new Book(5,"Sevlet",990));
		books.add(new Book(6,"Web Tech",339));
		books.add(new Book(1,"Core Java",400));

		
		
		return books;
		
	}
}
