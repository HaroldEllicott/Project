package com.fdm.controllers;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fdm.entities.GenericDAO;
import com.fdm.entities.Recipe;
import com.fdm.entities.User;

@Controller
public class LoginController {
	
	@Resource(name="recipeDao")
	private GenericDAO<Recipe> dao;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loadPage(Model model) {
		System.out.println("Binding user");
		model.addAttribute("user", new User());
		return "login";
	}

	@RequestMapping(value="/loginUser", method=RequestMethod.POST)
	public String loadPage(HttpServletRequest request, HttpSession session, User user) {
		System.out.println("Getting user from form " + user);
		session.setAttribute("username", user.getUsername());
		request.setAttribute("allRecipes", dao.getAll());
		return "home";
	}

}
