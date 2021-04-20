package example;

public class Animal {
	private String name;
	private boolean isSpotted;
	private int strength;
	private int health;
	
	public Animal(String name, boolean isSpotted, int strength, int health) {
		this.name = name;
		this.isSpotted = isSpotted;
		this.strength = strength;
		this.health = health;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSpotted() {
		return isSpotted;
	}
	public void setSpotted(boolean isSpotted) {
		this.isSpotted = isSpotted;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	
}
