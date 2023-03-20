package com.example.services;

import com.example.entity.User;

public interface UserService {
	public User registerUser(User user);
	public User loginUser(User user);
	public User changePassword(User user);
	public String forgotPassword(String username);
	public User searchUserByUserName(String username);
	public int searchByUserId(int userid);
	User searchUserByUserName(User username);
	

}