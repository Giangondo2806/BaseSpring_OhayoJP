package com.ohayojp.product;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ohayojp.base.BaseRepository;

/**
 * 
 * @author GiangTB
 *
 */
public abstract class  ProductRepository extends BaseRepository<Product, Long> {




}
