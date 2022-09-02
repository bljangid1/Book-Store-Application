package com.bookstore.dto;

import org.springframework.stereotype.Component;

import com.bookstore.entity.Address;

import lombok.Data;

@Data
@Component
public class CustomerDto {
	
	private String Name;
	private long Phonenumber;
	private Address Home;
	private Address Work;
	private Address Other;
	
	
}
