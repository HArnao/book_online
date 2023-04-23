package com.upao.apibook.service;

import com.upao.apibook.model.User;

public interface UserService {
    //Revisar
    User createUser(User user);

    User getUserById(Long id);

    User getUserByUsername(String username);

    User updateUser(Long id, User user);

    void deleteUser(Long id);
}
