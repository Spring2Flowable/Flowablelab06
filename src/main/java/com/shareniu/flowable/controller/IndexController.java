package com.shareniu.flowable.controller;

import java.util.HashMap;
import java.util.Map;

import org.flowable.engine.IdentityService;
import org.flowable.idm.api.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shareniu.flowable.util.Parametermap;

@Controller
public class IndexController extends BaseController {
	@Autowired
	IdentityService identityService; 
	@RequestMapping(value="/")
	public String tologin() {
		Object obj = this.getSession().getAttribute(Const.SESSION_USER);
		if (obj!=null) {
			return "redirect:index";
		}
		return "login";
	}
	@RequestMapping(value="index")
	public String index() {
		return "index";
	}
	@RequestMapping(value="/uploadToView")
	public Object uploadToView() {
		return "page/process/editcontentpage.html";
	}

	@RequestMapping(value="/login")
	@ResponseBody
	public Object login() {
		Parametermap parametermap = getParametermap();
		Object username1 = parametermap.get("username");
		Object password1 = parametermap.get("password");
		System.out.println(username1+"##################"+password1);
		Map<String, String> map=new HashMap<>();
		User user = identityService.createUserQuery()
		.userId(username1.toString()).singleResult();
		if (user!=null) {
			String dbpassword = user.getPassword();
			if (password1!=null && password1.equals(dbpassword)) {
				map.put("status", "success");
				getSession().setAttribute(Const.SESSION_USER, user);
			}else {
				map.put("status", "fail");
			}
		}
		
		return map;
	}
	
	@RequestMapping(value="/logout")
	public String logout() {
		getSession().removeAttribute(Const.SESSION_USER);
		return "login";
	}
}
