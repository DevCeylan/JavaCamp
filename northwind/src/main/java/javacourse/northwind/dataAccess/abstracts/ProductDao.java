package javacourse.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javacourse.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {

}