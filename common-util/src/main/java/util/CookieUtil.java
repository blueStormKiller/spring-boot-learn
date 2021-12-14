/*
 * Copyright (C), 2002-2014, 苏宁易购电子商务有限公司
 * FileName: CookieUtilities.java
 * Author:   12070675/王震
 * Date:     2014-9-2 上午10:18:23
 * Description: //模块目的、功能描述
 * History: //修改记录
 * 12070675/王震      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package util;

import constants.CookieContants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;


/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 12070675/王震
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class CookieUtil {
	private static final Logger LOGGER = LoggerFactory.getLogger(CookieUtil.class);
	private static final CookieUtil COOKIE = new CookieUtil();
	private static final String UTF_8 = "utf-8";

	public static CookieUtil getInstance() {
		return COOKIE;
	}

	/**
	 * 获取会话id
	 *
	 * @param request
	 * @return
	 */
	public String getId(HttpServletRequest request) {
		return getInstance().getCookieValue(request, "sessionId");
	}

	/**
	 * 设置cookie
	 *
	 * @param response
	 * @param cookieName
	 * @param cookieValue
	 */
	public void setCookie(HttpServletResponse response, String cookieName, String cookieValue) {
		Cookie cookie = null;
		try {
			cookie = new Cookie(cookieName, URLEncoder.encode(cookieValue, UTF_8));
			cookie.setPath(CookieContants.getCookiePath());
			cookie.setDomain(CookieContants.getCookieDomain());
			response.addCookie(cookie);
		} catch (UnsupportedEncodingException e) {
			// 日志
			LOGGER.debug(cookieName, e);
		}
	}

	/**
	 * 设置cookie
	 *
	 * @param request
	 * @param response
	 * @param cookieName
	 * @param cookieValue
	 */
	public void setCookie(HttpServletRequest request, HttpServletResponse response, String cookieName, String cookieValue) {
		String cookieDomain = request.getServerName();
		Cookie cookie = null;
		try {
			cookie = new Cookie(cookieName, URLEncoder.encode(cookieValue, UTF_8));
			cookie.setPath(CookieContants.getCookiePath());
			cookie.setDomain((null == cookieDomain) ? CookieContants.getCookieDomain() : cookieDomain);
			response.addCookie(cookie);
		} catch (UnsupportedEncodingException e) {
			// 日志
			LOGGER.debug(cookieName, e);
		}
	}

	/**
	 * 获取cookie值
	 *
	 * @param request
	 * @param cookieName
	 * @return
	 */
	public String getCookieValue(HttpServletRequest request, String cookieName) {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			Cookie cookie;
			for (int i = 0; i < cookies.length; i++) {
				cookie = cookies[i];
				if (!cookieName.equals(cookie.getName())) {
					continue;
				}
				try {
					return URLDecoder.decode(cookie.getValue(), UTF_8);
				} catch (UnsupportedEncodingException e) {
					// 日志
					LOGGER.debug(cookieName, e);
				}
			}
		}

		return "";
	}

	/**
	 * 清除cookie
	 *
	 * @param request
	 * @param response
	 * @param cookieKey
	 */
	public void clearCookie(HttpServletRequest request, HttpServletResponse response, String cookieKey) {
		Cookie[] cookies = request.getCookies();

		if (!org.springframework.util.ObjectUtils.isEmpty(cookies)) {
			String cookieDomain = request.getServerName();
			for (Cookie k : cookies) {
				if (k.getName().equals(cookieKey)) {
					Cookie cookie = new Cookie(k.getName(), null);
					cookie.setSecure(true);
					cookie.setMaxAge(0);
					cookie.setPath(CookieContants.getCookiePath());
					cookie.setDomain((null == cookieDomain) ? CookieContants.getCookieDomain() : cookieDomain);
					response.addCookie(cookie);
					break;
				}
			}
		}
	}

	/**
	 * 删除cookie
	 *
	 * @param request
	 * @param response
	 */
	public void deleteCookie(HttpServletRequest request, HttpServletResponse response) {
		Cookie[] cookies = request.getCookies();
		if (!org.springframework.util.ObjectUtils.isEmpty(cookies)) {
			String cookieDomain = request.getServerName();
			for (Cookie k : cookies) {
				if (!"sessionId".equalsIgnoreCase(k.getName())) {
					Cookie cookie = new Cookie(k.getName(), null);
					cookie.setSecure(true);
					cookie.setMaxAge(0);
					cookie.setPath(CookieContants.getCookiePath());
					cookie.setDomain((null == cookieDomain) ? CookieContants.getCookieDomain() : cookieDomain);
					response.addCookie(cookie);
				}
			}
		}
	}
}
