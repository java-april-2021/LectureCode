package com.matthew.dogs.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.matthew.dogs.models.Dog;
import com.matthew.dogs.models.Toy;
import com.matthew.dogs.services.DogService;
import com.matthew.dogs.services.ToyService;

@Controller
@RequestMapping("/toys")
public class ToyController {
	@Autowired
	private ToyService tService;
	@Autowired
	private DogService dService;
	
	@GetMapping("/new")
	public String createToy(Model viewModel, @ModelAttribute("toy") Toy toy) {
		viewModel.addAttribute("allDogs", this.dService.getAllDogs());
		return "toys/new.jsp";
	}
	
	@PostMapping("/new")
	public String create(@Valid @ModelAttribute("toy") Toy toy, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("allDogs", this.dService.getAllDogs());
			return "toys/new.jsp";
		}
		this.tService.create(toy);
		Dog dog = toy.getDog();
		Long dogId = dog.getId();
		return "redirect:/" + dogId;
	}
}
