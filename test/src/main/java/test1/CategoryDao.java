package test1;

import sample.test.Category;
import sample.test.Product;

public interface CategoryDao {
	public boolean addCategory(Category p);
	public boolean deleteCategory(Category p);
	public boolean updateCategory(Category p);
	 public Category findCategory(int id);
	public java.util.List<Category>getAllCategories();
	}


