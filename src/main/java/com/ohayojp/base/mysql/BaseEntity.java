package com.ohayojp.base.mysql;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import lombok.Data;


/**
 * 
 * created at 2021/04/21
 * @author GiangTB
 */
@MappedSuperclass
@Data
public class BaseEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected long id;

	@Column(name = "createdAt", nullable = true)
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	protected Date createdAt;

	@Column(name = "updatedAt", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	protected Date updatedAt;

	@Column(name = "deletedAt", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	protected Date deletedAt;

}
