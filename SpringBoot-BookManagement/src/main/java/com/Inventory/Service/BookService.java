package com.Inventory.Service;

import java.util.List;

import com.Inventory.Entity.Book;
public interface BookService {
	public List<Book> getlist();

	public Book postlist(Book book);
		
	public Book putlist(Book book);
	
	public Book Deletelist(Book book);


}

