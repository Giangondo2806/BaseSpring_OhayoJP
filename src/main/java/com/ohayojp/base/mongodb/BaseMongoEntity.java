package com.ohayojp.base.mongodb;

import java.time.Instant;
import java.util.Date;

import javax.persistence.Id;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.domain.Persistable;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 
 * created at 2021/04/21
 * @author GiangTB
 */
@Data

public class BaseMongoEntity implements Persistable<String>   {
	@Version      
    private Long version;
	
	@Id
	protected String id;
	
	 @CreatedDate
	 @Field("created_date")
	 private Instant createdAt;
	
	@LastModifiedDate
	protected Instant updatedAt;

	@Override
	public boolean isNew() {
		// TODO Auto-generated method stub
		return createdAt == null;
	}


	
	

}
