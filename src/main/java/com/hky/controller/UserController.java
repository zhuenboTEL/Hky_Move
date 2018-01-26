package com.hky.controller;

import java.util.UUID;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hky.entity.User;
import com.hky.service.UserService;
import com.hky.utils.CookieUtils;

@Controller
@RequestMapping("/user")
public class UserController {
	private static final String TOKEN_KEY = "token";
	@Autowired
	private UserService userservice;
	
	
	//登录界面
	@RequestMapping("/toLogin")
	public String tologin() {
		return "/index";
	}
	 //登录
	@RequestMapping("/login")
	public String login1(User user,HttpServletRequest request,HttpServletResponse response) {
		Subject subject =  SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword());
		try {
			 subject.login(token);
			//生成token令牌
			String toToken = UUID.randomUUID().toString();
			//放入cookie中
			CookieUtils.setCookie(request, response, TOKEN_KEY, toToken);
			return "index";
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "login";
	}
	
	
	
}
