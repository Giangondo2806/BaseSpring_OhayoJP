package com.ohayojp.product;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohayojp.base.sql.BaseService;



/**
 * 
 * created at 2021/04/21
 * @author GiangTB
 */
@Service("productService")
@Transactional
public class ProductService extends BaseService<Product, Long, ProductRepository> {
	
	@Autowired
	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		super(productRepository);
		this.productRepository = productRepository;
	}




	


}
