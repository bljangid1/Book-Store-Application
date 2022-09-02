/**
 * 
 */
package com.bookstore.service;

import java.util.List;

import com.bookstore.dto.UserDto;
import com.bookstore.entity.Users;
import com.bookstore.request.LoginInformation;
import com.bookstore.request.PasswordUpdate;

/**
 * @author HP
 *
 */
public interface UserServices {

	Users login(LoginInformation information);
	boolean register(UserDto ionformation);
	boolean verify(String token) throws Exception;
	boolean isUserExist(String email);
	boolean update(PasswordUpdate information, String token);
	List<Users> getUsers();
	Users getSingleUser(String token);
}