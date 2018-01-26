package com.hky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

	//欢迎界面
	@RequestMapping("/main")
	public String main() {
		return "/main/main";
	}
	//个人基本信息页面
	@RequestMapping("/basic")
	public String basic() {
		return "/user/basic";
	}
	//个人通讯信息页面
	@RequestMapping("/message")
	public String message() {
		return "/user/message";
	}
	 
}
