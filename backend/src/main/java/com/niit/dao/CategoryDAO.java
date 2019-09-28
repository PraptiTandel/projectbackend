package com.niit.dao;

import java.util.List;

import com.niit.model.Category;


public interface CategoryDAO {
boolean addCategory(Category category);
boolean updateCategory(Category category);
boolean deleteCategory(Category category);
List<Category> getCategoryList();
Category getCategoryById(int categoryId);
List<Category> getCategoryByName(String categoryName);

}
