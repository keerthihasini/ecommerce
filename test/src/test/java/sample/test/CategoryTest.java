package sample.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import test1.CategoryDao;

public class CategoryTest {
	public static ApplicationContext context;
	@BeforeClass
	public static void setConfiguration()
	{
		context=new AnnotationConfigApplicationContext(Springconfig.class);
	}
	@Test
	public final void testAddCategory() {
		Category p=new Category();
		p.setCategoryName("electronics");
		
		CategoryDao dao=(CategoryDao)context.getBean("categoryDao");
 assertTrue(dao.addCategory(p));	
	}

	@Test
	public final void testDeleteCategory() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testUpdateCategory() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testFindCategory() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetAllCategories() {
		fail("Not yet implemented"); // TODO
	}

}
