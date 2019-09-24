package test1;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sample.test.Product;
@Repository
@Transactional


public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	public boolean addProduct(Product p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(p);
		return true;
	}

	@Override
	public boolean deleteProduct(Product p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(p);
			
		return false;
	}

	@Override
	public boolean updateProduct(Product p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(p);
		return true;
	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
			Session session =sessionFactory.getCurrentSession();
			Query query=session.createQuery("from Product p where p.id="+id);
			List<Product>productlist=query.list();
		return productlist.get(0);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return (sessionFactory.getCurrentSession().createQuery("from  Product p").list());
		
	}
	

}
