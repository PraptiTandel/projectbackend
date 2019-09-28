package com.niit.service;

import java.util.List;

import com.niit.model.Category;

public interface CategoryService {
public boolean addCategory(Category category);
public boolean deleteCategory(Category category);
public Category getCategoryById(int categoryId);

public boolean updateCategory(Category category);
public List<Category> getCategoryList();	
}

