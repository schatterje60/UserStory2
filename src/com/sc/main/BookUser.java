package com.sc.main;
import java.util.Scanner;

import com.sc.model.BookStorage;
import com.sc.service.BookService;

public class BookUser 
{
	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		BookService service=new BookService();
		int menu;
		do {
				System.out.println("\nHello Reader");
				System.out.println("PRESS  1 FOR VIEW ALL BOOKS\n" 
						+"PRESS 2 FOR SEARCH A BOOK BY NAME \n" 
						+"PRESS 3 FOR UPDATING THE PRICE OF THE BOOK\n"
						+"PRESS 4 FOR INSERTION\n"
						+"PRESS 5 FOR DELETION\n"
						+"Press 6 for exit\n");
				System.out.println("enter the option of menu");
				menu=sc.nextInt();
				while(menu<1 || menu>6)
				{
					System.out.println("Invalid choice....Please choose proper option from the given menu.");
					System.out.println("press 1 for view all books\n" 
							+"press 2 for search a book by name\n" 
							+"press 3 for updating the price of the book\n"
							+"press 4 for insertion\n"
							+"press 5 for deletion\n"
							+"Press 6 for exit\n");
					menu=sc.nextInt();
					System.out.println("you have choosed the option" +menu);
				}
				switch(menu)
				{
					case 1:
					{
						System.out.println("you want to view all books...\n Here is the booklist for you:\n");
						service.showAllBooks();
						break;
					}
					case 2:
					{
						System.out.println("you want to search a book by the book title");
						System.out.println("Enter the title of the book");
						String name=sc.next();
						BookStorage bs=service.searchByName(name);
						if(bs!=null)
						{
							System.out.println("The book you are Seraching for:\n"+bs);
						}
						else
						{
							System.out.println("There is no such book available.Try again!");
						}
						break;
					}
					case 3:
					{
						System.out.println("you want to update the price of the book");
						System.out.println("Enter the id");
						int id=sc.nextInt();
						System.out.println("Enter the price");
						int price=sc.nextInt();
						service.updateBookData(id, price);
						System.out.println("The price is updated");
						break;
					}
					case 4:
					{
						System.out.println("Insert the valid details of the book you want to add...\n ");
					
						System.out.println("enter the book id"); 
						int book_id=sc.nextInt();
						System.out.println("you entered the book id" +book_id);
					
						System.out.println("\n enter the book title"); 
						String book_title=sc.next();
						System.out.println("you have entered" +book_title);
					
						System.out.println("\n enter the book price"); 
						int price=sc.nextInt();
						System.out.println("you have entered" +price);
					
						System.out.println("\n enter the author name"); 
						String author=sc.next();
						System.out.println("you have entered" +author);
					
						System.out.println("\n enter the page number");
						int page_no=sc.nextInt();
						System.out.println("you have entered" +page_no);
					 
						BookStorage bs=new BookStorage(book_id,book_title,price,author,page_no);
						service.addNewBook(bs);
						break;
					}
					case 5:
					{
						System.out.println("You want to delete a book from the list...\n");
						System.out.println("enter the bookid");
						int book_id=sc.nextInt(); 
						System.out.println("you want to delete:" +book_id);
						service.removeBook(book_id);
						break;
					}
					case 6:
					{
						System.out.println("You want to exit\n"
							+"Thank you for Visiting\n");
						return;
					}
				
					default:
					{
						System.out.println("invalid option");
						System.exit(menu);
						return;
					}
			
				}
				
		}
		while(true);
	}
	
}
