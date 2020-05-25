/*
 *+=======================================================================+
 *  Copyright (c) 2020, onlineshoppingbackend, CUPERTINO, NOIDA, INDIA  
 *  All rights reserved.   
 *  Unauthorized reproduction of this code in any form is prohibited
 *  You cannot copy, modify, and distribute this code without written permission of the copyright holder.
 +=======================================================================+
 * FILENAME                                                       
 *     ICategorySercive.java                                                                                                                 
 * DESCRIPTION                                                        
 *     
 * NOTE                         
 *      
 *                      
 * VERSION HISTORY                                                                                                              
 *  25-May-2020           GAURAV YADAV                 CREATED

 *+=======================================================================+
 */
package net.ecommerce.onlineshoppingbackend.service;

import java.util.List;
import java.util.Locale.Category;

import net.ecommerce.onlineshoppingbackend.dtos.CategoryDTO;

/**
 * @author GAURAV YADAV
 *
 */
public interface ICategoryService {

	List<CategoryDTO> categoryList();
	
	CategoryDTO getCategoryProductById(int categoryId);
}
