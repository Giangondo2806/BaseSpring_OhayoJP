package com.ohayojp.base.mysql;

import java.io.Serializable;
import java.util.List;

import com.ohayojp.base.generic.GenericRepository;
import com.ohayojp.base.generic.GenericService;
import com.ohayojp.product.ProductRepository;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * class recommend
 * @2021/04/21
 * @author GiangTB
 * @param <T>
 * @param <PK>
 * @param <D>
 */
public abstract class BaseService<T extends BaseEntity, PK extends Serializable, D extends GenericRepository<T, PK>> 
implements GenericService<T, PK> {
	
	
	
protected final Log log = LogFactory.getLog(getClass().getName());

protected D repository;
public BaseService(D repository) {
    this.repository = repository;
   }	



@Transactional
public T save(T target) throws Exception {
T t = repository.save(target);
return t;
}


@Transactional
public void deleteById(PK id) throws Exception {
this.repository.deleteById(id);
}

@Transactional
public T update(T target) throws Exception {
	return null;
//reuturn this.repository.
}

@Transactional
public T saveOrUpdate(T target) throws Exception {
	return null;
//return repository.saveOrUpdate(target);
}

public T getById(PK id) throws Exception {
	return null;
//return repository.getById(id);
}

public int count() throws Exception {
return (int) repository.count();
}

public List<T> findAll() throws Exception {
	return repository.findAll();

}


public void softDelete(PK id) throws Exception {
	 this.repository.softDelete(id);

}




}

