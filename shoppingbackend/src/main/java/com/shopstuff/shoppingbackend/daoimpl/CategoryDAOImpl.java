package com.shopstuff.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shopstuff.shoppingbackend.dao.CategoryDAO;
import com.shopstuff.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for television");
		category.setImageURL("cat_1.png");
		categories.add(category);
		//second category
		category = new Category();
		category.setId(2);
		category.setName("mobile");
		category.setDescription("This is some description for mobile");
		category.setImageURL("cat_2.png");
		categories.add(category);
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description for laptop");
		category.setImageURL("cat_3.png");
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category:categories) {
			if(category.getId() == id) 
				return category;
		}
		return null;
	}

}
