package sample.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import test1.CartDAO;

public class CartTest {
	public static ApplicationContext context;
	@BeforeClass
	public static void setConfiguration()
	{
		context=new AnnotationConfigApplicationContext(Springconfig.class);
	}

	@Test
	public final void testAddCart() {
		Cart obj=new Cart();
		obj.setEmail("keerthi@gmail.com");
		obj.setProductid(247);
		obj.setPrice(200);
		obj.setCartid("hi");
		CartDAO dao=(CartDAO)context.getBean("CartDAO");
	assertTrue(dao.addCart(obj));
	}

	@Test
	public final void testDeleteCart() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testFindCart() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testUpdateCart() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetAllCarts() {
		fail("Not yet implemented"); // TODO
	}

}
