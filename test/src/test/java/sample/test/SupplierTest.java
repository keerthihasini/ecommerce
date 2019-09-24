package sample.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import test1.SupplierDao;

public class SupplierTest {
	public static ApplicationContext context;
	@BeforeClass
	public static void setConfiguration()
	{
		context=new AnnotationConfigApplicationContext(Springconfig.class);
	}

	@Test
	
	public final void testAddSupplier() {
		Supplier k=new Supplier();
		k.setSupplierName("new Brand");
		k.setAddress("chennai");
		
		SupplierDao dao=(SupplierDao)context.getBean("SupplierDao");
 assertTrue(dao.addSupplier(k));
	}

	@Test
	public final void testDeleteSupplier() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testUpdateSupplier() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testFindSupplier() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetAllSuppliers() {
		fail("Not yet implemented"); // TODO
	}

}
