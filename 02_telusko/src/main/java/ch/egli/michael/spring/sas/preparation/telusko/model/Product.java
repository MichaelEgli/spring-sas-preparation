package ch.egli.michael.spring.sas.preparation.telusko.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int price;

    public Product(int prodId, String prodName, int price) {
    }

    public Product() {

    }
}
