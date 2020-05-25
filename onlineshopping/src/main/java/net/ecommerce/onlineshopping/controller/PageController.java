package net.ecommerce.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.ecommerce.onlineshoppingbackend.dtos.CategoryDTO;
import net.ecommerce.onlineshoppingbackend.service.ICategoryService;

@Controller
public class PageController {

	@Autowired
	private ICategoryService categoryService;
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView home() {
		System.out.println("home");
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "Home");
		modelAndView.addObject("userClickHome", true);
//		Passing the list of Categories
		modelAndView.addObject("categoryList", categoryService.categoryList());
		return modelAndView;		
	}
	
//	@RequestMapping(value = {"/test"})
//	public ModelAndView test(@RequestParam(value = "greeting", required = false)String greeting) {
//		ModelAndView modelAndView = new ModelAndView("page");
//		if(greeting == null) {
//			greeting = "Hello There";
//		}
//		modelAndView.addObject("greeting", greeting);
//		return modelAndView;		
//	}
//	@RequestMapping(value = {"/test/{greeting}"})
//	public ModelAndView test(@PathVariable("greeting")String greeting) {
//		ModelAndView modelAndView = new ModelAndView("page");
//		if(greeting == null) {
//			greeting = "Hello There";
//		}
//		modelAndView.addObject("greeting", greeting);
//		return modelAndView;		
//	}
	@RequestMapping(value = {"/about"})
	public ModelAndView about() {
		System.out.println("about");
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "About Us");
		modelAndView.addObject("userClickAbout", true);
		return modelAndView;		
	}
	
	@RequestMapping(value = {"/contact"})
	public ModelAndView contact() {
		System.out.println("contact");
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "Contact Us");
		modelAndView.addObject("userClickContact", true);
		return modelAndView;		
	}
	
	/* Method to load all the products and based on category */
	@RequestMapping(value = {"/show/all/products"})
	public ModelAndView showAllProduct() {
		System.out.println("showAllProduct");
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "All Products");
//		Passing the list of category
		modelAndView.addObject("categoryList", categoryService.categoryList());
		modelAndView.addObject("userClickAllProducts", true);
		return modelAndView;		
	}
	
	/* Method to load all the products and based on category */
	@RequestMapping(value = {"/show/category/{id}/products"})
	public ModelAndView showCategoryProduct(@PathVariable("id") int id) {
		System.out.println("showCategoryProduct");
		ModelAndView modelAndView = new ModelAndView("page");
		CategoryDTO category = null;
		category = categoryService.getCategoryProductById(id);
		modelAndView.addObject("title", category.getName());
//		Passing the list of category
		modelAndView.addObject("categoryList", categoryService.categoryList());
//		Passing the list of category
		modelAndView.addObject("category", category);
		modelAndView.addObject("userClickCategoryProduct", true);
		return modelAndView;		
	}
	
}
