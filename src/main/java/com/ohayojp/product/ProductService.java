package com.ohayojp.product;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohayojp.base.BaseService;

/**
 * 
 * @author GiangTB
 *
 */
@Service("productService")
public class ProductService extends BaseService<Product, Long, ProductRepository > {
	

	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		super(productRepository);
		this.productRepository = productRepository;
	}

	


}
