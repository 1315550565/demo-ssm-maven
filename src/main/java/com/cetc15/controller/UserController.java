package com.cetc15.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cetc15.entity.UserT;
import com.cetc15.service.impl.UserTService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource(name="userTService")
	private UserTService  userTService;
	
	@RequestMapping("/toIndex")
	public String toIndex(HttpServletRequest request,Model model) {
		int userId = Integer.parseInt(request.getParameter("id"));
		UserT userT = this.userTService.getUserById(userId);
		System.out.println(userT+"--------------");
		model.addAttribute("user", userT);
		return "showUser";
	}
}
