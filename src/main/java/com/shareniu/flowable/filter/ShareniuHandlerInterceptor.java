package com.shareniu.flowable.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.flowable.app.security.SecurityUtils;
import org.flowable.idm.api.User;
import org.flowable.idm.engine.impl.persistence.entity.UserEntityImpl;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.shareniu.flowable.controller.Const;

public class ShareniuHandlerInterceptor  implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String servletPath = request.getServletPath();
		
		if (servletPath.endsWith(".css")||servletPath.endsWith(".js")||servletPath.endsWith(".jpg")||servletPath.endsWith(".png")) {
			return true;
		}
		
		System.out.println(servletPath);
		if (servletPath.startsWith("/app")) {
			User user=new UserEntityImpl();
			user.setId("shareniu");
			SecurityUtils.assumeUser(user);
		}
		Object obj = request.getSession().getAttribute(Const.SESSION_USER);
		if (obj==null ) {
			response.sendRedirect("/");
			return false;
		}
	
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

}
