package com.telusko.service;

import com.telusko.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    // Array List must be mutable (new) - otherwise you can not post a new product because Array List is not mutable
    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 50000), new Product(102, "Canon Camera", 70000),new Product(103,"Shure Mic",10000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
         return products.stream()
                 .filter(p -> p.getProdId() == prodId)
                 .findFirst().orElse(new Product(100, "No Item", 0));
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void updateProduct(Product prod, int prodId) {

        products.set(getIndexOfProductId(prodId), prod);

        // int index = 0;
/*        for(int i = 0; i < products.size(); i++) {
            if(products.get(i).getProdId() == prod.getProdId()) {
                index = i;
            }
        }*/
        //products.set(index, prod);

/*        for(Product item : products) {
            if(item.getProdId() == prod.getProdId()) {
                products.set(products.indexOf(item), prod);
                break;
            }
        }*/
    }

    public void deleteProduct(int prodId) {
        products.remove(getIndexOfProductId(prodId));
    }

    private int getIndexOfProductId(int prodId) {
        int index = 0;
        for(Product item : products) {
            if(item.getProdId() == prodId) {
                index = products.indexOf(item);
                break;
            }
        }
        return index;
    }

}
