package controller1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sample.test.Payment;
import test1.PaymentDao;

@Controller
public class Paymentcontroller {
	
	@Autowired
	
	PaymentDao paymentDao;
	
	
	
	
	@ModelAttribute("addpayment")
	public Payment getPayment()
	{
	return new Payment();
	}
	@RequestMapping("/Paymentdetails")
	public String getpaymentdetails(Model model,HttpServletRequest request,HttpSession session)
	{
		String userName=(String)session.getAttribute("userName");
	   java.util.Date dt=new java.util.Date();
	 String cartid=dt.getDate()+":"+dt.getYear()+":"+dt.getMonth()+userName+"/";
	 java.util.List<Payment>productlist=paymentDao.getAllPayment(cartid);
	      model.addAttribute("productlist", productlist);
	      String id=request.getParameter("id");
	java.util.List<Payment>supplierlist=paymentDao.getAllPayment(cartid);
	model.addAttribute("paymentlist",supplierlist);
	if(id!=null)

	{
	int aid=Integer.parseInt(id);
	Payment a=paymentDao.findPayment(aid);
	           model.addAttribute("currpayment",a);  
	           return "editPayment";
	           
	}

	return "Paymentdetails";
	}
	@RequestMapping(value="addPayment",method=RequestMethod.POST)
	public String addpayment(Payment payment)
	{
	paymentDao.addPayment(payment);
	return "redirect:Paymentdetails";
	}

	@RequestMapping(value="updatePayment",method=RequestMethod.POST)
	public String updatepayment(Payment payment)
	{
	int id=payment.getId();
	  Payment a=paymentDao.findPayment(id);
	 a.setBillingAddress(payment.getBillingAddress());
	 a.setId(payment.getId());
	 a.setCartid(payment.getCartid());
	  paymentDao.updatePayment(a);

	return"redirect:Paymentdetails";
	}

	@RequestMapping("deletePayment")
	public String deletepayment(HttpServletRequest request)
	{
	int id=Integer.parseInt(request.getParameter("id"));
	   Payment a=paymentDao.findPayment(id);
	   paymentDao.deletePayment(a);
	   return "redirect:Paymentdetails";
	}
	}



