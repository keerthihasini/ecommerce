package test1;

import java.util.List;

import sample.test.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

	@Repository
	@Transactional
	public  class UserDAOImpl implements UserDAO {

		@Autowired 
		SessionFactory sessionFactory;

		@Override
		public boolean addUser(User po) {
			sessionFactory.getCurrentSession().save(po);
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public User deleteUser(User po) {
			sessionFactory.getCurrentSession().delete(po);
			// TODO Auto-generated method stub
			return po;
		}

		@Override
		public User updateUser(User po) {
			sessionFactory.getCurrentSession().update(po);
			// TODO Auto-generated method stub
			return po;
		}

		@Override
		public User findUser(int id) {
		
			User po=sessionFactory.getCurrentSession().get(User.class, id);
			// TODO Auto-generated method stub
			return po;
		}

		@Override
		public List<User> getAllUser() {
			// TODO Auto-generated method stub
			return sessionFactory.getCurrentSession().createQuery("from  User po").list();
		}
		
	}