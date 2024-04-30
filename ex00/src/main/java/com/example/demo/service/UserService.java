package com.example.demo.service;

import com.example.demo.domain.UserDTO;

public interface UserService {
	boolean join(UserDTO user);
	boolean leaveID(String userid);
	UserDTO getDetail(String userid);
	boolean login(String userid,String userpw);
}
