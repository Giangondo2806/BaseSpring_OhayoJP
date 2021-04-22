/**
 * 
 */
package com.ohayojp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

/**
 * 
 * created at 2021/04/22
 * @author GiangTB
 */
@Configuration

public class MongoConfig {
	 public @Bean MongoClient mongoClient() {
	      return MongoClients.create("mongodb://localhost:27017");
	  }

	  public @Bean(name = "mongoTemplate") MongoTemplate mongoTemplate() {
	      return new MongoTemplate(mongoClient(), "ondo");
	  }
}
