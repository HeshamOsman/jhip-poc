package com.repos.repository.nosql;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.repos.domain.sql.Authority;

/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
@Profile("mongo")
public interface AuthorityRepository extends MongoRepository<Authority, String> {
}
