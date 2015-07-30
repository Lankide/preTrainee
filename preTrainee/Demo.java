package preTrainee;

public class Demo {

	public static void main(String[] args) {

		Product A = new Animal();
		Product B = new Animal("Siamese cat", 7000, 16, 2, "Cat");
		Product C = new Animal("Labrador Retriever", 20050, 8, 4, "Dog");
		Product D = new Plant("Rosa 'Eden'", 3880, 4, 8, "Rose");
		Product E = new Plant("Lily 'Ariosto'", 2910, 2, 16, "Lily");
		Product F = new Plant();

		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);
		System.out.println(F);
		System.out.println();

		Storage shopZoo = new Storage();

		shopZoo.add(A);
		shopZoo.add(B);
		shopZoo.add(C);
		shopZoo.add(D);
		shopZoo.add(E);
		shopZoo.add(F);

		System.out.println(shopZoo.getProduct(2));
		System.out.println(shopZoo.getProduct(4));
		System.out.println(shopZoo.getProduct(10));
		System.out.println(shopZoo.getProduct(-2));
		System.out.println("Количество в магазине: " + shopZoo.count() + " единиц");
		System.out.println();

		shopZoo.print();
		System.out.println();
		shopZoo.sortPrice();
		shopZoo.print();

	}
}
