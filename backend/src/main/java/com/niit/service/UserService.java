package com.niit.service;

import java.util.List;

import com.niit.model.User;

public interface UserService {

	public boolean createUser(User user);
	
	public boolean deleteUser(User user);
	
	public boolean updateUser(User user);
	
	public User getUserById(String userId);
	
	public List<User> getUserList();
	
	public List<User> getUserListByName(String username);
	
	public User authUser(String userId, String password);
	
}
