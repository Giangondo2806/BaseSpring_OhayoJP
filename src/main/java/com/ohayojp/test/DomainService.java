/**
 * 
 */
package com.ohayojp.test;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohayojp.base.mongodb.BaseMongoService;
import com.ohayojp.product.ProductRepository;

/**
 * 
 * created at 2021/04/22
 * @author GiangTB
 */
@Service("domainService")
@Transactional
public class DomainService extends BaseMongoService<Domain, Long, DomainRepository>{
	
	@Autowired
	private final DomainRepository domainRepository;

	/**
	 * @param repository
	 */
	public DomainService(DomainRepository repository) {
		super(repository);
		this.domainRepository = repository;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deleteById(Long id) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
