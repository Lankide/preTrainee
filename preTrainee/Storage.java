package preTrainee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Storage {

	ArrayList<Product> storage = new ArrayList<Product>();

	public void Add(Product product) {
		storage.add(product);
	}
//return total amount of products in the shop
	public int Count() {
		int result = 0;
		for (Product product : storage) {
			result = result + product.getTotalAmount();
		}
		return result;
	}

	static Comparator<Product> comparatorProduct = new Comparator<Product>() {
		public int compare(Product o1, Product o2) {
			return o1.getPriceProduct() - (o2.getPriceProduct());
		}
	};

	public void SortPrice() {
		Collections.sort(storage, comparatorProduct);
	}

	// return "null" - if the index is out of range (index<0||index>=size())
	public Product getProduct(int index) {
		if (index < 0)
			return null;
		else
			return (index > storage.size()) ? null : storage.get(index);
	}

	public void Print() {
		for (Product product : storage) {
			System.out.println(product);
		}
	}
}
