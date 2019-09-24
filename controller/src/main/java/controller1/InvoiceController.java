package controller1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import sample.test.Cart;
import sample.test.Payment;
import test1.CartDAO;
import test1.PaymentDao;
import test1.ProductDAO;
import test1.SupplierDao;

@Controller
public class InvoiceController {
	@Autowired
	CartDAO CartDAO;
	@Autowired
	ProductDAO productDAO;
	@Autowired
	SupplierDao supplierDao;
@Autowired
	
	PaymentDao paymentDao;
	
	 @RequestMapping("/Invoice")
	
	public String viewCart(HttpSession session,Model model,HttpServletRequest Request)
	   {
		   String userName=(String)session.getAttribute("userName");
		   java.util.Date dt=new java.util.Date();
		   String cartid=	dt.getDate()+":"+dt.getYear()+":"+dt.getMonth()+userName+"/";
				   java.util.List<Cart> cartlist=CartDAO.getAllCarts(cartid);
				   float sum=0;
				   for(Cart c:cartlist)
				   {
					   sum=sum+c.getPrice();
				   }
	           model.addAttribute("cartlist",cartlist);
		     model.addAttribute("carttotal",sum);
		     java.util.List<Payment>productlist=paymentDao.getAllPayment(cartid);
		     model.addAttribute("productlist",productlist);
		     String id=Request.getParameter("id");
		     java.util.List<Payment>supplierlist=paymentDao.getAllPayment(cartid);
		     model.addAttribute("paymentlist",supplierlist);
		     
		
		   return "Invoice";
	   }
}
