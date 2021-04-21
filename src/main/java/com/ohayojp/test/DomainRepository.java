/**
 * 
 */
package com.ohayojp.test;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
/**
 * 
 * created at 2021/04/21
 * @author GiangTB
 */

@Repository
public interface DomainRepository extends MongoRepository<Domain, Long> {
   

}