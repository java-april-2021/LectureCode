package com.matthew.springBootExample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String hello() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/result", method=RequestMethod.POST)
	public String result(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("joke") String joke, Model viewModel) {
		viewModel.addAttribute("name", name);
		viewModel.addAttribute("email", email);
		viewModel.addAttribute("joke", joke);
		return "result.jsp";
	}
	
	@RequestMapping("/favColor/{color}")
	public String favColor(@PathVariable("color") String color, Model viewModel) {
		viewModel.addAttribute("color", color);
		return "color.jsp";
	}
}
