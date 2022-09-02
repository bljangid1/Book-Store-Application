package com.bookstore.service;

import java.util.List;

import com.bookstore.entity.Order;

public interface OrderService {

	List<Order> getOrderList(String token);

	Order getOrderConfrim(String token);

	int getCountOfBooks(String token);
}
