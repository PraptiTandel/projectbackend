package com.niit.backend;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.service.UserService;

import com.niit.model.User;


@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = AppContext.class)
public class UserTest {
	
	@Autowired
	UserService userservice;
	
	@Before
	public void setUp() throws Exception {
	}
	

	@After
	public void tearDown() throws Exception {
		userservice = null;
	}
	
	
	@Test
	public void addUser() {
		User user = new User();
		user.setUsername("Sanket");
		user.setPassword("jeoeko");
		user.setPhone_number("5635787457");
	    
		assertEquals(true, userservice.createUser(user));
	}
	@Ignore
	@Test(expected = IndexOutOfBoundsException.class)
	public void updateUser() {
		User user = userservice.getUserById("17");
		user.setPhone_number("1234567890");
		assertEquals(true, userservice.updateUser(user));
	}
    @Ignore
	@Test
	public void deleteUser() {
		User user=userservice.getUserById("17");
		assertEquals(true, userservice.deleteUser(user));
	}
	
	@Test
	public void userListTest() {

		List<User> getUserList = userservice.getUserList();		
		assertEquals(2, getUserList.size());
	}

}