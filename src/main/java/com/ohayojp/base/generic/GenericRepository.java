package com.ohayojp.base.generic;
import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.ohayojp.base.BaseEntity;
/**
 * 
 * @author GiangTB
 *
 */

@NoRepositoryBean
public interface GenericRepository<T extends BaseEntity, PK extends Serializable> extends CrudRepository<T, PK>, JpaRepository<T, PK>  {
	@Query("select u from #{#entityName} u")
	  List<T> customFindAll();

}