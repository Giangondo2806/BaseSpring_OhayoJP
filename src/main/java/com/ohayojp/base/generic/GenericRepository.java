package com.ohayojp.base.generic;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ohayojp.base.BaseEntity;
/**
 * 
 * @author GiangTB
 *
 */
public interface GenericRepository<T extends BaseEntity, PK extends Serializable> extends JpaRepository<T, PK>  {
	

}