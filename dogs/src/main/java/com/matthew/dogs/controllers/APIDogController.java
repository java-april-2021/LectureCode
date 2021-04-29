package com.matthew.dogs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matthew.dogs.models.Dog;
import com.matthew.dogs.services.DogService;

@RestController
@RequestMapping("/api")
public class APIDogController {
	@Autowired
	private DogService dService;
	
	@GetMapping("")
	public List<Dog> index(){
		return this.dService.getAllDogs();
	}
	
	@GetMapping("/{id}")
	public Dog getDog(@PathVariable("id") Long id) {
		return this.dService.getSingleDog(id);
	}
	
	@PostMapping("/create")
	public Dog create(Dog dog) {
		return this.dService.createDog(dog);
	}
	
	//@RequestMapping("/value="/delete/{id}", method=RequestMethod.DELETE)
	@DeleteMapping(value="/delete/{id}")
	public void deleteDog(@PathVariable("id") Long id) {
		this.dService.deleteDog(id);
	}
	
	//@RequestMapping("/value="/delete/{id}", method=RequestMethod.PUT)
	@PutMapping("/update/{id}")
	public Dog updateDog(@PathVariable("id") Long id, Dog updatedDog) {
		return this.dService.updateDog(updatedDog);
	}
	
}
