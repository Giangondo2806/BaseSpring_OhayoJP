package com.ohayojp.base.mongodb.generic;
import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ohayojp.base.mongodb.BaseMongoEntity;



/**
 * 
 * created at 2021/04/21
 * @author GiangTB
 * @param <T>
 * @param <PK>
 */
@NoRepositoryBean
public interface GenericMongoRepository<T extends BaseMongoEntity, PK extends Serializable> extends CrudRepository<T, PK>, MongoRepository<T, PK>  {

	

}