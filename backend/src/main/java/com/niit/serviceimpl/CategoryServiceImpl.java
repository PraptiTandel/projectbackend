package com.niit.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;
import com.niit.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
@Autowired 
CategoryDAO categoryDAO;

public boolean addCategory(Category category) {
	categoryDAO.addCategory(category);
	return true;
}

public boolean updateCategory(Category category) {
	categoryDAO.updateCategory(category);
	return true;
}

public boolean deleteCategory(Category category) {
	categoryDAO.deleteCategory(category);
	return true;
}

public List<Category> getCategoryList(){
	return categoryDAO.getCategoryList();
	
}

public Category getCategoryById(int categoryId)
{
	return categoryDAO.getCategoryById(categoryId);
}

}
