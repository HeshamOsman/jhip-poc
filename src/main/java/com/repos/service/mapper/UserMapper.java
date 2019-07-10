package com.repos.service.mapper;

import com.repos.domain.sql.SQLAuthority;
import com.repos.domain.sql.SQLUser;
import com.repos.service.dto.UserDTO;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Mapper for the entity {@link SQLUser} and its DTO called {@link UserDTO}.
 *
 * Normal mappers are generated using MapStruct, this one is hand-coded as MapStruct
 * support is still in beta, and requires a manual step with an IDE.
 */
@Service
public class UserMapper {

    public List<UserDTO> usersToUserDTOs(List<SQLUser> users) {
        return users.stream()
            .filter(Objects::nonNull)
            .map(this::userToUserDTO)
            .collect(Collectors.toList());
    }

    public UserDTO userToUserDTO(SQLUser user) {
        return new UserDTO(user);
    }

    public List<SQLUser> userDTOsToUsers(List<UserDTO> userDTOs) {
        return userDTOs.stream()
            .filter(Objects::nonNull)
            .map(this::userDTOToUser)
            .collect(Collectors.toList());
    }

    public SQLUser userDTOToUser(UserDTO userDTO) {
        if (userDTO == null) {
            return null;
        } else {
            SQLUser user = new SQLUser();
            user.setId(userDTO.getId());
            user.setLogin(userDTO.getLogin());
            user.setFirstName(userDTO.getFirstName());
            user.setLastName(userDTO.getLastName());
            user.setEmail(userDTO.getEmail());
            user.setImageUrl(userDTO.getImageUrl());
            user.setActivated(userDTO.isActivated());
            user.setLangKey(userDTO.getLangKey());
            Set<SQLAuthority> authorities = this.authoritiesFromStrings(userDTO.getAuthorities());
            user.setAuthorities(authorities);
            return user;
        }
    }


    private Set<SQLAuthority> authoritiesFromStrings(Set<String> authoritiesAsString) {
        Set<SQLAuthority> authorities = new HashSet<>();

        if(authoritiesAsString != null){
            authorities = authoritiesAsString.stream().map(string -> {
                SQLAuthority auth = new SQLAuthority();
                auth.setName(string);
                return auth;
            }).collect(Collectors.toSet());
        }

        return authorities;
    }

    public SQLUser userFromId(Long id) {
        if (id == null) {
            return null;
        }
        SQLUser user = new SQLUser();
        user.setId(id);
        return user;
    }
}
