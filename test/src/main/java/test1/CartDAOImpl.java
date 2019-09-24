
package test1;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sample.test.Cart;


@Repository
@Transactional
public class CartDAOImpl implements CartDAO {

	@Autowired 
	SessionFactory sessionFactory;
	
	public boolean addCart(Cart p) {
      sessionFactory.getCurrentSession().save(p);		
	
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean deleteCart(Cart p) {
		sessionFactory.getCurrentSession().delete(p);
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public Cart findCart(int id) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Cart p where p.id="+id);
		session.get(Cart.class,id);
		List<Cart>Cartlist=query.list();
		return Cartlist.get(0);
	}
	@Override
	public Cart updateCart(Cart p) {
		sessionFactory.getCurrentSession().update(p);
		// TODO Auto-generated method stub
		
		return p;
	}
	@Override
	public List<Cart> getAllCarts(String p) {
		
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Cart p").list();
	}
	public int totalelements(String cartid) {
	    Session session=sessionFactory.getCurrentSession();
	    System.out.println(cartid);
	    Query query=session.createQuery("select p from Cart p where p.cartid='"+cartid+"'");
		java.util.List<Cart> cartlist=query.list();
		Integer size=cartlist.size();
		System.out.println(size);
	    // TODO Auto-generated method stub
			return size;
		}
}
	