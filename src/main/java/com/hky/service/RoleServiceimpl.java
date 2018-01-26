package com.hky.service;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hky.dao.RoleMapper;
import com.hky.entity.Role;

@Service
@Transactional
public class RoleServiceimpl implements RoleService {

	@Resource
	private RoleMapper rolemapper;
	 
	@Override
	public Set<String> getRoleWithModuleByName(String username) {
		// TODO Auto-generated method stub
		return rolemapper.getRoleWithModuleByName(username);
	}

}
