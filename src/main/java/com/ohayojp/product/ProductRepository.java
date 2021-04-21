package com.ohayojp.product;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ohayojp.base.generic.GenericRepository;
import com.ohayojp.base.mysql.BaseRepository;



/**
 * 
 * created at 2021/04/21
 * @author GiangTB
 */
@Repository
public  interface ProductRepository extends GenericRepository<Product, Long> {
	
	


}
 