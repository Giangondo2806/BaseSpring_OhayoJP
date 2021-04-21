package com.ohayojp.base.generic;
import java.io.Serializable;
import java.util.List;
/**
 * 
 * @author GiangTB
 *
 */
public interface GenericService<T, PK extends Serializable> {
  public T save(T target) throws Exception;
  
  public void deleteById(PK id) throws Exception;

  public T update(T target) throws Exception;

  public T saveOrUpdate(T target) throws Exception;

  public T getById(PK id) throws Exception;
  
  public List<T> findAll() throws Exception;

  public int count() throws Exception;
}
