package javacourse.northwind.business.abstracts;

import java.util.List;

import javacourse.northwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
