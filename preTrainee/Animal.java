package preTrainee;

public class Animal extends Product {

	private int ageAnimal;

	private String breedAnimal;

	public int getAgeAnimal() {
		return ageAnimal;
	}

	public void setAgeAnimal(int ageAnimal) {
		this.ageAnimal = ageAnimal;
	}

	public String getBreedAnimal() {
		return breedAnimal;
	}

	public void setBreedAnimals(String breedAnimal) {
		this.breedAnimal = breedAnimal;
	}

	public Animal() {
		super();
		ageAnimal = 0;
		breedAnimal = "";
	}

	public Animal(String name, int price, int total, int age, String breed) {
		super(name, price, total);
		ageAnimal = age;
		breedAnimal = breed;
	}

	@Override
	public String toString() {
		return super.toString() + " Возраст: " + ageAnimal + " г. Порода: " + breedAnimal;
	}

}
