package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductService {
	// interface for classification and referencing
	
	void add(Product product);
	List<Product> getAll();
}
