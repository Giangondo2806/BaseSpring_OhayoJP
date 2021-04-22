/**
 * 
 */
package com.ohayojp.test;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ohayojp.base.mongodb.generic.GenericMongoRepository;
/**
 * 
 * created at 2021/04/21
 * @author GiangTB
 */

@Repository
public interface DomainRepository extends GenericMongoRepository<Domain, String> {
   

}