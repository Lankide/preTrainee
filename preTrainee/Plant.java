package preTrainee;

public class Plant extends Product {

	private int lengthPlant;

	private String cultivarPlant;

	public int getLengthPlant() {
		return lengthPlant;
	}

	public String getVarietyPlant() {
		return cultivarPlant;
	}

	public void setLengthPlant(int lengthPlant) {
		this.lengthPlant = lengthPlant;
	}

	public void setVarietyPlants(String cultivarPlant) {
		this.cultivarPlant = cultivarPlant;
	}

	public Plant() {
		lengthPlant = 0;
		cultivarPlant = "";
	}

	public Plant(String name, int price, int total, int lengthPlant, String varietyPlant) {
		super(name, price, total);
		this.lengthPlant = lengthPlant;
		this.cultivarPlant = varietyPlant;
	}

	@Override
	public String toString() {
		return super.toString() + " Длина: " + lengthPlant + "см. Сорт: " + cultivarPlant;
	}

}
