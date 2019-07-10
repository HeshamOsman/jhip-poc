package com.repos.repository;

import org.springframework.stereotype.Repository;

import com.repos.domain.User;


public interface usertworepo {

	User toFindUserByHisIdentifier(Long i);
}
