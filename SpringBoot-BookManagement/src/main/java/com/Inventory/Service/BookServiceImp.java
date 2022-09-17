package com.Inventory.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Inventory.EmployeeDao.BookDao;
import com.Inventory.Entity.Book;

@Service
public class BookServiceImp implements BookService {
	@Autowired
	private BookDao dao;

	public BookServiceImp() {

	}

	@Override
	public List<Book> getlist() {

		return dao.findAll();

	}

	@Override
	public Book postlist(Book book) {
		dao.save(book);
		return book;
	}

	@Override
	public Book putlist(Book book) {
		dao.save(book);
		return book;
	}

	@Override
	public Book Deletelist(Book book) {
		int i = book.getId();
		dao.getReferenceById(i);
		dao.deleteById(i);
		return book;
	}

}
