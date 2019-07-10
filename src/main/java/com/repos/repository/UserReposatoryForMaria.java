package com.repos.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.repos.domain.User;

import io.github.jhipster.config.JHipsterConstants;

@Repository
@Profile("maria")
public interface UserReposatoryForMaria extends JpaRepository<User, Long>,usertworepo{
	@Query("select u from User u where u.id = :i")
    User toFindUserByHisIdentifier(@Param("i") Long i);
}
