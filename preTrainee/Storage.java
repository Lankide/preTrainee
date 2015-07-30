package preTrainee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Storage {

	ArrayList<Product> storage = new ArrayList<Product>();

	public void add(Product product) {
		storage.add(product);
	}

	// Returns total amount of products in the shop
	public int count() {
		int result = 0;
		for (Product product : storage) {
			result += product.getTotalAmount();
		}
		return result;
	}

	static Comparator<Product> comparatorProduct = new Comparator<Product>() {
		public int compare(Product o1, Product o2) {
			return o1.getPriceProduct() - o2.getPriceProduct();
		}
	};

	public void sortPrice() {
		Collections.sort(storage, comparatorProduct);
	}

	// Returns "null" if the index is out of range
	public Product getProduct(int index) {
		return (index < 0 || index >= storage.size()) ? null : storage.get(index);
	}

	public void print() {
		for (Product product : storage) {
			System.out.println(product);
		}
	}
}
