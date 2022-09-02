package com.bookstore.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entity.Book;
import com.bookstore.entity.Users;
import com.bookstore.exception.AdminNotFoundException;
import com.bookstore.exception.BookNotFoundException;
import com.bookstore.repository.BookImple;
import com.bookstore.repository.BookInterface;
import com.bookstore.repository.CustomerRepository;
import com.bookstore.service.IAdminService;
import com.bookstore.util.JwtGenerator;

@Service
public class AdminServiceImpl implements IAdminService {

//	@Autowired
//	private IOrderStatusRepository orderStatusRepo;
//
	@Autowired
	CustomerRepository userRepo;

	@Autowired
	JwtGenerator jwt;

	@Autowired
	private BookImple bookRepository;
	
	@Autowired
	BookInterface bookRepo;

	@Override
	public boolean verifyBook(long bookId,String staus, String token) {

		long userid = 0;
		Users user = null;
			userid = jwt.parseJWT(token);
			System.out.println("user id:" + userid);
			user = userRepo.getCustomerDetailsbyId(userid);
			System.out.println("user:" + user);
	
		if (user != null) {
			Book book = bookRepo.findByBookId(bookId);
			System.out.println("bookinfo "+book);
			
			if (book != null) {
				book.setStatus(staus);

				bookRepo.save(book);
				return true;
				
			} else {
				throw new BookNotFoundException("Book Not Found");
			}

		} else {
			throw new AdminNotFoundException("Admin Not Found");
		}
	}

		@Override
	public List<Book> getBooksByStatus(String status) {
		
		return bookRepo.findByStatus(status);
	}

	


}
