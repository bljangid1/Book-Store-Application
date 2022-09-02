/**
 * 
 */
package com.bookstore.repository;

import java.util.List;

import com.bookstore.entity.Users;
import com.bookstore.request.PasswordUpdate;

/**
 * @author HP
 *
 */
public interface IUserRepository {
	Users save(Users users);

	Users getUser(String email);

	boolean verify(Long id);

	boolean upDate(PasswordUpdate information, Long token);

	Users getUserById(Long id );

	List<Users> getUsers();

}
