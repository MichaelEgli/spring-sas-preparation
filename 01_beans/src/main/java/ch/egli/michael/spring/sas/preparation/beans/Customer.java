package ch.egli.michael.spring.sas.preparation.beans;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private String name;
 
    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
