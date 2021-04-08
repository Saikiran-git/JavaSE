package com.kiran.java.mockito.HandsOnLMSRefactoring;

import java.util.*;
public class BookDAO {

	ArrayList<Book> l =  new ArrayList<Book>();
	
	public void addBook(Book obj){
		l.add(obj);
	}
	
	public void removeBook(Book obj)
	{
		l.remove(obj);
	}
	
	
// 	public void BookDAO()
// 	{
// 		for(int i=0;i<l.size();i++)
// 		{
// 			System.out.println("Book Id:" + l.get(i).getBookId());
// 			System.out.println("Book Title:" + l.get(i).getBookTitle());
// 			System.out.println("Author Name:" + l.get(i).getAuthor_Name());
// 			System.out.println("Publisher Name:" + l.get(i).getPublisherName());
			
// 		}
// 	}
    
    public void viewBooks() {
        l.forEach(System.out::println);
    }
    
}
