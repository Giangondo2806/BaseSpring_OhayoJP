package com.ohayojp.base;

import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ohayojp.base.generic.GenericRepository;
import com.ohayojp.base.generic.GenericService;


/**
 * 
 * @author GiangTB
 *
 * @param <T>
 * @param <PK>
 * @param <D>
 */
public abstract class BaseService<T extends BaseEntity, PK extends Serializable, RP extends GenericRepository<T, PK>>
    implements GenericService<T, PK> {
  protected final Log log = LogFactory.getLog(getClass().getName());

  protected RP genericRepository;

  public void setgenericRepository(RP genericRepository) {
    this.genericRepository = genericRepository;
  }

  @Transactional
  public T save(T target) throws Exception {
    T t = genericRepository.save(target);
    return t;
  }

  @Transactional
  public void removeById(PK id) throws Exception {
    genericRepository.removeById(id);
  }

  @Transactional
  public T update(T target) throws Exception {
    return genericRepository.update(target);
  }

  @Transactional
  public T saveOrUpdate(T target) throws Exception {
    return genericRepository.saveOrUpdate(target);
  }

  public T getById(PK id) throws Exception {
    return genericRepository.getById(id);
  }
  
  public int count() throws Exception {
    return genericRepository.count();
  }

}
