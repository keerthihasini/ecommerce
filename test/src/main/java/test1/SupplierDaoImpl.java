package test1;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sample.test.Product;
import sample.test.Supplier;

@Repository
@Transactional



public class SupplierDaoImpl implements SupplierDao{

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addSupplier(Supplier p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(p);
		return true;
	}

	@Override
	public boolean deleteSupplier(Supplier p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(p);
		return true;
	}

	@Override
	public boolean updateSupplier(Supplier p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(p);
		return true;
	}

	@Override
	public Supplier findSupplier(int id) {
		// TODO Auto-generated method stub
		Supplier p=sessionFactory.getCurrentSession().get(Supplier.class, id);
		return p;
	}

	@Override
	public List<Supplier> getAllSuppliers() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from  Supplier p").list();
		
	}





	


}
