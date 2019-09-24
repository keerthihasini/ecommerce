

package sample.test;

import java.sql.Driver;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import test1.CartDAO;
import test1.CartDAOImpl;
import test1.CategoryDao;
import test1.CategoryDaoImpl;
import test1.PaymentDao;
import test1.PaymentDaoImpl;
import test1.ProductDAO;
import test1.ProductDAOImpl;
import test1.SupplierDao;
import test1.SupplierDaoImpl;
import test1.UserDAO;
import test1.UserDAOImpl;
@Configuration
@EnableTransactionManagement
public class Springconfig {
	@Bean("dataSource")
	public DataSource getH2DataSource()
	{
	DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("org.h2.Driver");
		ds.setUrl(" jdbc:h2:tcp://localhost/~/test");
		ds.setUsername("sa");
		ds.setPassword("");
		return ds;
	}
	@Bean(name="sessionFactory")
	 public SessionFactory getSessionFactory()
    {  
    	System.out.println("------Hibernate Properties----");
    	Properties prop = new Properties();
    	prop.setProperty("hibernate.hbm2ddl.auto", "update");
    	prop.put("hibernate.show_sql", "true");
    	prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
    	System.out.println("-----Hibernate properties created----");
    	
    	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(getH2DataSource());
    	sessionBuilder.addProperties(prop);
    	sessionBuilder.addAnnotatedClass(Product.class);
    	sessionBuilder.addAnnotatedClass(Category.class);
    	sessionBuilder.addAnnotatedClass(Supplier.class);
    	sessionBuilder.addAnnotatedClass(User.class);
    	sessionBuilder.addAnnotatedClass(Cart.class);
    	sessionBuilder.addAnnotatedClass(Payment.class);

   
    	SessionFactory sessionFactory = sessionBuilder.buildSessionFactory();
    	return sessionFactory;
    	
    }
	@Bean("txManager")
	public HibernateTransactionManager getTransactionManager()
	{
	HibernateTransactionManager manager=new HibernateTransactionManager(getSessionFactory());	
	return manager;
	}
	@Bean("productDAO")
	ProductDAO getProductDAO()
	{
		 ProductDAOImpl s=new ProductDAOImpl();
		 return s;
	}
	@Bean("categoryDao")
	CategoryDao getCategoryDao()
	{
		CategoryDaoImpl s1=new CategoryDaoImpl();
		return s1;
	}
	@Bean("supplierDao")
	SupplierDao getSupplierDao()
	{
		SupplierDaoImpl s2=new SupplierDaoImpl();
		return s2;
	}
	@Bean("UserDAO")
	UserDAO getUserDAO()
	{
		UserDAOImpl s3=new UserDAOImpl();
		return s3;
	}
	@Bean("CartDAO")
	CartDAO getCartDAO()
	{
		CartDAOImpl p=new CartDAOImpl();
		return p;
	}
	@Bean("paymentDao")
	PaymentDao getPaymentDao()
	{
		PaymentDaoImpl p=new PaymentDaoImpl();
		return p;

	}
}
