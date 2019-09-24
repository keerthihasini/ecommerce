package sample.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import test1.UserDAO;

public class UserTest {
	public static ApplicationContext context;
	@BeforeClass
	public static void setConfiguration()
	{
		context=new AnnotationConfigApplicationContext(Springconfig.class);
	}
	

	@Test
	
	public final void testAddUser() {
		User u=new User();
		u.setUserName("kirti");
		u.setPassword("hh");
		u.setUserid(12345);
		u.setEmail("kk@yahoo.com");
		UserDAO ds=(UserDAO)context.getBean("UserDAO");
		 assertTrue(ds.addUser(u));		
			}
		
	@Test
	public final void testDeleteUser() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testUpdateUser() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testFindUser() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetAllUser() {
		fail("Not yet implemented"); // TODO
	}

}
