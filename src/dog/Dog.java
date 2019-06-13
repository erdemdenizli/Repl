package dog;

public class Dog extends Animal {
	
	String breed;
	int humanYears;
	
	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	@Override
	public int getAgeInHumanYears() {
		
		if(this.age <= 2) {
			return this.age *= 11;
		}
		
		return 22 + ((this.age-2) * 5);
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getHumanYears() {
		return humanYears;
	}

	public void setHumanYears(int humanYears) {
		this.humanYears = humanYears;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\n" + 
				"Breed: " + this.breed + "\n" +
				"Age in calendar years: " + this.age + "\n" +
				"Age in human years: " + getAgeInHumanYears();
	}

	public boolean equals(Dog dog) {
		if (this.name.equals(dog.name) && this.age == dog.age && this.breed.equals(dog.breed))
			return true;
		
		return false;
	}
	

}
