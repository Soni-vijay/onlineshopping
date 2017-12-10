package com.shopstuff.shoppingbackend.dao;

import java.util.List;
import com.shopstuff.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
