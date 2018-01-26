package com.hky.dao;

import java.util.Set;

import com.hky.entity.User;

public interface UserMapper {

	int deleteByPrimaryKey(String tId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	User getUserByName(String username);
	 
	/**
	 * 查询用户角色（用户名）
	 * @param username
	 * @return
	 */
	Set<String> getUserWithRoleByName(String username);

}