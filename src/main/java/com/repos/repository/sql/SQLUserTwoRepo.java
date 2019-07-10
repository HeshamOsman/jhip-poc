package com.repos.repository.sql;

import org.springframework.stereotype.Repository;

import com.repos.domain.sql.User;


public interface SQLUserTwoRepo {

	User toFindUserByHisIdentifier(Long i);
}
