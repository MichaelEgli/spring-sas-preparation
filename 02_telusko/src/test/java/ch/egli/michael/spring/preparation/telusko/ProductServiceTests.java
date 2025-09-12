package ch.egli.michael.spring.preparation.telusko;

import ch.egli.michael.spring.sas.preparation.telusko.TeluskoApplication;
import ch.egli.michael.spring.sas.preparation.telusko.model.Product;
import ch.egli.michael.spring.sas.preparation.telusko.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = TeluskoApplication.class)
public class ProductServiceTests {

    @Autowired
    private ProductService productService;

    @Test
    void productServiceTests() {

        Product p = new Product(102, "Camera", 70000);
        productService.addProduct(p);

        p = productService.getProductById(102);
        Assertions.assertNotNull(p);
        // Assertions.assertEquals(70000, product.getPrice());
        System.out.println("print cam: " + p);
    }

}
