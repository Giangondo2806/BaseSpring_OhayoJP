/**
 * 
 */
package com.ohayojp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.ohayojp.product.ProductRepository;
import com.ohayojp.test.DomainRepository;

/**
 * 
 * created at 2021/04/22
 * @author GiangTB
 */
@Configuration
@EnableMongoAuditing
@EnableMongoRepositories(basePackageClasses = {DomainRepository.class},
    mongoTemplateRef = "mongoTemplate")
public class OndoMongoDBConfig {

}
