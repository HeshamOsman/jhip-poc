package com.repos.repository.sql;

import org.springframework.data.jpa.repository.JpaRepository;

import com.repos.domain.sql.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface SQLAuthorityRepository extends JpaRepository<Authority, String> {
}
