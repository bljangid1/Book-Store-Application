package com.bookstore.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bookstore.dto.AddressDto;
import com.bookstore.dto.UpdateAddressDto;
import com.bookstore.entity.Address;
import com.bookstore.entity.Users;

@Repository
public interface IAdressService {

	Address addAddress(AddressDto address, String token);

	Users deleteAddress(String token, Long addressId);

	Address updateAddress(UpdateAddressDto address, String token);

	List<Address> getAllAddress();

	Address getAddress(Long id);

	List<Address> getAddressByUserId(String token);

	Address getAddress(String type, String token);

}
