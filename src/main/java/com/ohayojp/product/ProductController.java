package com.ohayojp.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * 
 * @author GiangTB
 *
 */
@RestController  
@RequestMapping("/product")
public class ProductController {
	@Autowired
    private ProductService productService;

	
	   @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	    public Product addProduct(@ModelAttribute Product product) {
	        try {
				return productService.save(product);
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
	    }
	   
	   
	   @GetMapping()
	    public List<Product> findAllProducts() {
	        try {
				return productService.findAll();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
	    }

	   

}
