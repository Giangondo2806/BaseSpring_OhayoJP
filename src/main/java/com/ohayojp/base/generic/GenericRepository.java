package com.ohayojp.base.generic;
import java.io.Serializable;
import java.util.List;
import com.ohayojp.base.BaseEntity;

public interface GenericRepository<T extends BaseEntity, PK extends Serializable> {
  public T save(T target) throws Exception;
  
  public void removeById(PK id) throws Exception;

  public T update(T target) throws Exception;

  public T saveOrUpdate(T target) throws Exception;

  public T getById(PK id) throws Exception;
  
  public int count() throws Exception;
  
  public List<T> queryForList(String hql, final Object[] values,
      final int offset, final int pageSize) throws Exception;

  public long queryForSize(String originHql, final Object[] values) throws Exception;

}
