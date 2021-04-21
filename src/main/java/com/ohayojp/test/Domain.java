/**
 * 
 */
package com.ohayojp.test;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * 
 * created at 2021/04/21
 * @author GiangTB
 */
@Data
@Document(collection = "domain")
public class Domain {

    @Indexed(unique = true)

    private String concho;

    private boolean displayAds;

}