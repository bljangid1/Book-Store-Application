package com.bookstore.repository;

import java.util.List;

import com.bookstore.entity.Book;

public interface IBook {

	Book save(Book bookinformation);

	List<Book> getUsers();

}
