package com.ohayojp.base.generic;
import java.io.Serializable;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ohayojp.base.BaseEntity;
/**
 * 
 * @author GiangTB
 *
 */

@NoRepositoryBean
public interface GenericRepository<T extends BaseEntity, PK extends Serializable> extends CrudRepository<T, PK>, JpaRepository<T, PK>  {
	@Query("select u from #{#entityName} u where u.deletedAt IS NULL")
	  List<T> findAll();
	
	@Modifying
	@Transactional
	@Query("update #{#entityName} u set u.deletedAt = CURRENT_TIMESTAMP where u.id = :id")
	  void softDelete(@Param("id") PK id);
	

}