package com.sc.repoitory;

import java.util.TreeSet;
import com.sc.model.BookStorage;
import java.util.Iterator;

public class Database
{
	public TreeSet<BookStorage> bookSet;
	
	public Database()
	{
		bookSet=new TreeSet<BookStorage>();
		BookStorage bs1=new BookStorage(1,"Like it happened yesterday",249,"Ravindar Singh",345);
		BookStorage bs2=new BookStorage(2,"Two States",299,"Chetan Vagat",400);
		BookStorage bs3=new BookStorage(3,"Operating System",700,"xyz",399);
		BookStorage bs4=new BookStorage(4,"Mulgudi Days",449,"R.K.Narayan",399);
		BookStorage bs5=new BookStorage(5,"Bared to you",499,"Sylvia Day",399);
		
		bookSet.add(bs1);
		bookSet.add(bs2);
		bookSet.add(bs3);
		bookSet.add(bs4);
		bookSet.add(bs5);
	}
	
}		
	
				
		

	
		
	

