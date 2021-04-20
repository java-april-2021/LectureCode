package example;

import java.util.ArrayList;

public class AnimalController {
// Entry Point Method
	public static void main(String[] args) {
		Animal dog = new Animal("Buster", false, 4, 50);
		Animal cat = new Animal("lazy-cat", true, 2, 500);
		
		System.out.println("Spring Tool Suite rocks!");
		
		ArrayList<Animal> myAnimals = new ArrayList<Animal>();
		
		myAnimals.add(dog);
		myAnimals.add(cat);
		
		for(Animal a : myAnimals) {
			System.out.println(a.getName());
		}
		
	}
}
