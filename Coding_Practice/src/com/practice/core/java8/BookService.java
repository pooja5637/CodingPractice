package com.practice.core.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	public List<Book> getBooksBySort(){
		
		List<Book> books = new BookDAO().getBooks();
		
	//	Collections.sort(books, new MyComparator());
		
	/*	Collections.sort(books, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {

				return o1.getName().compareTo(o2.getName());
			}
		}); 
		
	*/
		
		Collections.sort(books, 
						( o1,  o2) ->  o2.getName().compareTo(o1.getName()));
		
		return books;
		

		
		
	}
	
	public static void main(String[] args) {
		
		
		List<Book> books =  new BookService().getBooksBySort();
		
		System.out.println(books);
		
	}
}



//class MyComparator implements Comparator<Book>{
//
//	@Override
//	public int compare(Book o1, Book o2) {
//
//		
//		return o1.getName().compareTo(o2.getName());
//	}
//	
//}