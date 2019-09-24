package test1;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sample.test.Payment;


@Repository
@Transactional
public class PaymentDaoImpl implements PaymentDao{
@Autowired
	SessionFactory sessionFactory;
	public boolean addPayment(Payment p) {
		sessionFactory.getCurrentSession().save(p);
		return true;
	}

	@Override
	public boolean deletePayment(Payment p) {
		sessionFactory.getCurrentSession().delete(p);
		return false;
	}

	@Override
	public Payment findPayment(int id) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Payment p where p.id="+id);
		session.get(Payment.class,id);
		List<Payment>Paymentlist=query.list();
		// TODO Auto-generated method stub
		
		return Paymentlist.get(0);
	}

	@Override
	public Payment updatePayment(Payment p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(p);
		return p;
	}

	@Override
	public List<Payment> getAllPayment(String cartid) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Payment p where p.cartid='"+ cartid+"'  ").list();
	}
	

}
