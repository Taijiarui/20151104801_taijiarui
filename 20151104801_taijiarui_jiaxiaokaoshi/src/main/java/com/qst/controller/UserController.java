package com.qst.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qst.po.Employee;
import com.qst.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	UserService userService;
	
	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("employee", new Employee());
		return "login";
	}
	
	@RequestMapping("/loginForm")
	public String loginForm(@Valid @ModelAttribute("employee") Employee emp,Errors errors,Model model,HttpSession session) {
		if(errors.hasErrors())
			return "login";
		else {
			boolean flag = userService.login(emp);
			if(flag) {
				session.setAttribute("employee", emp);
				return "loginsuccess";
			}
			else {
				model.addAttribute("errorlogin","查无此人，请重新输入！");
				return "login";
			}
		}
		
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
}
