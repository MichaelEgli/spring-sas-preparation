package ch.egli.michael.spring.sas.preparation.telusko.repository;

import ch.egli.michael.spring.sas.preparation.telusko.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}
