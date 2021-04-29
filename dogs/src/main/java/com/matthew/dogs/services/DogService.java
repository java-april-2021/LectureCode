package com.matthew.dogs.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.matthew.dogs.models.Dog;
import com.matthew.dogs.repositories.DogRepository;

@Service
public class DogService {
	// dependency inject our repoisoty so the service essentially has access to all methods in the repository interface
	private DogRepository dRepo;
	
	public DogService(DogRepository repo) {
		this.dRepo = repo;
	}
	
	//Get All Dogs
	public List<Dog> getAllDogs(){
		return this.dRepo.findAll();
	}
	
	// Get One Dog
	public Dog getSingleDog(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
	// Create a Dog
	public Dog createDog(Dog newDog) {
		return this.dRepo.save(newDog);
	}
	
	// Update a Dog
	public Dog updateDog(Dog dog) {
		return this.dRepo.save(dog);
	}
	
	// Delete A Dog
	public void deleteDog(Long id) {
		this.dRepo.deleteById(id);
	}
	
	// Create Dog With HTML Forms
	public Dog createDogHTML(String name, String breed, int age) {
		Dog newDog = new Dog(name, breed, age);
		return this.dRepo.save(newDog);
	}
}
