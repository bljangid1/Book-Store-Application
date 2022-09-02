package com.bookstore.service;

import java.util.List;

import com.bookstore.entity.Book;

public interface IAdminService {
	

	boolean verifyBook(long bookId, String staus, String token);


	List<Book> getBooksByStatus(String status);


}
