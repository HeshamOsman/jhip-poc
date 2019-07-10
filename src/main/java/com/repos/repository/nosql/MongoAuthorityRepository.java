package com.repos.repository.nosql;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.repos.domain.Authority;
//import com.repos.domain.nosql.MongoAuthority;
import com.repos.repository.AuthorityRepository;

/**
 * Spring Data MongoDB repository for the {@link MongoAuthority} entity.
 */
@Profile("mongo")
public interface MongoAuthorityRepository extends MongoRepository<Authority, String>,AuthorityRepository {
}
