package controller1;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sample.test.Product;
import test1.CartDAO;
import test1.ProductDAO;


@Controller
public class HomeController {
	@Autowired
	ProductDAO productDAO;
	@Autowired
	CartDAO CartDAO;
	
	@RequestMapping("/")
	public String getIndex()
	{
		return "index";
	}
	@RequestMapping("/login")
	public String getLogin()
	{
		return "login";
	}
	@RequestMapping("/SignUp")
	public String getSignUp()
	{
		return "SignUp";
	}
	@RequestMapping("/Admin")
	public String getAdmin()
	{
		return "Admin";
	}
	@RequestMapping("/home")
	public String getHome(HttpSession session,Model model)
	{
		String userName=SecurityContextHolder.getContext().getAuthentication().getName();
		session.setAttribute("userName",userName);
		java.util.List<Product> productlist=productDAO.getAllProduct();
    	 model.addAttribute("productlist", productlist);
    	 java.util.Date dt=new java.util.Date();
    	 String cartid=dt.getDate()+":"+dt.getYear()+":"+dt.getMonth()+userName+"/";
    	 int size=CartDAO.totalelements(cartid);
    	 System.out.println(size);
    	 return "home";
	}
	@RequestMapping("/User")
	public String getUser()
	{
		return "User";
	}
	
	}
