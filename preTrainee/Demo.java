package preTrainee;

public class Demo {

	public static void main(String[] args) {

		Product A = new Animal();
		Product B = new Animal("cat", 7000, 16, 2, "Cat");
		Product C = new Animal("dog", 20050, 8, 4, "Dog");
		Product D = new Plant("rose", 3880, 4, 8, "Rose");
		Product E = new Plant("lily", 2910, 2, 16, "Lily");
		Product F = new Plant();

		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);
		System.out.println(F);
		System.out.println();

		Storage shopZoo = new Storage();

		shopZoo.Add(A);
		shopZoo.Add(B);
		shopZoo.Add(C);
		shopZoo.Add(D);
		shopZoo.Add(E);
		shopZoo.Add(F);

		System.out.println(shopZoo.getProduct(2));
		System.out.println(shopZoo.getProduct(4));
		System.out.println(shopZoo.getProduct(10));
		System.out.println(shopZoo.getProduct(-2));
		System.out.println("Количество в магазине: " + shopZoo.Count() + " единиц");
		System.out.println();

		shopZoo.Print();
		System.out.println();
		shopZoo.SortPrice();
		shopZoo.Print();

	}
}
