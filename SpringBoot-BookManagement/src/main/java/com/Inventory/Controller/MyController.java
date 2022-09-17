 package com.Inventory.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Inventory.Entity.Book;
import com.Inventory.Service.BookService;

@RestController
public class MyController {
	
	@Autowired
	private BookService service; 

	@GetMapping("/book")
	public List<Book> getemplist()
	{
		
		return (List<Book>) this.service.getlist();
	
	}

	@PostMapping("/book")
	public Book postemplist(@RequestBody Book book)
	{
		return this.service.postlist(book);
	}
	@PutMapping("/book")
	public Book putemplist(@RequestBody Book book)
	{
		return this.service.postlist(book);
	}
	@DeleteMapping("/book")
	public Book Deletemplist(@RequestBody Book book)
	{
		return this.service.Deletelist(book);
	}
	
}
