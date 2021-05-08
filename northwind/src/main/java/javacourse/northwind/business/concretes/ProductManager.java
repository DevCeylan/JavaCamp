package javacourse.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacourse.northwind.business.abstracts.ProductService;
import javacourse.northwind.dataAccess.abstracts.ProductDao;
import javacourse.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

	// business katmanını dataAccess e bağlamak için Dao ya erişme zorunlu
	// constructor injection: att olarak tanımla constructor a dahil et
	
	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		
		return this.productDao.findAll();
	}

}
