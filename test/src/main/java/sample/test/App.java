package sample.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import test1.CartDAO;
import test1.CategoryDao;
import test1.PaymentDao;
import test1.ProductDAO;
import test1.SupplierDao;
import test1.UserDAO;
public class App 
{
    private static ApplicationContext ctx;

	public static void main( String[] args )
    {
try {
	ctx = new AnnotationConfigApplicationContext(Springconfig.class);
    ProductDAO s=(ProductDAO)ctx.getBean("productDAO");
    Product s1=new Product();
    s1.setProductName("coffee");
    s1.setPrice(150);
    s1.setQuantity(500);
    s1.setDescription("my favourite drink");
    s1.setCategoryid(12);
    s1.setSupplierid(12);
    s.addProduct(s1);
   
    CategoryDao c=(CategoryDao)ctx.getBean("categoryDao");
    Category c1=new Category();
    c1.setCategoryName("Electronics");
    c1.setDescription("philips");
    c.addCategory(c1);
    
    SupplierDao sup=(SupplierDao)ctx.getBean("supplierDao");
    Supplier Su=new Supplier();
    Su.setSupplierName("New Shopper");
    Su.setAddress("Chennai");
    sup.addSupplier(Su);
    
    UserDAO s3=(UserDAO)ctx.getBean("UserDAO");
    User po=new User();
    po.setUserid(1);
    po.setEmail("gfas@.com");
    po.setPassword("12345");
    po.setUserName("kirthi24@gmailcom");
    po.setUser_role("ROLE_USER");
    po.setId(4);
    s3.addUser(po);
    
    CartDAO p=(CartDAO)ctx.getBean("CartDAO");
    Cart p1=new Cart();
    p1.setId(12);
    p1.setEmail("kirtihoney24@gmail.com");
    p1.setCartid("a");
    p1.setProductid(1);
    p1.setPrice(100);
    p.addCart(p1);
    
    
PaymentDao pa=(PaymentDao)ctx.getBean("paymentDao");
Payment pay1=new Payment();
pay1.setId(12);
pay1.setBillingAddress("12 street");
pay1.setCartid(7);
pa.addPayment(pay1);
} 
catch (Throwable e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
        
    }
}


