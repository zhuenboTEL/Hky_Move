package com.hky.dao;

import java.util.Set;

import com.hky.entity.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(String rId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String rId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    
	/**
	 * 查询角色模块（用户名）
	 * @param username
	 * @return
	 */
	Set<String> getRoleWithModuleByName(String username);
}