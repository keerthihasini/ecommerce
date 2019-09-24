package controller1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sample.test.Cart;
import test1.CartDAO;
import test1.ProductDAO;

@Controller
public class Cartcontroller {
	@Autowired
	CartDAO CartDAO;
	@Autowired
	ProductDAO productDAO;

	   @RequestMapping(value="addcart", method=RequestMethod.POST)
	   public String addcart(Cart cart,HttpSession session)
	   {
		   String userName=(String)session.getAttribute("userName");
		   java.util.Date dt=new java.util.Date();
		   
		 String cartid=dt.getDate()+":"+dt.getYear()+":"+dt.getMonth()+userName+"/";
		 cart.setCartid(cartid);
			cart.setEmail(userName);
			CartDAO.addCart(cart);
			return "redirect:home";
	   }
	   @RequestMapping("/Cart")
	   public String viewCart(HttpSession session,Model model)
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
		   return "Cart";
	   }
	   @RequestMapping("/deletecart")
	   public String deleteCart(HttpServletRequest request)
	   {
		   int id=Integer.parseInt(request.getParameter("id"));
		   Cart cart=CartDAO.findCart(id);
		   CartDAO.deleteCart(cart);
		    return "redirect:Cart";
	   }
}