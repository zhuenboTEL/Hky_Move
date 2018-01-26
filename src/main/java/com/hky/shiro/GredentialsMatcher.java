package com.hky.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

import com.hky.utils.Encrypt;

public class GredentialsMatcher extends SimpleCredentialsMatcher{

	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		// TODO Auto-generated method stub
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		String md5Hash = Encrypt.md5Hash( new String(upToken.getPassword()), upToken.getUsername()+"khyt");
		return md5Hash.equals(info.getCredentials());
	}

}
