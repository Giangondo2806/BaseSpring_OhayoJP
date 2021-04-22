package com.ohayojp.product;

import org.springframework.stereotype.Repository;

import com.ohayojp.base.sql.generic.GenericRepository;



/**
 * 
 * created at 2021/04/21
 * @author GiangTB
 */
@Repository
public  interface ProductRepository extends GenericRepository<Product, Long> {
	
	


}
 