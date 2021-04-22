package com.ohayojp.base.sql.generic;
import java.io.Serializable;
import java.util.List;


/**
 * 
 * created at 2021/04/21
 * @author GiangTB
 * @param <T>
 * @param <PK>
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
