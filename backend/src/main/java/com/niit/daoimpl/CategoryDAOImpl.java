package com.niit.daoimpl;

import java.util.List;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;




@Repository
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public boolean addCategory(Category category) {
		sessionFactory.getCurrentSession().save(category);
		return true;
	}
   @Transactional
	public boolean updateCategory(Category category) {
	   sessionFactory.getCurrentSession().update(category);
		return true;
	}
   
	public boolean deleteCategory(Category category) {
     sessionFactory.getCurrentSession().delete(category);
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public List<Category> getCategoryList() {
		List<Category> categoryList=sessionFactory.getCurrentSession().createQuery("from Category").list();
		return categoryList;
	}

	public Category getCategoryById(int id) {
		
		Category category = (Category) sessionFactory.getCurrentSession().createQuery("from Category where categoryId ="+id).uniqueResult();
		return category;
	}
	@SuppressWarnings("unchecked")
	public List<Category> getCategoryByName(String categoryName) {
		return (List<Category>) sessionFactory.getCurrentSession().createQuery("from Category where categoryName like "+ "'%"+categoryName + "%'").list();
		
	}
	


}
