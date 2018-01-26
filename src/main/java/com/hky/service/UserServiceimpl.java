package com.hky.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hky.dao.UserMapper;
import com.hky.entity.User;

@Service
@Transactional
public class UserServiceimpl implements UserService {

	@Autowired
	private UserMapper usermapper;
	
	@Override
	public User getUserByName(String username) {
		// TODO Auto-generated method stub
		return usermapper.getUserByName(username);
	}


	@Override
	public Set<String> getUserWidthRoleByName(String username) {
		// TODO Auto-generated method stub
		return usermapper.getUserWithRoleByName(username);
	}


}
