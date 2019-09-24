package controller1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sample.test.Category;


import test1.CategoryDao;

@Controller
public class CategoryController {
	@Autowired
	CategoryDao categoryDao;
	@ModelAttribute("addCategory")
	public Category getAllCategories()
	{
		return new Category();
	}
	@RequestMapping("/Categorydetails")
	public String getCategorydetails(Model model,HttpServletRequest request)
	{
		java.util.List<Category> Categorylist=categoryDao.getAllCategories();
     	 model.addAttribute("Categorylist", Categorylist);
		String id=request.getParameter("id");
if(id!=null)
			
		{
			int pid=Integer.parseInt(id);
			Category p=categoryDao.findCategory(pid);
           model.addAttribute("currcategory",p); 
          
           return "EditCategory";
		}
return "Categorydetails";		
}
	@RequestMapping(value="/addCategory",method=RequestMethod.POST)
	public String add(Category category)
	{
		categoryDao.addCategory(category);
		return "redirect:Categorydetails";
	}
	@RequestMapping(value="updateCategory",method=RequestMethod.POST)
	public String updateCategory(Category category)
	{
		int id=category.getId();
	   Category p=categoryDao.findCategory(id);
	   p.setCategoryName(category.getCategoryName());
	   p.setId(category.getId());
	  
	categoryDao.updateCategory(p);
	
	return "redirect:Categorydetails";
	}
	

	 @RequestMapping("/deleteCategory")
	public String deleteCategory(HttpServletRequest request)
	 {
		 int id=Integer.parseInt(request.getParameter("id"));
	    Category pr=categoryDao.findCategory(id);
	    categoryDao.deleteCategory(pr);
	    return "redirect:Categorydetails";
	 }

}



