package com.bookstore.service;

import java.util.List;

import com.bookstore.dto.CartDto;
import com.bookstore.entity.CartItem;

public interface ICartService {
 List<CartItem> addBooktoCart(String token,long bookId);
 
 List<CartItem> getBooksfromCart(String token);
 
 boolean removeBooksFromCart(String token, Long bookId);
 
 int getCountOfBooks(String token);
 
 CartItem IncreaseBooksQuantityInCart(String token, Long bookId, CartDto bookQuantityDetails);
 
 CartItem descreaseBooksQuantityInCart(String token, Long bookId, CartDto bookQuantityDetails);

 
}
