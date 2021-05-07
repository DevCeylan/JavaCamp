package oopIntro;

public class Main {

	public static void main(String[] args) {

		// referans/instance oluþturma
		Product product1 = new Product(1, "Lenovo V14", 15000, "laptop",10);

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo v15");
		product2.setDetail("16 gb ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());

		Product product3 = new Product();

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}
		// --------------------------

		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Bilgisayar");

		Category category2 = new Category();
		category1.setId(2);
		category2.setName("Mobil");

		Category[] categories = { category1, category2 };

		for (Category category : categories) {
			System.out.println(category.getName());
		}
		// --------------------------
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		
		

	}

}
