package com.example.service.impl;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.services.UserService;

import jakarta.transaction.Transactional;


@Component
@Transactional
public class UserServiceImpl implements UserService {
@Autowired
private UserRepository userRepository;
@Override
public User changePassword(User user) {
	Optional<User> opt = userRepository.getUserByUserName(user.getUserName());
	User existingUser = null;
	if (opt.isPresent()) {
		existingUser = opt.get();
		existingUser.setPassword(user.getPassword());
		userRepository.save(existingUser);
	} else {
		return null;
	}
	return existingUser;
}

@Override
public String forgotPassword(String username) {
	User u = userRepository.findByUserName(username);
	return u.getPassword();
}
@Override
public User searchUserByUserName(User username) {
	return null;
}
@Override
public int searchByUserId(int userid) {
	return (Integer) null;
}

@Override
public User registerUser(User user) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public User loginUser(User user) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public User searchUserByUserName(String username) {
	// TODO Auto-generated method stub
	return null;
}

}
