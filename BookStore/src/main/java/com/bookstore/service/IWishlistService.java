package com.bookstore.service;

import java.util.List;

import com.bookstore.entity.WishlistBook;

public interface IWishlistService {
	List<WishlistBook> addwishBook(String token,long bookId);
	
	List<WishlistBook> getWishlistBooks(String token);
	
	boolean removeWishBook(String token, Long bookId);
	
	int getCountOfWishlist(String token);

}
