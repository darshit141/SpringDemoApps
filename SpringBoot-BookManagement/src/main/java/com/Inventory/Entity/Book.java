package com.Inventory.Entity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	private int id;
	private String name;
	private String Type;
	private Date date;	

	public Book(int id, String name, String Type, Date date) {
		 
		this.id = id;
		this.name = name;
		this.Type = Type;
		this.date = date;
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return Type;
	}

	public void setType(String Type) {
		this.Type = Type;
	}


	public Book() {
	}

}
