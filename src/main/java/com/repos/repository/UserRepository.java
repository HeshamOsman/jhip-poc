package com.repos.repository;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import com.repos.domain.User;
//import com.repos.domain.UserI;
//import com.repos.domain.sql.SQLUser;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, String>, QueryByExampleExecutor<User>{
	
	String USERS_BY_LOGIN_CACHE = "usersByLogin";

    String USERS_BY_EMAIL_CACHE = "usersByEmail";
	
	
	//User toFindUserByHisIdentifier(Long i);
	
    Optional<User> findOneByActivationKey(String activationKey);


    List<User> findAllByActivatedIsFalseAndActivationKeyIsNotNullAndCreatedDateBefore(Instant dateTime);


    Optional<User> findOneByResetKey(String resetKey);

  
    Optional<User> findOneByEmailIgnoreCase(String email);


    Optional<User> findOneByLogin(String login);

    Page<User> findAllByLoginNot(Pageable pageable, String login);
	
	
}
