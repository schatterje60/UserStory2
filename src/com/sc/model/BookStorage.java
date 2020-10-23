package com.sc.model;

public class BookStorage implements Comparable
{
	public int book_id;
	public String book_title;
	double price;
	public String author;
	public int page_no;
	
	public BookStorage(int book_id, String book_title, double price, String author,int page_no) 
	{
		
		this.book_id = book_id;
		this.book_title = book_title;
		this.price = price;
		this.author = author;
		this.page_no=page_no;
	}
	public BookStorage()
	{
		super();
	}
	public int getBook_id() 
	{
		return book_id;
	}
	public void setBook_id(int book_id)
	{
		this.book_id = book_id;
	}
	public String getBook_title() 
	{
		return book_title;
	}
	public void setBook_title(String book_title)
	{
		this.book_title = book_title;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author) 
	{
		this.author = author;
	}
	public int getPage_no()
	{
		return page_no;
	}
	public void setPage_no(int page_no)
	{
		this.page_no = page_no;
	}
	public void showDetails()
	{
		System.out.println("The details of the book:" +book_id +book_title  +price +author +page_no);

	}
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + book_id;
		result = prime * result + ((book_title == null) ? 0 : book_title.hashCode());
		result = prime * result + page_no;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookStorage other = (BookStorage) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (book_id != other.book_id)
			return false;
		if (book_title == null) {
			if (other.book_title != null)
				return false;
		} else if (!book_title.equals(other.book_title))
			return false;
		if (page_no != other.page_no)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	@Override
	public String toString()
	{
		return "BookStorage [book_id=" + book_id + ", book_title=" + book_title + ", price=" + price + ", author="
				+ author + ", page_no=" + page_no + "]";
	}
	
	public int compareTo(Object arg0) 
	{
		return (this.book_id - ((BookStorage)arg0).book_id);
		
	}


}
