package controller1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import sample.test.Supplier;
import test1.SupplierDao;
@Controller
public class SupplierController {
	@Autowired
	SupplierDao supplierDao;
		@ModelAttribute("addSupplier")
		public Supplier getSupplier()
		{
			return new Supplier();
		}
		@RequestMapping("/supplierdetails")
		public String getsupplierdetails(Model model,HttpServletRequest request)
		{
			String id=request.getParameter("id");
			java.util.List<Supplier> supplierlist=supplierDao.getAllSuppliers();
			model.addAttribute("supplierlist",supplierlist);
			
			if(id!=null)
				
			{
				int pid=Integer.parseInt(id);
				Supplier p=supplierDao.findSupplier(pid);
	           model.addAttribute("currSupplier",p); 
	           System.out.println(p.getSupplierName());
	           return "EditSupplier";
	           
			}
			 
			 return "supplierdetails";
		}
		@RequestMapping(value="/addSupplier",method=RequestMethod.POST)
		public String addSupplier(Supplier supplier)
		{
			supplierDao.addSupplier(supplier);
			return "redirect:supplierdetails";
		}
		@RequestMapping(value="updateSupplier",method=RequestMethod.POST)
		public String updateSupplier(Supplier supplier)
		{
			int id=supplier.getId();
		   Supplier p=supplierDao.findSupplier(id);
		   p.setAddress(supplier.getAddress());
		   p.setSupplierName(supplier.getSupplierName());
		
	   
		  supplierDao.updateSupplier(p);
		
		return "redirect:supplierdetails";
		}
		

		 @RequestMapping("/deleteSupplier")
		 public String deleteSupplier(HttpServletRequest request)
		 {
			 int id=Integer.parseInt(request.getParameter("id"));
		    Supplier pr=supplierDao.findSupplier(id);
		    supplierDao.deleteSupplier(pr);
		    return "redirect:supplierdetails";
		 }

	}