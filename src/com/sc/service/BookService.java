package com.sc.service;
import java.util.Iterator;
import com.sc.model.BookStorage;
import com.sc.repoitory.Database;

public class BookService implements Comparable<BookStorage>
{
	Database database;
	
	public BookService()
	{
		super();
		database=new Database();
		
	}
	public void showAllBooks()
	{
		Iterator<BookStorage>itr=database.bookSet.iterator();
		while(itr.hasNext()) 
		{
			System.out.println((itr.next()));
		}
	}
	public void removeBook(int bookId)
	{
		
		boolean notFound=true;
		Iterator<BookStorage>itr=database.bookSet.iterator();
		while(itr.hasNext())
		{
			BookStorage bs=itr.next();
			if(bs.book_id==bookId)
			{
				notFound=false;
				itr.remove();
				System.out.println("You have successfully deleted the book");
				break;
				
			}
		}
		if(notFound)
		{
			System.out.println("no such BookId available");
		}
		Iterator<BookStorage>itr1=database.bookSet.iterator();
		while(itr1.hasNext()) 
		{
		System.out.println(itr1.next());
		}
	}
	
	public void addNewBook(BookStorage bs1)
	{
		
		database.bookSet.add(bs1);
		System.out.println("\nBook inserted successfully\n");
		Iterator<BookStorage>itr1=database.bookSet.iterator();
		while(itr1.hasNext()) 
		{
			System.out.println(itr1.next());
		}
		
	}	
	
	 public void updateBookData(int bookId,int price) 
	 {
	  
		 Iterator <BookStorage>itr=database.bookSet.iterator();
	 	 	while(itr.hasNext())
	 	 	{
	 	 		BookStorage bs=itr.next();
	 	 		if(bs.book_id==bookId)
	 	 		{
	 	 			String book_title=bs.book_title;
	 	 			String author=bs.author;
	 	 			Integer page_no=bs.page_no;
	 	 			itr.remove();
	 	 			BookStorage b=new BookStorage(bookId,book_title,price,author,page_no);
	 	 			database.bookSet.add(b);
	 	 			System.out.println("Details Updated Successfully");
				
	 	 			Iterator<BookStorage>itr1=database.bookSet.iterator();
	 	 			while(itr1.hasNext()) 
	 	 			{
						System.out.println(itr1.next());
	 	 			}
	 	 		}
			 
	 	 	}
	 }	 
		
	public BookStorage searchByName(String name)
	{
		for(BookStorage bookSet:database.bookSet)
		{
			
				if(bookSet.book_title.equals(name))
				{
					return  bookSet ;
				}
		}
		return null;
	}
	@Override
	public int compareTo(BookStorage o) 
	{
		return 0;
	}
}
