/**
 * 
 */
package com.ohayojp.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ohayojp.product.Product;
import com.ohayojp.product.ProductService;

/**
 * 
 * created at 2021/04/22
 * @author GiangTB
 */
@RestController  
@RequestMapping("/domain")
public class DomainController {
	@Autowired
    private DomainService domainService;
	@Autowired
    private DomainRepository domainRepository;

	
	   @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,produces = {MediaType.APPLICATION_JSON_VALUE})
	   @ResponseStatus(HttpStatus.OK)
	    public Domain addProduct(@ModelAttribute Domain product) {
	        try {
	        	System.out.println(product.toString());
	        	return domainRepository.save(product);
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
	    }
	   
	   
	   @GetMapping()
	   @ResponseStatus(HttpStatus.OK)
	    public List<Domain> findAllDomains() {
	        try {
	        	System.out.print("custom find all");
				return domainRepository.findAll();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
	    }
//	   
//	   @DeleteMapping(value = "/{id}")
//	   @ResponseStatus(HttpStatus.OK)
//	    public String deleteProductById(@PathVariable Long id) {
//	        try {
//				productService.softDelete(id);
//				return "deleted by id = "+ id;
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//				return null;
//			}
//	    }

}
