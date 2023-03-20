package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping(value = "/registerUser")
	public ResponseEntity<User> registerUser(@Valid @RequestBody User user) {
		User registeredUser = userService.registerUser(user);
		return new ResponseEntity<User>(registeredUser, HttpStatus.CREATED);
	}
	@PostMapping(value = "/loginUser")
	public ResponseEntity<User> loginUser(@RequestBody User user) {
		User registeredUser = userService.loginUser(user);
		return new ResponseEntity<User>(registeredUser, HttpStatus.OK);

	}
	@PostMapping(value = "/changePassword")
	public ResponseEntity<String> changePassword(@Valid @RequestBody User user) {
		userService.changePassword(user);
		String msg = "Password Updated Successfully for User:" + user;
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	@GetMapping("/searchUserByUserName/{username}")
	public ResponseEntity<User> searchUserByUsername(@PathVariable String username) {
		User user = userService.searchUserByUserName(username);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	@GetMapping("/searchUserByUserId/{userId}")
	public ResponseEntity<User> searchUserByUserId(Integer userId) {
		return null;
	}
	@GetMapping("/forgotPassword/{username}")
	public ResponseEntity<?> forgotPassword(String username) {
		String user ="Your password is : "+ userService.forgotPassword(username);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	

}
