/**
 * 
 */
package com.ohayojp.test;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ohayojp.base.mongodb.BaseMongoEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 * created at 2021/04/21
 * @author GiangTB
 */
@Data
@Document(collection = "domain")
@NoArgsConstructor
@AllArgsConstructor
public class Domain extends BaseMongoEntity {

    @Indexed(unique = true)
    private String concho;

    private boolean displayAds;

	@Override
	public String toString() {
		return "Domain [concho=" + concho + ", displayAds=" + displayAds + ", id=" + id + ", updatedAt=" + updatedAt
				+ "]";
	}
    
 
    
    

}