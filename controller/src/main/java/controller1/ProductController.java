package controller1;

import java.io.FileOutputStream;
import java.io.InputStream;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import sample.test.Product;
import sample.test.Supplier;
import test1.ProductDAO;
import test1.SupplierDao;

@Controller
public class ProductController {
	@Autowired
	ProductDAO productDAO;
	@Autowired
	SupplierDao supplierDao;
	
	@ModelAttribute("addproduct")
	public Product getProduct()
	{
		return new Product();
	}
	@RequestMapping("/productdetails")
	public String getProductDetails(Model model,HttpServletRequest request)
	{
		java.util.List<Product> productlist=productDAO.getAllProduct();
     	 model.addAttribute("productlist", productlist);
		String id=request.getParameter("id");
		java.util.List<Supplier> supplierlist=supplierDao.getAllSuppliers();
		model.addAttribute("supplierlist",supplierlist);
		
		if(id!=null)
			
		{
			int pid=Integer.parseInt(id);
			Product p=productDAO.findProduct(pid);
           model.addAttribute("currproduct",p); 
           System.out.println(p.getProductName());
           return "EditProduct";
           
		}
		 
		 return "productdetails";
	}
	@RequestMapping(value="addproduct",method=RequestMethod.POST)
	public String addProduct(Product product)
	{
		productDAO.addProduct(product);
				
		try {
		//byte[ bt=image.getBytes();
		//	productDAO.addProduct(product);
			MultipartFile image=(MultipartFile)product.getImage();
			byte[] bt=new byte[(int)image.getSize()];
			try {
				InputStream i=image.getInputStream();
				i.read(bt);
				FileOutputStream f=new FileOutputStream("C:\\Users\\123\\eclipse-workspace\\controller\\src\\main\\webapp\\resources\\images\\"+product.getId()+".jpg");
				f.write(bt);
				f.flush();
			}
			catch(Exception e) {
			      System.out.println(e);
			}
		System.out.println(bt);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "redirect:productdetails";	
	}
	@RequestMapping(value="updateproduct",method=RequestMethod.POST)
	public String updateProduct(Product product)
	{
		int id=product.getId();
	   Product p=productDAO.findProduct(id);
	   p.setCategoryid(product.getCategoryid());
	   p.setSupplierid(product.getSupplierid());
	   p.setPrice(product.getPrice());
	   p.setDescription(product.getDescription());
   p.setQuantity(product.getQuantity());
   p.setProductName(p.getProductName());
   
	   productDAO.updateProduct(p);
				
		try {
		//byte[ bt=image.getBytes();
		//	productDAO.addProduct(product);
			MultipartFile image=(MultipartFile)product.getImage();
			byte[] bt=new byte[(int)image.getSize()];
			try {
				InputStream i=image.getInputStream();
				i.read(bt);
				FileOutputStream f=new FileOutputStream("C:\\Users\\123\\eclipse-workspace\\controller\\src\\main\\webapp\\resources\\images\\" +product.getId()+".jpg");
				f.write(bt);
				f.flush();
			}
			catch(Exception e) {
			      System.out.println(e);
			}
		System.out.println(bt);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "redirect:productdetails";	
	}

 @RequestMapping("/deleteproduct")
 public String deleteproduct(HttpServletRequest request)
 {
	 int id=Integer.parseInt(request.getParameter("id"));
    Product pr=productDAO.findProduct(id);
    productDAO.deleteProduct(pr);
    return "redirect:productdetails";
 }
}