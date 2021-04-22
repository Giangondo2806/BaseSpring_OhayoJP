package com.ohayojp.base.mongodb;

import java.io.Serializable;
import java.util.List;

import com.ohayojp.base.mongodb.generic.GenericMongoRepository;
import com.ohayojp.base.sql.generic.GenericService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.transaction.annotation.Transactional;


/**
 * class recommend
 * @2021/04/21
 * @author GiangTB
 * @param <T>
 * @param <PK>
 * @param <D>
 */
public abstract class BaseMongoService<T extends BaseMongoEntity, PK extends Serializable, D extends GenericMongoRepository<T, String>> 
implements GenericService<T, PK> {
	
	
	
protected final Log log = LogFactory.getLog(getClass().getName());

protected D repository;
public BaseMongoService(D repository) {
    this.repository = repository;
   }	



@Transactional
public T save(T target) throws Exception {
T t = repository.save(target);
return t;
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





}

