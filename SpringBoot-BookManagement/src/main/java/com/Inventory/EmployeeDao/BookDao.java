package com.Inventory.EmployeeDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Inventory.Entity.Book;

public interface BookDao extends JpaRepository<Book,Integer> {

}
