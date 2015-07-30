package preTrainee;

public abstract class Product{

	private static long idGlobal = 0;

	private long idProduct;

	private String nameProduct;

	private int priceProduct;

	private int totalAmount;

	public long getIdProduct() {
		return idProduct;
	}

	@SuppressWarnings("unused")
	private void setIdProduct(long id) {
		idProduct = id;
	}

	public void setNameProduct(String name) {
		nameProduct = name;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setPriceProduct(int price) {
		priceProduct = price;
	}

	public int getPriceProduct() {
		return priceProduct;
	}

	public void setTotalAmount(int total) {
		totalAmount = total;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public Product() {
		idProduct = idGlobal++;
		nameProduct = "new product";
		priceProduct = 0;
		totalAmount = 0;
	}

	public Product(String name, int price, int total) {
		idProduct = idGlobal++;
		nameProduct = name;
		priceProduct = price;
		totalAmount = total;
	}

	public String toString() {
		return "Наименование:" + nameProduct + " Цена:" + (priceProduct / 100) + "."
				+ (priceProduct % 100) + " грн Количество:" + totalAmount;
	}

}
