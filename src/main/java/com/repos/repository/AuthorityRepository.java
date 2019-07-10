package com.repos.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import com.repos.domain.Authority;
//import com.repos.domain.AuthorityI;

public interface AuthorityRepository extends PagingAndSortingRepository<Authority, String>, QueryByExampleExecutor<Authority> {

}
