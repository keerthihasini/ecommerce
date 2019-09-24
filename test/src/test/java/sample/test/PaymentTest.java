package sample.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import test1.PaymentDao;

public class PaymentTest {
	public static ApplicationContext context;
	@BeforeClass
	public static void setConfiguration()
	{
		context=new AnnotationConfigApplicationContext(Springconfig.class);
	}

	@Test
	public final void testAddPayment() {
		Payment p=new Payment();
		p.setCartid(12345);
		p.setId(1234);
		p.setBillingAddress("122 dore");
		PaymentDao dao=(PaymentDao)context.getBean("paymentDao");
 assertTrue(dao.addPayment(p));	
	}

	

	@Test
	public final void testDeletePayment() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testFindPayment() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testUpdatePayment() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetAllPayment() {
		fail("Not yet implemented"); // TODO
	}

}
