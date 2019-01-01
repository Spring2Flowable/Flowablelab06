package com.shareniu.flowable.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.shareniu.flowable.filter.ShareniuHandlerInterceptor;
@Configuration
public class InterceptorAdapter extends WebMvcConfigurerAdapter {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(new ShareniuHandlerInterceptor())
		.addPathPatterns("/**")
		.excludePathPatterns("/","/login","/logout","toLogin","/error/**")
		
		;
		super.addInterceptors(registry);
	}
}
