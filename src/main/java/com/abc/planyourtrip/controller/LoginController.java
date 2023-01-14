package com.abc.planyourtrip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("/admin-login")
	public String getLoginPage() {
		return "admin-login";
	}
	
	@RequestMapping(value= "/admin-login", method = RequestMethod.POST)
	public String showLoginPage(ModelMap model , @RequestParam String username,String password) {
		if(username.equalsIgnoreCase("sai") && password.equalsIgnoreCase("1234"))
			return "success";
		model.put("error", "Wrong credentials");
		return "admin-login";
	}
	
	
}
