/*
 *+=======================================================================+
 *  Copyright (c) 2020, ONLINE SHOPPING_BACKGOUUND, CUPERTINO, NOIDA, INDIA  
 *  All rights reserved.   
 *  Unauthorized reproduction of this code in any form is prohibited
 *  You cannot copy, modify, and distribute this code without written permission of the copyright holder.
 +=======================================================================+
 * FILENAME                                                       
 *     CATEGORYDAO.java                                                                                                                 
 * DESCRIPTION                                                        
 *     
 * NOTE                         
 *      
 *                      
 * VERSION HISTORY                                                                                                              
 *  25-MAY-2020           GAURAV YADAV                 CREATED

 *+=======================================================================+
 */
package net.ecommerce.onlineshoppingbackend.service.dao;

import java.util.List;
import java.util.Locale.Category;

import net.ecommerce.onlineshoppingbackend.dtos.CategoryDTO;

/**
 * @author GauravYadav
 *
 */
public interface ICategoryDAO {

	List<CategoryDTO> categoryList();

	/**
	 * @param categoryId
	 * @return
	 */
	CategoryDTO getCategoryProductById(int categoryId);
	
}
