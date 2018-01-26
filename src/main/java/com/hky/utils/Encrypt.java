package com.hky.utils;

import org.apache.shiro.crypto.hash.Md5Hash;

public class Encrypt {

	public static String md5Hash(String str,String salt) {
		return new Md5Hash(str,salt).toString();
	}
	public static void main(String[] args) {
		String md5 = md5Hash("ykh284","huankeyuan");
		System.out.println(md5);
	}
}
