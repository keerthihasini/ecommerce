package test1;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sample.test.Category;
import sample.test.Product;
import sample.test.Supplier;

@Repository
@Transactional

public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	SessionFactory sessionFactory;
	public boolean addCategory(Category p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(p);
		return true;
	}

	@Override
	public boolean deleteCategory(Category p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(p);
		return true;
	}

	@Override
	public boolean updateCategory(Category p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(p);
		return false;
	}

	@Override
	public Category findCategory(int id) {
		// TODO Auto-generated method stub
		Category p=sessionFactory.getCurrentSession().get(Category.class, id);
		return p;
	}

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from  Category p").list();
	}
}
