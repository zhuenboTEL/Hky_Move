package com.hky.service;


import java.util.Set;

import com.hky.entity.User;


public interface UserService {

	User getUserByName(String username);

	/**
	 * 查询用户角色（用户名）
	 * @param username
	 * @return
	 */
	Set<String> getUserWidthRoleByName(String username);

	
	
}
