package com.movie.serviceImpl;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.movie.model.User;
import com.movie.repository.UserRepository;
import com.movie.service.UserService;

@Service
@Primary
public class UserServiceImpl implements UserService {
	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Long user_id) {
		return null;
	}

	@Override
	public User addUser(User newUser) {
		return null;
	}

	@Override
	public User updateUser(User updatedUser, Long user_id) {
		return null;
	}

	@Override
	public void deleteUserById(Long user_id) {

	}
}
