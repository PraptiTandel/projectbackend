package com.niit.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.service.UserService;
import com.niit.dao.UserDAO;
import com.niit.model.User;
@Service
public class UserServiceImpl implements UserService {
@Autowired
UserDAO userdao;
	public boolean createUser(User user) {
		userdao.createUser(user);
		return true;
	}

	public boolean deleteUser(User user) {
		userdao.deleteUser(user);
		return false;
	}

	public boolean updateUser(User user) {
		userdao.updateUser(user);
		return true;
	}

	public User getUserById(String userId) {
		
		return userdao.getUserById(userId);
	}

	public List<User> getUserList() {
	
		return userdao.getUserList();
	}

	public List<User> getUserListByName(String username) {
		
		return userdao.getUserListByName(username);
	}

	public User authUser(String userId, String password) {
	
		return userdao.authUser(userId, password);
	}
	

}


