package com.hky.service;

import java.util.Set;

import com.hky.entity.Role;

public interface RoleService {

	/**
	 * 查询角色模块（用户名）
	 * @param username
	 * @return
	 */
	Set<String> getRoleWithModuleByName(String username);

	

}
