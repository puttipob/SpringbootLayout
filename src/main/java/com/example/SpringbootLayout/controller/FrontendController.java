package com.example.SpringbootLayout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendController {

	String viewpath = "frontend/";

	@GetMapping(value = "/")
	public String index(Model model) {
		model.addAttribute("homeMenuActive", true);
		return viewpath + "index";
	}

	@GetMapping(value = "/about")
	public String about(Model model) {
		model.addAttribute("aboutMenuActive", true);
		return viewpath + "about";
	}

	@GetMapping(value = "/service")
	public String service(Model model) {
		model.addAttribute("serviceMenuActive", true);
		return viewpath + "service";
	}

	@GetMapping(value = "/contact")
	public String contact(Model model) {
		model.addAttribute("contactMenuActive", true);
		return viewpath + "contact";
	}

	@GetMapping(value = "/login")
	public String login(Model model) {
		model.addAttribute("loginMenuActive", true);
		return viewpath + "login";
	}

	@GetMapping(value = "/register")
	public String register(Model model) {
		model.addAttribute("registerMenuActive", true);
		return viewpath + "register";
	}
}
