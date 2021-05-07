package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
	
	private ProductDao productDao; //dependency injection
	private LoggerService loggerService;

	/**
	 * @param productDao
	 * @param loggerService
	 */
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId() == 1) {
			System.out.println("Category Error");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("Added: " + product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
