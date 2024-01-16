package com.movie.service;

import java.util.List;

import com.movie.model.User;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long user_id);

    User addUser(User newUser);

    User updateUser(User updatedUser, Long user_id);

    void deleteUserById(Long user_id);
}
