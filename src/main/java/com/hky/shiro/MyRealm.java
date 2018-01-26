package com.hky.shiro;

import java.util.Set;

import javax.annotation.Resource;
import javax.crypto.EncryptedPrivateKeyInfo;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.hky.entity.User;
import com.hky.service.RoleService;
import com.hky.service.UserService;
import com.hky.utils.Encrypt;

public class MyRealm extends AuthorizingRealm{

	@Resource
	private UserService userservice;
	@Resource
	private RoleService roleservice;
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalConllection) {
		 String username = principalConllection.getPrimaryPrincipal().toString();
		 SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		 Set<String> roleName = userservice.getUserWidthRoleByName(username);
		 Set<String> moduleName = roleservice.getRoleWithModuleByName(username);
		 info.setRoles(roleName);
		 info.setStringPermissions(moduleName);
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		String username = token.getPrincipal().toString();
		User user = userservice.getUserByName(username);
		if(user!=null) {
			 //将查询到的用户账号和密码存放到 authenticationInfo用于后面的权限判断。第三个参数传入realName。
            AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getUsername(),user.getPassword(), this.getName()) ;
            return authenticationInfo;
		} 
		return null;
	}

}
