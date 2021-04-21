package com.ohayojp.base.mysql;

import java.io.Serializable;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.ohayojp.base.generic.GenericRepository;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;



/**
 * 
 * created at 2021/04/21
 * @author GiangTB
 * @param <T>
 * @param <PK>
 */
public abstract class BaseRepository<T extends BaseEntity, PK extends Serializable> implements GenericRepository<T, PK> {

	
	  
}
