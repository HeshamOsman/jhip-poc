package com.repos.repository.sql;

import org.springframework.data.jpa.repository.JpaRepository;

import com.repos.domain.Authority;
//import com.repos.domain.sql.SQLAuthority;
import com.repos.repository.AuthorityRepository;

/**
 * Spring Data JPA repository for the {@link SQLAuthority} entity.
 */
public interface SQLAuthorityRepository extends JpaRepository<Authority, String>,AuthorityRepository {
}
