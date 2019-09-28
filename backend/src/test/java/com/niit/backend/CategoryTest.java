package com.niit.backend;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



	
	import org.junit.Ignore;
	
	import org.junit.runner.RunWith;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
	import org.springframework.test.context.junit4.SpringRunner;

import com.niit.model.Category;
import com.niit.service.CategoryService;

	
	@RunWith(SpringRunner.class)
	@SpringJUnitConfig(classes=AppContext.class)
	public class CategoryTest {
	@Autowired
	CategoryService categoryService;
		@Before
		public void setUp() throws Exception {
		}

		@After
		public void tearDown() throws Exception {
			categoryService=null;
		}
		
@Ignore
		@Test
		public void addCategory() {
			Category category=new Category();
			category.setCategoryName("Child");
			category.setCategoryDesc("Contains children products");
			assertTrue("Category is added sucessfully",categoryService.addCategory(category));
			
		}
@Ignore
		@Test
		public void updateCategory() {
			Category category=categoryService.getCategoryById(3);
			
			
			category.setCategoryName("Children");
			assertTrue("Category is updated sucessfully",categoryService.updateCategory(category));
		}
		@Ignore
		@Test
		public void deleteCategory() {
			Category category=new Category();
			category.setCategoryId(4);
			assertTrue("Category is delete",categoryService.deleteCategory(category));
			
		}
		
	@Test
	public void getTestCategory() {
		int count=categoryService.getCategoryList().size();
		
		assertEquals(3,count);
		
	}
	}


