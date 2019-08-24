package com.vip.mvc.utils;

import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

public class LoginHelper {
//
//    private final static String SECRET_KEY = "wo-shi-test-mi-yao";
//
//	private final static String USER_TOKEN_NAME = "X-Token";
//
//	private final static String LOGIN_USER_KEY = "LOGINED-USER";
//	/**
//	 * 获取登录账号信息到COOKIE中
//	 */
//	public static String getLoginAccountFromCookie(HttpServletRequest request) {
//		String encodeLoginToken = CookieUtil.getCookieValue(request, USER_TOKEN_NAME, true);
//		if (StringUtils.isEmpty(encodeLoginToken)) {
//			return null;
//		}
//
//		return decodeLoginToken(encodeLoginToken);
//	}
//
//
//	/**
//	 * 获取登录账号信息从请求对象中
//	 */
//	public static String getLoginAccount(HttpServletRequest request) {
//		String loginAccount = request.getHeader(USER_TOKEN_NAME);
//		if (!StringUtils.isEmpty(loginAccount)) {
//			return decodeLoginToken(loginAccount);
//		}
//
//		loginAccount = getLoginAccountFromCookie(request);
//		if (!StringUtils.isEmpty(loginAccount)) {
//			return loginAccount;
//		}
//
//		return null;
//	}
//
//	public static String encodeLoginToken(String loginAccount) {
//		if (StringUtils.isEmpty(loginAccount)) {
//			return null;
//		}
//
//		return AESUtil.encrypt(loginAccount, SECRET_KEY);
//	}
//
//	public static String decodeLoginToken(String loginToken) {
//		if (StringUtils.isEmpty(loginToken)) {
//			return null;
//		}
//
//		return AESUtil.decrypt(loginToken, SECRET_KEY);
//	}
//
//	/**
//	 * 将用户信息放入请求对象
//	 */
//	public static void addLoginUserToRequest(HttpServletRequest request, User user) {
//		request.setAttribute(LOGIN_USER_KEY, user);
//	}
//
//	/**
//	 * 获取登录用户信息从请求对象 备注：使用该方法时需要在对应controller类或方法上加{@link LoginedAuth}注解
//	 */
//	public static User getLoginUserFromRequest(HttpServletRequest request) {
//		Object userO = request.getAttribute(LOGIN_USER_KEY);
//		if (userO == null) {
//			return null;
//		}
//
//		return (User)userO;
//	}
}
