/*
 *+=======================================================================+
 *  Copyright (c) 2020, onlineshoppingbackend, CUPERTINO, NOIDA, INDIA  
 *  All rights reserved.   
 *  Unauthorized reproduction of this code in any form is prohibited
 *  You cannot copy, modify, and distribute this code without written permission of the copyright holder.
 +=======================================================================+
 * FILENAME                                                       
 *     CategorySercive.java                                                                                                                 
 * DESCRIPTION                                                        
 *     
 * NOTE                         
 *      
 *                      
 * VERSION HISTORY                                                                                                              
 *  25-May-2020           GAURAV YADAV                 CREATED

 *+=======================================================================+
 */
package net.ecommerce.onlineshoppingbackend.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.ecommerce.onlineshoppingbackend.dtos.CategoryDTO;
import net.ecommerce.onlineshoppingbackend.service.ICategoryService;
import net.ecommerce.onlineshoppingbackend.service.dao.ICategoryDAO;
import net.ecommerce.onlineshoppingbackend.service.dao.impl.CategoryDAO;

/**
 * @author GAURAV YADAV
 *
 */
@Repository("categoryService")
public class CategoryService implements ICategoryService {
	private static final long serialVersionUID = 1L;
	private ICategoryDAO categoryDAO = new CategoryDAO();
	@Override
	public List<CategoryDTO> categoryList() {
		
		return categoryDAO.categoryList();
	}
	
	@Override
	public CategoryDTO getCategoryProductById(int categoryId) {		
		return categoryDAO.getCategoryProductById(categoryId);
	}

}
