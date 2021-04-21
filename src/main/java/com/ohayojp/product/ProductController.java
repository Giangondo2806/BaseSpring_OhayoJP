package com.ohayojp.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ohayojp.test.Domain;
import com.ohayojp.test.DomainRepository;

import org.springframework.http.HttpStatus;


/**
 * 
 * created at 2021/04/21
 * @author GiangTB
 */
@RestController  
@RequestMapping("/product")
public class ProductController {
	@Autowired
    private ProductService productService;
	@Autowired
    private DomainRepository domainRepository;

	
	   @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,produces = {MediaType.APPLICATION_JSON_VALUE})
	   @ResponseStatus(HttpStatus.OK)
	    public Domain addProduct(@ModelAttribute Domain product) {
	        try {
	        	return domainRepository.save(product);
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
	    }
	   
	   
	   @GetMapping()
	   @ResponseStatus(HttpStatus.OK)
	    public List<Product> findAllProducts() {
	        try {
	        	System.out.print("custom find all");
				return productService.findAll();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
	    }
	   
	   @DeleteMapping(value = "/{id}")
	   @ResponseStatus(HttpStatus.OK)
	    public String deleteProductById(@PathVariable Long id) {
	        try {
				productService.softDelete(id);
				return "deleted by id = "+ id;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
	    }

	   

}
