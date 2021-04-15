package com.ohayojp.base;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author GiangTB
 *
 */
@MappedSuperclass
public  class BaseEntity implements Serializable {
	  @Id
	  private long id;
	  
	  @Column(name = "createdAt",nullable = false)
	  @Temporal(TemporalType.DATE)
	  private Date createdAt;
	  
	  @Column(name = "updatedAt",nullable = false)
	  @Temporal(TemporalType.DATE)
	  private Date updatedAt;
	  
	  @Column(name = "deletedAt",nullable = true)
	  @Temporal(TemporalType.DATE)
	  private Date deletedAt;
}
