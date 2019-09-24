package sample.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import test1.ProductDAO;

public class ProductTest {
	public static ApplicationContext context;
	@BeforeClass
	public static void setConfiguration()
	{
		context=new AnnotationConfigApplicationContext(Springconfig.class);
	}
	
	@Test
	public final void testAddProduct() {

		Product p=new Product();
		p.setProductName("Cofee");
		p.setPrice(200);
		p.setQuantity(340);
		p.setCategoryid(1);
		p.setSupplierid(1);
		ProductDAO dao=(ProductDAO)context.getBean("productDAO");
 assertTrue(dao.addProduct(p));		
	}
	

	@Test
	public final void testDeleteProduct() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testUpdateProduct() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testFindProduct() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetAllProduct() {
		fail("Not yet implemented"); // TODO
	}

}
